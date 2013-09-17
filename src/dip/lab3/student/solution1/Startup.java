package dip.lab3.student.solution1;

public class Startup {

    public static void main(String[] args) {
        IMessageOutput outputType = new SwingOutput();
        IMessageInput inputType = new KeyboardInput();
        
        
        MessageService ms = new MessageService(outputType, inputType);
        
        ms.produceMessage();
        
        
    }
}
