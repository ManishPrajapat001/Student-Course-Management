package Entity;

public class Course {
//    Fields: id, courseName, description, durationInWeeks, active
    private Integer id;
    private String courseName;
    private String description;
    private Integer durationInWeeks;
    private boolean active;

//    constuctor
    Course(Integer id,String courseName,String description,Integer durationInWeeks){
        this.id =id;
        this.courseName =courseName;
        this.description = description;
        this.durationInWeeks = durationInWeeks;
        this.active = true;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void displayCourse(){
        System.out.println("Info of Selected Course");
        System.out.println("Name of course :"+courseName);
        System.out.println("Course Description :"+ description);
        System.out.println("duration (in weeks) :"+ durationInWeeks);
        System.out.print("status: "+ active);
    }
}
