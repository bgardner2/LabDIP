package dip.lab3.student.solution1;



public class MessageService {
    private IMessageOutput outputType;
    private IMessageInput inputType;
    private Message message = new Message();
    
    public MessageService(IMessageOutput outputType, IMessageInput inputType){
        //Validate input
        this.outputType = outputType;
        this.inputType = inputType;
    }
    
    public void initializeMessage(){
        inputType.setMessage(message);
    }
    
    public void showMessage(){
        outputType.showMessage(message);
    }
    
    public void produceMessage(){
        this.initializeMessage();
        this.showMessage();
    }
    
}
