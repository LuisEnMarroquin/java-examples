package pi168$Threads; // Multiples Threads = Programaci�n Concurrente

import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Pi168$ProgamacionDeHilos {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    JFrame marco=new MarcoRebote(); // Intancia el marco

    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    marco.setVisible(true);

  }

}

class PelotaHilos implements Runnable{ // Para crear un hilo se tiene que hacer una clase que implemente la interfaz 'Runnable' que influya dentro del m�todo 'run()' lo que desdea poder ejecutar en multiples hilos

  public PelotaHilos(Pelota unaPelota, Component unComponente) {

    pelota = unaPelota;
    componente = unComponente;

  }

  @Override
  public void run() {

    for (int i=1; i<=3000; i++){

      // El m�todo est�tico 'sleep' de la clase 'Thread' pausa en la ejecuci�n de un hilo
      try {
        Thread.sleep(1L); // .sleep(NumberOfMiliseconds);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      pelota.mueve_pelota(componente.getBounds());

      componente.paint(componente.getGraphics());

    }

  }

  private Pelota pelota;
  private Component componente;

}

// Movimiento de la pelota -----------------------------------------------------------------------------------------

class Pelota{ // Se encarga de la animaci�n de la pelota y de uqe cuando se encuentre con el l�mite rebote

  // Mueve la pelota invirtiendo posici�n si choca con l�mites

  public void mueve_pelota(Rectangle2D limites){

    x+=dx;

    y+=dy;

    if(x<limites.getMinX()){

      x=limites.getMinX();

      dx=-dx;
    }

    if(x + TAMX>=limites.getMaxX()){

      x=limites.getMaxX() - TAMX;

      dx=-dx;
    }

    if(y<limites.getMinY()){

      y=limites.getMinY();

      dy=-dy;
    }

    if(y + TAMY>=limites.getMaxY()){

      y=limites.getMaxY()-TAMY;

      dy=-dy;

    }

  }

  //Forma de la pelota en su posici�n inicial

  public Ellipse2D getShape(){

    return new Ellipse2D.Double(x,y,TAMX,TAMY);

  }

  private static final int TAMX=15;

  private static final int TAMY=15;

  private double x=0;

  private double y=0;

  private double dx=1;

  private double dy=1;


}

// L�mina que dibuja las pelotas ----------------------------------------------------------------------


class LaminaPelota extends JPanel{

  //A�adimos pelota a la l�mina

  public void add(Pelota b){

    pelotas.add(b);
  }

  public void paintComponent(Graphics g){ // Pinta la pelota

    super.paintComponent(g);

    Graphics2D g2=(Graphics2D)g;

    for(Pelota b: pelotas){

      g2.fill(b.getShape());
    }

  }

  private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
}


// Marco con l�mina y botones ------------------------------------------------------------------------------

class MarcoRebote extends JFrame{

  public MarcoRebote(){

    setBounds(600,300,400,350);

    setTitle ("Rebotes");

    lamina=new LaminaPelota();

    add(lamina, BorderLayout.CENTER);

    JPanel laminaBotones=new JPanel();

    ponerBoton(laminaBotones, "Dale!", new ActionListener(){ // 'Bot�n Dale'

      public void actionPerformed(ActionEvent evento){

        comienza_el_juego();
      }

    });


    ponerBoton(laminaBotones, "Salir", new ActionListener(){

      public void actionPerformed(ActionEvent evento){

        System.exit(0);

      }

    });

    add(laminaBotones, BorderLayout.SOUTH);
  }


  //Ponemos botones

  public void ponerBoton(Container c, String titulo, ActionListener oyente){

    JButton boton=new JButton(titulo);

    c.add(boton);

    boton.addActionListener(oyente);

  }

  //A�ade pelota y la bota 3000 veces

  public void comienza_el_juego (){


      Pelota pelota=new Pelota();

      lamina.add(pelota);

      /*for (int i=1; i<=3000; i++){

        // El m�todo est�tico 'sleep' de la clase 'Thread' pausa en la ejecuci�n de un hilo
        try {
          Thread.sleep(1L); // .sleep(NumberOfMiliseconds);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }

        pelota.mueve_pelota(lamina.getBounds());

        lamina.paint(lamina.getGraphics());

      }*/

      Runnable r = new PelotaHilos(pelota, lamina); // Instancia la clase 'PelotaHilos' haciendo que ejecute todo el c�digo que hay en su interior

      Thread t = new Thread(r); // Instancia la clase 'Thread' para crear el hilo y se le pasa de par�metro la clase 'PelotaHilos' // Se hace una tara con este 'Runnable'

      t.start(); // Se le indica que comienze la tarea

  }

  private LaminaPelota lamina;


}
