package Entity;

abstract class Person {
    private int id ;
    private String firstName ;
    private String lastName;
    private String email;
    private boolean active ;

//    constructor for this class
    Person(int id, String firstName, String lastName, String email, boolean active ){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.active = active;
    }

//    getters
    public String getFullName(){
        return this.firstName+this.lastName;
    }

    public void displayPerson(){

        System.out.println(id+" " +firstName +" "+lastName+" "+ email + " "+ active);
    }


    public void changeActiveState(boolean active){
        this.active = active;
    }
}


//person will be inherited by trainer and student
//for handling they will have theri separate management
