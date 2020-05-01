package pi081$Layouts; // If Window is empty just resize it

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pi092$CheckBox {

  public static void main(String[] args) {

    MarcoCheck marco = new MarcoCheck();
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}

class MarcoCheck extends JFrame {

  public MarcoCheck() {

    setBounds(550, 300, 750, 350);

    setVisible(true);

    LaminaCheck lamina = new LaminaCheck();

    add(lamina);

  }

}

class LaminaCheck extends JPanel {

  public LaminaCheck() {

    setLayout(new BorderLayout()); // Setting 'BorderLayout' for panel 'LaminaCheck'

    Font letra = new Font("Serif", Font.PLAIN, 24); // Creating 'Font' // 24 = size

    texto = new JLabel("Esta es una frase a la que se le van a cambiar las caracter�sticas");

    texto.setFont(letra); // Pasando un objeto de tipo 'Font' al texto para formatearlo as�

    JPanel laminaTexto = new JPanel(); // Creating a second panel
    laminaTexto.add(texto); // Adding 'texto' to panel 'laminaTexto'
    add(laminaTexto, BorderLayout.CENTER); // Adding panel 'laminaTexto' to panel 'LaminaCheck'

    check1 = new JCheckBox("Negrita"); // Creates the 'CheckBox' and String "Negrita" next to it
    check2 = new JCheckBox("Cursiva");

    check1.addActionListener(new ManejaChecks()); // Poniendo a la escucha
    check2.addActionListener(new ManejaChecks()); // Instancing class 'ManejaChecks'

    JPanel laminaChecks = new JPanel(); // Creating new Panel to put 'check1' and 'check2'
    laminaChecks.add(check1); // Adding to 'laminaChecks'
    laminaChecks.add(check2);

    add(laminaChecks, BorderLayout.SOUTH); // Adding panel 'laminaChecks' to panel 'LaminaCheck'

  }

  private class ManejaChecks implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent arg0) {

      int tipo = 0;

      if(check1.isSelected()) tipo += Font.BOLD; // If this is true: font +=1 // 'Font.BOLD' is an 'int' and equals 1

      if(check2.isSelected()) tipo += Font.ITALIC; // If this is true: font +=2 // 'Font.BOLD' is an 'int' and equals 2

      texto.setFont(new Font("Serif", tipo, 24));

    }

  }

  // Variables
  private JLabel texto;
  private JCheckBox check1, check2;

}
