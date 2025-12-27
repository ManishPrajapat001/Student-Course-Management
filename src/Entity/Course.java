package Entity;

public class Course {
//    Fields: id, courseName, description, durationInWeeks, active
    private int id;
    private String courseName;
    private String description;
    private int durationInWeeks;
    private boolean active;

//    constuctor
    public Course(int id,String courseName,String description,int durationInWeeks){
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
        System.out.println("status: "+ active);
    }
    public void displayName(){
        System.out.println(this.courseName);
    }
}
