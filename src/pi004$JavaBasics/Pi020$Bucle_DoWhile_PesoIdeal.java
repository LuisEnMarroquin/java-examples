package pi004$JavaBasics;
import javax.swing.*;

public class Pi020$Bucle_DoWhile_PesoIdeal {

	public static void main(String[] args) {
		
		String genero = ""; //Se declara el valor de la variable antes porque no se puede usar en el "Do While" si no ha sido declarada previamente.
		
		do {
			genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false); //Que repita el DO infinitas veces mientras el texto introducido no sea "H" o "M".

		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en centímetros"));
		
		int pesoIdeal = 0;
		
		if(genero.equalsIgnoreCase("H")) {
			pesoIdeal = altura - 110; //Si eres hombre calcula tu edad restando 110 a tu altura.
		}else {
			pesoIdeal = altura -120; //Si eres mujer calcula tu edad restando 120 a tu altura.
		}
		
		System.out.println("Tu peso ideal es: " + pesoIdeal + " kg.");
		
	}

}
