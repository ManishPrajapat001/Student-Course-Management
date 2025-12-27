package Repositories;

import Entity.Course;
import Utils.IdGenerator;

import java.util.ArrayList;

public class CourseManagementRepository {
    private static final ArrayList<Course>courseArrayList = new ArrayList<>();

    public static void addCourse(String courseName,String description,Integer durationInWeeks){
        int id = IdGenerator.getNextCourseId(courseArrayList);
        courseArrayList.add(new Course(id,courseName,description,durationInWeeks));
    }

    public static void viewAllCourses(){
        System.out.print("============================= LIST OF COURSES ======================================");

        for(int i =0;i< courseArrayList.size();i++){
            System.out.println("----------------------------------------------------------------------------------------------");
            courseArrayList.get(i).displayCourse();
        }
        System.out.print("============================= LIST ENDS HERE ======================================");


    }

    public static void changeStatus(int id,boolean active){
        if(!IdGenerator.validateId("course",id)){
            System.out.println("Invalid id!");
            return;
        }

        courseArrayList.get(id).setActive(active);
        System.out.println("Status changed to : "+active );
    }

    public static void viewCourseById(int id){
        if(!IdGenerator.validateId("course",id)){
            System.out.println("Invalid id!");
            return;
        }
         courseArrayList.get(id).displayName();
    }
}
