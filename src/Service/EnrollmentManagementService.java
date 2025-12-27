package Service;

import Entity.Enrollment;
import Utils.IdGenerator;

import java.util.ArrayList;

public class EnrollmentManagementService {
    private static ArrayList<Enrollment>enrollmentArrayList = new ArrayList<>();

//    int id, int student_id, int course_id, String enrollmentDate
    public static void addEnrollment(int student_id, int course_id,String enrollmentDate){
        int id = IdGenerator.getEnrollmentIdId(enrollmentArrayList);
        enrollmentArrayList.add(new Enrollment(id,student_id,course_id,enrollmentDate));

    }

    public static void viewEnrollmentsOfStudent(int student_id){

        System.out.println("Enrollment List of Student with Student_id : " +student_id);
        for(Enrollment enrollment:enrollmentArrayList){
            if(enrollment.getStudentId() == student_id){
                enrollment.displayEnrollementDetailsOfStudent();
                CourseManagementService.viewCourseById(enrollment.getCourseId());
                System.out.println("----------------------------------------------------------------------------");
            }
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------");


    }

    public static void changeStatus(int enrollment_id ,String status){
        if(!IdGenerator.validateId("enrollment",enrollment_id)){
            System.out.println("Invalid Enrollment ID");
            return;
        }

        enrollmentArrayList.get(enrollment_id).setStatus(status);
        System.out.println("Status updated to : " + status);
    }
}
