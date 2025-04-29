package CreationalDesignPatterns.Builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Business Maths");
        subs.add("Finances & cals");
        subs.add("Management");
        this.subjects = subs;
        return this;
    }
}
