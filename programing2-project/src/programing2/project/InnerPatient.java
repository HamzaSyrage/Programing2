package programing2.project;

import java.util.ArrayList;

public class InnerPatient extends Patient {
    private ArrayList <InnerTreatment> innerTreatmentList = new ArrayList();
    private ArrayList <OutterTreatment> outterTreatmentsList = new ArrayList();
    private boolean isDischarged ;
    private Date dischargeDate ;

    public InnerPatient(boolean isDischarged, Date dischargeDate, String name, String address, Date birthDate) {
        super(name, address, birthDate);
        this.isDischarged = isDischarged;
        if (isDischarged) {
        this.dischargeDate = dischargeDate;   
        }
    }

    public InnerPatient(boolean isDischarged, int dyear, int dmonth, int dday, String name, String address, int year, int month, int day) {
        super(name, address, year, month, day);
        this.isDischarged = isDischarged;
        if (isDischarged) {
        this.dischargeDate = new Date(dyear, dmonth, dday);   
        }
    }
    
    public InnerPatient(boolean isDischarged, String name, String address, Date birthDate) {
        super(name, address, birthDate);
        this.isDischarged = isDischarged;
    }

    public InnerPatient(boolean isDischarged, String name, String address, int year, int month, int day) {
        super(name, address, year, month, day);
        this.isDischarged = isDischarged;
    }
    public void setDisgargeDate(int dyear, int dmonth, int dday){
    this.isDischarged = true ;
    this.dischargeDate = new Date(dyear, dmonth, dday) ;
    }

    public boolean getIsDischarged() {
        return isDischarged;
    }
    
    
    
    @Override
    public String toString() {
        return "InnerPatient{" + super.getInfo() /* + ", innerTreatmentList=" + innerTreatmentList  + ", outterTreatmentsList=" + outterTreatmentsList */ + ", isDischarged=" + isDischarged + ", dischargeDate=" + dischargeDate + '}';
    }
    
    
}
