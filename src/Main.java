import Menu.Menu;
import Repositories.CourseManagementRepository;
import Repositories.EnrollmentManagementRepository;
import Repositories.StudentManagementRepository;

import java.util.Scanner;

import static Console.CourseConsole.courseManagementConsole;
import static Console.EnrollmentConsole.enrollmentManagementConsole;
import static Console.StudentConsole.studentManagementConsole;

public class Main {
    static Scanner sc = new Scanner(System.in);
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
