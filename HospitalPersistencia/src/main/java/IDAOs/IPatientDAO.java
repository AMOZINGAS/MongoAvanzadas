package IDAOs;

import POJOs.PatientPOJO;
import DTOs.NewPatientDTO;
import DTOs.ExistentPatientDTO;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author TeLesheo
 */
public interface IPatientDAO {

    public void registerPatient(PatientPOJO patientPOJO);

    public PatientPOJO serachPatientById(ObjectId idPatient);

    public PatientPOJO searchPatientByCurp(String curp);

    public ExistentPatientDTO EntityToDto(PatientPOJO patientPOJO);

    public PatientPOJO DtoToEntity(NewPatientDTO newPatientDTO);

    public PatientPOJO ExistentDtoToEntity(ExistentPatientDTO existentPatientDTO);
    
    public List<ExistentPatientDTO> findAllPatient();
    
    public PatientPOJO findPatient(ObjectId id);
    
}
