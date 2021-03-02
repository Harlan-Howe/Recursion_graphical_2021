import javax.swing.*;
import java.awt.*;

public class MessageWindow
{
    private String myMessage;

    public MessageWindow()
    {
        this("Hello, World!");
    }

    public MessageWindow(String s)
    {
        myMessage = s;
    }

    public void setMessage(String s)
    {
        myMessage = s;
    }

    public void displayMessage(Component parent)
    {
        JTextArea textArea = new JTextArea(10,30);
        textArea.setLineWrap(true);
        textArea.setEditable(false);
        JScrollPane scroller = new JScrollPane(textArea);
        scroller.setSize(200,200);
        textArea.setText(myMessage);
        scroller.getVerticalScrollBar().setValue(0);
        textArea.setCaretPosition(0);
        JOptionPane.showMessageDialog(parent, scroller,"",JOptionPane.PLAIN_MESSAGE);
    }

    public void displayMessage()
    {
        this.displayMessage(null);
    }

}
