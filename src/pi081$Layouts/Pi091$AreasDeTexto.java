package pi081$Layouts;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Pi091$AreasDeTexto {

	public static void main(String[] args) {
		
		MarcoPruebaArea marco = new MarcoPruebaArea();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoPruebaArea extends JFrame {
	
	public MarcoPruebaArea() {
		
		setTitle("Probando Areas de Texto");
		
		setBounds(500,400,500,350);
		
		setLayout(new BorderLayout()); // Assigning 'BorderLayout' to the 'Frame' not to the 'Panel'
		
		laminaBotones = new JPanel(); // Creating new Panel 'laminaBotones'
		
		botonInsertar = new JButton("Insertar texto");
		botonInsertar.addActionListener(new ActionListener() { // Adding listener for 'botonInsertar' that includes 'ActionListener' interface

			@Override // This is because it implements interface 'ActionListener'
			public void actionPerformed(ActionEvent e) {
				areaDeTexto.append("Texto Agregado "); // '.append()' is used to add some text
			}
			
		});
		
		laminaBotones.add(botonInsertar); // Adding 'botonInsertar' to 'laminaBotones'
		
		botonSaltoDeLinea = new JButton("Salto linea");
		botonSaltoDeLinea.addActionListener(new ActionListener() { 

			@Override // This is because it implements interface 'ActionListener'
			public void actionPerformed(ActionEvent e) { // Tipe ON/OFF
				boolean saltar = !areaDeTexto.getLineWrap(); // '.getLineWrap()' returns a boolean // cuando no existan saltos de linea guardará un true
				areaDeTexto.setLineWrap(saltar);
				botonSaltoDeLinea.setText(saltar ? "Quitar salto" : "Salto linea");
				/*if(saltar) {
					botonSaltoDeLinea.setText("Quitar salto");
				} else {
					botonSaltoDeLinea.setText("Salto linea");
				}*/
			}
			
		});
		
		laminaBotones.add(botonSaltoDeLinea); // Adding 'botonSaltoDeLinea' to 'laminaBotones'
		
		add(laminaBotones, BorderLayout.SOUTH); // Adding 'laminaBotones' to 'MarcoPruebaArea'
		
		areaDeTexto = new JTextArea(8, 20); // Initializing 'areaDeTexto'
		
		laminaConBarras = new JScrollPane(areaDeTexto); // Adding 'areaDeTexto' inside 'laminaConBarras'
		
		add(laminaConBarras, BorderLayout.CENTER); // Adding 'laminaConBarras' to 'MarcoPruebaArea'
		
	}
	
	private JPanel laminaBotones;
	private JButton botonInsertar, botonSaltoDeLinea;
	private JTextArea areaDeTexto;
	private JScrollPane laminaConBarras;
	
}