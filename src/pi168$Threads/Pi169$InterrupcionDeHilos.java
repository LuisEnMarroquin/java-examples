package pi168$Threads; // Multiples Threads = Programación Concurrente

import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Pi169$InterrupcionDeHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame marco=new MarcoRebote2(); // Intancia el marco
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}

class Pelota2Hilos2 implements Runnable{ // Para crear un hilo se tiene que hacer una clase que implemente la interfaz 'Runnable' que influya dentro del método 'run()' lo que desdea poder ejecutar en multiples hilos
	
	public Pelota2Hilos2(Pelota2 unaPelota2, Component unComponente) {
		
		Pelota2 = unaPelota2;
		componente = unComponente;
		
	}

	@Override
	public void run() {
		
		System.out.println("Estado del hilo al comenzar: " + Thread.currentThread().isInterrupted());
		
		/*for (int i=1; i<=3000; i++){
			
			// El método estático 'sleep' de la clase 'Thread' pausa en la ejecución de un hilo
			try {
				Thread.sleep(1L); // .sleep(NumberOfMiliseconds);
			} catch (InterruptedException e) {
				System.out.println("Hilo bloqueado por el método 'sleep()' Imposible su Interrupción");
			}
		
			Pelota2.mueve_Pelota2(componente.getBounds());
			componente.paint(componente.getGraphics());
			
		}*/
		
		/*while(!Thread.interrupted()) { // En este caso este while y el while e abajo hacen lo mismo
			Pelota2.mueve_Pelota2(componente.getBounds());
			componente.paint(componente.getGraphics());
		}*/
		
		while(!Thread.currentThread().isInterrupted()) {
			Pelota2.mueve_Pelota2(componente.getBounds());
			componente.paint(componente.getGraphics());
		}
		
		System.out.println("Estado del hilo al finalizar: " + Thread.currentThread().isInterrupted());
		
	}
	
	private Pelota2 Pelota2;
	private Component componente;
	
}

// Movimiento de la Pelota2 -----------------------------------------------------------------------------------------

class Pelota2{ // Se encarga de la animación de la Pelota2 y de uqe cuando se encuentre con el límite rebote
	
	// Mueve la Pelota2 invirtiendo posición si choca con límites
	
	public void mueve_Pelota2(Rectangle2D limites){
		
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
	
	//Forma de la Pelota2 en su posición inicial
	
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

// Lámina que dibuja las Pelota2s ----------------------------------------------------------------------


class LaminaPelota22 extends JPanel{
	
	//Añadimos Pelota2 a la lámina
	
	public void add(Pelota2 b){
		
		Pelota2s.add(b);
	}
	
	public void paintComponent(Graphics g){ // Pinta la Pelota2
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		
		for(Pelota2 b: Pelota2s){
			
			g2.fill(b.getShape());
		}
		
	}
	
	private ArrayList<Pelota2> Pelota2s=new ArrayList<Pelota2>();
}


// Marco con lámina y botones ------------------------------------------------------------------------------

class MarcoRebote2 extends JFrame{
	
	public MarcoRebote2(){
		
		setBounds(600,300,400,350);
		
		setTitle ("Rebotes");
		
		lamina=new LaminaPelota22();
		
		add(lamina, BorderLayout.CENTER);
		
		JPanel laminaBotones=new JPanel();
		
		ponerBoton(laminaBotones, "Dale!", new ActionListener(){ // 'Botón Dale'
			
			public void actionPerformed(ActionEvent evento){
				
				comienza_el_juego();
			}
			
		});
		
		// botón para salir
		ponerBoton(laminaBotones, "Salir", new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				System.exit(0);
				
			}
			
		});
		
		// botón de detener
		ponerBoton(laminaBotones, "Detener", new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				detener();
				
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
	
	//Añade Pelota2 y la bota 3000 veces
	
	public void comienza_el_juego (){
		
					
			Pelota2 Pelota2=new Pelota2();
			
			lamina.add(Pelota2);
			
			/*for (int i=1; i<=3000; i++){
				
				// El método estático 'sleep' de la clase 'Thread' pausa en la ejecución de un hilo
				try {
					Thread.sleep(1L); // .sleep(NumberOfMiliseconds);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Pelota2.mueve_Pelota2(lamina.getBounds());
				
				lamina.paint(lamina.getGraphics());
				
			}*/
			
			Runnable r = new Pelota2Hilos2(Pelota2, lamina); // Instancia la clase 'Pelota2Hilos2' haciendo que ejecute todo el código que hay en su interior
			
			/*Thread*/ t = new Thread(r); // Instancia la clase 'Thread' para crear el hilo y se le pasa de parámetro la clase 'Pelota2Hilos2' // Se hace una tara con este 'Runnable'
			
			t.start(); // Se le indica que comienze la tarea // Llama al método 'run()'
		
	}
	
	/*@SuppressWarnings("deprecation")
	public void detener() {
		t.stop(); // Método obsoleto
	}*/
	
	public void detener() {
		t.interrupt();
	}
	
	Thread t;
	
	private LaminaPelota22 lamina;
	
	
}
