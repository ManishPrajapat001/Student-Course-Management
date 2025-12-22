import Entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> studentArrayList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void studentManagementConsole(){
        Menu.displayStudentManagementMenu();

        Integer choice = sc.nextInt();

        switch (choice){
            case 1:
//                StudentMangement.

        }


    }

    public static void courseManagementConsole(){

    }

    public static void enrollmentManagementConsole(){

    }

    public static void main(){
        Integer choice = 0;
        do {
            Menu.displayMainMenu();
            choice = sc.nextInt();

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
