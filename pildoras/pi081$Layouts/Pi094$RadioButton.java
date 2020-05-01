package pi081$Layouts;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Pi094$RadioButton {

  public static void main(String[] args) {

    MarcoRadio2 marco = new MarcoRadio2();
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}

class MarcoRadio2 extends JFrame {
  public MarcoRadio2() {
    setVisible(true);
    setBounds(550, 300, 500, 350);
    LaminaRadio2 lamina = new LaminaRadio2();
    add(lamina);
  }
}

class LaminaRadio2 extends JPanel {

  public LaminaRadio2() {

    setLayout(new BorderLayout()); // Setting 'BorderLayout' for this JPanel 'LaminaRadio2'

    texto = new JLabel("Esto es el texto"); // Creating JLabel 'texto'
    texto.setFont(new Font("Serif", Font.PLAIN, 12)); // Setting text properties
    add(texto, BorderLayout.CENTER); // Adding 'texto' to CENTER of JPanel 'LaminaRadio2'

    ButtonGroup grupo = new ButtonGroup(); // Creating group for RadioButtons

    boton1 = new JRadioButton("Peque�o", false); // Initializing RadioButtons
    boton2 = new JRadioButton("Mediano", true);
    boton3 = new JRadioButton("Grande", false);
    boton4 = new JRadioButton("Muy Grande", false);

    JPanel laminaRadio = new JPanel(); // Creating new JPanel 'laminaRadio'

    CambiaTamano evento = new CambiaTamano(); // Creating instance of class 'CambiaTamano'
    boton1.addActionListener(evento); // Putting the objects to listen
    boton2.addActionListener(evento);
    boton3.addActionListener(evento);
    boton4.addActionListener(evento);

    grupo.add(boton1); // Adding buttons to the ButtonGroup "grupo"
    grupo.add(boton2);
    grupo.add(boton3);
    grupo.add(boton4);

    laminaRadio.add(boton1); // Adding buttons to JPanel 'laminaRadio'
    laminaRadio.add(boton2);
    laminaRadio.add(boton3);
    laminaRadio.add(boton4);

    add(laminaRadio, BorderLayout.SOUTH); // Adding JPanel 'laminaRadio' to JPanel 'LaminaRadio2'

  }

  private class CambiaTamano implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

      if(e.getSource() == boton1) {
        System.out.println("Has pulsado el bot�n 1");
        texto.setFont(new Font("Serif", Font.PLAIN, 10)); // Changing Font
      } else if (e.getSource() == boton2) {
        System.out.println("Has pulsado el bot�n 2");
        texto.setFont(new Font("Serif", Font.PLAIN, 12)); // Changing Font
      } else if (e.getSource() == boton3) {
        System.out.println("Has pulsado el bot�n 3");
        texto.setFont(new Font("Serif", Font.PLAIN, 18)); // Changing Font
      } else if (e.getSource() == boton4) {
        System.out.println("Has pulsado el bot�n 4");
        texto.setFont(new Font("Serif", Font.PLAIN, 24)); // Changing Font
      }

    }

  }

  private JLabel texto;
  private JRadioButton boton1, boton2, boton3, boton4;

}
