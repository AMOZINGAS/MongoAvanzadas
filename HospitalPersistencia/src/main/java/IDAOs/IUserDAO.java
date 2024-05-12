package IDAOs;

import POJOs.UserPOJO;
import DTOs.NewUserDTO;

public interface IUserDAO {

    public void registerUser(UserPOJO userPOJO);

    public UserPOJO DtoToEntity(NewUserDTO userDTO);
    
    public String getUserType(Long userId);

    public boolean validateUser(String user, String password);

    public UserPOJO findUserByUserPassword(String user, String password);

    public String getUserTypeByUserAndPassword(String user, String password);

}
