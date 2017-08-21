package nested.function;

import objects.*;

public class Builder {
    static Recipient[] recipient(String... to){
        Recipient[] recipients = new Recipient[to.length];
        for (int i = 0; i<to.length;i++){
            recipients[i] = new Recipient(to[i]);
        }
        return recipients;
    }
    static CC[] cc(String... to) {
        CC[] ccs = new CC[to.length];
        for (int i = 0; i<to.length;i++){
            ccs[i] = new CC(to[i]);
        }
        return ccs;
    }
    static Subject subject(String subject){
        return new Subject(subject);

    }

    static Body body(String body){
        return new Body(body);
    }



    static Message message(Recipient[] r, CC[] c, Subject s, Body b ){
        return new Message(r,c,s,b);
    }

    static String to(String to){
        return to;
    }

    public static void main(String[] args){
        System.out.println(
                message(
                        recipient(
                                to("email1@mail.com"),
                                to("mail@mai.dk")
                        ),
                        cc(
                                to("someone"),
                                to("Whom it may concern")
                        ),
                        subject("Nothing"),
                        body("Body text")));
    }
}
