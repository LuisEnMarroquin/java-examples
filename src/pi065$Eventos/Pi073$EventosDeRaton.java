package pi065$Eventos;

import javax.swing.JFrame;
import java.awt.event.*;

public class Pi073$EventosDeRaton {

	public static void main(String[] args) { 
		
		MarcoRaton2 mimarco = new MarcoRaton2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton2 extends JFrame{
	
	public MarcoRaton2() {
		
		setVisible(true);
		
		setBounds(700,300,600,450);
		
		EventosDeRaton2 EventoRaton = new EventosDeRaton2();
		addMouseListener(EventoRaton);
		
		addMouseMotionListener(new ArrastrarObjetos());
		
	}
	
}

//La clase 'MouseAdapter' se usa para no implementar todos los métodos de la interfaz 'MouseListener'
class EventosDeRaton2 extends MouseAdapter{

	@Override // Interfaz 'MouseListener'
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
		
		System.out.println("Número de click hecho en la misma coordenada: " + e.getClickCount());
		
	}
	
	@Override // Interfaz 'MouseListener'
	public void mousePressed(MouseEvent e) {
		
		System.out.println("Código del botón con que se ha presionado: " + e.getModifiersEx());
		
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) { // 1024 es el código que devuelve al presionar el botón izquierdo.
			System.out.println("Has pulsado el botón 'izquierdo' del mouse.");
		}else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) { // 2048 es el código que devuelve al presionar la rueda del mouse.
			System.out.println("Has pulsado la 'rueda' del mouse.");
		}else if(e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) { // 4096 es el código que devuelve al presionar el botón derecho.
			System.out.println("Has pulsado el botón 'derecho' del mouse.");
		}
		
	}

}

class ArrastrarObjetos implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		System.out.println("Estás arrastrando el mouse.");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		System.out.println("Estás moviendo el mouse.");
	}
	
	
	
}