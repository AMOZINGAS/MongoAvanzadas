package DAOs;

import DTOs.ExistentAppointmentDTO;
import DTOs.NewAppointmentDTO;
import IDAOs.IAppointmentManager;
import IDAOs.IDoctorDAO;
import IDAOs.IPatientDAO;
import POJOs.AdministratorPOJO;
import POJOs.AppointmentPOJO;
import POJOs.DoctorPOJO;
import POJOs.PatientPOJO;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import connection.ConnectionDB;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

public class AppointmentManager implements IAppointmentManager {

    private final MongoDatabase dataBase;
    private final MongoCollection<AppointmentPOJO> collection;
    
    public AppointmentManager(){
        
        dataBase = ConnectionDB.createConnection();
        collection = dataBase.getCollection("Appointment", AppointmentPOJO.class);
        
    }
    
    @Override
    public void createAppointment(AppointmentPOJO appointmentPOJO) {
        
        collection.insertOne(appointmentPOJO);
        
    }

    @Override
    public AppointmentPOJO DtoToEntity(NewAppointmentDTO newAppointmentDTO) {
    
        AppointmentPOJO appointmentPOJO = new AppointmentPOJO();
        appointmentPOJO.setDate(newAppointmentDTO.getAppointmentDate().getTime());
        IDoctorDAO doctorDAO = new DoctorDAO();
        appointmentPOJO.setIdDoctor(doctorDAO.ExistentDtoToEntity(newAppointmentDTO.getDoctor()));
        IPatientDAO patientDAO = new PatientDAO();
        appointmentPOJO.setIdPatient(patientDAO.ExistentDtoToEntity(newAppointmentDTO.getPatient()));
        appointmentPOJO.setNote(newAppointmentDTO.getNote());
        appointmentPOJO.setStatus(newAppointmentDTO.getStatus());
        return appointmentPOJO;
        
    }

    @Override
    public List<Calendar> findLimitDays(DoctorPOJO doctorPOJO) {
    
           FindIterable<AppointmentPOJO> appointments = collection.find(Filters.eq("idDoctor._id", doctorPOJO.getId()));
           List<Calendar> dateList = new ArrayList<>();
           for(AppointmentPOJO appointment: appointments){
               
               if(appointment.getStatus() == "CANCELLED"){
               }else{
                   
                   Calendar calendar = Calendar.getInstance();
                   calendar.setTime(appointment.getDate());
                   dateList.add(calendar);
                   
               }
               
               
           }
           
           return dateList;
    
    }

    @Override
    public List<Calendar> findLimitDays(PatientPOJO patientPOJO) {
    
        FindIterable<AppointmentPOJO> appointments = collection.find(Filters.eq("idPatient._id", patientPOJO.getId()));
           List<Calendar> dateList = new ArrayList<>();
           for(AppointmentPOJO appointment: appointments){
               
               if(appointment.getStatus() == "CANCELLED"){
               }else{
                   
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(appointment.getDate());
                    dateList.add(calendar);
                   
               }
               
           }
           
           return dateList;
        
    }

    @Override
    public List<ExistentAppointmentDTO> findAppointmentsByPatientId(ObjectId patientId) {
    
        FindIterable<AppointmentPOJO> appointmentByPatient = collection.find(Filters.eq("idPatient._id", patientId));
        List<ExistentAppointmentDTO> DTOList = new ArrayList<>();
        for(AppointmentPOJO appointment: appointmentByPatient){
            
            DTOList.add(convertToDTO(appointment));
            
        }
        
        return DTOList;
        
    }

    @Override
    public ExistentAppointmentDTO convertToDTO(AppointmentPOJO appointmentPOJO) {
    
        ExistentAppointmentDTO appointmentDTO = new ExistentAppointmentDTO();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(appointmentPOJO.getDate());
        appointmentDTO.setAppointmentDate(calendar);
        IDoctorDAO doctorDAO = new DoctorDAO();
        appointmentDTO.setDoctor(doctorDAO.EntityToDTO(appointmentPOJO.getIdDoctor()));
        appointmentDTO.setId(appointmentPOJO.getId());
        appointmentDTO.setNote(appointmentPOJO.getNote());
        IPatientDAO patientDAO = new PatientDAO();
        appointmentDTO.setPatient(patientDAO.EntityToDto(appointmentPOJO.getIdPatient()));
        appointmentDTO.setStatus(appointmentPOJO.getStatus());
        return appointmentDTO;
        
        
    }

    @Override
    public List<ExistentAppointmentDTO> findAppointmentsByDoctorId(ObjectId doctorId) {
    
        FindIterable<AppointmentPOJO> appointmentByPatient = collection.find(Filters.eq("idDoctor._id", doctorId));
        List<ExistentAppointmentDTO> DTOList = new ArrayList<>();
        for(AppointmentPOJO appointment: appointmentByPatient){
            
            DTOList.add(convertToDTO(appointment));
            
        }
        
        return DTOList;
        
    }

    @Override
    public boolean cancelAppointment(ObjectId id) {
    
        collection.updateOne(Filters.eq("_id", id), Updates.set("status", "CANCELLED"));
        return true;
        
    }

    @Override
    public ExistentAppointmentDTO findAppointmentById(ObjectId id) {
    
        AppointmentPOJO findAppointment = collection.find(Filters.eq("_id", id)).first();

        if (findAppointment != null) {
            
            return convertToDTO(findAppointment);
            
        } else {
            
            System.out.println("No se encontró ninguna cita con el ID proporcionado.");
            return null;
            
        }
        
    }

    

}
