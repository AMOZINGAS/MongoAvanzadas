package connection;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

public class ConnectionDB{

    private static MongoDatabase dataBase;
    
    public ConnectionDB(){}
    
    public static MongoDatabase createConnection() {
    
        if(dataBase == null){
            
            CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
            CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
            ConnectionString stringConnection = new ConnectionString("mongodb://localhost/27017");
            MongoClientSettings clientsSettings = MongoClientSettings.builder().applyConnectionString(stringConnection).codecRegistry(codecRegistry).build();
            //Aqui usamos el MongoClient para poder crear las conexiones en la base de datos de mongo
            MongoClient dbServer = MongoClients.create(clientsSettings);
            //Inicializamos a la base de datos con el dbserver que es la conexion a mongo y ahora a la base de nosotros
            dataBase = dbServer.getDatabase("AdvancedDataBaseProject");
            
        }
        
        return dataBase;
    
    }


    

}
