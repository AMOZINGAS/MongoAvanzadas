package IDAOs;

import DTOs.NewAdministratorDTO;
import DTOs.ExistentAdministratorDTO;
import POJOs.AdministratorPOJO;
import POJOs.UserPOJO;
import org.bson.types.ObjectId;


public interface IAdministratorDAO {

    public void registerAdministrator(AdministratorPOJO administratorPOJO);

    public AdministratorPOJO DtoToPOJO(NewAdministratorDTO administratorDTO);

    public ExistentAdministratorDTO POJOToDto(AdministratorPOJO administrator);

    public AdministratorPOJO searchAdministratorByName(String names);

    public AdministratorPOJO findAdministratorById(ObjectId id);

}
