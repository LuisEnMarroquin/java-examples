package pi065$Eventos; //Explicación importante de los eventos en el video 71

import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Pi071$EventosDeTeclado {

	public static void main(String[] args) {
		
		MarcoConTeclas mimarco = new MarcoConTeclas();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTeclas extends JFrame{
	
	public MarcoConTeclas() {
		
		setVisible(true);
		setBounds(700, 300, 600, 450);
		
		EventoDeTeclado tecla = new EventoDeTeclado();
		addKeyListener(tecla);
		
	}
	
}

//Oyente
class EventoDeTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) { //Presiona la tecla
		// Obteniendo la tecla que se presionó
		int codigo = e.getKeyCode();
		System.out.println("El código de la tecla presionada es: " + codigo);
	}

	@Override
	public void keyReleased(KeyEvent e) { //Suelta la tecla
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) { //Presiona y suelta la tecla
		// Convirtiendo el código de la tecla presionada en el simbolo
		char letra = e.getKeyChar();
		System.out.println("Si ha presionado una letra esta es: " + letra);
	}
	
	
	
}