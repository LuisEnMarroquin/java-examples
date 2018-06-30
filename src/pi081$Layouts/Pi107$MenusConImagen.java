package pi081$Layouts;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Pi107$MenusConImagen {

	public static void main(String[] args) {
		
		MenuFrame2 marco = new MenuFrame2();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MenuFrame2 extends JFrame {
	
	public MenuFrame2() {
		
		setBounds(500, 300, 550, 400);
		
		MenuLamina2 lamina = new MenuLamina2();
		
		add(lamina);
		
	}
	
}

class MenuLamina2 extends JPanel {
	
	public MenuLamina2() {
	
		JMenuBar miBarra = new JMenuBar(); // Instancing class 'JMenuBar'
	
		JMenu archivo = new JMenu("Archivo"); // Creating elements for 'MenuBar'
		JMenu edicion = new JMenu("Edición");
		JMenu herramientas = new JMenu("Herramientas");
		
		JMenuItem guardar = new JMenuItem("Guardar"); // Creating dropdown items for 'JMenu archivo' 
		JMenuItem guardar_como = new JMenuItem("Guardar como");
		archivo.add(guardar); // Adding dropdown items to 'JMenu archivo' 
		archivo.add(guardar_como);
		
		JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon("src/pi081$Layouts/cortar.gif")); // Creating dropdown items for 'JMenu edicion' 
		JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon("src/pi081$Layouts/copiar.gif"));
		JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon("src/pi081$Layouts/pegar.gif"));
		edicion.add(cortar); // Adding dropdown items to 'JMenu edicion' 
		edicion.add(copiar);
		edicion.add(pegar);
		
		JMenuItem generales = new JMenuItem("Generales", new ImageIcon("src/pi081$Layouts/wrench.png")); // Creating dropdown items for 'JMenu herramientas' 
		generales.setHorizontalTextPosition(SwingConstants.LEFT); // Make text to appear on the left side of the image
		herramientas.add(generales); // Adding dropdown items to 'JMenu herramientas' 
		
		herramientas.addSeparator(); // Adding separator line
		
		JMenu opciones = new JMenu("Opciones"); // Creating a submenu
		final JMenuItem opcion1 = new JMenuItem("Opción 1"); // Creating items for submenu // I don't know why this is final
		JMenuItem opcion2 = new JMenuItem("Opción 2");
		opciones.add(opcion1); // Adding items to submenu
		opciones.add(opcion2);
		herramientas.add(opciones); // A Menu that adds other menu
		
		miBarra.add(archivo); // Adding elements to 'MenuBar'
		miBarra.add(edicion);
		miBarra.add(herramientas);
	
		add(miBarra); // Adding 'MenuBar' to Panel 'MenuLamina2'
		
	}
	
}

