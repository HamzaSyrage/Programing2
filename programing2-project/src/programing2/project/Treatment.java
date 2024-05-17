package programing2.project;

public class Treatment {
    private static int countre = 1 ;
    private  final int numbre = countre++ ;
    private Date date ;
    private float Price ;

    public Treatment(Date date, float Price) {
        this.date = date;
        this.Price = Price;
    }
    
    public Treatment(int year, int month, int day, float Price) {
        this.date = new Date(year, month, day);
        this.Price = Price;
    }
    
    
    
    public float getPrice() {
        return Price;
    }
    
}
