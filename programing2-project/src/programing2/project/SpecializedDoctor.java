package programing2.project;

public class SpecializedDoctor extends Doctor {
    private int departmentIndex ;
    final static float salary = 100;

    public SpecializedDoctor(int departmentIndex, String name, Date birthDate) {
        super(name, birthDate);
        this.departmentIndex = departmentIndex;
    }

    public SpecializedDoctor(int departmentIndex, String name, int year, int month, int day) {
        super(name, year, month, day);
        this.departmentIndex = departmentIndex;
    }
    
    
    
}
