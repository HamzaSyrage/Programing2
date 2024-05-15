package programing2.project;


public class ContractedDoctor extends Doctor {
    private float remuneration ;
    private Date startDate ;

    public ContractedDoctor(float remuneration, Date startDate, String name, Date birthDate) {
        super(name, birthDate);
        this.remuneration = remuneration;
        this.startDate = startDate;
    }

    public ContractedDoctor(float remuneration, int syear, int smonth, int sday, String name, int year, int month, int day) {
        super(name, year, month, day);
        this.remuneration = remuneration;
        this.startDate = new Date(syear, smonth, sday);
    }

    
    
    public ContractedDoctor(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    
    public float getRemuneration(Treatment treat) {
        remuneration = treat.getPrice()/2 ;
        return remuneration;
    }
    
}
