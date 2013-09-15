package dip.lab3.student.solution1;
import javax.swing.JOptionPane;

public class SwingOutput implements Output{
    private final String SHOW_MESSAGE_TITLE = "Your Message";
    
    @Override
    public void showMessage(Message m) {
        System.out.println("line before joption");
        JOptionPane.showMessageDialog(null, m.getMessage(), SHOW_MESSAGE_TITLE, JOptionPane.PLAIN_MESSAGE);
        System.out.println("Line after joption");
    }
    
    
}
