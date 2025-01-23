import java.util.*;
class Doctor {
    String name;
    
    Doctor(String name) {
        this.name = name;
    }
    
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting " + patient.getName() + ".");
        System.out.println("Consultation completed for " + patient.getName() + ".");
    }
    
    public String getName() {
        return name;
    }
}

class Patient {
    String name;
    
    Patient(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
	
    public void visitDoctor(Doctor doctor) {
        doctor.consult(this);
    }
}

class Hospital {
    String hospitalName;
    List<Doctor> doctors;
    List<Patient> patients;
    
    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    
     public void showHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName());
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

public class HospitalManagement{
    public static void main(String[] args) {
        Hospital hospital = new Hospital("MegaCity Hospital");
        
        Doctor doctor1 = new Doctor("Dr.gupta");
        Doctor doctor2 = new Doctor("Dr.garg");
        
        Patient patient1 = new Patient("yada");
        Patient patient2 = new Patient("ram");
        
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        
        hospital.showHospitalDetails();
        
        patient1.visitDoctor(doctor1); 
        patient2.visitDoctor(doctor2);  
        patient1.visitDoctor(doctor2);  
    }
}