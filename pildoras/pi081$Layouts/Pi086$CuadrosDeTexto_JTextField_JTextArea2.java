package pi081$Layouts; // "JTextField" y "JTextButton" extends from 'JTextComponent'

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pi086$CuadrosDeTexto_JTextField_JTextArea2 {

  public static void main(String[] args) {

    MarcoTexto2 marco = new MarcoTexto2();
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}

class MarcoTexto2 extends JFrame {
  public MarcoTexto2() {
    setBounds(600,300,600,350);
    LaminaTexto2 lamina = new LaminaTexto2();
    add(lamina);
    setVisible(true);
  }
}

class LaminaTexto2 extends JPanel {

  public LaminaTexto2() {

    JLabel texto = new JLabel("Email: "); // Creating TextLabel
    add(texto); // Adding TextLabel

    campo1 = new JTextField(20); // Instancing TextField that's outside this constructor
    add(campo1); // Adding TextField

    JButton boton = new JButton("Comprobar"); // Creating button
    DameTexto evento = new DameTexto(); // Instancing internal class 'DameTexto'
    boton.addActionListener(evento); // Adding 'ActionListener' to 'boton'. Now 'boton' is listening to an action
    add(boton); // Adding button

  }

  private class DameTexto implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println(campo1.getText().trim());
    }
  }

  private JTextField campo1;

}
