package programing2.project;

import java.util.ArrayList;

public class InnerPatient extends Patient {
    private ArrayList <InnerTreatment> innerTreatmentList = new ArrayList();
    private ArrayList <OutterTreatment> outterTreatmentsList = new ArrayList();
    private boolean isDischarged ;
    private Date dischargeDate ;
    
}
