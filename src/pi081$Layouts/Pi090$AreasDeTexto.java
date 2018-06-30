package pi081$Layouts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Pi090$AreasDeTexto {

	public static void main(String[] args) {
		
		MarcoArea marco = new MarcoArea();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoArea extends JFrame {
	public MarcoArea() {
		setBounds(500, 300, 500, 350);
		LaminaArea lamina = new LaminaArea();
		add(lamina);
		setVisible(true);
	}
}

class LaminaArea extends JPanel {
	
	public LaminaArea() {
		
		/*JTextArea*/ miArea = new JTextArea(8,20); // Creating TextArea
		JScrollPane laminaBarras = new JScrollPane(miArea); // Creating a new Panel of type 'JScrollPane' with 'miArea' inside of it
		miArea.setLineWrap(true); // Avoid 'miArea' to resize horizontally
		add(laminaBarras); // Adding 'laminaBarras' because it has 'TextArea' inside of it
		
		JButton boton = new JButton("Muestra en consola");
		boton.addActionListener(new GestionaArea());
		
		add(boton); // Adding the 'button' to the Panel
	}
	
	private class GestionaArea implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			System.out.println(miArea.getText());
			
		}
		
	}
	
	private JTextArea miArea; // 'TextArea' outside constructor to use it also is 'GestionaArea'
	
}