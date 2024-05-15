package programing2.project;

public class InternDoctor extends Doctor {
    private float salary ;
    private Date startDate ;
    private Date endDate = new Date(2+startDate.getYear(),startDate.getMonth(),startDate.getDay()) ;

    public InternDoctor(Date startDate, String name, Date birthDate) {
        super(name, birthDate);
         int servYear = startDate.getYear() - Date.presentDate.getYear() ;
        if (servYear==0) {
            salary = SpecializedDoctor.salary / 2 ;
        }
        if (servYear==1) {
            salary = SpecializedDoctor.salary * 3 / 4 ;
        }
        this.startDate = startDate;
    }

    public InternDoctor(int syear, int smonth, int sday, String name, int year, int month, int day) {
        super(name, year, month, day);
          int servYear = startDate.getYear() - Date.presentDate.getYear() ;
        if (servYear==0) {
            salary = SpecializedDoctor.salary / 2 ;
        }
        if (servYear==1) {
            salary = SpecializedDoctor.salary * 3 / 4 ;
        }
        this.startDate = new Date(syear, smonth, sday);
    }

    
    
    public float getSalary() {
      
        return salary;
    }
    
}
