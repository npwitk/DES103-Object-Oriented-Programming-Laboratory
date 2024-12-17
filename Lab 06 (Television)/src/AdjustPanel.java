import java.awt.*;
import javax.swing.*;

public class AdjustPanel extends JPanel
{
	public AdjustPanel(String centerText) {
		
		//create three buttons: Less, center text, and more 
		this.setLayout(new FlowLayout());
		
		JButton decrease = new JButton("<<");
		JButton display_text = new JButton(centerText);
		JButton increase = new JButton(">>");
		
		//Add to this AdjustPanel panel
		this.add(decrease);
		this.add(display_text);
		this.add(increase);
		
		}

	
	
	
}
