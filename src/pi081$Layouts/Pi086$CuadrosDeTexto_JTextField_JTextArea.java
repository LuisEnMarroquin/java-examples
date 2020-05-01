package pi081$Layouts; // "JTextField" y "JTextButton" extends from 'JTextComponent'

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pi086$CuadrosDeTexto_JTextField_JTextArea {

  public static void main(String[] args) {

    MarcoTexto marco = new MarcoTexto();
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}

class MarcoTexto extends JFrame {
  public MarcoTexto() {
    setBounds(600,300,600,350);
    LaminaTexto lamina = new LaminaTexto();
    add(lamina);
    setVisible(true);
  }
}

class LaminaTexto extends JPanel {
  public LaminaTexto() {

    JTextField campo1 = new JTextField("Texto por defecto");
    add(campo1);
    System.out.println(campo1.getText());

    JTextField campo2 = new JTextField(20);
    add(campo2);

    JTextField campo3 = new JTextField("Texto       por       defecto", 20);
    add(campo3);
    System.out.println(campo1.getText().trim()); // '.trim()' quits a lot of white spaces

  }
}
