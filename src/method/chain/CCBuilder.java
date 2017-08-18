package method.chain;

import objects.CC;
import objects.Message;

public class CCBuilder {
    public String address;
    private MessageBuilder parent;

    public CCBuilder(MessageBuilder parent) {
        this.parent = parent;
    }

    CC getValue() {
        return new CC(address);
    }

    public CCBuilder to(String s){
        this.address = s;
        return this;
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
}
