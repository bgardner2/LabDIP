package dip.lab3.student.solution1;

public class Message {
    private String message = null;
    
    
    public Message(){
        
        
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public int getMessageLength(){
        return message.length();
    }
    
    
}
