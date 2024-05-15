package programing2.project;

import java.util.ArrayList;

public class InnerTreatment extends Treatment {
    private int departmentIndex ;
    private ArrayList <Doctor> attendingDoctorList = new ArrayList() ;

    public InnerTreatment(int departmentIndex, int Numbre, programing2.project.Date Date, float Price) {
        super(Numbre, Date, Price);
        this.departmentIndex = departmentIndex;
    }

    public InnerTreatment(int departmentIndex, int Numbre, int year, int month, int day, float Price) {
        super(Numbre, year, month, day, Price);
        this.departmentIndex = departmentIndex;
    }
    // we need away to add doctor list in the constructor
    
    
}
