package method.chain;

import objects.Subject;

public class SubjectBuilder {
    public String text;


    Subject getValue(){
        return new Subject(text);
    }
}
