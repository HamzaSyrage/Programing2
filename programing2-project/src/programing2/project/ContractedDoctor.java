package programing2.project;


public class ContractedDoctor extends Doctor {
    private float remuneration ;
    private Date startDate ;
// we need a method to set rmuration from treat and patient
    public ContractedDoctor(Date startDate, String name, Date birthDate) {
        super(name, birthDate);
        this.startDate = startDate;
    }

    public ContractedDoctor(int syear, int smonth, int sday, String name, int year, int month, int day) {
        super(name, year, month, day);
        this.startDate = new Date(syear, smonth, sday);
    }

    
    

// edit this thing later
    
//    public float getRemuneration(Treatment treat) {
//        remuneration = treat.getPrice()/2 ;
//        return remuneration;
//    }
    
}
