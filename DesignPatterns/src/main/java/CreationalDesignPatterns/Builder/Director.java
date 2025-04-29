package CreationalDesignPatterns.Builder;

// Orchestrates the building of object

public class Director {

    StudentBuilder studentBuilder;

    Director( StudentBuilder builder ){
        studentBuilder = builder;
    }

    public Student createStudent() {

        if( studentBuilder instanceof EngineeringStudentBuilder ) {
            return createEngineeringStudent();
        }
        else
            return createMBAStudent();
    }

    private Student createMBAStudent() {
        return studentBuilder.setRollNo(2).setName("xzy").setAge(20)
                .setAddress("1/3a").setFieldOfStudy("Business").setSubjects().build();
    }

    public Student createEngineeringStudent() {
        return studentBuilder.setRollNo(1).setName("xyz").setAge(23)
                .setAddress("13/2a").setFieldOfStudy("Civil").setSubjects().build();
    }
}
