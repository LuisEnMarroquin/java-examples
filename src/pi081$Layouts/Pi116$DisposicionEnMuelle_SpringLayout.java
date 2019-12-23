package pi081$Layouts; // Disposición en Muelle = SpringLayout

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class Pi116$DisposicionEnMuelle_SpringLayout {

	public static void main(String[] args) {
		
		MarcoMuelle marco = new MarcoMuelle();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoMuelle extends JFrame{
	
	public MarcoMuelle() {
		
		setBounds(300, 400, 1000, 350);
		LaminaMuelle lamina = new LaminaMuelle();
		add(lamina);
		
	}
	
}

class LaminaMuelle extends JPanel{
	
	public LaminaMuelle() {
		
		JButton boton1 = new JButton("Botón 1"); // Creating buttons
		JButton boton2 = new JButton("Botón 2");
		JButton boton3 = new JButton("Botón 3");
		
		SpringLayout myLayout = new SpringLayout(); // Instancing Spring Layout
		setLayout(myLayout); // Setting 'Spring Layout' to the panel
		
		add(boton1); // Adding buttons to the panel
		add(boton2);
		add(boton3);
		
		Spring muelle = Spring.constant(0, 10, 100); // Definiendo como va a ser el muelle
		
		myLayout.putConstraint(SpringLayout.WEST, boton1, muelle, SpringLayout.WEST, this);
		
		myLayout.putConstraint(SpringLayout.WEST, boton2, muelle, SpringLayout.EAST, boton1);
		
		myLayout.putConstraint(SpringLayout.WEST, boton3, muelle, SpringLayout.EAST, boton2);
		
		myLayout.putConstraint(SpringLayout.EAST, this, muelle, SpringLayout.EAST, boton3);
		
	}
	
}