package pi081$Layouts;

import java.awt.FlowLayout;
import javax.swing.*;

public class Pi082$Layouts_FlowLayout {

	public static void main(String[] args) {
		
		MarcoLayout2 marco = new MarcoLayout2();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}

class MarcoLayout2 extends JFrame {
	
	public MarcoLayout2() {
		
		setTitle("Prueba Acciones");
		setBounds(600, 350, 600, 300);
		
		PanelLayout2 lamina = new PanelLayout2();
		/*FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER, 50, 100); // (Align Position, Between elements, From top )
		lamina.setLayout(disposicion);*/
		add(lamina);
		
	}
	
}

class PanelLayout2 extends JPanel {
	
	public PanelLayout2() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 100)); // (Align Position, Between elements, From top )
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));
		add(new JButton("Azul"));
	}
	
}