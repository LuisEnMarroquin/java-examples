package random_mp3;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.awt.event.ActionEvent;

public class Swing_full extends JFrame {

  private static final long serialVersionUID = 4720048839617587413L;

  private final JButton b = new JButton();

  public Swing_full() {
    super();
    this.setTitle("HelloApp");
    this.getContentPane().setLayout(null);
    this.setBounds(100, 100, 180, 140);
    this.add(makeButton());
    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  private JButton makeButton() {
    b.setText("Click me!");
    b.setBounds(40, 40, 100, 30);
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(b, "Hello World!");
      }
    });
    return b;
  }

  public static void main(String[] args) {
    // Swing calls must be run by the event dispatching thread.
    try {
      SwingUtilities.invokeAndWait(() -> new Swing_full());
    } catch (InvocationTargetException | InterruptedException e) {
      e.printStackTrace();
    }
  }
}
