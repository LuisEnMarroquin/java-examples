package pi081$Layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

public class Pi082$Layouts_DiferentesLayoutsEnUnaVentana {

	public static void main(String[] args) {
		
		MarcoLayout4 marco = new MarcoLayout4();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoLayout4 extends JFrame {
	
	public MarcoLayout4() {
		
		setTitle("Prueba Acciones");
		setBounds(600, 350, 600, 300);
		
		PanelLayout4 lamina = new PanelLayout4();
		PanelLayout5 lamina2 = new PanelLayout5();
		
		add(lamina, BorderLayout.NORTH);
		add(lamina2, BorderLayout.SOUTH);
		
	}
	
}

class PanelLayout4 extends JPanel {
	
	public PanelLayout4() {
		
		setLayout(new FlowLayout(FlowLayout.LEFT)); //Separacion horizonal y vertical de 10 pixeles
		
		add(new JButton("Amarillo")); 
		
		add(new JButton("Rojo"));
		
	}
	
}

class PanelLayout5 extends JPanel {
	
	public PanelLayout5() {
		
		setLayout(new BorderLayout());
		
		add(new JButton("Azul"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.EAST);
		add(new JButton("Negro"), BorderLayout.CENTER); 
		
	}
	
}