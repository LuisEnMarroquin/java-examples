package pi081$Layouts;

import java.awt.BorderLayout;
import javax.swing.*;

public class Pi082$Layouts_BorderLayout {

	public static void main(String[] args) {
		
		MarcoLayout3 marco = new MarcoLayout3();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}

class MarcoLayout3 extends JFrame {
	
	public MarcoLayout3() {
		
		setTitle("Prueba Acciones");
		setBounds(600, 350, 600, 300);
		
		PanelLayout3 lamina = new PanelLayout3();

		add(lamina);
		
	}
	
}

class PanelLayout3 extends JPanel {
	
	public PanelLayout3() {
		setLayout(new BorderLayout(10,10)); //Separacion horizonal y vertical de 10 pixeles
		add(new JButton("Amarillo"), BorderLayout.NORTH); // El método .add de la clase 'JPanel' puede admitir mas de un arguento
		add(new JButton("Rojo"), BorderLayout.SOUTH);
		add(new JButton("Azul"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.EAST);
		add(new JButton("Negro")/*, BorderLayout.CENTER*/); // Como es la unica zona que queda todavía por rellenar, no es necesario especificar donde estará
	}
	
}