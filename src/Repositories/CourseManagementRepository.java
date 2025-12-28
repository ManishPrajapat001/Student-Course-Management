package Repositories;

import Entity.Course;
import Utils.IdGenerator;

import java.util.ArrayList;

public class CourseManagementRepository {
    private static final ArrayList<Course>courseArrayList = new ArrayList<>();

    public static void addCourse(String courseName,String description,Integer durationInWeeks){
        int id = IdGenerator.getNextCourseId();
        courseArrayList.add(new Course(id,courseName,description,durationInWeeks));
    }

    public static ArrayList<Course> viewAllCourses(){

        return courseArrayList;

    }

    public static boolean changeStatus(int id,boolean active){
        for (Course course:courseArrayList){
            if(course.getID() == id){
                course.setActive(active);
                return true;
            }
        }
        return false;


    }

    public static void viewCourseById(int id){
        if(!IdGenerator.validateId("course",id)){
            System.out.println("Invalid id!");
            return;
        }
         courseArrayList.get(id).displayName();
    }
}
