import Entity.Student;
import Service.CourseManagementService;
import Service.EnrollmentManagementService;
import Service.StudentManagementService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void studentManagementConsole(){
        int choice =0;
        do {
            Menu.displayStudentManagementMenu();

            choice = sc.nextInt();
            sc.nextLine();
            int student_id;
            switch (choice){
                case 1:
                    System.out.println("Enter First name :");
                    String firstName = sc.nextLine();
                    System.out.println("Enter Last name :");
                    String lastName = sc.nextLine();
                    System.out.println("Enter email id :");
                    String email = sc.nextLine();

                    StudentManagementService.addStudent(firstName,lastName,email);
                    break;

                case 2:
                    StudentManagementService.viewAllStudents();
                    break;

                case 3:
                    System.out.println("Enter student Id:");
                    student_id = sc.nextInt();
                    StudentManagementService.searchStudentByID(student_id);
                    break;

                case 4:
                    System.out.println("enter the student id :");
                    student_id = sc.nextInt();
                    StudentManagementService.deactivateStudent(student_id);
                    break;

                case 5:
                    System.out.println("Exiting \n"+ "-------------------------------------------------------------");
                    return;
//                break;

                default:
                    System.out.println("Invalid key");


            }
        }while(choice != 5);



    }

    public static void courseManagementConsole(){
        int choice = 0;
        do {
            choice = sc.nextInt();
            sc.nextLine();
            int course_id = 0;
            boolean status = false;
//            String courseName,String description,Integer durationInWeeks
            switch (choice){
                case 1:
                    System.out.println("Enter course Name : ");
                    String courseName = sc.nextLine();
                    System.out.print("Course description : ");
                    String description = sc.nextLine();
                    System.out.println("\n duration of course (in Weeks) :");
                    Integer durationInWeeks = sc.nextInt();
                    sc.nextLine();

                    CourseManagementService.addCourse(courseName,description,durationInWeeks);

                    break;

                case 2:
                    CourseManagementService.viewAllCourses();
                    break;

                case 3:

                    status = true;
                    System.out.println("Enter course id : ");
                    course_id = sc.nextInt();
                    sc.nextLine();

                    CourseManagementService.changeStatus(course_id,status);
                    break;


                case 4:
                    System.out.println("Enter course id : ");
                    course_id = sc.nextInt();
                    sc.nextLine();

                    CourseManagementService.changeStatus(course_id,status);

                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != 5);
    }

    public static void enrollmentManagementConsole(){
        int choice =0;
        do {
            choice = sc.nextInt();
            sc.nextLine();
            int student_id,course_id,enrollment_id;
            switch (choice){
                case 1:
                    System.out.println("Enter course id : ");
                    course_id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter student id : ");

                    student_id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Date (DDMMYYYY) :");
                    String enrollmentDate = sc.nextLine();

                    EnrollmentManagementService.addEnrollment(student_id,course_id,enrollmentDate);

                    break;

                case 2:
                    System.out.println("Enter student id : ");

                    student_id = sc.nextInt();
                    sc.nextLine();
                    EnrollmentManagementService.viewEnrollmentsOfStudent(student_id);

                    break;

                case 3:
                    System.out.println("Enter enrollment id : ");
                    enrollment_id = sc.nextInt();
                    sc.nextLine();
                    EnrollmentManagementService.changeStatus(enrollment_id,"COMPLETED");
                    break;

                case 4:
                    System.out.println("Enter enrollment id : ");
                    enrollment_id = sc.nextInt();
                    sc.nextLine();

                    EnrollmentManagementService.changeStatus(enrollment_id,"CANCELLED");
                    break;

                case 5:
                    break;

                default:
                    System.out.println("INVALID KEY");
            }

        }while (choice!=5);
    }

    public static void main(){
        int choice = 0;
        do {
            Menu.displayMainMenu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    studentManagementConsole();
                    break;

                case 2:
                    courseManagementConsole();
                    break;

                case 3:
                    enrollmentManagementConsole();
                    break;

                case 4 :
                    System.out.println("Exiting.......");
                    break;

                default:
                    System.out.println("Invalid Choice...");
            }

        }while(choice != 4);

    }
}
