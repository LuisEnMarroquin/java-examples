package pi168$Threads; // Multiples Threads = Programaci�n Concurrente

import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Pi170$InterrupcionDeVariosHilos {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    JFrame marco=new MarcoRebote3(); // Intancia el marco

    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    marco.setVisible(true);

  }

}

class PelotaHilos3 implements Runnable{ // Para crear un hilo se tiene que hacer una clase que implemente la interfaz 'Runnable' que influya dentro del m�todo 'run()' lo que desdea poder ejecutar en multiples hilos

  public PelotaHilos3(Pelotas unaPelotas, Component unComponente) {

    Pelotas = unaPelotas;
    componente = unComponente;

  }

  @Override
  public void run() {

    System.out.println("Estado del hilo al comenzar: " + Thread.currentThread().isInterrupted());

    while(!Thread.currentThread().isInterrupted()) {
      Pelotas.mueve_Pelotas(componente.getBounds());
      componente.paint(componente.getGraphics());

    //for (int i=1; i<=3000; i++){

      // El m�todo est�tico 'sleep' de la clase 'Thread' pausa en la ejecuci�n de un hilo
      try {
        Thread.sleep(4); // .sleep(NumberOfMiliseconds);
      } catch (InterruptedException e) {
        System.out.println("Hilo bloqueado por el m�todo 'sleep()' Interrupcion hecha con el catch");
        Thread.currentThread().interrupt();
      }

      Pelotas.mueve_Pelotas(componente.getBounds());
      componente.paint(componente.getGraphics());

    //}

    /*while(!Thread.interrupted()) { // En este caso este while y el while e abajo hacen lo mismo
      Pelotas.mueve_Pelotas(componente.getBounds());
      componente.paint(componente.getGraphics());
    }*/

    }

    System.out.println("Estado del hilo al finalizar: " + Thread.currentThread().isInterrupted());

  }

  private Pelotas Pelotas;
  private Component componente;

}

// Movimiento de la Pelotas -----------------------------------------------------------------------------------------

class Pelotas{ // Se encarga de la animaci�n de la Pelotas y de uqe cuando se encuentre con el l�mite rebote

  // Mueve la Pelotas invirtiendo posici�n si choca con l�mites

  public void mueve_Pelotas(Rectangle2D limites){

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

  //Forma de la Pelotas en su posici�n inicial

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

// L�mina que dibuja las Pelotass ----------------------------------------------------------------------


class LaminaPelota3 extends JPanel{

  //A�adimos Pelotas a la l�mina

  public void add(Pelotas b){

    Pelotass.add(b);
  }

  public void paintComponent(Graphics g){ // Pinta la Pelotas

    super.paintComponent(g);

    Graphics2D g2=(Graphics2D)g;

    for(Pelotas b: Pelotass){

      g2.fill(b.getShape());
    }

  }

  private ArrayList<Pelotas> Pelotass=new ArrayList<Pelotas>();
}


// Marco con l�mina y botones ------------------------------------------------------------------------------

class MarcoRebote3 extends JFrame{

  public MarcoRebote3(){

    setBounds(600,300,600,350);

    setTitle ("Rebotes");

    lamina=new LaminaPelota3();

    add(lamina, BorderLayout.CENTER);

    JPanel laminaBotones=new JPanel();

    // bot�n 'arranca1'
    arranca1 = new JButton("Hilo 1");
    arranca1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evento) {
        comienza_el_juego(evento);
      }
    });
    laminaBotones.add(arranca1);

    // bot�n 'arranca2'
    arranca2 = new JButton("Hilo 2");
    arranca2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evento) {
        comienza_el_juego(evento);
      }
    });
    laminaBotones.add(arranca2);

    // bot�n 'arranca3'
    arranca3 = new JButton("Hilo 3");
    arranca3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evento) {
        comienza_el_juego(evento);
      }
    });
    laminaBotones.add(arranca3);

    detener1 = new JButton("Detener 1");
    detener1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evento) {
        detener(evento);
      }
    });
    laminaBotones.add(detener1);

    detener2 = new JButton("Detener 2");
    detener2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evento) {
        detener(evento);
      }
    });
    laminaBotones.add(detener2);

    detener3 = new JButton("Detener 3");
    detener3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evento) {
        detener(evento);
      }
    });
    laminaBotones.add(detener3);

    add(laminaBotones, BorderLayout.SOUTH);
  }

  //A�ade Pelotas y la bota 3000 veces

  public void comienza_el_juego (ActionEvent e){


      Pelotas Pelotas=new Pelotas();

      lamina.add(Pelotas);

      Runnable r = new PelotaHilos3(Pelotas, lamina); // Instancia la clase 'PelotaHilos3' haciendo que ejecute todo el c�digo que hay en su interior

      if(e.getSource().equals(arranca1)) {
        /*Thread*/ t1 = new Thread(r); // Instancia la clase 'Thread' para crear el hilo y se le pasa de par�metro la clase 'PelotaHilos3' // Se hace una tara con este 'Runnable'
        t1.start(); // Se le indica que comienze la tarea // Llama al m�todo 'run()'
      } else if(e.getSource().equals(arranca2)) {
        t2 = new Thread(r);
        t2.start();
      } else if(e.getSource().equals(arranca3)) {
        t3 = new Thread(r);
        t3.start();
      }



  }

  public void detener(ActionEvent e) {

    if(e.getSource().equals(detener1)) {
      t1.interrupt();
    } else if(e.getSource().equals(detener2)) {
      t2.interrupt();
    } else if(e.getSource().equals(detener3)) {
      t3.interrupt();
    }

  }

  Thread t1, t2, t3;

  JButton arranca1, arranca2, arranca3, detener1, detener2, detener3;

  private LaminaPelota3 lamina;


}
