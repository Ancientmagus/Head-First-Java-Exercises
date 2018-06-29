import javax.swing.*;

public class SimpleGui1{
	
	//MAIN
	public static void main (String [] args){
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		
		//makes the window close when click the close button
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(button);
		
		frame.setSize(300,300);
		
		frame.setVisible(true);
	}
}