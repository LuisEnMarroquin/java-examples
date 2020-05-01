package random_mp3;

import javax.swing.*;

public class Swing extends JFrame {

  private static final long serialVersionUID = 1L;

  public Swing() {
    super("hello");
    super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    super.add(new JLabel("Hello, world!"));
    super.pack();
    super.setVisible(true);
  }

  public static void main(String[] args) {
    new Swing();
  }

}
