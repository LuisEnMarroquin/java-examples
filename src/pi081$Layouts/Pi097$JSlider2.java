package pi081$Layouts;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javafx.scene.control.Slider;

public class Pi097$JSlider2 {

	public static void main(String[] args) {
		
		FrameSliders2 marco = new FrameSliders2();
		

	}

}

class FrameSliders2 extends JFrame {
	
	public FrameSliders2() {
		
		setBounds(550, 400, 550, 350);
		
		LaminaSliders2 lamina = new LaminaSliders2();
		
		add(lamina);
		
		setVisible(true);
		
	}
	
}

class LaminaSliders2 extends JPanel {
	
	public LaminaSliders2() {
		
		setLayout(new BorderLayout()); // Set Layout of 'LaminaSliders2' to 'BorderLayout'
		
		rotulo = new JLabel("Texto que se va a cambiar"); // Initializing rotulo
		add(rotulo, BorderLayout.CENTER); // Adding rotulo to the CENTER of 'LaminaSliders2'
		
		control = new JSlider(5, 65, 12); // Creating Slider (StartPosition, EndPosition, SliderPosition)
		
		control.setMajorTickSpacing(15); // Mayor marks Slider
		control.setMinorTickSpacing(5); // Minor marks Slider
		control.setPaintTicks(true); // Making marks visible
		
		control.setPaintLabels(true); // Adding text to the Mayor marks
		
		control.setFont(new Font("Serif", Font.ITALIC, 20)); // Asigning properties to Mayor marks text

		control.addChangeListener(new EventoSlider()); // Now class 'EventoSlider()' is listening for changes in 'control'
		
		JPanel laminaSlider = new JPanel(); // Creating new Panel
		laminaSlider.add(control); // Adding 'control' to the new Panel
		
		add(laminaSlider, BorderLayout.NORTH); // Adding 'laminaSlider' to 'BorderLayout.NORTH' of 'LaminaSliders2'
		
	}
	
	private class EventoSlider implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent arg0) { 
			
			contador++;
			System.out.println("Estás moviendo el Slider: " + contador);
			
			rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
			
		}
		
	}
	
	private JLabel rotulo; // For the text inside the panel
	private JSlider control; // For the slider
	private static int contador;
	
}