package CreationalDesignPatterns.Builder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Engineering Maths");
        subs.add("DSP");
        subs.add("OS");
        this.subjects = subs;
        return this;
    }
}
