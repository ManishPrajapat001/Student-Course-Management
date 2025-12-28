package Service;

import Entity.Course;
import Entity.Student;
import Repositories.CourseManagementRepository;

import java.util.ArrayList;
import Exception.EntityNotFoundException;

public class CourseManagementService {
    public static void addCourse(String courseName,String description,Integer durationInWeeks){
        CourseManagementRepository.addCourse(courseName,description,durationInWeeks);
    }

    public static ArrayList<Course> viewAllCourses(){
        return CourseManagementRepository.viewAllCourses();
    }

    public static void changeStatus(int course_id,boolean status) throws Exception{
        boolean statusChanged = CourseManagementRepository.changeStatus(course_id,status);
         if(!statusChanged){
             throw new EntityNotFoundException("Entity doesn't exist");
         }
    }
}
