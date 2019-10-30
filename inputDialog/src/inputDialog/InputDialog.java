package inputDialog;
import java.awt.event.*;
import javax.swing.*;

public class InputDialog extends JFrame {
    public InputDialog() {
        super("Title Frame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(false);
        String response = JOptionPane.showInputDialog(null,
            "Enter a Title for the Frame:");
        setTitle(response);
    }

    public static void main(String[] arguments) {
    	ProgressMonitor frame = new ProgressMonitor();
    	frame.setVisible(true);
    	frame.iterate();
    }
}