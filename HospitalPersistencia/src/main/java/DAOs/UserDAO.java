package DAOs;

import DTOs.NewAdministratorDTO;
import DTOs.NewDoctorDTO;
import DTOs.NewUserDTO;
import IDAOs.IUserDAO;
import POJOs.UserPOJO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import connection.ConnectionDB;
import org.bson.types.ObjectId;

/**
 *
 * @author TeLesheo
 */
public class UserDAO implements IUserDAO {

    private final MongoDatabase dataBase;
    private final MongoCollection<UserPOJO> collection;
    
    public UserDAO(){
        
        dataBase = ConnectionDB.createConnection();
        collection = dataBase.getCollection("User", UserPOJO.class);
        
    }
    
    @Override
    public void registerUser(UserPOJO userPOJO) {
    
        collection.insertOne(userPOJO);
    
    }

    @Override
    public UserPOJO DtoToEntity(NewUserDTO userDTO) {
    
        UserPOJO userPOJO = new UserPOJO();
        userPOJO.setCurp(userDTO.getCurp());
        userPOJO.setPassword(userDTO.getPassword());
        userPOJO.setType(userDTO.getType());
        userPOJO.setIdOwner(userDTO.getIdOwner());
        return userPOJO;
        
    }

    @Override
    public String getUserType(ObjectId userId) {
    
        UserPOJO findUser = collection.find(Filters.eq("_id", userId)).first();
            
        if (findUser != null) {
            return findUser.getType();
        } else {
            System.out.println("No se encontró ningún usuario con el ID proporcionado.");
            return null;
        }
        
    }

    @Override
    public boolean validateUser(String user, String password) {
    
        UserPOJO userPOJO = collection.find(Filters.eq("curp", user)).first();

            if (userPOJO != null) {
                // Obtener la contraseña almacenada en la base de datos
                String contrasenaAlmacenada = userPOJO.getPassword();

                // Validar la contraseña
                if (contrasenaAlmacenada.equals(password)) {
                    
                    System.out.println("Usuario y contraseña válidos.");
                    return true;
                
                } else {
                
                    System.out.println("Contraseña incorrecta.");
                    return false;
                    
                }
                
            } else {
                
                System.out.println("Usuario no encontrado.");
                return false;
            
            }
        
    }

    @Override
    public UserPOJO findUserByUserPassword(String user, String password) {
    
        UserPOJO userPOJO = collection.find(Filters.eq("curp", user)).first();

        if (userPOJO != null) {
            // Obtener la contraseña almacenada en la base de datos
            String contrasenaAlmacenada = userPOJO.getPassword();

            // Validar la contraseña
            if (contrasenaAlmacenada.equals(password)) {

                System.out.println("Usuario y contraseña válidos.");
                return userPOJO;

            } else {

                System.out.println("Contraseña incorrecta.");
                return null;

            }

        } else {

            System.out.println("Usuario no encontrado.");
            return null;

        }
        
    }

    @Override
    public String getUserTypeByUserAndPassword(String user, String password) {
    
        UserPOJO userPOJO = collection.find(Filters.eq("curp", user)).first();

        if (userPOJO != null) {
            // Obtener la contraseña almacenada en la base de datos
            String contrasenaAlmacenada = userPOJO.getPassword();

            // Validar la contraseña
            if (contrasenaAlmacenada.equals(password)) {

                System.out.println("Usuario y contraseña válidos.");
                return userPOJO.getType();

            } else {

                System.out.println("Contraseña incorrecta.");
                return null;

            }

        } else {

            System.out.println("Usuario no encontrado.");
            return null;

        }
        
    } 

    @Override
    public boolean existUser(String user) {
    
        UserPOJO userPOJO = collection.find(Filters.eq("curp", user)).first();

            if (userPOJO != null) {
                
                return true;
                
            } else {

                return false;
            
            }
    
    }
    
    
    
}
