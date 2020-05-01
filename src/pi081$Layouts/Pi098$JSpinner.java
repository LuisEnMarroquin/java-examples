package pi081$Layouts; // Resize if the content inside the Frame is not displayed

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class Pi098$JSpinner {

  public static void main(String[] args) {

    FrameSpinner marco = new FrameSpinner();
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setVisible(true);

  }

}

class FrameSpinner extends JFrame {

  public FrameSpinner() {

    setBounds(500, 350, 550, 350);

    setVisible(true);

    add(new LaminaSpinner());

  }

}

class LaminaSpinner extends JPanel {

  public LaminaSpinner() {

    //add(new JSpinner()); // Creating 'JSpinner()' for numbers

    /* JSpinner controlFecha = new JSpinner(new SpinnerDateModel()); // Creating 'SpinnerDateModel()' to show dates inside the 'Spinner'
    add(controlFecha); */

    String lista [] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); // Array for Strings
    JSpinner control = new JSpinner(new SpinnerListModel(lista)); // Creating 'SpinnerListModel()' to show an Array inside the 'Spinner'
    Dimension d = new Dimension(200, 30); // Dimensions for 'SpinnerListModel()'
    control.setPreferredSize(d); // Adding dimensions
    add(control);

    JSpinner numbers = new JSpinner(new SpinnerNumberModel(5,0,10,2)); // Creating 'SpinnerListModel()' to show an Array inside the 'Spinner'
    Dimension d2 = new Dimension(200, 30); // Dimensions for 'SpinnerListModel()'
    numbers.setPreferredSize(d2); // Adding dimensions
    add(numbers);

  }

}
