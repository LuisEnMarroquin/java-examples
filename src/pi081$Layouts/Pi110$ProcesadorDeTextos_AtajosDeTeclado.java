package pi081$Layouts;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;

public class Pi110$ProcesadorDeTextos_AtajosDeTeclado {

	public static void main(String[] args) {
		
		MenuProcesador9 marco = new MenuProcesador9();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MenuProcesador9 extends JFrame {
	
	public MenuProcesador9() {
		
		setBounds(500, 300, 550, 400);
		
		LaminaProcesador9 lamina = new LaminaProcesador9();
		
		add(lamina);
		
		setVisible(true);
		
	}
	
}

class LaminaProcesador9 extends JPanel {
	
	public LaminaProcesador9() {
		
		setLayout(new BorderLayout()); // Setting 'LaminaProcesador9' layout
		
		JPanel laminaMenu = new JPanel(); // Creating new Panel
		
		JMenuBar barra = new JMenuBar(); // Creating 'JMenuBar'
		
		/*JMenu*/ fuente = new JMenu("Fuente"); // Creating new menu sections
		/*JMenu*/ estilo = new JMenu("Estilo");
		/*JMenu*/ tamano = new JMenu("Tamaño");
		
		// ------------------------------------------------------------
		
		configuraMenu("Arial", "fuente", "Arial", 0, 0, ""); /* 107 */
		configuraMenu("Courier", "fuente", "Courier", 0, 0, ""); /* 107 */
		configuraMenu("Verdana", "fuente", "Verdana", 0, 0, ""); /* 107 */
		
		// ------------------------------------------------------------
		
		configuraMenu("Negrita", "estilo", "", Font.BOLD, 0, "src/pi081$Layouts/bold.png"); /* 107 */
		configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 0, "src/pi081$Layouts/italic.png"); /* 107 */
		
			/*JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("src/pi081$Layouts/bold.png")); // Creating 'MenuItem' to make text bold /* 108 /
			JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Negrita", new ImageIcon("src/pi081$Layouts/italic.png")); /* 108 /
			negrita.addActionListener(new StyledEditorKit.BoldAction()); // Changing text to bold /* 108 /			
			cursiva.addActionListener(new StyledEditorKit.ItalicAction()); // Changing text to italic /* 108 /		// Deprecated for issues with CheckBox and Right Click Action / 109/
			estilo.add(negrita); // Adding 'MenuItem' to JMenu 'estilo' /* 108 /
			estilo.add(cursiva); / 108 */
		
		// ------------------------------------------------------------
		
			/*configuraMenu("12", "tamano", "", 0, 12, ""); / 107 / Deprecated on / 108 /
			configuraMenu("16", "tamano", "", 0, 16, ""); / 107 /
			configuraMenu("20", "tamano", "", 0, 20, ""); / 107 /
			configuraMenu("24", "tamano", "", 0, 24, ""); / 107 */
		
		ButtonGroup grupoLetra = new ButtonGroup(); // Creating group for 'RadioButtons(forMenuItem)'
		
		JRadioButtonMenuItem n12 = new JRadioButtonMenuItem("12"); // Creating 'RadioButtons(forMenuItem)'
		JRadioButtonMenuItem n16 = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem n20 = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem n24 = new JRadioButtonMenuItem("24");
		
		// Creating keyboard shortcut for 'n24' to change text size / 110 /
		n24.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK)); // Ctrl + D
		
		grupoLetra.add(n12); // Adding 'RadioButtons(forMenuItem)' to the group 'grupoLetra'
		grupoLetra.add(n16);
		grupoLetra.add(n20);
		grupoLetra.add(n24);
		
		n12.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar Tamaño", 12)); 
		n16.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar Tamaño", 16)); // Modifies the size only for the selected text);
		n20.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar Tamaño", 20)); // Putting all 'RadioButtons(forMenuItem)' to listen
		n24.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar Tamaño", 24));
		
		tamano.add(n12); // Adding elements to 'JMenu' "tamano"
		tamano.add(n16);
		tamano.add(n20);
		tamano.add(n24);
		
		// ------------------------------------------------------------
		
		barra.add(fuente); // Adding menu sections to the menu
		barra.add(estilo);
		barra.add(tamano);
		
		laminaMenu.add(barra); // Adding 'barra' to the Panel 'laminaMenu'
		
		add(laminaMenu, BorderLayout.NORTH); // Adding Panel 'laminaMenu' to the Panel 'LaminaProcesador9'
		
		/*JTextPane*/ area = new JTextPane(); // Creating a new 'JTextPane' // 'JTextPane' is similar to 'JTextArea' but with a few more options
		
		add(area, BorderLayout.CENTER); // Adding 'area' to the center of 'LaminaProcesador9'
		
		// ---------------------------------------------------- Code for 'PopupMenu'
		
		JPopupMenu emergente = new JPopupMenu(); // Creating a 'PopupMenu'
				
		JMenuItem negritaEmergente = new JMenuItem("Negrita"); // Creating 'Menu Item'
		JMenuItem cursivaEmergente = new JMenuItem("Cursiva");

		negritaEmergente.addActionListener(new StyledEditorKit.BoldAction()); // Changing text to bold // Event /* 109 */
		cursivaEmergente.addActionListener(new StyledEditorKit.ItalicAction()); // Changing text to italic /* 109 */
		
		emergente.add(negritaEmergente); // Adding 'MenuItem' to the 'PopupMenu'
		emergente.add(cursivaEmergente);
		
		area.setComponentPopupMenu(emergente); // Setting Popup on right click to the JTextPane 'area' 
		
	}
	
	// Method
	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam, String rutaIcono) { /* 107 */
		
		// To create menu sections
		JMenuItem elementoMenu = new JMenuItem(rotulo, new ImageIcon(rutaIcono)); /* 107 */
		
		if(menu=="fuente") {
			
			fuente.add(elementoMenu);
			
			if(tipoLetra=="Arial") {
				elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("", "Arial")); // Turns the selected text into 'Arial'
			} else if (tipoLetra=="Courier") {
				elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("", "Courier")); // Turns the selected text into 'Courier'
			} else if (tipoLetra=="Verdana") {
				elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("", "Verdana")); // Turns the selected text into 'Verdana'
			}
			
		}  else if (menu=="estilo") { // There is a new way to do this / 108 /
			
		estilo.add(elementoMenu);
		
		if(estilos==Font.BOLD) {
			
			elementoMenu.addActionListener(new StyledEditorKit.BoldAction()); // Turns the selected text into 'Bold'
		
			elementoMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK)); // Ctrl + N /* 110 */
			
		} else if (estilos==Font.ITALIC) {
			
			elementoMenu.addActionListener(new StyledEditorKit.ItalicAction()); // Turns the selected text into 'Italic'
			
			elementoMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK)); // Ctrl + K /* 110 */
			
		}
		
		} /*else if (menu=="tamano") {
		
		tamano.add(elementoMenu);
		
		elementoMenu.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar Tamaño", tam)); // Modifies the size only for the selected text
	
		}*/
		
	}	
	
	// Created here to be able to use it in the anonymous or internal class
	JTextPane area; // Text Area
	JMenu fuente, estilo, tamano; // Menu Sections
	Font letras; // Font to
	
}
