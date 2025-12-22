package Service;

import Entity.Student;
import Utils.IdGenerator;

import java.util.ArrayList;

public class StudentManagementService {
    private static ArrayList<Student>studentArrayList = new ArrayList<>();

//    String firstName ,String lastName, String email ,String batch
    public static void addStudent(String firstName, String lastName,String email){
        int newStudentId= IdGenerator.getNextStudentId(studentArrayList);
        studentArrayList.add(new Student(newStudentId,firstName,lastName,email));
        System.out.println("Student added successfully!");
    }

    public static void viewAllStudents(){
        System.out.println("----------------------------------------------------------------------------");
        for (Student student:studentArrayList){
            student.displayPerson();
        }
        System.out.println("----------------------------------------------------------------------------");

    }

    public static void searchStudentByID(Integer id){
        if(id < 0 || id>= studentArrayList.size()){
            System.out.println("Invalid Student id");
        }

//        display that student
        System.out.println("----------------------------------------------------------------------------");
        studentArrayList.get(id).displayPerson();
        System.out.println("----------------------------------------------------------------------------");

    }

    public static void deactivateStudent(Integer id){
        if(id < 0 || id>= studentArrayList.size()){
            System.out.println("Invalid Student id");
        }

        studentArrayList.get(id).changeActiveState(false);

        System.out.println("Student deactivated successfully!");
    }
}
