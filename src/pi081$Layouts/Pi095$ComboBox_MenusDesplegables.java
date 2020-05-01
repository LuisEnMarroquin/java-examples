package pi081$Layouts;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pi095$ComboBox_MenusDesplegables {

  public static void main(String[] args) {

    MarcoCombo marco = new MarcoCombo();
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}

class MarcoCombo extends JFrame {

  public MarcoCombo() {

    setVisible(true);

    setBounds(500, 300, 550, 400);

    LaminaCombo lamina = new LaminaCombo();

    add(lamina);

  }

}

class LaminaCombo extends JPanel {

  public LaminaCombo() {

    setLayout(new BorderLayout());

    texto = new JLabel("Este es el texto..."); // Creating new JLabel 'texto'

    texto.setFont(new Font("Serif", Font.PLAIN, 18)); // Assigning to 'texto' font properties

    add(texto, BorderLayout.CENTER); // Adding 'texto' to CENTER of JPanel 'LaminaCombo'

    JPanel laminaNorte = new JPanel(); // Creating new JPanel

    combo = new JComboBox(); // Initializing a new 'JComboBox' called 'combo'
    combo.setEditable(true); // Making user able to write in 'combo'
    combo.addItem("Serif"); // Adding items to 'combo'
    combo.addItem("SansSerif");
    combo.addItem("Monospaced");
    combo.addItem("Dialog");

    EventoCombo evento = new EventoCombo();// Putting the 'combo' to listen
    combo.addActionListener(evento);

    laminaNorte.add(combo); // Adding 'combo' to 'laminaNorte'
    add(laminaNorte, BorderLayout.NORTH); // Adding 'laminaNorte' to JPanel 'LaminaCombo'

  }

  private class EventoCombo implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent arg0) {

      texto.setFont(new Font((String) combo.getSelectedItem(), Font.PLAIN, 18)); // '.getSelectedItem()' returns an Object, that's because it's casted to String

    }

  }

  private JLabel texto;
  private JComboBox combo;

}
