package pi004$JavaBasics;
import javax.swing.*;

public class Pi018$Bucle_While {

	public static void main(String[] args) {
		
		String clave = "password";
		String pass = "";
		
		while(clave.equals(pass)==false) { //Mientras clave y pass no son iguales que ejecute lo que está dentro del bucle.
			pass = JOptionPane.showInputDialog("Introduce la contraseña"); //La contraseña es password
			if(clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta");
			}
		}
		System.out.println("Contraseña correcta");
		
	}
	
}
