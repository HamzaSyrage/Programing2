package programing2.project;

import java.util.ArrayList;

public class InnerTreatment extends Treatment {
    private int departmentIndex ;
    private ArrayList <Doctor> attendingDoctorList = new ArrayList() ;

    public InnerTreatment(int departmentIndex, Date date, float Price) {
        super(date, Price);
        this.departmentIndex = departmentIndex;
    }

    public InnerTreatment(int departmentIndex, int id[] , int year, int month, int day, float Price) {
        super(year, month, day, Price);
        this.departmentIndex = departmentIndex;
         for (int i : id) {
            for (Doctor doctor : Hospital.doctorList) {
                if (doctor.getId() == i ) {
                    attendingDoctorList.add(doctor) ;
                }
            }
        }
    }
    
    
    // we need away to add doctor list in the constructor

    public void addAttendingDoctorToList(int...id) {
        for (int i : id) {
            for (Doctor doctor : Hospital.doctorList) {
                if (doctor.getId() == i ) {
                    attendingDoctorList.add(doctor) ;
                }
            }
        }
       
    }
    
    
}
