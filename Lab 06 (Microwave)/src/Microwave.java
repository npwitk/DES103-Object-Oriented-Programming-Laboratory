import java.awt.*;
import javax.swing.*;

public class Microwave extends JFrame {
	public Microwave() 
	{						
		this.MicrowaveComponents();
		this.setTitle("The Front View of a Microwave Oven");
		this.setSize(600 , 300);	
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);		
	}
	
	public void MicrowaveComponents() {
										
		JPanel p1_MicrowaveLayout = new JPanel();
		JPanel p2_NumberLayout = new JPanel();
		JButton foodBT = new JButton("Food to be place here");
		JTextField timeTF = new JTextField("Microwave Time Display");
		
		p2_NumberLayout.setLayout(new GridLayout(4,3));
		//Right 12 buttons
		for (int i=1; i<=9; i++) {
			p2_NumberLayout.add(new JButton(""+i));
		}
				
		JButton button_Stop = new JButton("Stop");
		JButton button_0 = new JButton("0");
		JButton button_Start = new JButton("Start");
		p2_NumberLayout.add(button_Stop);
		p2_NumberLayout.add(button_0);
		p2_NumberLayout.add(button_Start);
		
		
		p1_MicrowaveLayout.setLayout(new BorderLayout());
		p1_MicrowaveLayout.add(p2_NumberLayout,BorderLayout.CENTER);
		p1_MicrowaveLayout.add(timeTF,BorderLayout.NORTH);
		
		
		this.setLayout(new BorderLayout());
		this.add(p1_MicrowaveLayout,BorderLayout.EAST);
		this.add(foodBT,BorderLayout.CENTER);

	}
}
