package programing2.project;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate localDate = LocalDate.now();
        Date.setPresentDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        System.out.println("present " + Date.presentDate);

        int op;
        while (true) {
            System.out.println("chose an option :\n [0] end the program\n [1] add new doctor\n [2] delete existing doctor\n"
                    + " [3] show doctor informatin\n [4] convert intern to specialized\n [5] get numbre of doctor\n");

            op = in.nextInt();

            switch (op) {
                case 0:
                    return;
                case 1:
                    Doctor doc;
                    int op2,
                     y,
                     m,
                     d;
                    System.out.println("chose doctor type\n [1] intern doctor\n [2] specialized doctor\n [3] contracted doctor\n");
                    op2 = in.nextInt();
                    String name;
                    System.out.println("enter name");
                    name = in.next();
                    System.out.println("enter birth year");
                    y = in.nextInt();
                    System.out.println("enter birth month");
                    m = in.nextInt();
                    System.out.println("enter birth day");
                    d = in.nextInt();
                    switch (op2) {
                        case 1:
                            int sy,
                             sm,
                             sd;
                            System.out.println("enter start training year");
                            sy = in.nextInt();
                            System.out.println("enter start training month");
                            sm = in.nextInt();
                            System.out.println("enter start training day");
                            sd = in.nextInt();
                            doc = new InternDoctor(sy, sm, sd, name, y, m, d);
                            Hospital.doctorList.add(doc);
                            break;
                        case 2:
                            int index;
                            System.out.println("chose doctor department");
                            Hospital.getDepartment();
                            index = in.nextInt();
                            doc = new SpecializedDoctor(index, name, y, m, d);
                            Hospital.doctorList.add(doc);
                            break;
                        case 3:

                            System.out.println("enter start contract year");
                            sy = in.nextInt();
                            System.out.println("enter start contract month");
                            sm = in.nextInt();
                            System.out.println("enter start contract day");
                            sd = in.nextInt();
                            doc = new ContractedDoctor(sy, sm, sd, name, y, m, d);
                            Hospital.doctorList.add(doc);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("chose the doctor by id to delete");
                    Hospital.getDoctorLIst();
                    int rid = in.nextInt();
                    Hospital.doctorList.removeIf(prdct -> prdct.getId() == rid);
                    break;
                case 3 :
                    System.out.println(" [1] all doctor\n [2] intern doctor\n [3] specialized doctor\n [4] contracted doctor\n");
                    int op3 = in.nextInt();
                    boolean isThereDoctor = false ;
                    switch(op3) {
                    case 1 :
                        Hospital.getDoctorLIst();
                        break;
                    case 2 :
                        for (Doctor e : Hospital.doctorList) {
                        if (e instanceof InternDoctor) {
                            System.out.println(e);
                            isThereDoctor = true ;
                        }
                    }
                        if (!isThereDoctor) {
                             System.out.println("there is no intern doctor");
                        }
                        break;
                    case 3 :
                       for (Doctor e : Hospital.doctorList) {
                        if (e instanceof SpecializedDoctor) {
                            System.out.println(e);
                            isThereDoctor = true ;
                        }
                    }  
                       if (!isThereDoctor) {
                             System.out.println("there is no specialized doctor");
                        } 
                       break;
                    case 4 :
                         for (Doctor e : Hospital.doctorList) {
                        if (e instanceof ContractedDoctor) {
                            System.out.println(e);
                            isThereDoctor = true ;
                        }
                    }
                         if (!isThereDoctor) {
                             System.out.println("there is no contracted doctor");
                        }
                        break;
                    }
                    break;
                case 4:
                    boolean InternFound = false;

                    for (Doctor e : Hospital.doctorList) {
                        if (e instanceof InternDoctor) {
                            System.out.println(e);
                            InternFound = true;
                        }
                    }
                    if (InternFound) {
                        System.out.println("chose intern to make him specialized doctor by id");
                        System.out.println("enter id ");
                        int dId = in.nextInt();
                        Hospital.getDepartment();
                        System.out.println("enter department index");

                        int indexOfDepartment = in.nextInt();
                        for (Doctor e : Hospital.doctorList) {
                            if (e.getId() == dId) {
                                Hospital.doctorList.add(new SpecializedDoctor(e,indexOfDepartment));
                                Hospital.doctorList.remove(e);
                            }

                        }
                    }
                    break;
                case 5 :
                    int doctorCountre = 0 ;
                    System.out.println(" [1] all doctor\n [2] intern doctor\n [3] specialized doctor\n [4] contracted doctor\n");
                    int op4 = in.nextInt();
                    switch(op4) {
                    case 1 :                   
                        System.out.println("numbre of all doctor is:" + Hospital.doctorList.size());
                        System.out.println("");
                        break;
                    case 2 :
                        for (Doctor e : Hospital.doctorList) {
                        if (e instanceof InternDoctor) {
                            doctorCountre++;
                        }
                            System.out.println("numbre of intern doctor is:" + doctorCountre);
                            System.out.println("");
                    }
                        break;
                    case 3 :
                       for (Doctor e : Hospital.doctorList) {
                        if (e instanceof SpecializedDoctor) {
                            doctorCountre++;
                        }
                            System.out.println("numbre of specialized doctor is:" + doctorCountre);
                            System.out.println("");
                    } 
                       break;
                    case 4 :
                         for (Doctor e : Hospital.doctorList) {
                        if (e instanceof ContractedDoctor) {
                            doctorCountre++;
                        }
                            System.out.println("numbre of contracted doctor is:" + doctorCountre);
                             System.out.println("");
                    }
                        break;
                    }
                  break;
            }
        }
    }

}
