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
                    + " [3] show doctor informatin\n [4] convert intern to specialized\n [5] get numbre of doctor\n"
                    + " [6] add new patient\n [7] discharge patient from hospital\n [8] show patient information");

            op = in.nextInt();

            switch (op) {
                case 0:
                    return;
                case 1:
                  
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
                            
                            Hospital.doctorList.add(new InternDoctor(sy, sm, sd, name, y, m, d));
                            break;
                        case 2:
                            int index;
                            System.out.println("chose doctor department");
                            Hospital.getDepartment();
                            index = in.nextInt();
                            
                            Hospital.doctorList.add(new SpecializedDoctor(index, name, y, m, d));
                            break;
                        case 3:

                            System.out.println("enter start contract year");
                            sy = in.nextInt();
                            System.out.println("enter start contract month");
                            sm = in.nextInt();
                            System.out.println("enter start contract day");
                            sd = in.nextInt();
                            
                            Hospital.doctorList.add(new ContractedDoctor(sy, sm, sd, name, y, m, d));
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
                        isThereDoctor = true ;
                        if (!isThereDoctor) {
                            System.out.println("there is no doctor");
                        }
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
                        System.out.println("numbre of all doctor is: " + Hospital.doctorList.size());
                        System.out.println("");
                        break;
                    case 2 :
                        for (Doctor e : Hospital.doctorList) {
                        if (e instanceof InternDoctor) {
                            doctorCountre++;
                        }
                    }
                            System.out.println("numbre of intern doctor is: " + doctorCountre);
                            System.out.println("");
                        break;
                    case 3 :
                       for (Doctor e : Hospital.doctorList) {
                        if (e instanceof SpecializedDoctor) {
                            doctorCountre++;
                        }
                    } 
                            System.out.println("numbre of specialized doctor is: " + doctorCountre);
                            System.out.println("");
                       break;
                    case 4 :
                         for (Doctor e : Hospital.doctorList) {
                        if (e instanceof ContractedDoctor) {
                            doctorCountre++;
                        }
                    }
                            System.out.println("numbre of contracted doctor is: " + doctorCountre);
                             System.out.println("");
                        break;
                    }
                  break;
                case 6 :
                    System.out.println("chose patient type\n [1] inner patient\n [2] outter patient");
                    int op5 = in.nextInt() ;
                    boolean isDisCharged ;
                    String addres ;
                    System.out.println("enter name");
                    name = in.next();
                    System.out.println("enter addres");
                    addres = in.next() ;
                    System.out.println("enter birth year");
                    y = in.nextInt();
                    System.out.println("enter birth month");
                    m = in.nextInt();
                    System.out.println("enter birth day");
                    d = in.nextInt();
                    switch(op5){
                    case 1 :
                        int dy,dm,dd;
                        System.out.println("is the patient charged y/n");
                        char answer = in.next().charAt(0) ;
                        if (answer == 'y') {
                            isDisCharged = true ;
                        }
                        else {
                        isDisCharged = false ;
                        }
                        if (isDisCharged) {
                            System.out.println("enter discharged date");
                            System.out.println("enter discharged year");
                            dy = in.nextInt();
                            System.out.println("enter discharged month");
                            dm = in.nextInt();
                            System.out.println("enter discharged day");
                            dd = in.nextInt();
                        Hospital.patientList.add(new InnerPatient(isDisCharged, dy, dm, dd, name, addres, y, m, d)) ;
                        }
                        else {
                        Hospital.patientList.add(new InnerPatient(isDisCharged, name, addres, y, m, d)) ;
                        }
                        break;
                    case 2 :
                        System.out.println("enter accept date");
                            System.out.println("enter accept year");
                            dy = in.nextInt();
                            System.out.println("enter accept month");
                            dm = in.nextInt();
                            System.out.println("enter accept day");
                            dd = in.nextInt();
                            Hospital.patientList.add(new OutterPatient(dy, dm, dd, name, addres, y, m, d)) ;
                        break;
                    }
                    break;
                case 7 :
