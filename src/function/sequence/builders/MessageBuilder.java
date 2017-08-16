package function.sequence.builders;

import objects.CC;
import objects.Message;
import objects.Recipient;
import objects.Subject;

import java.util.ArrayList;
import java.util.List;

abstract public class MessageBuilder {

    private List<RecipientBuilder> recipients = new ArrayList<>();
    private List<CCBuilder> ccs = new ArrayList<>();
    private BodyBuilder body;
    private SubjectBuilder subject;

    private RecipientBuilder currentRecipient;
    private CCBuilder currentCC;
    private BodyBuilder currentBody;
    private SubjectBuilder currentSubject;

    void message(){
        currentRecipient = null;
        currentCC = null;
        currentBody = null;
        currentSubject = null;
    }

    void recipient(){
        currentRecipient = new RecipientBuilder();
        recipients.add(currentRecipient);
        currentCC=null;
        currentBody=null;
        currentSubject = null;
    }

    void cc (){
        currentCC = new CCBuilder();
        ccs.add(currentCC);
        currentBody = null;
        currentSubject = null;
        currentRecipient = null;
    }

    void body(){
        currentBody = new BodyBuilder();
        body = currentBody;
        currentSubject = null;
        currentRecipient = null;
        currentCC = null;
    }

    void subject(){
        currentSubject = new SubjectBuilder();
        subject = currentSubject;
        currentBody = null;
        currentCC = null;
        currentRecipient = null;
    }

    void address(String s){
        if (currentRecipient != null){
            currentRecipient.address = s;
        }
        else if(currentCC!=null){
            currentCC.address = s;
        }
        else throw new IllegalStateException();
    }

    void text(String s){
        if (currentBody!= null) {
            currentBody.text = s;
        }
        else if (currentSubject!=null){
            currentSubject.text = s;
        }
    }

    private Recipient[] getRecipientValues(){
        Recipient[] result = new Recipient[recipients.size()];
        for (int i = 0; i<recipients.size();i++){
            result[i] = recipients.get(i).getValue();
        }
        return result;
    }
    private CC[] getCCValues(){
        CC[] result = new CC[ccs.size()];
        for (int i = 0; i<ccs.size();i++){
            result[i] = ccs.get(i).getValue();
        }
        return result;
    }

    Message getValue(){
        return new Message(getRecipientValues(),getCCValues(),subject.getValue(),body.getValue());
    }

    public Message run() {
        build();
        return getValue();
    }

    abstract protected void build();


}
