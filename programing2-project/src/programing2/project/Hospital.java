package programing2.project;

import java.util.ArrayList;

public class Hospital {
    static final String department[] = {"NULL","ambulance department","opthalmology department","respiratory department","general surgery department" } ;
    static final String clinic[] = {"NULL","internal medicine clinic","opthalmology clinic","gastroenterology clinic"};
    static ArrayList <Doctor> doctorList = new ArrayList() ;
    static ArrayList <Patient> patientList = new ArrayList() ;
    
    public static void getDepartment() {
        for (int i = 1; i < 5; i++) {
            System.out.println("[" + i + "] " + Hospital.department[i]);
        }         
    }
    
    public static void getClinic() {
        for (int i = 1; i < 4; i++) {
            System.out.println("[" + i + "] " + Hospital.clinic[i]);
        }             
      } 
    
    public static void getDoctorLIst() {
        for(Doctor e : doctorList)
            System.out.println(e);
        System.out.println("");
    }
    
    public static void getPatientLIst() {
        for(Patient e : patientList)
            System.out.println(e);
        System.out.println("");
    }
    
    
    
}
