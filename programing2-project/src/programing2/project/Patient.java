package programing2.project;

import java.util.ArrayList;

public class Patient {
    private static int counter = 1 ;
    private final int id = counter++;
    private String name ;
    private String address ;
    private Date birthDate ;


    
    public Patient(String name, String address, int year, int month, int day) {
        this.name = name;
        this.address = address;
        this.birthDate = new Date(year, month, day);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    
    public void addOutterTreatmentToList(int clinicIndex, Doctor attendingDoctor, int year, int month, int day, float Price) {
        
    }
    
    

    public void addInnerTreatmentToList(int departmentIndex, ArrayList attendingDoctorList , int year, int month, int day, float Price) {
       
    }
    
    
    public void getTreatmentList() { 
    }
    
    
    
    public String getInfo() {
        return "id=" + id + ", name=" + name + ", address=" + address + ", birthDate=" + birthDate + '}';
    }
    
    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", name=" + name + ", address=" + address + ", birthDate=" + birthDate + '}';
    }
    
    
    
    
    
    
}
