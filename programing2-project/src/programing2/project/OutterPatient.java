package programing2.project;

import java.util.ArrayList;

public class OutterPatient extends Patient {
    private ArrayList <OutterTreatment> outterTreatmentsList = new ArrayList();
    private final boolean isAccepted = true ;
    private Date acceptDate ;

    public OutterPatient(Date acceptDate, String name, String address, Date birthDate) {
        super(name, address, birthDate);
        this.acceptDate = acceptDate;
    }

    public OutterPatient( int ayear, int amonth, int aday, String name, String address, int year, int month, int day) {
        super(name, address, year, month, day);
        this.acceptDate = new Date(ayear, amonth, aday);
    }

    
    
}
