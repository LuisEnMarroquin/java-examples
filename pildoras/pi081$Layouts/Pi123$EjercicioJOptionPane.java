package pi081$Layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Pi123$EjercicioJOptionPane {

  public static void main(String[] args) {

    MarcoDialogos marco = new MarcoDialogos();

    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    marco.setVisible(true);

  }

}

class MarcoDialogos extends JFrame{

  public MarcoDialogos() {

    setTitle("Prueba de dialogos");

    setBounds(500, 300, 600, 450);

    setLayout(new BorderLayout()); // Setting 'BorderLayout()' for this frame

    JPanel laminaCuadricula = new JPanel(); // Creating a Panel
    laminaCuadricula.setLayout(new GridLayout(2, 3)); // Setting the Panel layout to 'GridLayout()' with 2 rows and 3 columns

    String primerBox[] = {"Mensaje", "Confirmar", "Opci�n", "Entrada"}; // Creating array called 'primerBox'
    tipoLamina = new LaminaBotones("Tipo", primerBox); // Instancing class 'LaminaBotones'
    laminaCuadricula.add(tipoLamina); // Adding 'tipoLamina' to 'laminaCuadricula'

    tipoMensaje = new LaminaBotones("Tipo de Mensaje", new String[] {"ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"}); // Instancing class 'LaminaBotones' and Creating array
    laminaCuadricula.add(tipoMensaje); // Adding 'tipoMensaje' to 'laminaCuadricula'

    tipoContenido = new LaminaBotones("Contenido", new String[] {"Cadena", "Icono", "Componente", "Otros", "Object[]"}); // Instancing class 'LaminaBotones' and Creating array
    laminaCuadricula.add(tipoContenido); // Adding 'tipoContenido' to 'laminaCuadricula'

    /* Only works for tipoLamina.Confirmar */
    tipoConfirmar = new LaminaBotones("Confirmar", new String[] {"DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION"}); // Instancing class 'LaminaBotones' and Creating array
    laminaCuadricula.add(tipoConfirmar); // Adding 'tipoConfirmar' to 'laminaCuadricula'

    /* Only works for tipoLamina.Opci�n */
    tipoOpciones = new LaminaBotones("Opci�n", new String[] {"String[]", "Icon[]", "Object[]"}); // Instancing class 'LaminaBotones' and Creating array
    laminaCuadricula.add(tipoOpciones); // Adding 'tipoOpciones' to 'laminaCuadricula'

    /* Only works for tipoLamina.Entrada */
    tipoEntrada = new LaminaBotones("Entrada", new String[] {"Campo de Texto", "Combo"}); // Instancing class 'LaminaBotones' and Creating array
    laminaCuadricula.add(tipoEntrada); // Adding 'tipoEntrada' to 'laminaCuadricula'

    JPanel laminaMostrar = new JPanel(); // Creating a panel
    JButton botonMostrar = new JButton("Mostrar"); // Creating button
    botonMostrar.addActionListener(new AccionParaMostrar()); // Calling internal class to perform an action
    laminaMostrar.add(botonMostrar); // Adding button 'botonMostrar' to the panel 'laminaMostrar'
    add(laminaMostrar, BorderLayout.SOUTH); // Adding 'laminaMostrar' to the SOUTH of the frame

    add(laminaCuadricula, BorderLayout.CENTER); // Adding the panel to the CENTER of the Frame

  }

  // ------- RETURNS THE CONTENT OF THE BOX 'tipoMensaje' y 'tipoConfirmar' -------
    public int dameLamina2y4(LaminaBotones lamina) {
      String s = lamina.dameSeleccion(); // Returns the text of the selection of the 2nd or 4th box
      if(s.equals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")) {
        return 0; // ERROR_MESSAGE = 0
      } else if (s.equals("INFORMATION_MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")) {
        return 1; // INFORMATION_MESSAGE = 1
      } else if (s.equals("WARNING_MESSAGE") || s.equals("OK_CANCEL_OPTION")) {
        return 2; // WARNING_MESSAGE = 2
      } else if (s.equals("QUESTION_MESSAGE")) {
        return 3; // QUESTION_MESSAGE = 3
      } else if (s.equals("PLAIN_MESSAGE") || s.equals("DEFAULT_OPTION")) {
        return -1; // PLAIN_MESSAGE = -1
      } else { // Compilation error if else is not built
        return 00; // This is never used
      }
    }

  // -------------- RETURNS THE CONTENT OF THE BOX 'tipoContenido' ------------------
  public Object dameContenido() { /*ID-1*/
    String s = tipoContenido.dameSeleccion(); // Returns the text of the selection of the 3rd box
    if(s.equals("Cadena")) {
      return cadenaMensaje;
    } else if (s.equals("Icono")) {
      return iconoMensaje;
    } else if (s.equals("Componente")) {
      return componenteMensaje;
    } else if (s.equals("Otros")) {
      return objetoMensaje;
    } else if (s.equals("Object[]")) {
      return new Object[] {
        cadenaMensaje, iconoMensaje, componenteMensaje, objetoMensaje
      };
    } else { // Compilation error if else is not built
      return null;
    }
  }

