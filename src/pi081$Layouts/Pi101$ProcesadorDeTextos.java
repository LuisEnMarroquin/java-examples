package pi081$Layouts; // Only Courier works for this file // This is only to see the usage of an Internal Class

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Pi101$ProcesadorDeTextos {

	public static void main(String[] args) {
		
		MenuProcesador marco = new MenuProcesador();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MenuProcesador extends JFrame {
	
	public MenuProcesador() {
		
		setBounds(500, 300, 550, 400);
		
		LaminaProcesador lamina = new LaminaProcesador();
		
		add(lamina);
		
		setVisible(true);
		
	}
	
}

class LaminaProcesador extends JPanel {
	
	public LaminaProcesador() {
		
		setLayout(new BorderLayout()); // Setting 'LaminaProcesador' layout
		
		JPanel laminaMenu = new JPanel(); // Creating new Panel
		
		JMenuBar barra = new JMenuBar(); // Creating 'JMenuBar'
		
		// -------------------------------------------
		
		JMenu fuente = new JMenu("Fuente"); // Creating new menu sections
		JMenu estilo = new JMenu("Estilo");
		JMenu tamano = new JMenu("Tamaño");
		
		// -------------------------------------------
		
		JMenuItem arial = new JMenuItem("Arial"); // Creating menu items for 'JMenu("Fuente")'
		
		JMenuItem courier = new JMenuItem("Courier");
		courier.addActionListener(new GestionaMenus());
		
		JMenuItem verdana = new JMenuItem("Verdana");
		
		fuente.add(arial); // Adding menu items to 'JMenu("Fuente")'
		fuente.add(courier);
		fuente.add(verdana);
		
		// -------------------------------------------
		
		JMenuItem negrita = new JMenuItem("Negrita"); // Creating menu items for 'JMenu("Estilo")'
		JMenuItem cursiva = new JMenuItem("Cursiva");
		estilo.add(negrita); // Adding menu items to 'JMenu("Estilo")'
		estilo.add(cursiva);
		
		// -------------------------------------------
		
		JMenuItem tam_12 = new JMenuItem("12"); // Creating menu items for 'JMenuJMenu("Tamaño");'
		JMenuItem tam_16 = new JMenuItem("16");
		JMenuItem tam_20 = new JMenuItem("20");
		JMenuItem tam_24 = new JMenuItem("24");
		tamano.add(tam_12); // Adding menu items to 'JMenuJMenu("Tamaño");'
		tamano.add(tam_16);
		tamano.add(tam_20);
		tamano.add(tam_24);
		
		// -------------------------------------------
		
		barra.add(fuente); // Adding menu sections to the menu
		barra.add(estilo);
		barra.add(tamano);
		
		laminaMenu.add(barra); // Adding 'barra' to the Panel 'laminaMenu'
		
		add(laminaMenu, BorderLayout.NORTH); // Adding Panel 'laminaMenu' to the Panel 'LaminaProcesador'
		
		/*JTextPane*/ area = new JTextPane(); // Creating a new 'JTextPane' // 'JTextPane' is similar to 'JTextArea' but with a few more options
		
		add(area, BorderLayout.CENTER); // Adding 'area' to the center of 'LaminaProcesador'
		
	}
	
	private class GestionaMenus implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			area.setFont(new Font("Courier", Font.PLAIN, 12));
			
		}
		
	}
	
	JTextPane area;
	
}