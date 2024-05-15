package programing2.project;

public class Treatment {
    private int Numbre ;
    private Date Date ;
    private float Price ;

    public Treatment(int Numbre, Date Date, float Price) {
        this.Numbre = Numbre;
        this.Date = Date;
        this.Price = Price;
    }
    
    public Treatment(int Numbre, int year, int month, int day, float Price) {
        this.Numbre = Numbre;
        this.Date = new Date(year, month, day);
        this.Price = Price;
    }
    
    
    
    public float getPrice() {
        return Price;
    }
    
}
