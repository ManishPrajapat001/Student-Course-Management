package Service;

import Entity.Course;
import Utils.IdGenerator;

import java.util.ArrayList;

public class CourseManagementService {
    private static final ArrayList<Course>courseArrayList = new ArrayList<>();

    public static void addCourse(String courseName,String description,Integer durationInWeeks){
        int id = IdGenerator.getNextCourseId(courseArrayList);
        courseArrayList.add(new Course(id,courseName,description,durationInWeeks));
    }

    public static void viewAllCourses(){
        System.out.print("--------------------------------------------------------\n");

        for(int i =0;i< courseArrayList.size();i++){
            courseArrayList.get(i).displayCourse();
        }
        System.out.print("--------------------------------------------------------\n");

    }

    public static void changeStatus(int id,boolean active){
        if(!IdGenerator.validateId("course",id)){
            System.out.println("Invalid id!");
        }

        courseArrayList.get(id).setActive(active);
    }

    public static void viewCourseById(int id){
        if(!IdGenerator.validateId("course",id)){
            System.out.println("Invalid id!");
        }
         courseArrayList.get(id).displayName();
    }
}
