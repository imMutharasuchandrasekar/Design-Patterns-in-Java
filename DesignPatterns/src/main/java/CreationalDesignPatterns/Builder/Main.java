package CreationalDesignPatterns.Builder;

public class Main {
    public static void main(String[]args) {

        StudentBuilder builder = new EngineeringStudentBuilder();

        Director dir = new Director( builder );
        Student stu = dir.createStudent();
        System.out.println( stu.toString() );
    }
}
