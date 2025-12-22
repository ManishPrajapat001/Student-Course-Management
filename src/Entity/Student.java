package Entity;

public class Student extends Person{
//    Fields: id, firstName, lastName, email, batch, active (boolean)

    private String batch;
    private Boolean active;

//   will need something which will keep reference in what courses are this student is enrolled

    public Student(int id,String firstName ,String lastName, String email ){

        super(id,firstName, lastName,email, true);
//        this.batch = batch;
    }
//    here comes only setters and getters
//    public String getName(){
//        return this.firstName+this.lastName;
//    }

    public void displayStudent(){
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Name of Student :"+firstName +" "+lastName);

    }


}
