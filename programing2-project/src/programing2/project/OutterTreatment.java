package programing2.project;

public class OutterTreatment extends Treatment {
    private int clinicIndex ;
    private Doctor attendingDoctor ;



    public OutterTreatment(int clinicIndex, Doctor attendingDoctor, int year, int month, int day, float Price) {
        super(year, month, day, Price);
        this.clinicIndex = clinicIndex;
        this.attendingDoctor = attendingDoctor;
    }

    @Override
    public String toString() {
        return "OutterTreatment{" + super.getInfo() + ", clinicIndex=" + clinicIndex + ", attendingDoctor=" + attendingDoctor + '}';
    }
    
    
    
}
