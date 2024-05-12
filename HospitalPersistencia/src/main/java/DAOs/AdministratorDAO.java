package DAOs;

import DTOs.ExistentAdministratorDTO;
import connection.ConnectionDB;
import DTOs.NewAdministratorDTO;
import IDAOs.IAdministratorDAO;
import POJOs.AdministratorPOJO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;



public class AdministratorDAO implements IAdministratorDAO { 

    private final MongoDatabase dataBase;
    private final MongoCollection<AdministratorPOJO> collection;
    
    public AdministratorDAO() {
        
        dataBase = ConnectionDB.createConnection();
        collection = dataBase.getCollection("Administrator", AdministratorPOJO.class);
        
    }
    
    @Override
    public void registerAdministrator(AdministratorPOJO administratorPOJO) {
    
        collection.insertOne(administratorPOJO);
        
    }

    @Override
    public AdministratorPOJO DtoToPOJO(NewAdministratorDTO administratorDTO) {
    
        AdministratorPOJO administratorPOJO = new AdministratorPOJO();
        administratorDTO.setName(administratorDTO.getName());
        return administratorPOJO;
    
    }

    @Override
    public ExistentAdministratorDTO POJOToDto(AdministratorPOJO administrator) {
    
        ExistentAdministratorDTO administratorDTO = new ExistentAdministratorDTO();
        administratorDTO.setName(administrator.getName());
        administratorDTO.setId(administrator.getId());
        return administratorDTO;
        
    }

    @Override
    public AdministratorPOJO searchAdministratorByName(String names) {
    
        Document filtro = new Document("names", names);
        AdministratorPOJO administratorPOJO = collection.find(filtro).first();
        if(administratorPOJO != null){
            
            return administratorPOJO;
            
        }else{
            
            return null;
            
        }
        
    }

    @Override
    public AdministratorPOJO findAdministratorById(Object id) {
    
        Document filtro = new Document("id", id);
        AdministratorPOJO administratorPOJO = collection.find(filtro).first();
        if(administratorPOJO != null){
            
            return administratorPOJO;
            
        }else{
            
            return null;
            
        }
        
    }

    

}
