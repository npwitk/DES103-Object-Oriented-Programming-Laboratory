import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class Television extends JFrame {
	
	public Television(String title) 
	{
		//Call a method TelevisionComponents
		this.TelevisionComponents();
		
		// Set JFrame
		this.setTitle("My Television");
		this.setSize(700 , 400);	
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void TelevisionComponents() {
		
		this.setLayout(new BorderLayout());
		
		JButton TelevisionScreen = new JButton();
		this.add(TelevisionScreen, BorderLayout.CENTER);
		
		BarPanel barpanel = new BarPanel();
		this.add(barpanel,BorderLayout.SOUTH);
		
		
		//create abutton_TelevisionScreen and panal_TelevisionButtonBar
		
		//Add to this Television

	}
}