package dip.lab3.student.solution1;

public class Startup {
    public static void main(String[] args) {
        Output outputType = new SwingOutput();
        Input inputType = new KeyboardInput();
        
        
        MessageService ms = new MessageService(outputType, inputType);
        
        ms.setMessage();
        ms.showMessage();
        
        
    }
}
