package Console;

import Entity.Enrollment;
import Menu.Menu;
import Repositories.CourseManagementRepository;
import Repositories.EnrollmentManagementRepository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Exception.EntityNotFoundException;
import Service.EnrollmentManagementService;

public class EnrollmentConsole {
    private static final Scanner sc = new Scanner(System.in);

    private static void addEnrollment(){
        try {
            System.out.println("Enter course id : ");
            int course_id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter student id : ");

            int student_id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Date (DDMMYYYY) :");
            String enrollmentDate = sc.nextLine();

            EnrollmentManagementService.addEnrollment(student_id,course_id,enrollmentDate);

            System.out.println("Enrollment Added Successfully!");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private static void viewEnrollmentsOfStudent(){
        try {
            System.out.println("Enter student id : ");

            int student_id = sc.nextInt();
            sc.nextLine();
            ArrayList<Enrollment> enrollmentArrayList =EnrollmentManagementService.viewEnrollmentofStudentById(student_id);
            System.out.println("===============================================================================================");
            System.out.println("Enrollment List of Student with Student_id : " +student_id);
            System.out.println("===============================================================================================");

            if (enrollmentArrayList.isEmpty()){
                System.out.println("No enrollment found for this student\n\n");
            }
            else {
                for(Enrollment enrollment:enrollmentArrayList){
                        enrollment.displayEnrollementDetailsOfStudent();
                        System.out.println("----------------------------------------------------------------------------");
                }
            }
            System.out.println("=============================================THE END==================================================");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void changeStatus(String status){
        try {
            System.out.print("Enter enrollment id : ");
            int enrollment_id = sc.nextInt();
            sc.nextLine();
            EnrollmentManagementService.changeStatus(enrollment_id,status);
            System.out.println("Status updated to : " + status);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void enrollmentManagementConsole(){
        int choice =0;
        do {
            Menu.displayEnrollmentManagementMenu();
            choice = sc.nextInt();
            sc.nextLine();
            int student_id,course_id,enrollment_id;
            switch (choice){
                case 1:
                    addEnrollment();
                    break;

                case 2:
                    viewEnrollmentsOfStudent();
                    break;

                case 3:
                    changeStatus("COMPLETED");
                    break;

                case 4:
                     changeStatus("CANCELLED");
                     break;

                case 5:
                    break;

                default:
                    System.out.println("INVALID KEY");
            }

        }while (choice!=5);
    }

}
