package inputDialog;

import java.awt.*;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

public class ProgressMonitor extends JFrame{
JProgressBar current;
JTextArea out;
JButton find;
Thread runner;
int num = 0;
JTextField jT = new JTextField(3);
String newNum;

public ProgressMonitor() {
	super("Progress Monitor");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLookAndFeel();
	setSize(205, 200);
	setLayout(new FlowLayout());
	current = new JProgressBar(0, 2000);
	current.setValue(0);
	current.setStringPainted(true);
	add(jT);
	add(current);
}

public void iterate() {
	while (num < 2000) {
		current.setValue(num);
		newNum = Integer.toString(num);
		jT.setText(newNum);
		
	try {
		Thread.sleep(1000);
		
	} catch (InterruptedException e){}
		num += 95;
	}
}
private static void setLookAndFeel() {
    try {
    	for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
    	}
    } catch (Exception exc) {
        System.out.println(exc.getMessage());
    }
}
}

