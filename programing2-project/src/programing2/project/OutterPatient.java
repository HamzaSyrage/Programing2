package programing2.project;

import java.util.ArrayList;

public class OutterPatient extends Patient {
    private ArrayList <OutterTreatment> outterTreatmentsList = new ArrayList();
    private  boolean isAccepted  ;
    private Date acceptDate ;

    

    public OutterPatient( int ayear, int amonth, int aday, String name, String address, int year, int month, int day) {
        super(name, address, year, month, day);
        this.acceptDate = new Date(ayear, amonth, aday);
    }

    public void addOutterTreatmentToList(int clinicIndex, Doctor attendingDoctor, int year, int month, int day, float Price) {
        outterTreatmentsList.add(new OutterTreatment(clinicIndex, attendingDoctor, year, month, day, Price)) ;
    }


    
    public void getTreatmentList(){
        for (OutterTreatment ot : outterTreatmentsList) {
            System.out.println(ot);
            System.out.println("");
        }
    }

    public ArrayList<OutterTreatment> getOutterTreatmentsList() {
        return outterTreatmentsList;
    }
    
    
//    @Override
//    public String toString() {
//        return "OutterPatient{" + super.getInfo()  + ", isAccepted=" + isAccepted + ", acceptDate=" + acceptDate + '}';
//    }

    @Override
    public String toString() {
        return "OutterPatient{" + super.getInfo() + "\n outterTreatmentsList=" + outterTreatmentsList + "\n isAccepted=" + isAccepted + ", acceptDate=" + acceptDate + "}\n";
    }

    
    
}
