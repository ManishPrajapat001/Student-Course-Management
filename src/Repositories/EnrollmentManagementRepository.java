package Repositories;

import Entity.Enrollment;
import Utils.IdGenerator;

import java.util.ArrayList;

public class EnrollmentManagementRepository {
    private static final ArrayList<Enrollment>enrollmentArrayList = new ArrayList<>();

//    int id, int student_id, int course_id, String enrollmentDate
    public static void addEnrollment(int student_id, int course_id,String enrollmentDate){
        int id = IdGenerator.getEnrollmentIdId(enrollmentArrayList);

        if(!IdGenerator.validateId("student",student_id) ){
            System.out.println("INVALID STUDENT ID");
            return;
        }
        if (!IdGenerator.validateId("course",course_id)){
            System.out.println("INVALID COURSE ID");
            return;
        }

        enrollmentArrayList.add(new Enrollment(id,student_id,course_id,enrollmentDate));

    }

    public static ArrayList<Enrollment> viewEnrollmentsOfStudent(int student_id){
        ArrayList<Enrollment>enrollmentsOfStudent = new ArrayList<>();

        for(Enrollment enrollment:enrollmentArrayList){
            if(enrollment.getStudentId() == student_id){
                enrollmentsOfStudent.add(enrollment);
            }
        }
        return enrollmentsOfStudent;
    }

    public static boolean changeStatus(int enrollment_id ,String status){
       for (Enrollment enrollment:enrollmentArrayList){
           if (enrollment.getId() == enrollment_id){
               enrollment.setStatus(status);
               return true;
           }
       }

       return false;
    }
}
