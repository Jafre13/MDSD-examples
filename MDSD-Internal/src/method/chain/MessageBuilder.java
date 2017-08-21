package method.chain;

import objects.CC;
import objects.Message;
import objects.Recipient;

import java.util.ArrayList;
import java.util.List;

public class MessageBuilder {
    private List<Recipient> recipients = new ArrayList<>();
    private List<CC> ccs = new ArrayList<>();
    private BodyBuilder body;
    private SubjectBuilder subject;

    private RecipientBuilder currentRecipient;
    private CCBuilder currentCC;
    private SubjectBuilder currentSubject;
    private BodyBuilder currentBody;


    public static MessageBuilder message() {
        return new MessageBuilder();
    }


    public RecipientBuilder recipient() {
        if (currentRecipient != null) {
            recipients.add(currentRecipient.getValue());
        }
        if (currentCC != null){
            ccs.add(currentCC.getValue());
        }
        currentRecipient = new RecipientBuilder(this);
        currentCC = null;
        currentSubject = null;
        currentBody = null;
        return currentRecipient;
    }

    public CCBuilder cc(){
        if (currentCC != null){
            ccs.add(currentCC.getValue());
        }
        if (currentRecipient != null){
            recipients.add(currentRecipient.getValue());
        }
        currentCC = new CCBuilder(this);
        currentRecipient = null;
        currentSubject = null;
        currentBody = null;
        return currentCC;
    }

    public MessageBuilder subject(){
        if (currentRecipient != null) {
            recipients.add(currentRecipient.getValue());
        }
        if (currentCC != null){
            ccs.add(currentCC.getValue());
        }
        currentSubject = new SubjectBuilder();
        subject = currentSubject;
        currentRecipient = null;
        currentCC = null;
        currentBody = null;
        return this;
    }

    public MessageBuilder body(){
        if (currentRecipient != null) {
            recipients.add(currentRecipient.getValue());
        }
        if (currentCC != null){
            ccs.add(currentCC.getValue());
        }
        currentBody = new BodyBuilder();
        body = currentBody;
        currentRecipient = null;
        currentCC = null;
        currentSubject = null;
        return this;
    }

    public MessageBuilder to(String s){
        if (currentRecipient!=null){
            currentRecipient.address = s;
        }
        else if(currentCC!=null){
            currentCC.address =s;
        }
        else{
            throw new IllegalStateException();
        }
        return this;
    }

    public MessageBuilder text(String s){
        if (currentSubject!=null){
            currentSubject.text = s;
        }
        else if(currentBody != null){
            currentBody.text = s;
        }
        else{
            throw new IllegalStateException();
        }
        return this;
    }

    public Recipient[] recipients(){
        List<Recipient> results = new ArrayList<>();
        results.addAll(recipients);
        if (currentRecipient != null){
            results.add(currentRecipient.getValue());
        }
        return results.toArray(new Recipient[results.size()]);
    }

    public CC[] ccs(){
        List<CC> results = new ArrayList<>();
        results.addAll(ccs);
        if (currentCC != null) {
            results.add(currentCC.getValue());
        }
        return results.toArray(new CC[results.size()]);
    }

    public Message getValue(){
        return new Message(recipients(),ccs(),subject.getValue(),body.getValue());
    }

    public Message end(){
        return getValue();
    }


    public static void main (String[] args){
        Message m = MessageBuilder.message()
                .recipient()
                    .to("Someone")
                .recipient()
                    .to("Another")
                .cc()
                    .to("Someone Else")
                .subject()
                    .text("This is a dsl")
                .body()
                    .text("pretty neat").end();

        System.out.println(m);
    }
}
