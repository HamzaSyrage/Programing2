package programing2.project;

public class Treatment {
    private static int countre = 1 ;
    private  final int numbre = countre++ ;
    private Date date ;
    private float Price ;


    
    public Treatment(int year, int month, int day, float Price) {
        this.date = new Date(year, month, day);
        this.Price = Price;
    }

    public int getNumbre() {
        return numbre;
    }

    public Date getTreatmentDate() {
        return date;
    }
    
    
    
    
    public float getPrice() {
        return Price;
    }
    public String getInfo() {
        return "numbre=" + numbre + ", date=" + date + ", Price=" + Price + '}';
    }

    @Override
    public String toString() {
        return "Treatment{" + "numbre=" + numbre + ", date=" + date + ", Price=" + Price + '}';
    }
    
}
