package IDAOs;

import DTOs.NewDoctorDTO;
import DTOs.ExistentDoctorDTO;
import POJOs.DoctorPOJO;
import java.util.List;
import org.bson.types.ObjectId;

public interface IDoctorDAO {

    public void registerDoctor(DoctorPOJO doctorPOJO);

    public DoctorPOJO DtoToEntity(NewDoctorDTO doctorDTO);

    public DoctorPOJO ExistentDtoToEntity(ExistentDoctorDTO existentDoctorDTO);

    public DoctorPOJO serachById(ObjectId id);

    public DoctorPOJO searchByMedicart(String medicalLicense);

    public List<ExistentDoctorDTO> searchBySpecialization(String specialization);

    public ExistentDoctorDTO EntityToDTO(DoctorPOJO doctorPOJO);

    public String setSpecilaization(String specialization);

}
