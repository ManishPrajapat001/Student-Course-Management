package Service;

import Entity.Student;
import Repositories.StudentManagementRepository;
import Exception.EntityNotFoundException;
import Utils.IdGenerator;

import java.util.ArrayList;

public class StudentManagementService {

    public static void addStudent(String firstName,String lastName,String email){
        StudentManagementRepository.addStudent(firstName,lastName,email);
    }


    public static Student searchStudentByID(Integer id) throws EntityNotFoundException {

        Student student =  StudentManagementRepository.searchStudentByID(id);

        if(student == null){
            throw new EntityNotFoundException("Student not Found");
        }

        return student;

    }

    public static ArrayList<Student> viewAllStudents(){
        return StudentManagementRepository.viewAllStudents();
    }

    public static void deactivateStudent(int student_id) throws EntityNotFoundException{
        boolean isDeactivated = StudentManagementRepository.deactivateStudent(student_id);

        if(!isDeactivated){
            throw new EntityNotFoundException("Student not Found");
        }

    }


}
