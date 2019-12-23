package pi081$Layouts; // Resize if the content inside the Frame is not displayed

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class Pi099$JSpinner_ClaseInternaAnonima {

	public static void main(String[] args) {
		
		FrameSpinner3 marco = new FrameSpinner3();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class FrameSpinner3 extends JFrame {
	
	public FrameSpinner3() {
		
		setBounds(500, 350, 550, 350);
		
		setVisible(true);
		
		add(new LaminaSpinner3());
		
	}
	
}

class LaminaSpinner3 extends JPanel {
	
	public LaminaSpinner3() {
		
		JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) { // Internal Anonim Class
			
			@Override // Changing behavior of 'UP' button
			public Object getNextValue() { // This method instead of return next value is going to return the last value
				return super.getPreviousValue(); // 'super.getPreviousValue()' returns an 'Object' with the previous value // It calls father class
			}
			@Override // Changing behavior of 'DOWN' button
			public Object getPreviousValue() {
				return super.getNextValue(); // This calls father class and returns an 'Object' with the previous value
			}
			
		}); 
		
		Dimension d = new Dimension(200, 30); // Dimensions for 'SpinnerListModel()'
		control.setPreferredSize(d); // Adding dimensions
		
		add(control); // Adding Spinner to the Panel
		
	}
	
	/* private class SpinnerPropio extends SpinnerNumberModel { // It extends SpinnerNumberModel to get all properties from Spinners
		public SpinnerPropio() {
			super(5, 0, 10, 1); // Calling father class constructor (StartPosition, Start, End, JumpFrom)
		}
		// Changing behavior of 'UP' and 'DOWN' buttons
		@Override // Changing behavior of 'UP' button
		public Object getNextValue() { // This method instead of return next value is going to return the last value
			return super.getPreviousValue(); // 'super.getPreviousValue()' returns an 'Object' with the previous value // It calls father class
		}
		@Override // Changing behavior of 'DOWN' button
		public Object getPreviousValue() {
			return super.getNextValue(); // This calls father class and returns an 'Object' with the previous value
		}
	} */
	
}