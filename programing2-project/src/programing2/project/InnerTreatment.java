package programing2.project;

import java.util.ArrayList;

public class InnerTreatment extends Treatment {
    private int departmentIndex ;
    private ArrayList <Doctor> attendingDoctorList = new ArrayList() ;


    
    public InnerTreatment(int departmentIndex, ArrayList attendingDoctorList, int year, int month, int day, float Price) {
        super(year, month, day, Price);
        this.departmentIndex = departmentIndex;
        this.attendingDoctorList.addAll(attendingDoctorList) ;
    }
    
    
    
 

    public int getDepartmentIndex() {
        return departmentIndex;
    }
    
    
    


    @Override
    public String toString() {
        return "InnerTreatment{" + super.getInfo() + ", departmentIndex=" + departmentIndex + "\n attendingDoctorList=" + attendingDoctorList + "}\n";
    }

    
    
    
}
