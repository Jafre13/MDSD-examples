package objects;

import java.util.ArrayList;
import java.util.List;

public class Message {
    Recipient[] recipients;
    CC[] ccs;
    Subject subject;
    Body body;

    public Message(Recipient[] recipients, CC[] ccs, Subject subject, Body body) {
        this.recipients = recipients;
        this.ccs = ccs;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Message: \n");
        sb.append("\tRecipients: \n");
        for (Recipient rec : recipients) {
            sb.append("\t\t");
            sb.append(rec.getAddress());
            sb.append("\n");
        }
        sb.append("\tCC's: \n");
        for (CC cc : ccs){
            sb.append("\t\t");
            sb.append(cc.getAddress());
            sb.append("\n");
        }
        sb.append("\tSubject: \n");
        sb.append("\t\t");
        sb.append(subject);
        sb.append("\n");
        sb.append("\tMessage: \n");
        sb.append("\t\t");
        sb.append(body);
        sb.append("\n");
        return sb.toString();
    }
}
