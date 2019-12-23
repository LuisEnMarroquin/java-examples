package pi031$POO_PasoDeParametros;

public class Pi031$POO_UsoCoche {

	public static void main(String[] args) { 
		
		//Instanciar un objeto de tipo Pi030$POO_Coche
		Pi031$POO_Coche Renault = new Pi031$POO_Coche();
		
		//getter-1
		System.out.println(Renault.largo_coche());
		
		//getter-2
		System.out.println(Renault.dime_largo());
		
		//Instanciar un objeto de tipo Pi030$POO_Coche
		Pi031$POO_Coche Ford = new Pi031$POO_Coche();
		
		//setter-1
		Ford.establece_color("Amarillo"); //Con esta linea se le pasa el String "Amarillo" al setter-1
	
		//getter-3
		System.out.println(Ford.dime_color()); //Si no se definiera en el setter-1 el color del coche sería 'null' ya que el color no está definido en el constructor como si lo están getter-1 y getter2.
		
		//getter-4
		System.out.println(Ford.dime_datos_generales());
		
		//setter-2
		Renault.configura_asientos("si");
		
		//getter-5
		System.out.println(Renault.dime_asientos());
		
		//Ese no tiene asientos de cuero porque a Ford no se le pasó en el setter-2 el String "si" y a Renault si se le pasó el String "si" en el setter-2.
		System.out.println(Ford.dime_asientos());

	}

}
