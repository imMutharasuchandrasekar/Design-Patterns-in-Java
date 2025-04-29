package CreationalDesignPatterns.Builder;

import java.util.List;

public class Student {

    int rollNo;
    String name;
    String address;
    int age;
    String fieldOfStudy;
    List<String> subjects;

    public Student( StudentBuilder builder ) {
        this.rollNo = builder.rollNo;
        this.name = builder.name;
        this.address = builder.address;
        this.fieldOfStudy = builder.fieldOfStudy;
        this.subjects = builder.subjects;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
