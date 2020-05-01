package examples;

import javax.swing.*;

public class SwingSimple extends JFrame {

  private static final long serialVersionUID = 1L;

  public SwingSimple() {
    super("hello");
    super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    super.add(new JLabel("Hello, world!"));
    super.pack();
    super.setVisible(true);
  }

  public static void main(String[] args) {
    new SwingSimple();
  }

}
