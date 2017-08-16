package function.sequence.builders;

import objects.Body;

public class BodyBuilder {
    String text;

    public Body getValue(){
        return new Body(text);
    }
}
