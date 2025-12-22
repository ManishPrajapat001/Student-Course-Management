package Utils;

import Entity.Course;
import Entity.Student;

import java.util.ArrayList;

public class IdGenerator {

    public static int getNextStudentId(ArrayList<Student>studentArrayList){
        return studentArrayList.size();
    }

    public static int getNextCourseId(ArrayList<Course>CourseArrayList){
        return CourseArrayList.size();
    }


}
