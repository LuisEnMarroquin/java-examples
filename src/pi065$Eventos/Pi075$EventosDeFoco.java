package pi065$Eventos;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Pi075$EventosDeFoco {

  public static void main(String[] args) {

    MarcoFoco2 mimarco = new MarcoFoco2();

    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}

class MarcoFoco2 extends JFrame{

  public MarcoFoco2() {

    setVisible(true);

    setBounds(300,300,600,450);

    add(new LaminaFoco2());

  }

}

class LaminaFoco2 extends JPanel{

  public void paintComponent(Graphics g) {

    super.paintComponent(g);

    setLayout(null); //Por defecto Java determina una posici�n por defecto centrada a los nuevos elementos, con esta funci�n se elimina ese 'Layout'

    //Instanciando los cuadros de texto que est�n bajo este m�todo
    cuadro1 = new JTextField();
    cuadro2 = new JTextField();

    //Asignandole tama�o a los cuadros de texto.
    cuadro1.setBounds(120,10,150,20);
    cuadro2.setBounds(120,50,150,20);

    //Agregando los cuadros de texto a la l�mina
    add(cuadro1);
    add(cuadro2);

    //Instanciando la clase oyente 'LlevaArroba' para 'cuadro1'
    LlevaArroba Foco = new LlevaArroba();
    cuadro1.addFocusListener(Foco);

  }

  //Agregando cuadros de texto con 'JTextField'
  JTextField cuadro1;
  JTextField cuadro2;

  //Poniendo esta clase como clase interna para que pueda acceder a los cuadros de texto. Y poniendola como private porque es bueno encapsularla.
  private class LlevaArroba implements FocusListener{ //Se implementan los 2 m�todos pertenecientes a la interfaz.

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

      String email = cuadro1.getText(); //M�todo de la clase 'JTextComponent' que es de la que hereda 'JTextField'
      boolean comprobacion = false;

      for(int i = 0; i<email.length(); i++) {
        if(email.charAt(i) == '@') { //Evaluando cada caracter si es una @.
          comprobacion = true;
        }
      }

      if(comprobacion) {
        System.out.println("Tu email es correcto.");
      }else {
        System.out.println("Tu email sin @ no es correcto.");
      }

    }

  }

}
