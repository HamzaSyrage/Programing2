package programing2.project;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate localDate = LocalDate.now();
        Date.setPresentDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        System.out.println("");
        System.out.println("present " + Date.presentDate);
        System.out.println("");
        Hospital.doctorList.add(new InternDoctor(2023, 1, 1, "ahmad", 2000, 1, 1));
        Hospital.doctorList.add(new SpecializedDoctor(2, "samer", 2000, 1, 1));
        Hospital.doctorList.add(new ContractedDoctor(2020, 1, 1, "jamal", 2000, 1, 1));
        Hospital.patientList.add(new InnerPatient(false, "kamal", "damascus", 2000, 1, 1));
        Hospital.patientList.add(new OutterPatient(2023, 1, 1, "ramy", "damascus", 2000, 1, 1));
        Hospital.patientList.get(0).addInnerTreatmentToList(1, Hospital.doctorList, 2024, 6, 1, 2500);
        Hospital.patientList.get(0).addOutterTreatmentToList(2, Hospital.doctorList.get(0), 2024, 5, 1, 5000);
        Hospital.patientList.get(1).addOutterTreatmentToList(1, Hospital.doctorList.get(1), 2024, 3, 5, 1000);
        
        int op;
        while (true) {
            System.out.println("chose an option :\n [0] end the program\n [1] add new doctor\n [2] delete existing doctor\n"
                    + " [3] show doctor informatin\n [4] convert intern to specialized\n [5] get number of doctor\n"
                    + " [6] add new patient\n [7] discharge patient from hospital\n [8] accept outter patient\n"
                    + " [9] show patient information\n [10] add treatment to patient\n [11] show all patient in department\n"
                    + " [12] show patient treatment list\n [13] show number of patient in specific department\n");

            op = in.nextInt();

            switch (op) {
                default:
                    System.out.println("");
                    System.out.println("invalid input");
                    System.out.println("");
                    break;
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

                    switch (op2) {
                        default:
                            System.out.println("");
                            System.out.println("invalid input");
                            System.out.println("");
                            break;
                        case 1:
                            int sy,
                             sm,
                             sd;
                            System.out.println("enter name");
                            name = in.next();
                            System.out.println("enter birth year");
                            y = in.nextInt();
                            System.out.println("enter birth month");
                            m = in.nextInt();
                            System.out.println("enter birth day");
                            d = in.nextInt();
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
                            System.out.println("enter name");
                            name = in.next();
                            System.out.println("enter birth year");
                            y = in.nextInt();
                            System.out.println("enter birth month");
                            m = in.nextInt();
                            System.out.println("enter birth day");
                            d = in.nextInt();
                            System.out.println("");
                            System.out.println("chose doctor department");
                            System.out.println("");
                            Hospital.getDepartment();
                            index = in.nextInt();

                            Hospital.doctorList.add(new SpecializedDoctor(index, name, y, m, d));
                            break;
                        case 3:
                            System.out.println("enter name");
                            name = in.next();
                            System.out.println("enter birth year");
                            y = in.nextInt();
                            System.out.println("enter birth month");
                            m = in.nextInt();
                            System.out.println("enter birth day");
                            d = in.nextInt();
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

                    System.out.println("");
                    System.out.println("chose the doctor by id to delete");
                    System.out.println("");
                    Hospital.getDoctorLIst();
                    int rid = in.nextInt();
                    boolean rmFound = false;
                    for (Doctor e : Hospital.doctorList) {
                        if (e.getId() == rid) {
                            rmFound = true;
                        }
                    }
                    if (!rmFound) {
                        System.out.println("");
                        System.out.println("invalid input");
                        System.out.println("");
                    } else {
                        Hospital.doctorList.removeIf(prdct -> prdct.getId() == rid);
                    }
                    break;
                case 3:
                    System.out.println(" [1] all doctor\n [2] intern doctor\n [3] specialized doctor\n [4] contracted doctor\n");
                    int op3 = in.nextInt();
                    boolean isThereDoctor = false;
                    switch (op3) {
                        default:
                            System.out.println("");
                            System.out.println("invalid input");
                            System.out.println("");
                            break;
                        case 1:
                            Hospital.getDoctorLIst();

                            if (Hospital.doctorList.isEmpty()) {
                                System.out.println("");
                                System.out.println("there is no doctor");
                                System.out.println("");
                            }
                            break;
                        case 2:
                            for (Doctor e : Hospital.doctorList) {
                                if (e instanceof InternDoctor) {
                                    System.out.println(e);
                                    isThereDoctor = true;
                                }
                            }
                            if (!isThereDoctor) {
                                System.out.println("");
                                System.out.println("there is no intern doctor");
                                System.out.println("");
                            }
                            break;
                        case 3:
                            for (Doctor e : Hospital.doctorList) {
                                if (e instanceof SpecializedDoctor) {
                                    System.out.println(e);
                                    isThereDoctor = true;
                                }
                            }
                            if (!isThereDoctor) {
                                System.out.println("");
                                System.out.println("there is no specialized doctor");
                                System.out.println("");
                            }
                            break;
                        case 4:
                            for (Doctor e : Hospital.doctorList) {
                                if (e instanceof ContractedDoctor) {
                                    System.out.println(e);
                                    isThereDoctor = true;
                                }
                            }
                            if (!isThereDoctor) {
                                System.out.println("");
                                System.out.println("there is no contracted doctor");
                                System.out.println("");
                            }
                            break;
                    }
                    break;
                case 4:
                    boolean InternFound = false;
                    boolean validId = false;
                    for (Doctor e : Hospital.doctorList) {
                        if (e instanceof InternDoctor) {
                            System.out.println(e);
                            InternFound = true;
                        }
                    }
                    if (InternFound) {
                        System.out.println("chose intern to make him specialized doctor by id");
                        System.out.println("");
                        System.out.println("enter id ");
                        System.out.println("");
                        int dId = in.nextInt();
                        for (Doctor e : Hospital.doctorList) {
                            if (e instanceof InternDoctor) {
                                
                            if (e.getId() == dId) {
                                validId = true;
                            }
                            }
                        }

                        if (validId) {

                            Hospital.getDepartment();
                            System.out.println("");
                            System.out.println("enter department index");
                            System.out.println("");
                            int indexOfDepartment = in.nextInt();
                            for (Doctor e : Hospital.doctorList) {
                                if (e.getId() == dId) {
                                    Hospital.doctorList.add(new SpecializedDoctor(e, indexOfDepartment));
                                    Hospital.doctorList.remove(e);
                                }

                            }
                        } else {
                            System.out.println("");
                            System.out.println("invalid id");
                            System.out.println("");
                        }

                    } else {
                        System.out.println("");
                        System.out.println("there is no intern");
                        System.out.println("");
                    }
                    break;
                case 5:
                    int doctorCountre = 0;
                    System.out.println(" [1] all doctor\n [2] intern doctor\n [3] specialized doctor\n [4] contracted doctor\n");
                    int op4 = in.nextInt();
                    switch (op4) {
                        default:
                            System.out.println("");
                            System.out.println("invalid input");
                            System.out.println("");
                            break;
                        case 1:
                            System.out.println("");
                            System.out.println("number of all doctor is: " + Hospital.doctorList.size());
                            System.out.println("");
                            break;
                        case 2:
                            for (Doctor e : Hospital.doctorList) {
                                if (e instanceof InternDoctor) {
                                    doctorCountre++;
                                }
                            }
                            System.out.println("");
                            System.out.println("number of intern doctor is: " + doctorCountre);
                            System.out.println("");
                            break;
                        case 3:
                            for (Doctor e : Hospital.doctorList) {
                                if (e instanceof SpecializedDoctor) {
                                    doctorCountre++;
                                }
                            }
                            System.out.println("");
                            System.out.println("number of specialized doctor is: " + doctorCountre);
                            System.out.println("");
                            break;
                        case 4:
                            for (Doctor e : Hospital.doctorList) {
                                if (e instanceof ContractedDoctor) {
                                    doctorCountre++;
                                }
                            }
                            System.out.println("");
                            System.out.println("number of contracted doctor is: " + doctorCountre);
                            System.out.println("");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("chose patient type\n [1] inner patient\n [2] outter patient");
                    int op5 = in.nextInt();
                    boolean isDisCharged;
                    String addres;

                    switch (op5) {
                        default:
                            System.out.println("");
                            System.out.println("invalid input");
                            System.out.println("");
                            break;
                        case 1:
                            int dy,
                             dm,
                             dd;
                            System.out.println("enter name");
                            name = in.next();
                            System.out.println("enter addres");
                            addres = in.next();
                            System.out.println("enter birth year");
                            y = in.nextInt();
                            System.out.println("enter birth month");
                            m = in.nextInt();
                            System.out.println("enter birth day");
                            d = in.nextInt();
                            System.out.println("");
                            System.out.println("is the patient charged y/n");
                            System.out.println("");
                            char answer = in.next().charAt(0);
                            if (answer == 'y') {
                                isDisCharged = true;
                            } else {
                                isDisCharged = false;
                            }
                            if (isDisCharged) {
                                System.out.println("enter discharged date");
                                System.out.println("enter discharged year");
                                dy = in.nextInt();
                                System.out.println("enter discharged month");
                                dm = in.nextInt();
                                System.out.println("enter discharged day");
                                dd = in.nextInt();
                                Hospital.patientList.add(new InnerPatient(isDisCharged, dy, dm, dd, name, addres, y, m, d));
                            } else {
                                Hospital.patientList.add(new InnerPatient(isDisCharged, name, addres, y, m, d));
                            }
                            break;
                        case 2:
                            System.out.println("enter name");
                            name = in.next();
                            System.out.println("enter addres");
                            addres = in.next();
                            System.out.println("enter birth year");
                            y = in.nextInt();
                            System.out.println("enter birth month");
                            m = in.nextInt();
                            System.out.println("enter birth day");
                            d = in.nextInt();
                            System.out.println("");
                            System.out.println("enter accept date");
                            System.out.println("");
                            System.out.println("enter accept year");
                            dy = in.nextInt();
                            System.out.println("enter accept month");
                            dm = in.nextInt();
                            System.out.println("enter accept day");
                            dd = in.nextInt();
                            Hospital.patientList.add(new OutterPatient(dy, dm, dd, name, addres, y, m, d));
                            break;
                    }
                    break;
                case 7:
                    isDisCharged = false;
                    boolean valid = false;
                    for (Patient e : Hospital.patientList) {
                        if (e instanceof InnerPatient) {
                            if (!((InnerPatient) e).getIsDischarged()) {

                                System.out.println(e);
                                isDisCharged = true;
                            }
                        }
                    }
                    if (isDisCharged) {
                        System.out.println("chose the patient by id to discharge him");
                        System.out.println("");
                        System.out.println("enter id ");
                        System.out.println("");
                        int dId = in.nextInt();
                        for (Patient e : Hospital.patientList) {
                            if (e instanceof InnerPatient) {
                                
                            if (e.getId() == dId) {
                                valid = true;
                            }

                           }
                        }

                        if (valid) {

                            int dy, dm, dd;

                            System.out.println("");
                            System.out.println("enter discharged date");
                            System.out.println("");
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
                        } else {
                            System.out.println("");
                            System.out.println("invalid id");
                            System.out.println("");
                        }
                    } else {
                        System.out.println("");
                        System.out.println("there is no patient to discharge");
                        System.out.println("");
                    }
                    break;
                case 8:
                    boolean outterFound = false;
                    validId = false;
                    int dy,
                     dm,
                     dd;
                    for (Patient p : Hospital.patientList) {
                        if (p instanceof OutterPatient) {
                            System.out.println(p);
                            outterFound = true;
                        }
                    }
                    if (outterFound) {
                        System.out.println("chose outter patient to accept him");
                        System.out.println("");
                        System.out.println("enter id ");
                        System.out.println("");
                        int dId = in.nextInt();
                        for (Patient e : Hospital.patientList) {
                            if (e instanceof OutterPatient) {
                                
                            if (e.getId() == dId) {
                                validId = true;
                            }
                            }

                        }

                        if (validId) {
                            Hospital.getDepartment();
                            System.out.println("");
                            System.out.println("enter accept date");
                            System.out.println("");
                            System.out.println("enter accept year");
                            dy = in.nextInt();
                            System.out.println("enter accept month");
                            dm = in.nextInt();
                            System.out.println("enter accept day");
                            dd = in.nextInt();
                            for (Patient p : Hospital.patientList) {
                                if (p.getId() == dId) {
                                    Hospital.patientList.add(new InnerPatient((OutterPatient) p));
                                    Hospital.patientList.remove(p);
                                }

                            }
                        } else {
                            System.out.println("");
                            System.out.println("invalid id");
                            System.out.println("");
                        }
                    } else {
                        System.out.println("");
                        System.out.println("there is no outter patient");
                        System.out.println("");
                    }
                    break;
                case 9:
                    System.out.println(" [1] all patient\n [2] inner patient\n [3] outter patient\n");
                    int op6 = in.nextInt();
                    boolean isTherePatient = false;
                    switch (op6) {
                        default:
                            System.out.println("");
                            System.out.println("invalid input");
                            System.out.println("");
                            break;
                        case 1:
                            Hospital.getPatientLIst();

                            if (Hospital.patientList.isEmpty()) {
                                System.out.println("");
                                System.out.println("there is no patient");
                                System.out.println("");
                            }
                            break;
                        case 2:
                            for (Patient e : Hospital.patientList) {
                                if (e instanceof InnerPatient) {
                                    System.out.println(e);
                                    isTherePatient = true;
                                }
                            }
                            if (!isTherePatient) {
                                System.out.println("");
                                System.out.println("there is no inner patient");
                                System.out.println("");
                            }
                            break;
                        case 3:
                            for (Patient e : Hospital.patientList) {
                                if (e instanceof OutterPatient) {
                                    System.out.println(e);
                                    isTherePatient = true;
                                }
                            }
                            if (!isTherePatient) {
                                System.out.println("");
                                System.out.println("there is no outter patient");
                                System.out.println("");
                            }
                            break;
                    }
                    break;
                case 10:
                    validId = false;
                    System.out.println("chose patient by id to add treatment to him");
                    Hospital.getPatientLIst();
                    System.out.println("");
                    System.out.println("enter id");
                    System.out.println("");
                    int tid = in.nextInt();
                    for (Patient e : Hospital.patientList) {
                        if (e.getId() == tid) {
                            validId = true;
                        }

                    }

                    if (validId) {
                        System.out.println("entre treatment price");
                        float price = in.nextFloat();
                        System.out.println("");
                        System.out.println("entre treatment date");
                        System.out.println("");
                        System.out.println("entre treatment year");
                        int ty = in.nextInt();
                        System.out.println("entre treatment month");
                        int tm = in.nextInt();
                        System.out.println("entre treatment day");
                        int td = in.nextInt();
                        for (Patient e : Hospital.patientList) {
                            if (e.getId() == tid) {
                                if (e instanceof InnerPatient) {
                                    System.out.println("chose treatment type\n [1] inner treatment\n [2] outter treatment");
                                    int op7 = in.nextInt();
                                    switch (op7) {
                                        default:
                                            System.out.println("");
                                            System.out.println("invalid input");
                                            System.out.println("");
                                            break;
                                        case 1:
                                            System.out.println("chose department by index");
                                            Hospital.getDepartment();
                                            System.out.println("");
                                            System.out.println("enter department index");
                                            System.out.println("");
                                            int departmentIndex = in.nextInt();
                                            if (departmentIndex > 5) {
                                                System.out.println("");
                                                System.out.println("invalid input");
                                                System.out.println("");
                                            } else {
                                                int attendNumbre;
                                                while (true) {

                                                    System.out.println("enter how many attend doctor :");
                                                    attendNumbre = in.nextInt();
                                                    if (attendNumbre > Hospital.doctorList.size()) {
                                                        System.out.println("");
                                                        System.out.println("there is no enough doctor");
                                                        System.out.println("");
                                                    } else {
                                                        break;
                                                    }
                                                }

                                                ArrayList<Doctor> attendDoctorList = new ArrayList();
                                                for (int i = 0; i < attendNumbre; i++) {
                                                    System.out.println("");
                                                    System.out.println(i + "-chose attend doctor by id");
                                                    System.out.println("");
                                                    for (Doctor doc : Hospital.doctorList) {

                                                        if (!(attendDoctorList.contains(doc))) {
                                                            System.out.println(doc);
                                                        }

                                                    }
                                                    int did = in.nextInt();
                                                    for (Doctor doc : Hospital.doctorList) {
                                                        if (doc.getId() == did) {
                                                            attendDoctorList.add(doc);
                                                            if (doc instanceof ContractedDoctor) {
                                                                ((ContractedDoctor) doc).addRemuneration(price);
                                                            }
                                                        }
                                                    }
                                                }
                                                ((InnerPatient) e).addInnerTreatmentToList(departmentIndex, attendDoctorList, ty, tm, td, price);
                                            }
                                            break;

                                        case 2:

                                            System.out.println("chose attend doctor by id");
                                            Hospital.getDoctorLIst();
                                            System.out.println("");
                                            System.out.println("enter doctor id");
                                            System.out.println("");
                                            int did = in.nextInt();
                                            for (Doctor t : Hospital.doctorList) {
                                                if (t.getId() == did) {
                                                    validId = true;
                                                }

                                            }

                                            if (validId) {
                                                System.out.println("chose clinic by index");
                                                Hospital.getClinic();
                                                System.out.println("");
                                                System.out.println("enter clinic index");
                                                System.out.println("");
                                                int clinicIndex = in.nextInt();
                                                for (Doctor attendDoctor : Hospital.doctorList) {
                                                    if (attendDoctor.getId() == did) {
                                                        if (attendDoctor instanceof ContractedDoctor) {
                                                            ((ContractedDoctor) attendDoctor).addRemuneration(price);
                                                        }
                                                        ((InnerPatient) e).addOutterTreatmentToList(clinicIndex, attendDoctor, ty, td, td, price);

                                                    }

                                                }
                                            } else {
                                                System.out.println("");
                                                System.out.println("invalid id");
                                                System.out.println("");
                                            }
                                            break;

                                    }
                                } else if (e instanceof OutterPatient) {
                                    System.out.println("chose attend doctor by id");
                                    Hospital.getDoctorLIst();
                                    System.out.println("");
                                    System.out.println("enter doctor id");
                                    System.out.println("");
                                    int did = in.nextInt();

                                    System.out.println("chose clinic by index");
                                    Hospital.getClinic();
                                    System.out.println("");
                                    System.out.println("enter clinic index");
                                    System.out.println("");
                                    int clinicIndex = in.nextInt();
                                    for (Doctor attendDoctor : Hospital.doctorList) {
                                        if (attendDoctor.getId() == did) {
                                            if (attendDoctor instanceof ContractedDoctor) {
                                                ((ContractedDoctor) attendDoctor).addRemuneration(price);
                                            }
                                            ((OutterPatient) e).addOutterTreatmentToList(clinicIndex, attendDoctor, ty, td, td, price);

                                        }

                                    }
                                }
                            }
                        }
                    } else {
                        System.out.println("");
                        System.out.println("invalid id");
                        System.out.println("");
                    }
                    break;
                case 11:
                    System.out.println("chose an option\n [1] show patient of all time\n [2] show patient in specific time zone");
                 
                    int op7 = in.nextInt();
                    
                    switch (op7) {
                        default:
                            System.out.println("");
                            System.out.println("invalid input");
                            System.out.println("");
                            break;
                        case 1:
                            for (Patient p : Hospital.patientList) {
                                if (p instanceof InnerPatient) {
                                    
                                    if (!((InnerPatient) p).getInnerTreatmentList().isEmpty()) {
                                        
                                    
                                        System.out.println(p);
                                    
                                   } else {
                                        System.out.println("");
                                        System.out.println("there is no treatment");
                                        System.out.println("");
                                    }
                                   
                                }
                            }
                            break;

                        case 2:
                            System.out.println("");
                            System.out.println("enter time zone start date");
                            System.out.println("");
                            System.out.println("enter time zone start year");
                            int zsy = in.nextInt();
                            System.out.println("enter time zone start month");
                            int zsm = in.nextInt();
                            System.out.println("enter time zone start day");
                            int zsd = in.nextInt();

                            System.out.println("");
                            System.out.println("enter time zone end date");
                            System.out.println("");
                            System.out.println("enter time zone end year");
                            int zey = in.nextInt();
                            System.out.println("enter time zone end month");
                            int zem = in.nextInt();
                            System.out.println("enter time zone end day");
                            int zed = in.nextInt();

                            for (Patient p : Hospital.patientList) {
                                if (p instanceof InnerPatient) {
                                    for (InnerTreatment t : ((InnerPatient) p).getInnerTreatmentList()) {
                                        if (zsy < t.getTreatmentDate().getYear()) {
                                            if (t.getTreatmentDate().getYear() < zey) {
                                                System.out.println(p);
                                            } else if (t.getTreatmentDate().getYear() == zey) {
                                                if (t.getTreatmentDate().getMonth() < zem) {
                                                    System.out.println(p);
                                                } else if (t.getTreatmentDate().getMonth() == zem) {
                                                    if (t.getTreatmentDate().getDay() <= zed) {
                                                        System.out.println(p);
                                                    }
                                                }
                                            }
                                        } else if (zsy == t.getTreatmentDate().getYear()) {
                                            if (zsm < t.getTreatmentDate().getMonth()) {
                                                System.out.println(p);
                                            } else if (zsm == t.getTreatmentDate().getMonth()) {
                                                if (zsd <= t.getTreatmentDate().getDay()) {
                                                    System.out.println(p);
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            break;
                    }
                    break;
                case 12:
                    validId = false;
                    System.out.println("chose patient by id ");
                    Hospital.getPatientLIst();
                    System.out.println("");
                    System.out.println("enter id");
                    System.out.println("");
                    int pid = in.nextInt();
                    for (Patient e : Hospital.patientList) {
                        if (e.getId() == pid) {
                            validId = true;
                        }

                    }

                    if (validId) {
                        for (Patient p : Hospital.patientList) {
                            if (p.getId() == pid) {
                                if (p instanceof InnerPatient) {
                                    p.getTreatmentList();
                                    if (((InnerPatient) p).getInnerTreatmentList().isEmpty()) {
                                        System.out.println("");
                                        System.out.println("there is no Treatment");
                                        System.out.println("");
                                    }
                                } else if (p instanceof OutterPatient) {
                                    p.getTreatmentList();
                                    if (((OutterPatient) p).getOutterTreatmentsList().isEmpty()) {
                                        System.out.println("");
                                        System.out.println("there is no Treatment");
                                        System.out.println("");
                                    }
                                }
                            }
                        }
                    } else {
                        System.out.println("");
                        System.out.println("invalid id");
                        System.out.println("");
                    }
                    break;
                case 13:    
                    System.out.println("chose an option\n [1] show number patient of all time and all department\n [2] show number of patient in specific time zone");
                    int op8 = in.nextInt();
                    int patientCount = 0;
                    switch (op8) {
                        default:
                            System.out.println("");
                            System.out.println("invalid input");
                            System.out.println("");
                            break;

                        case 1:
                            for (Patient p : Hospital.patientList) {
                                if (p instanceof InnerPatient) {
                                    patientCount++;
                                }
                            }

                            System.out.println("");
                            System.out.println("number of patient is :" + patientCount);
                            System.out.println("");
                            break;

                        case 2:
                            System.out.println("chose department by index");
                            Hospital.getDepartment();
                            System.out.println("");
                            System.out.println("enter index");
                            System.out.println("");
                            int departmentIndex = in.nextInt();
                            System.out.println("");
                            System.out.println("enter time zone start date");
                            System.out.println("");
                            System.out.println("enter time zone start year");
                            int zsy = in.nextInt();
                            System.out.println("enter time zone start month");
                            int zsm = in.nextInt();
                            System.out.println("enter time zone start day");
                            int zsd = in.nextInt();

                            System.out.println("");
                            System.out.println("enter time zone end date");
                            System.out.println("");
                            System.out.println("enter time zone end year");
                            int zey = in.nextInt();
                            System.out.println("enter time zone end month");
                            int zem = in.nextInt();
                            System.out.println("enter time zone end day");
                            int zed = in.nextInt();

                            for (Patient p : Hospital.patientList) {
                                if (p instanceof InnerPatient) {
                                    for (InnerTreatment t : ((InnerPatient) p).getInnerTreatmentList()) {
                                        if (t.getDepartmentIndex() == departmentIndex) {
                                            if (zsy < t.getTreatmentDate().getYear()) {
                                                if (t.getTreatmentDate().getYear() < zey) {
                                                    patientCount++;
                                                } else if (t.getTreatmentDate().getYear() == zey) {
                                                    if (t.getTreatmentDate().getMonth() < zem) {
                                                        patientCount++;
                                                    } else if (t.getTreatmentDate().getMonth() == zem) {
                                                        if (t.getTreatmentDate().getDay() <= zed) {
                                                            patientCount++;
                                                        }
                                                    }
                                                }
                                            } else if (zsy == t.getTreatmentDate().getYear()) {
                                                if (zsm < t.getTreatmentDate().getMonth()) {
                                                    patientCount++;
                                                } else if (zsm == t.getTreatmentDate().getMonth()) {
                                                    if (zsd <= t.getTreatmentDate().getDay()) {
                                                        patientCount++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            System.out.println("");
                            System.out.println("number of patient in" + Hospital.department[departmentIndex] + "is :" + patientCount);
                            System.out.println("");
                            break;
                    }
                    break;

            }
        }
    }
}
