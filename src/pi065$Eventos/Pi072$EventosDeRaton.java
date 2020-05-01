package pi065$Eventos;

import javax.swing.JFrame;
import java.awt.event.*;

public class Pi072$EventosDeRaton {

  public static void main(String[] args) {

    MarcoRaton mimarco = new MarcoRaton();

    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}

class MarcoRaton extends JFrame{

  public MarcoRaton() {

    setVisible(true);

    setBounds(700,300,600,450);

    EventosDeRaton EventoRaton = new EventosDeRaton();
    addMouseListener(EventoRaton);

  }

}

//La clase 'MouseAdapter' se usa para no implementar todos los m�todos de la interfaz 'MouseListener'
class EventosDeRaton implements MouseListener{

  @Override
  public void mouseClicked(MouseEvent arg0) {
    System.out.println("Has hecho click (presionado y soltado la tecla)");
  }

  @Override
  public void mouseEntered(MouseEvent arg0) {
    System.out.println("Has puesto el mouse en la ventana");
  }

  @Override
  public void mouseExited(MouseEvent arg0) {
    System.out.println("Has sacado el mouse de la ventana");
  }

  @Override
  public void mousePressed(MouseEvent arg0) {
    System.out.println("Has presionado la tecla");
  }

  @Override
  public void mouseReleased(MouseEvent arg0) {
    System.out.println("Has soltado la tecla");
  }

}
