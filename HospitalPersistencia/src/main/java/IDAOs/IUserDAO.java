package IDAOs;

import POJOs.UserPOJO;
import DTOs.NewUserDTO;
import org.bson.types.ObjectId;

public interface IUserDAO {

    public void registerUser(UserPOJO userPOJO);

    public UserPOJO DtoToEntity(NewUserDTO userDTO);
    
    public String getUserType(ObjectId userId);

    public boolean validateUser(String user, String password);

    public UserPOJO findUserByUserPassword(String user, String password);

    public String getUserTypeByUserAndPassword(String user, String password);

    public boolean existUser(String user);
    
}