  // --------------------------------- For tipoLamina.Opci�n ----------------------------
    public Object[] dameOpciones(LaminaBotones lamina) { // This returns an Array filled by Objects
      String s = lamina.dameSeleccion(); // Returns the text of the selection of the 5th box
      if(s.equals("String[]")) {
        return new String[] {"Amarillo", "Azul", "Rojo"}; // Returns some Strings inside an Array
      } else if (s.equals("Icon[]")) {
        return new Object[] {new ImageIcon("src/pi081$Layouts/wrench.png"), new ImageIcon("src/pi081$Layouts/cortar.gif"), new ImageIcon("src/pi081$Layouts/bold.png")};
      } else if (s.equals("Object[]")) {
        return new Object[] {
            cadenaMensaje, iconoMensaje, componenteMensaje, objetoMensaje
        };
      } else { // Compilation error if else is not built
        return null;
      }
    }

  // -------------------------------------------------------------------------

  private class AccionParaMostrar implements ActionListener{ // This is the action executed always button 'Mostrar' is pressed

    @Override
    public void actionPerformed(ActionEvent e) { // System.out.println("El 'tipoLamina' seleccionado es: " + tipoLamina.dameSeleccion() + '.');

      if(tipoLamina.dameSeleccion().equals("Mensaje")) {
        JOptionPane.showMessageDialog(MarcoDialogos.this, dameContenido(), "Message", dameLamina2y4(tipoMensaje/*2*/));
      } else if (tipoLamina.dameSeleccion().equals("Confirmar")) {
        JOptionPane.showConfirmDialog(MarcoDialogos.this, dameContenido(), "Confirm", dameLamina2y4(tipoConfirmar/*4*/), dameLamina2y4(tipoMensaje/*2*/));
      } else if (tipoLamina.dameSeleccion().equals("Entrada")) {

        if(tipoEntrada/*6*/.dameSeleccion().equals("Campo de texto")) {
          JOptionPane.showInputDialog(MarcoDialogos.this, dameContenido(), "Input", dameLamina2y4(tipoMensaje/*2*/));
        } else {
          JOptionPane.showInputDialog(MarcoDialogos.this, dameContenido(), "Input", dameLamina2y4(tipoMensaje/*2*/), null, new String[] {"Amarillo", "Azul", "Rojo"}, "Azul"); // Selected "Azul" by default
        }

      } else if (tipoLamina.dameSeleccion().equals("Opci�n")) {
        JOptionPane.showOptionDialog(MarcoDialogos.this, dameContenido(), "Option", 0, dameLamina2y4(tipoMensaje/*2*/), null, dameOpciones(tipoOpciones)/*5*/, null);
      }

    }

  }

  private LaminaBotones tipoLamina, tipoMensaje/*2*/, tipoContenido, tipoConfirmar/*4*/, tipoOpciones/*5*/, tipoEntrada/*6*/;

  /*ID-1*/private String cadenaMensaje = "Esto es una cadena de texto"; // This part of the code is for this
  /*ID-1*/private Icon iconoMensaje = new ImageIcon("src/pi081$Layouts/wrench.png");
  /*ID-1*/private Object objetoMensaje = new Date();
  /*ID-1*/private Component componenteMensaje = new LaminaEjemplo(); // In this case this component is a panel

}

class LaminaEjemplo extends JPanel{ // Creating a new yellow panel for internal option
  @Override
  public void paintComponent(Graphics g) { // Overriding method 'paintComponent'
    super.paintComponents(g); // Calling father class method 'paintComponents'
    Graphics2D g2 = (Graphics2D) g; // Casting object Graphics 'g' to object Graphics2D 'g2'
    Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight()); // Creating a rectangle // (startPosition, endPosition, Width, Height)
    g2.setPaint(Color.YELLOW); // Assigning paint to the object Graphics2D 'g2' with color yellow
    g2.fill(rectangulo); // Filling Graphics2D 'g2' with the rectangle
  }
}

class LaminaBotones extends JPanel{

  public LaminaBotones(String titulo, String [] opciones) {

    setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));

    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // Y_AXIS = Vertically aligned components

    /*ButtonGroup*/ grupo = new ButtonGroup(); // Creating ButtonGroup

    for(int i = 0; i < opciones.length; i++) { // Moving though the array
      JRadioButton boton = new JRadioButton(opciones[i]); // Creating button
      boton.setActionCommand(opciones[i]); // Setting Name of the radio button as the Name of the action // Video 126 minute 14.30
      add(boton); // Adding button to the panel
      grupo.add(boton); // Adding button to the button group
      boton.setSelected(i==0); // Make the first radio button to be selected
    }

  }

  public String dameSeleccion() { // Method Getter
    ButtonModel myButton = grupo.getSelection(); // 'grupo.getSelection()' returns the number of the radioButton selected
    String s = myButton.getActionCommand(); // This returns the name of the selected radioButton (example: "Mensaje", "Confirmar", etc.)
    return s;
  }

  private ButtonGroup grupo;

}
