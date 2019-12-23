package pi081$Layouts;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class Pi096$JSlider {

	public static void main(String[] args) {
		
		FrameSliders marco = new FrameSliders();
		

	}

}

class FrameSliders extends JFrame {
	
	public FrameSliders() {
		
		setBounds(550, 400, 550, 350);
		
		LaminaSliders lamina = new LaminaSliders();
		
		add(lamina);
		
		setVisible(true);
		
	}
	
}

class LaminaSliders extends JPanel {
	
	public LaminaSliders() {
		
		/* add(new JSlider()); // Slider horizontal
		add(new JSlider(0, 100, 50)); // Slider horizontal same as the Slider up
		add(new JSlider(SwingConstants.VERTICAL, 20, 100, 25)); */
		
		JSlider control = new JSlider(0, 100, 50); // Creating Slider (StartPosition, EndPosition, SliderPosition)
		
		//control.setOrientation(SwingConstants.VERTICAL); // Making slider vertical
		
		control.setMajorTickSpacing(50); // Mayor marks Slider
		control.setMinorTickSpacing(25); // Minor marks Slider
		
		control.setPaintTicks(true); // Making marks visible
		
		control.setFont(new Font("Serif", Font.ITALIC, 20)); // Asigning properties to Mayor marks text
		control.setPaintLabels(true); // Adding text to the Mayor marks
		
		control.setSnapToTicks(true); // Slider goes to the closest value
		
		add(control); // Adding Slider to the Panel
		
	}
	
}