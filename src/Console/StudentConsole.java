package Console;

import Entity.Student;
import Repositories.StudentManagementRepository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Exception.EntityNotFoundException;
import Menu.Menu ;
import Service.StudentManagementService;

public class StudentConsole {
    static Scanner sc = new Scanner(System.in);

    private static void addStudent(){
        System.out.println("Enter First name :");
        String firstName = sc.nextLine();
        System.out.println("Enter Last name :");
        String lastName = sc.nextLine();
        System.out.println("Enter email id :");
        String email = sc.nextLine();

        StudentManagementService.addStudent(firstName,lastName,email);
    }

    private static void viewAllStudents(){
        ArrayList<Student>studentArrayList = StudentManagementService.viewAllStudents();
        System.out.println("========================================LIST OF STUDENTS==========================================================");

        for (Student student:studentArrayList){
            System.out.println("----------------------------------------------------------------------------");

            student.displayPerson();
        }
        System.out.println("========================================LIST ENDS HERE==========================================================");

    }

    private static void searchStudentByID(){
        System.out.println("Enter student Id:");
        int student_id = sc.nextInt();
        try {
            Student student = StudentManagementService.searchStudentByID(student_id);
            System.out.println("----------------------------------------------------------------------------");
            student.displayPerson();
            System.out.println("----------------------------------------------------------------------------");
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

    private static void deactivateStudent(){
        try{
            System.out.println("enter the student id :");
            int student_id = sc.nextInt();
            StudentManagementService.deactivateStudent(student_id);
            System.out.println("Student deactivated successfully!");

        }catch (InputMismatchException e){
            System.out.println("Enter an integer not other type");
        }catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void studentManagementConsole(){
        int choice =0;
        do {
            Menu.displayStudentManagementMenu();

            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewAllStudents();
                    break;

                case 3:
                    searchStudentByID();
                    break;

                case 4:
                    deactivateStudent();
                    break;

                case 5:
                    System.out.println("Exiting \n"+ "-------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Invalid key");
            }
        }while(choice != 5);

    }

}
