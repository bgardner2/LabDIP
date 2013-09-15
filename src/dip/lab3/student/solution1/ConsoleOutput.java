package dip.lab3.student.solution1;

public class ConsoleOutput implements Output{

    @Override
    public void showMessage(Message m) {
        System.out.println(m.getMessage());
    }
}
