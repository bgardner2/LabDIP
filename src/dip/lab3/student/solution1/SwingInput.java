package dip.lab3.student.solution1;
import javax.swing.JOptionPane;

public class SwingInput implements Input{

    public SwingInput(){
        
    }
    
    @Override
    public final void setMessage(Message m) {
        String text = JOptionPane.showInputDialog(null, null);
        if(m != null){
            m.setMessage(text);
        }
    }    
    
}
