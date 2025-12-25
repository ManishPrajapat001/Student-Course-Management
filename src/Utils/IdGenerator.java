package Utils;

import Entity.Course;
import Entity.Enrollment;
import Entity.Student;

import java.util.ArrayList;

public class IdGenerator {
    private static int studentId = 0;
    private static int courseId = 0;
    private static int enrollmentId = 0;
    public static int getNextStudentId(ArrayList<Student>studentArrayList){
        studentId= studentArrayList.size();

        return studentId;
    }

    public static int getNextCourseId(ArrayList<Course>CourseArrayList){
        courseId = CourseArrayList.size();
        return courseId;
    }

    public static int getEnrollmentIdId(ArrayList<Enrollment>EnrollmentArrayList){
        courseId = EnrollmentArrayList.size();
        return courseId;
    }

    public static boolean validateId(String type,int id){
        if(id<0)    return false;

        if(type.equals("student")){
            return id<=studentId;
        }
        else if (type.equals("course")){
            return id<=courseId;
        }
        else if(type.equals("enrollment")){
            return id<=enrollmentId;
        }


        return true;
    }


}
