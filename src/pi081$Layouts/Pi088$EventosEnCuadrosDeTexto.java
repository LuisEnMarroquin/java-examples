package pi081$Layouts;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Pi088$EventosEnCuadrosDeTexto {

	public static void main(String[] args) {
		
		MarcoPrueba marco = new MarcoPrueba();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPrueba extends JFrame {
	
	public MarcoPrueba() {
		setBounds(500, 300, 500, 350);
		LaminaPrueba lamina = new LaminaPrueba();
		add(lamina);
		setVisible(true);
	}
	
}

class LaminaPrueba extends JPanel {
	
	public LaminaPrueba() {
		
		JTextField campo = new JTextField(20);
		
		EscuchaTexto evento = new EscuchaTexto();
		
		Document documento = campo.getDocument(); // Saving what's inside the TextField(campo) into 'documento'
		
		documento.addDocumentListener(evento); // Now 'document' is listening for changes
		
		add(campo);
		
	}
	
	private class EscuchaTexto implements DocumentListener { // Internal class to listen for changes on the TextField

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// Is used when text changes it's properties, for now it's not possible to use it
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			System.out.println("Has insertado texto");
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			System.out.println("Has borrado texto");
		}
		
	}
	
}
