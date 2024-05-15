package programing2.project;

public class Patient {
    private static int counter = 1 ;
    private final int id = counter++;
    private String name ;
    private String address ;
    private Date birthDate ;

    public Patient(String name, String address, Date birthDate) {
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
    }
    
    public Patient(String name, String address, int year, int month, int day) {
        this.name = name;
        this.address = address;
        this.birthDate = new Date(year, month, day);
    }
    
}
