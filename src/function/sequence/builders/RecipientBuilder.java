package function.sequence.builders;

import objects.Recipient;

public class RecipientBuilder {
    public String address;

    Recipient getValue(){
        return new Recipient(address);
    }
}
