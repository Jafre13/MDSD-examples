package function.sequence.builders;

public class Script extends MessageBuilder {
    protected void build(){
        message();
        recipient();
            address("abc@Hello.com");
        recipient();
            address("def@Something.org");
        cc();
            address("omega@alpha.com");
        cc();
            address("not@gonna.happen");
        subject();
            text("Nothing important really");
        body();
            text("Really nothing at all");
    }


    public static void main(String[] args){
        System.out.println(new Script().run().toString());
    }
}
