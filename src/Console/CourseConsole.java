package Console;

import Entity.Course;
import Entity.Student;
import Menu.Menu;
import Repositories.CourseManagementRepository;
import Service.CourseManagementService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Exception.EntityNotFoundException;

public class CourseConsole {
    static Scanner sc = new Scanner(System.in);

    private static void addCourse(){
        try {
            System.out.print("Enter course Name : ");
            String courseName = sc.nextLine();
            System.out.print("Course description : ");
            String description = sc.nextLine();
            System.out.print("Duration of course (in Weeks) :");
            Integer durationInWeeks = sc.nextInt();
            sc.nextLine();

            CourseManagementRepository.addCourse(courseName,description,durationInWeeks);
            System.out.println("New course Added successfully!");
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }

    }

    private static void viewAllCourses(){
        ArrayList<Course>courseArrayList = CourseManagementService.viewAllCourses();
        System.out.print("============================= LIST OF COURSES ======================================");

        if(courseArrayList.isEmpty() ){
            System.out.println("No Course exists");
        }
        else{
            for(Course course: courseArrayList){
                System.out.println("----------------------------------------------------------------------------------------------");
                course.displayCourse();
            }
        }
        System.out.print("============================= LIST ENDS HERE ======================================");



    }

    private static void changeStatus( boolean status){
        try {

            System.out.print("Enter course id : ");
            int course_id = sc.nextInt();
            sc.nextLine();

            CourseManagementService.changeStatus(course_id,status);
            System.out.println("Status changed to : "+status );
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }catch (EntityNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void courseManagementConsole(){
        int choice = 0;
        do {
            Menu.displayCourseManagementMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    addCourse();
                    break;
                case 2:
                     viewAllCourses();
                    break;
                case 3:
                    changeStatus(true);
                     break;
                case 4:
                    changeStatus(false);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != 5);
    }

}
