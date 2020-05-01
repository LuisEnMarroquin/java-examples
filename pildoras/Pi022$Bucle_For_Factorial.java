package pildoras;
import javax.swing.*;

public class Pi022$Bucle_For_Factorial { // El factorial de 3 ser�a: 3 * 2 * 1 = 6

  public static void main(String[] args) {

    Long resultado = 1L; //Hab�a problemas con el resutado ya que rapidamente se sobrepasar�a la capacidad de los datos de tipo int desde el n�mero 20. Por eso mejor declararla como Long
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero")); //Integer.parseInt = Pasa a entero el String que se introduce por la ventana JOptionPane y lo guarda en la variable n�mero.

    for(int i=numero; i>0; i--) {  // S� numero=i  3  // i =          // i = 11
      resultado=resultado*i;    // 3 = 1 * 3 = 3  // 3 = 3 * 2 = 6  // 6 = 6 * 1 = 6
    }

    System.out.println("El factorial de " + numero + " es " + resultado + ".");
    // Los datos de tipo Long tambi�n son facilmente sobrepasados, por ello para manejar n�meros incluso m�s grandes que un Long se puede usar la clase BigInteger (consultar en la API su uso).

  }

}
