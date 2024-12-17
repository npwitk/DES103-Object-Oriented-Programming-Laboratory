import java.awt.*;
import javax.swing.*;

public class BarPanel extends JPanel
{
	public BarPanel() {
		
		this.setLayout(new BorderLayout());
		JTextField textfield = new JTextField("Ch 35 Vol 45");	
		
		ControlPanel controlpanel = new ControlPanel();
		
		this.add(textfield,BorderLayout.CENTER);
		this.add(controlpanel,BorderLayout.EAST);

	}
}

