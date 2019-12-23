package pi168$Threads; // Exlicación del error de la programación concurrente en los primeros 10 minutos del video 175

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Pi175$BancoSincronizado_ReentrantLock {

	public static void main(String[] args) {

		Banco3 elBanco = new Banco3();
		
		for(int i = 0; i < 100; i++) { // i < 100 = porque hay 100 cuentas
			
			EjecucionTransferencias2 r = new EjecucionTransferencias2(elBanco, i, 2000); // Initanciando la clase que lleva la interfaz 'Runnable'
		
			Thread t = new Thread(r); // Instancia a la clase 'Thread'
			t.start(); // Arrancando el hilo
		
		}

	}

}

class Banco3 {
	
	public Banco3() {
	
		cuentas = new double[100]; // Habrá 100 cuentas
	
		for(int i = 0; i < cuentas.length; i++) { // Creando 100 cuentas
			cuentas[i] = 2000; // Asignando $2000 a cada cuenta
		}
	
	}
	
	public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) { // Método que realiza las transferencias
		
		soloUnHiloEjecutandoEsteMetodo.lock(); // Bloqueando el código dentro del try para que solamente un hilo pueda ejecutarlo a al vez
		
		try {
			
			if(cuentas[cuentaOrigen] < cantidad) { // Si el dinero de la cuenta de origen es menor que 'cantidad' (lo que se va a transferir)
				return; // Esto convertirá el hilo en un hilo que solo habre y cierra pero no hace nada
			}
			
			System.out.println(Thread.currentThread()); // Imprime en consola le hilo que hace la transferencia
			
			cuentas[cuentaOrigen] -= cantidad; // Resta del dinero de la 'cuentaOrigen' la cierta cantidad
			
			System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
			
			cuentas[cuentaDestino] += cantidad; // Aumenta cierta cantidad a la 'cuentaDestino'
			
			System.out.printf(" Saldo total: %10.2f%n", getSaldoTotal()); // Getting saldo total formated
		
		} finally {
			
			soloUnHiloEjecutandoEsteMetodo.unlock(); // Desbloqueando el código para que otro hilo pueda usarlo
			
		}
		
	} 
	
	private Lock soloUnHiloEjecutandoEsteMetodo = new ReentrantLock(); // Intancia perteneciente a la clase 'ReentrantLock' /// Campo encapsulado de la interfaz 'Lock'
	
	public double getSaldoTotal() { // Método para devolver el saldo total combinado de todas las cuentas
		double sumaCuentas = 0;
		for(double a : cuentas) {
			sumaCuentas += a;
		}
		return sumaCuentas; // Suma de todos los valores que están dentro del array
	}
	
	private final double[] cuentas;
	
}

class EjecucionTransferencias2 implements Runnable{ // Método que hará transferencias infinitas

	public EjecucionTransferencias2(Banco3 b, int cuentaOrigen, double cantidadMaximaPermitida) { // Constructor
		banco = b;
		delaCuenta = cuentaOrigen;
		cantidadMax = cantidadMaximaPermitida;
	}
	
	@Override
	public void run() {
		
		while(true) { // Bucle infinito para transferencias infinitas
			
			int cuentaDestinoDeLaTranferencia = (int)(100*Math.random()); // Devolverá un número entero entre 0 y 100
			
			double cantidadTransferencia = cantidadMax * Math.random(); // Cantidad para la tranferencia
			
			banco.transferencia(delaCuenta, cuentaDestinoDeLaTranferencia, cantidadTransferencia); // Aquí se manda a llamar al método que hace la transferencia
			
			try {
				Thread.sleep((int)Math.random()*10); // Que espere por una cantidad de tiempo variable
			} catch (InterruptedException e) {
				System.out.println("Error intentando dormir el hilo de ejecución");
			}
			
		}
		
	}
	
	private Banco3 banco;
	private int delaCuenta;
	private double cantidadMax;
	
}