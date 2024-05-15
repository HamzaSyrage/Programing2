package programing2.project;

public class Date {
    private int year , month , day ;
    public static Date presentDate ;
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    
    @Override
    public String toString() {
        return "Date{"+ year + "/" + month + "/" + day + '}';
    }    
}