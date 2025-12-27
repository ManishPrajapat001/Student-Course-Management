package Repositories;

import Entity.Student;
import Utils.IdGenerator;

import java.util.ArrayList;

public class StudentManagementRepository {
    private static ArrayList<Student>studentArrayList = new ArrayList<>();

//    String firstName ,String lastName, String email ,String batch
    public static void addStudent(String firstName, String lastName,String email){
        int newStudentId= IdGenerator.getNextStudentId();
        studentArrayList.add(new Student(newStudentId,firstName,lastName,email));
        System.out.println("Student added successfully!");
    }

    public static ArrayList<Student> viewAllStudents(){
        return studentArrayList;
    }

    public static Student searchStudentByID(Integer id){
        for(Student student : studentArrayList){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }

    public static void deactivateStudent(Integer id){
        if(!IdGenerator.validateId("student", id)){
            System.out.println("Invalid Student id");
        }

        studentArrayList.get(id).changeActiveState(false);

        System.out.println("Student deactivated successfully!");
    }
}
