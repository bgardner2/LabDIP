package dip.lab3.student.solution1;



public class MessageService {
    private Output outputType;
    private Input inputType;
    private Message message = new Message();
    
    public MessageService(Output outputType, Input inputType){
        this.outputType = outputType;
        this.inputType = inputType;
    }
    
    public void setMessage(){
        inputType.setMessage(message);
    }
    
    public void showMessage(){
        outputType.showMessage(message);
        
    }
    
}
