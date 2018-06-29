import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener{
	JButton button;
	
	//MAIN
	public static void main (String [] args){
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();
	}
		
	public void go(){	
		JFrame frame = new JFrame();
		button = new JButton("click me");
		
		//add this listener to the lis of listeners
		button.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	//event handling method
	public void actionPerformed(ActionEvent event){
		button.setText("I've been clicked!");
	}
}