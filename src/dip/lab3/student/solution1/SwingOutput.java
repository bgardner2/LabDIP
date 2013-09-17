package dip.lab3.student.solution1;
import javax.swing.JOptionPane;

public class SwingOutput implements IMessageOutput{
    private final String SHOW_MESSAGE_TITLE = "Your Message";
    
    @Override
    public void showMessage(Message m) {
        JOptionPane.showMessageDialog(null, m.getMessage(), SHOW_MESSAGE_TITLE, JOptionPane.PLAIN_MESSAGE);
    }
    
    
}
