package Entity;

public class Enrollment {
    private int id;
    private int student_id;
    private int course_id;
    private String enrollmentDate;
    private String status = "PENDING";

    public Enrollment(int id, int student_id, int course_id, String enrollmentDate){
        this.id = id ;
        this.student_id = student_id;
        this.course_id = course_id;
        this.enrollmentDate = enrollmentDate;
    }

    public int getStudentId(){
        return student_id;
    }
    public int getCourseId(){
        return course_id;
    }
    public void displayEnrollementDetailsOfStudent(){
        System.out.print(id + " " + course_id + " " + enrollmentDate + " " );
    }
    public void setStatus(String status){
        this.status = status;
    }
}
