package pi004$JavaBasics;
import javax.swing.*;

public class Pi022$Bucle_For_Factorial { // El factorial de 3 sería: 3 * 2 * 1 = 6

	public static void main(String[] args) {
		
		Long resultado = 1L; //Había problemas con el resutado ya que rapidamente se sobrepasaría la capacidad de los datos de tipo int desde el número 20. Por eso mejor declararla como Long
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número")); //Integer.parseInt = Pasa a entero el String que se introduce por la ventana JOptionPane y lo guarda en la variable número.

		for(int i=numero; i>0; i--) {	// Sí numero=i=3	// i = 2			// i = 11
			resultado=resultado*i;		// 3 = 1 * 3 = 3	// 3 = 3 * 2 = 6	// 6 = 6 * 1 = 6
		}
		
		System.out.println("El factorial de " + numero + " es " + resultado + ".");
		// Los datos de tipo Long también son facilmente sobrepasados, por ello para manejar números incluso más grandes que un Long se puede usar la clase BigInteger (consultar en la API su uso).
		
	}

}
