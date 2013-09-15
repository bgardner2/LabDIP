package dip.lab3.student.solution1;

import java.util.Scanner;

public class KeyboardInput implements Input {

    Scanner keyboard = new Scanner(System.in);

    @Override
    public void setMessage(Message m) {
        String text;
        System.out.print("Please enter the text you'd like to display: ");
        if (m != null) {
            if (keyboard.hasNextLine()) {
                text = keyboard.nextLine();
            }
            else{
                text = "nextline was either null or didn't have a nextline";
            }
            m.setMessage(text);
        }
        

    }
}
