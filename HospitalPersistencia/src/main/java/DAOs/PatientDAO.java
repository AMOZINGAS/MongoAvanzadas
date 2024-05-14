package DAOs;

import DTOs.ExistentPatientDTO;
import DTOs.NewPatientDTO;
import IDAOs.IPatientDAO;
import POJOs.PatientPOJO;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import connection.ConnectionDB;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.bson.types.ObjectId;

public class PatientDAO implements IPatientDAO {

    private final MongoDatabase dataBase;
    private final MongoCollection<PatientPOJO> collection;
    
    public PatientDAO (){
        
        dataBase = ConnectionDB.createConnection();
        collection = dataBase.getCollection("Patient", PatientPOJO.class);
        
    }
    
    @Override
    public void registerPatient(PatientPOJO patientPOJO) {
    
        collection.insertOne(patientPOJO);
        
    }

    @Override
    public PatientPOJO serachPatientById(ObjectId idPatient) {
    
        PatientPOJO findAppointment = collection.find(Filters.eq("_id", idPatient)).first();

        if (findAppointment != null) {
            
            return findAppointment;
            
        } else {
            
            System.out.println("No se encontró ningun paciente con el ID proporcionado.");
            return null;
            
        }
        
    }

    @Override
    public PatientPOJO searchPatientByCurp(String curp) {
    
        PatientPOJO findAppointment = collection.find(Filters.eq("curp", curp)).first();

        if (findAppointment != null) {
            
            return findAppointment;
            
        } else {
            
            System.out.println("No se encontró ningun paciente con la curp proporcionado.");
            return null;
            
        }
        
    }

    @Override
    public ExistentPatientDTO EntityToDto(PatientPOJO patientPOJO) {
    
        ExistentPatientDTO existentPatientDTO = new ExistentPatientDTO();
        existentPatientDTO.setId(patientPOJO.getId());
        existentPatientDTO.setName(patientPOJO.getNames());
        existentPatientDTO.setFirstName(patientPOJO.getLastName());
        existentPatientDTO.setSecondName(patientPOJO.getSecondName());
        existentPatientDTO.setCurp(patientPOJO.getCurp());
        existentPatientDTO.setPhone(patientPOJO.getPhone());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(patientPOJO.getBirthDate());
        existentPatientDTO.setBirthDate(calendar);
        existentPatientDTO.setSex(patientPOJO.getSex());
        existentPatientDTO.setStreet(patientPOJO.getStreet());
        existentPatientDTO.setZipCode(patientPOJO.getZipCode());
        existentPatientDTO.setColonia(patientPOJO.getColony());
        existentPatientDTO.setSocialNumber(patientPOJO.getSocialNumber());
        return existentPatientDTO;
        
    }

    @Override
    public PatientPOJO DtoToEntity(NewPatientDTO patient) {
    
        PatientPOJO patientPOJO = new PatientPOJO();
        patientPOJO.setNames(patient.getNames());
        patientPOJO.setLastName(patient.getFirstName());
        patientPOJO.setSecondName(patient.getSecondName());
        patientPOJO.setCurp(patient.getCurp());
        patientPOJO.setPhone(patient.getPhone());
        patientPOJO.setBirthDate(patient.getBirthDate().getTime());
        patientPOJO.setSex(patient.getSex());
        patientPOJO.setStreet(patient.getStreet());
        patientPOJO.setZipCode(patient.getZipCode());
        patientPOJO.setColony(patient.getColony());
        patientPOJO.setSocialNumber(patient.getSocialNumber());
        return patientPOJO;
        
    }

    @Override
    public PatientPOJO ExistentDtoToEntity(ExistentPatientDTO existentPatientDTO) {
    
        PatientPOJO patientPOJO = new PatientPOJO();
        patientPOJO.setId(existentPatientDTO.getId());
        patientPOJO.setNames(existentPatientDTO.getName());
        patientPOJO.setLastName(existentPatientDTO.getFirstName());
        patientPOJO.setSecondName(existentPatientDTO.getSecondName());
        patientPOJO.setCurp(existentPatientDTO.getCurp());
        patientPOJO.setPhone(existentPatientDTO.getPhone());
        patientPOJO.setBirthDate(existentPatientDTO.getBirthDate().getTime());
        patientPOJO.setSex(existentPatientDTO.getSex());
        patientPOJO.setStreet(existentPatientDTO.getStreet());
        patientPOJO.setZipCode(existentPatientDTO.getZipCode());
        patientPOJO.setColony(existentPatientDTO.getColonia());
        patientPOJO.setSocialNumber(existentPatientDTO.getSocialNumber());
        return patientPOJO;
        
    }

    @Override
    public List<ExistentPatientDTO> findAllPatient() {
    
        FindIterable<PatientPOJO> patient = collection.find();
       List<ExistentPatientDTO> DTOList = new ArrayList<>();
       for(PatientPOJO patientPOJO: patient){

           DTOList.add(EntityToDto(patientPOJO));

       }

       return DTOList;
        
    }

    @Override
    public PatientPOJO findPatient(ObjectId id) {
    
        PatientPOJO findAppointment = collection.find(Filters.eq("_id", id)).first();

        if (findAppointment != null) {
            
            return findAppointment;
            
        } else {
            
            System.out.println("No se encontró ningun paciente con el id proporcionado.");
            return null;
            
        }
        
    }

    
    
}
