package programing2.project;

public class Doctor {
    private static int counter = 1 ;
    private final int id = counter++;
    private String name ;
    private Date birthDate ;

    public Doctor(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public Doctor(String name, int year , int month, int day) {
        this.name = name;
        birthDate = new Date(year, month, day) ;
    }
    
    public int getId() {
    return id ;
    }
    
    public String getInfo(){
    return "id=" + id + ", name=" + name + ", birthDate=" + birthDate ;
    }
    
    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", name=" + name + ", birthDate=" + birthDate + '}';
    }
    
    
    
}
