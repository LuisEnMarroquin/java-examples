package pi168$Threads;

public class Pi172$SincronizacionDeHilos {

	public static void main(String[] args) {
		
		HilosVarios2 hilo1 = new HilosVarios2();
		
		HilosVarios3 hilo2 = new HilosVarios3(hilo1);
		
		hilo2.start(); // Este hilo no comienza hasta que termina el otro
		
		hilo1.start();
		
		System.out.println("El método main también tiene su  propio hilo");

	}

}

// Otra forma de hacer varios Hilos es hacer una clase que herede de 'Thread'
class HilosVarios2 extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 0; i < 15; i++) {
			
			System.out.println("Ejecutando Hilo " + getName());
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}

class HilosVarios3 extends Thread{
	
	public HilosVarios3(Thread hilo) {
		this.hilo = hilo;
	}
	
	@Override
	public void run() {
		
		try {
			hilo.join(); // Que la tarea no comienze hasta que termine la ejecución anterior
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} 
		
		for(int i = 0; i < 15; i++) {
			System.out.println("Ejecutando Hilo " + getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private Thread hilo;
	
}
