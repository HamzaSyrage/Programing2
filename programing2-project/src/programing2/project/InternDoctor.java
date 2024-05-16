package programing2.project;

public class InternDoctor extends Doctor {
    private float salary ;
    private Date startDate ;
    private Date endDate ;

    public InternDoctor(Date startDate, String name, Date birthDate) {
        super(name, birthDate);
        salary = SpecializedDoctor.salary ;
         int servYear = Date.presentDate.getYear() - startDate.getYear() ;
        if (servYear==0) {
            salary = salary / 2 ;
        }
        if (servYear==1) {
            salary = salary * 3 / 4 ;
        }
        this.startDate = startDate;
        endDate = new Date(2+startDate.getYear(),startDate.getMonth(),startDate.getDay()) ;
    }

    public InternDoctor(int syear, int smonth, int sday, String name, int year, int month, int day) {
        super(name, year, month, day);
          salary = SpecializedDoctor.salary ;
        int servYear = Date.presentDate.getYear() - syear;

          if (servYear==0) {
            salary = salary / 2 ;
        }
        if (servYear==1) {
            salary = salary * 3 / 4 ;
        }
        this.startDate = new Date(syear, smonth, sday);
        endDate = new Date(2+startDate.getYear(),startDate.getMonth(),startDate.getDay()) ;
    }

    
    
    public float getSalary() {
      
        return salary;
    }

    @Override
    public String toString() {
        return "InternDoctor{" + super.getInfo() + ", salary=" + salary + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
    
    
}
