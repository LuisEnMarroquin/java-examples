package pi168$Threads;

public class Pi171$SincronizacionDeHilos {

	public static void main(String[] args) {
		
		HilosVarios hilo1 = new HilosVarios();
		hilo1.start();
		
		try {
			hilo1.join(); // Espera hasta que el 'hilo1' muera
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		HilosVarios hilo2 = new HilosVarios();
		hilo2.start();
		
		System.out.println("El método main también tiene su hilo");
		
		try {
			hilo2.join(); // Espera hasta que el 'hilo2' muera
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Terminadas todas las tareas");

	}

}

// Otra forma de hacer varios Hilos es hacer una clase que herede de 'Thread'
class HilosVarios extends Thread{
	
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