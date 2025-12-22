public class Menu {
    public static void displayMainMenu(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("----------------Welcome to Student & Course Management System--------------------");
        System.out.println("1. Student Management");
        System.out.println("2. Course Management");
        System.out.println("3. Enrollment Management");
        System.out.println("4. Exit");
    }

    public static void displayStudentManagementMenu(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("----------------Welcome to Student Management System--------------------");
        System.out.println("1. Add new Student");
        System.out.println("2. View all Students");
        System.out.println("3. Search student by ID");
        System.out.println("4. Deactivate a student");
        System.out.println("5. Back to home");
//        System.out.println("5. Exit");
    }

    public static void displayCourseManagementMenu(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("----------------Welcome to Course Management System--------------------");
        System.out.println("1. Add new course");
        System.out.println("2. View all courses");
        System.out.println("3. Activate a course");
        System.out.println("4. Deactivate a course");
        System.out.println("5. Back to home");

//        System.out.println("5. Exit");
    }


    public static void displayEnrollmentManagementMenu(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("----------------Welcome to Enrollment Management System--------------------");
        System.out.println("1. Enroll a student in a course");
        System.out.println("2. View enrollments for a student");
        System.out.println("3. Mark enrollment as completed/cancelled");
        System.out.println("5. Back to home");

//        System.out.println("4. Exit");
    }
}
