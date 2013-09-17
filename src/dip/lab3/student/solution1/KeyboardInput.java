package dip.lab3.student.solution1;

import java.util.Scanner;

public class KeyboardInput implements IMessageInput {

    private final String ENTER_TEXT_PROMPT = "Please enter the text you'd like to display: ";
    Scanner keyboard = new Scanner(System.in);

    @Override
    public void setMessage(Message m) {
        String text = null;

        //Ask for and Validate input. If input is not valid, keep asking for it
        do {
            System.out.print(ENTER_TEXT_PROMPT);
            if (m != null && keyboard.hasNextLine()) {
                text = keyboard.nextLine();
            }
        } while (!this.validateMessageText(text));

        if (m != null) {
            m.setMessage(text);
        }
    }

    @Override
    public boolean validateMessageText(String text) {
        return (text != null && text.length() > 0);
    }
}