//                    System.out.println("chose the patient by id to discharged");
//                    Hospital.getPatientLIst();
//                    rid = in.nextInt();
//                    Hospital.patientList.removeIf(prdct -> prdct.getId() == rid);
                    isDisCharged = false;

                    for (Patient e : Hospital.patientList) {
                        if (e instanceof InnerPatient) {
                            if (!((InnerPatient) e).getIsDischarged()) {
                                
                            System.out.println(e);
                            isDisCharged = true;
                            }
                        }
                    }
                    if (isDisCharged) {
                        System.out.println("chose the patient by id to discharged");
                        System.out.println("enter id ");
                        int dId = in.nextInt();
                        int dy,dm,dd ;
                        
                            System.out.println("enter discharged date");
                            System.out.println("enter discharged year");
                            dy = in.nextInt();
                            System.out.println("enter discharged month");
                            dm = in.nextInt();
                            System.out.println("enter discharged day");
                            dd = in.nextInt();
                        
                        for (Patient e : Hospital.patientList) {
                            if (e.getId() == dId) {
                                ((InnerPatient) e).setDisgargeDate(dy, dm, dd);
                                }
                        }
                    }
                    else 
                        System.out.println("there is no patient to discharge");
                    break;
                case 8 :
                       System.out.println(" [1] all patient\n [2] inner patient\n [3] outter patient\n");
                    int op6 = in.nextInt();
                    boolean isTherePatient = false ;
                    switch(op6) {
                    case 1 :
                        Hospital.getPatientLIst();
                        isTherePatient = true ;
                        if (!isTherePatient) {
                            System.out.println("thre is no patient");
                        }
                        break;
                    case 2 :
                        for (Patient e : Hospital.patientList) {
                        if (e instanceof InnerPatient) {
                            System.out.println(e);
                            isTherePatient = true ;
                        }
                    }
                        if (!isTherePatient) {
                             System.out.println("there is no inner patient");
                        }
                        break;
                    case 3 :
                       for (Patient e : Hospital.patientList) {
                        if (e instanceof OutterPatient) {
                            System.out.println(e);
                            isTherePatient = true ;
                        }
                    }  
                       if (!isTherePatient) {
                             System.out.println("there is no outter patient");
                        } 
                       break;
                    }
                    break;
//                case 9 :
//                    System.out.println("chose patient by id to add tretment to him");
//                    Hospital.getPatientLIst();
//                    System.out.println("inter id");
//                    int tid = in.nextInt();
//                    System.out.println("entre tretment price");
//                    int price = in.nextInt() ;
//                    System.out.println("entre tretment date");
//                    System.out.println("entre tretment year");
//                    int ty = in.nextInt() ;
//                    System.out.println("entre tretment month");
//                    int tm = in.nextInt() ;
//                    System.out.println("entre tretment day");
//                    int td = in.nextInt() ;
//                    for(Patient e : Hospital.patientList) {
//                        if (e.getId() == tid) {
//                            if (e instanceof InnerPatient) {
//                                System.out.println("chose treatment type\n [1] inner treatment\n [2] outter treatment"); 
//                                int op7 = in.nextInt() ;
//                                switch(op7) {
//                                case 1 :
//                                    System.out.println("chose department by index");
//                                    Hospital.getDepartment();
//                                    System.out.println("enter department index");
//                                    int departmentIndex = in.nextInt() ;
//                                    ((InnerPatient) e).addInnerTreatmentToList(departmentIndex, ty, tm, td, price);
//                                    
//                                    
//                                    System.out.println("enter attend doctor numbre");
//                                    int attendNumbre = in.nextInt() ;
//                                    int idArr[] = new int[attendNumbre];
//                                    int rdid=0 ;
//                                    for (int i : idArr) {
//                                    System.out.println("chose attend doctor by id");   
//                                    int did = in.nextInt();                                       
//                                    for(Doctor doc : Hospital.doctorList) {
//                                        if (!(doc.getId() == rdid)) {
//                                            System.out.println(doc);
//                                        }
//                                    }
//                                    }
//                                    break;
//                                case 2 :
//                                  
//                                System.out.println("chose clinic by index");
//                                Hospital.getClinic();
//                                System.out.println("enter clinic index");
//                                int clinicIndex = in.nextInt() ;
//                                System.out.println("chose attend doctor by id");
//                                Hospital.getDoctorLIst();
//                                System.out.println("enter doctor index");
//                                int did = in.nextInt() ;
//                                for (Doctor attendDoctor : Hospital.doctorList) {
//                                    if (attendDoctor.getId() == did) {
//                                ((InnerPatient) e).addOutterTreatmentToList(clinicIndex, attendDoctor, ty, td, td, price);
//                                        
//                                    }
//                                    
//                                }
//                              
//                                    break;
//                                }
//                                
//                            }
//                            else if (e instanceof OutterPatient) {
//                                System.out.println("chose attend doctor by id");
//                                Hospital.getDoctorLIst();
//                                System.out.println("enter doctor index");
//                                int did = in.nextInt() ;
//                                System.out.println("chose clinic by index");
//                                Hospital.getClinic();
//                                System.out.println("enter clinic index");
//                                int clinicIndex = in.nextInt() ;
//                                for (Doctor attendDoctor : Hospital.doctorList) {
//                                    if (attendDoctor.getId() == did) {
//                                ((OutterPatient) e).addOutterTreatmentToList(clinicIndex, attendDoctor, ty, td, td, price);
//                                        
//                                    }
//                                    
//                                }
//                            }
//                        }
//                    }
//                    break;
            }
        }
    }
}
