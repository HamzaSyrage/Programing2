package programing2.project;

import java.util.ArrayList;

public class InnerPatient extends Patient {
    private ArrayList <InnerTreatment> innerTreatmentList = new ArrayList();
    private ArrayList <OutterTreatment> outterTreatmentsList = new ArrayList();
    private boolean isDischarged ;
    private Date dischargeDate ;

    

    public InnerPatient(boolean isDischarged, int dyear, int dmonth, int dday, String name, String address, int year, int month, int day) {
        super(name, address, year, month, day);
        this.isDischarged = isDischarged;
        if (isDischarged) {
        this.dischargeDate = new Date(dyear, dmonth, dday);   
        }
    }
    


    public InnerPatient(boolean isDischarged, String name, String address, int year, int month, int day) {
        super(name, address, year, month, day);
        this.isDischarged = isDischarged;
    }

    public InnerPatient(OutterPatient p) {
        super(p.getName(), p.getAddress(), p.getBirthDate().getYear(), p.getBirthDate().getMonth(), p.getBirthDate().getDay());
        this.outterTreatmentsList = p.getOutterTreatmentsList() ;
    }
    
    
    
    
    
    public void setDisgargeDate(int dyear, int dmonth, int dday){
    this.isDischarged = true ;
    this.dischargeDate = new Date(dyear, dmonth, dday) ;
    }
    
    public void addOutterTreatmentToList(int clinicIndex, Doctor attendingDoctor, int year, int month, int day, float Price) {
        outterTreatmentsList.add(new OutterTreatment(clinicIndex, attendingDoctor, year, month, day, Price)) ;
    }
    
    

    public void addInnerTreatmentToList(int departmentIndex, ArrayList attendingDoctorList , int year, int month, int day, float Price) {
        innerTreatmentList.add(new InnerTreatment(departmentIndex, attendingDoctorList , year, month, day, Price)) ;
    }
    
    public boolean getIsDischarged() {
        return isDischarged;
    }

   
    @Override
    public void getTreatmentList(){
        for (InnerTreatment it : innerTreatmentList) {
            System.out.println(it);
        }
        for (OutterTreatment ot : outterTreatmentsList) {
            System.out.println(ot);
        }
        System.out.println("");
    }

    public ArrayList<InnerTreatment> getInnerTreatmentList() {
        return innerTreatmentList;
    }

    
    
    
//    @Override
//    public String toString() {
//        return "InnerPatient{" + super.getInfo() + ", isDischarged=" + isDischarged + ", dischargeDate=" + dischargeDate + '}';
//    }

    @Override
    public String toString() {
        return "InnerPatient{" + super.getInfo() + "\n innerTreatmentList=" + innerTreatmentList + "\n outterTreatmentsList=" + outterTreatmentsList + "\n isDischarged=" + isDischarged + ", dischargeDate=" + dischargeDate + "}\n";
    }
    
    
}
