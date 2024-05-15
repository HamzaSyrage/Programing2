package programing2.project;

public class OutterTreatment extends Treatment {
    private int clinicIndex ;
    private Doctor attendingDoctor ;

    public OutterTreatment(int clinicIndex, Doctor attendingDoctor, int Numbre, programing2.project.Date Date, float Price) {
        super(Numbre, Date, Price);
        this.clinicIndex = clinicIndex;
        this.attendingDoctor = attendingDoctor;
    }

    public OutterTreatment(int clinicIndex, Doctor attendingDoctor, int Numbre, int year, int month, int day, float Price) {
        super(Numbre, year, month, day, Price);
        this.clinicIndex = clinicIndex;
        this.attendingDoctor = attendingDoctor;
    }
    
    
    
}
