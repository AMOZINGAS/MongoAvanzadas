package DAOs;

import DTOs.ExistentDoctorDTO;
import DTOs.NewDoctorDTO;
import IDAOs.IDoctorDAO;
import POJOs.AdministratorPOJO;
import POJOs.DoctorPOJO;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import connection.ConnectionDB;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

public class DoctorDAO implements IDoctorDAO {

    private final MongoDatabase dataBase;
    private final MongoCollection<DoctorPOJO> collection;
    
    public DoctorDAO(){
        
        dataBase = ConnectionDB.createConnection();
        collection = dataBase.getCollection("Doctor", DoctorPOJO.class);
        
    }
    
    @Override
    public void registerDoctor(DoctorPOJO doctorDTO) {
    
        collection.insertOne(doctorDTO);
        
    }

    @Override
    public DoctorPOJO DtoToEntity(NewDoctorDTO doctorDTO) {
    
        DoctorPOJO doctorPOJO = new DoctorPOJO();
        doctorPOJO.setLastName(doctorDTO.getFirstName());
        doctorPOJO.setMedicalLicense(doctorDTO.getMedicalCart());
        doctorPOJO.setNames(doctorDTO.getName());
        doctorPOJO.setSecondName(doctorDTO.getSecondName());
        doctorPOJO.setSpecialization(doctorDTO.getSpecialization());
        return doctorPOJO;
        
    }

    @Override
    public DoctorPOJO ExistentDtoToEntity(ExistentDoctorDTO existentDoctorDTO) {
    
        DoctorPOJO doctorPOJO = new DoctorPOJO();
        doctorPOJO.setId(existentDoctorDTO.getId());
        doctorPOJO.setLastName(existentDoctorDTO.getFirstName());
        doctorPOJO.setMedicalLicense(existentDoctorDTO.getMedicalCart());
        doctorPOJO.setNames(existentDoctorDTO.getName());
        doctorPOJO.setSecondName(existentDoctorDTO.getSecondName());
        doctorPOJO.setSpecialization(existentDoctorDTO.getSpecialization());
        return doctorPOJO;
        
    }

    @Override
    public DoctorPOJO serachById(ObjectId id) {
    
        DoctorPOJO findAppointment = collection.find(Filters.eq("_id", id)).first();

        if (findAppointment != null) {
            
            return findAppointment;
            
        } else {
            
            System.out.println("No se encontró ningun medico con el ID proporcionado.");
            return null;
            
        }
        
    }

    @Override
    public DoctorPOJO searchByMedicart(String medicalLicense) {
    
        DoctorPOJO findAppointment = collection.find(Filters.eq("medicalLicense", medicalLicense)).first();

        if (findAppointment != null) {
            
            return findAppointment;
            
        } else {
            
            System.out.println("No se encontró ningun medico con la medicalLicense proporcionado.");
            return null;
            
        }
        
    }

    @Override
    public List<ExistentDoctorDTO> searchBySpecialization(String specialization) {
    
        FindIterable<DoctorPOJO> doctor = collection.find(Filters.eq("specialization", specialization));
           List<ExistentDoctorDTO> DTOList = new ArrayList<>();
           for(DoctorPOJO doctorPOJO: doctor){
               
               DTOList.add(EntityToDTO(doctorPOJO));
               
           }
           
           return DTOList;
        
    }

    @Override
    public ExistentDoctorDTO EntityToDTO(DoctorPOJO doctorPOJO) {
    
        ExistentDoctorDTO doctorDTO = new ExistentDoctorDTO();
        doctorDTO.setId(doctorPOJO.getId());
        doctorDTO.setFirstName(doctorPOJO.getLastName());
        doctorDTO.setMedicalCart(doctorPOJO.getMedicalLicense());
        doctorDTO.setName(doctorPOJO.getNames());
        doctorDTO.setSecondName(doctorPOJO.getSecondName());
        doctorDTO.setSpecialization(doctorPOJO.getSpecialization());
        return doctorDTO;
        
    }

    @Override
    public String setSpecilaization(String specialization) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}
