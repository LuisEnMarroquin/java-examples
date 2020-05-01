package pi081$Layouts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pi121$VentanasEmergentes_JOptionPane {

  public static void main(String[] args) {

    CuadrosDialogos marco = new CuadrosDialogos();

    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    marco.setVisible(true);

  }

}

class CuadrosDialogos extends JFrame{

  public CuadrosDialogos() {

    setBounds(500, 300, 600, 250);

    add(new LaminaCuadrosDialogos());

  }

}

class LaminaCuadrosDialogos extends JPanel{

  public LaminaCuadrosDialogos(){

     boton1=new JButton("MessageDialog"); // Creating buttons
     boton2=new JButton("InputDialog");
     boton3=new JButton("ConfirmDialog");
     boton4=new JButton("InputDialog");

    boton1.addActionListener(new Accion_botones()); // Buttons listening to an event of type 'ActionListener'
    boton2.addActionListener(new Accion_botones());
    boton3.addActionListener(new Accion_botones());
    boton4.addActionListener(new Accion_botones());

    add(boton1); // Adding buttons to the panel
    add(boton2);
    add(boton3);
    add(boton4);

  }

  private class Accion_botones implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

      if(e.getSource()==boton1){

        // JOptionPane.showMessageDialog(LaminaCuadrosDialogos.this, "Este es un mensaje"); // .showMessageDialog( PARENT COMPONENT , MESSAGE );

        JOptionPane.showMessageDialog(LaminaCuadrosDialogos.this, "Este es un mensaje", "Esto es un '.showMessageDialog()'", 0); /* The last number can be: 0, 1, 2 or 3 */

      }else if(e.getSource()==boton2){

        JOptionPane.showInputDialog(LaminaCuadrosDialogos.this, "Este es un mensaje", "Esto es un '.showInputDialog()'", 1);

      }else if(e.getSource()==boton3){

        JOptionPane.showConfirmDialog(LaminaCuadrosDialogos.this, "Este es un mensaje", "Esto es un '.showConfirmDialog()'", 0); // The last number changes the number of buttons that appear on the 'ConfirmDialog'
        JOptionPane.showConfirmDialog(LaminaCuadrosDialogos.this, "Este es un mensaje", "Esto es un '.showConfirmDialog()'", 1);
        JOptionPane.showConfirmDialog(LaminaCuadrosDialogos.this, "Este es un mensaje", "Esto es un '.showConfirmDialog()'", 2);
        // JOptionPane.showConfirmDialog(LaminaCuadrosDialogos.this, "Este es un mensaje", "Esto es un '.showConfirmDialog()'", 3); // This is not allowed

      }else{

        JOptionPane.showOptionDialog(LaminaCuadrosDialogos.this, "Elige", "T�tulo", 1, 1, null, null, null);

      }

    }

  }

  private JButton boton1, boton2, boton3, boton4;

}
