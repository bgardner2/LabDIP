package dip.lab3.student.solution1;
import javax.swing.JOptionPane;

public class SwingInput implements IMessageInput{

    public SwingInput(){
        
    }
    
    @Override
    public final void setMessage(Message m) {
        String text = null;
        do{
            text = JOptionPane.showInputDialog(null, null);
            
            
        }while (!this.validateMessageText(text));
        
        if(m != null){
            m.setMessage(text);
        }
    }
    
    @Override
    public boolean validateMessageText(String text){
        return (text != null && text.length() > 0);
    }
    
}
