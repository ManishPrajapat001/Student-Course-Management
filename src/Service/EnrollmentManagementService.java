package Service;

import static Utils.IdGenerator.validateId;

import Entity.Enrollment;
import Exception.EntityNotFoundException;
import Repositories.EnrollmentManagementRepository;

import java.util.ArrayList;

public class EnrollmentManagementService {
    public static void addEnrollment(int student_id,int course_id,String enrollmentDate) throws Exception{
//        check for validation of id's odf course and student
        if(!validateId("student",student_id)){
            throw new EntityNotFoundException("INVALID STUDENT ID");
        }
        if(!validateId("course",course_id)){
            throw new EntityNotFoundException("INVALID COURSE ID");
        }
//        now adding
        EnrollmentManagementRepository.addEnrollment(student_id,course_id,enrollmentDate);


    }

    public static ArrayList<Enrollment> viewEnrollmentofStudentById(int student_id) throws Exception{

        if(!validateId("student",student_id)){
            throw new EntityNotFoundException("INVALID STUDENT ID");
        }

        return EnrollmentManagementRepository.viewEnrollmentsOfStudent(student_id);


    }

    public static void changeStatus(int enrollment_id,String status) throws Exception{
        boolean isStatusChanged =  EnrollmentManagementRepository.changeStatus(enrollment_id,status);

        if (!isStatusChanged){
            throw new EntityNotFoundException("INVALID ENROLLMENT_ID");
        }
    }

}

