/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Ben
 */
public interface IMessageInput {
    public abstract void setMessage(Message m);
    public abstract boolean validateMessageText(String text);
}
