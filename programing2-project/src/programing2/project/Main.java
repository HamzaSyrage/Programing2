package programing2.project;

import java.util.Scanner ;
import java.time.LocalDate ;
 
public class Main {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        LocalDate localDate = LocalDate.now();
        Date.setPresentDate(localDate.getYear(), localDate.getMonthValue() , localDate.getDayOfMonth());        
        System.out.println("present " + Date.presentDate );
        
        int op ;
        while (true) {
            System.out.println("chose an option :\n [0] end the program\n [1] add new doctor\n [2] delete existing doctor\n");
            
            op = in.nextInt();
        
            switch(op) {
            case 0 :
                return;
            case 1 : 
                Doctor doc ;
                int op2,y,m,d ;
                System.out.println("chose doctor type\n [1] intern doctor\n [2] specialized doctor\n [3] contracted doctor\n");
                op2 = in.nextInt() ;
                String name ;
                System.out.println("enter name");
                name = in.next();
                System.out.println("enter birth year");
                y = in.nextInt();
                System.out.println("enter birth month");
                m = in.nextInt();
                System.out.println("enter birth day");
                d = in.nextInt();
                switch(op2) {
                    case 1 :
                        int sy,sm,sd;
                        System.out.println("enter start training year");
                        sy = in.nextInt();
                        System.out.println("enter start training month");
                        sm = in.nextInt();
                        System.out.println("enter start training day");
                        sd = in.nextInt(); 
                        doc = new InternDoctor(sy, sm, sd, name, y, m, d) ;
                        Hospital.doctorList.add(doc) ;
                        break;
                    case 2 :
                        int index ;
                        System.out.println("chose doctor department");
                        Hospital.getDepartment() ;
                        index = in.nextInt();
                        doc = new SpecializedDoctor(index, name, y, m, d) ;
                        Hospital.doctorList.add(doc) ;
                        break;
                    case 3 :
                        
                        System.out.println("enter start contract year");
                        sy = in.nextInt();
                        System.out.println("enter start contract month");
                        sm = in.nextInt();
                        System.out.println("enter start contract day");
                        sd = in.nextInt();
                        doc = new ContractedDoctor(sy, sm, sd, name, y, m, d) ;
                        Hospital.doctorList.add(doc) ;
                        break;
                }
                break;
            case 2 :
                System.out.println("chose the doctor by id to delete");
                Hospital.getDoctorLIst();
                int rid = in.nextInt();
                Hospital.doctorList.removeIf(prdct -> prdct.getId() == rid) ;
                break;
            case 3 :
                        System.out.println("chose intern to make him specialized doctor");
                for(Doctor e : Hospital.doctorList ){
                    if ( e instanceof InternDoctor ) {
                        System.out.println(e);
                    }
                }
                System.out.println("enter id ");      
                     int dId = in.nextInt();
                System.out.println("enter department index");    
                     int index = in.nextInt() ;
                for(Doctor e : Hospital.doctorList ){      
                    if (e.getId() == dId) {
                    Hospital.doctorList.remove(e) ;
                    
                    Hospital.doctorList.add(new SpecializedDoctor(e,index));
                    }
                
                }  
            }
        }
    }
    
}
