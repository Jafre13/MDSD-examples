package method.chain;

import objects.Message;
import objects.Recipient;

public class RecipientBuilder {
    public String address;
    private MessageBuilder parent;

    public RecipientBuilder(MessageBuilder parent) {
        this.parent = parent;
    }
    public RecipientBuilder recipient(){
        return parent.recipient();
    }
    public CCBuilder cc(){
        return parent.cc();
    }
    public MessageBuilder subject(){
        return parent.subject();
    }
    public MessageBuilder body(){
        return parent.body();
    }

    public Message end(){
        return parent.end();
    }

    public RecipientBuilder to(String s){
        this.address = s;
        return this;
    }
    Recipient getValue(){
        return new Recipient(address);
    }
}
