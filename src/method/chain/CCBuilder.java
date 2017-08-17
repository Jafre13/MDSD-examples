package function.sequence.builders;

import objects.CC;

public class CCBuilder {
    public String address;

    CC getValue(){
        return new CC(address);
    }
}
