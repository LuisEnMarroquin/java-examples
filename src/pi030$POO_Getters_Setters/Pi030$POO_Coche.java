package pi030$POO_Getters_Setters;

public class Pi030$POO_Coche { 
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador; //Declarando 2 variables de tipo boolean en la misma linea.
	
	public Pi030$POO_Coche() { //Método constructor.
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	} 
	
	// Sintaxis de un método Getter(para obtener un valor): public(para que se pueda ver en todas las clases) dato_a_devolver nombre_método() { código + return }
	
	//getter-1
	public int largo_coche() {
		return largo;
	}
	
	//getter-2
	public String dime_largo() {
		return "El largo del coche es " + largo;
	}
	
	//getter-3 (no está en el video, lo puse para quitar las advertencias en amarillo)
	public String dameDatos() {
		return "Datos: " + ruedas + ancho + motor + peso_plataforma + peso_total + asientos_cuero + climatizador;
	}
	
	// Sintaxis de un método Setter(para modificar un valor): public(para que se pueda acceder desde otra clase) void(porque no devuelve ningún dato) nombre_método() { código }
	
	//setter-1
	public void establece_color() {
		color="azul";
	}
	
	//getter-3
	public String dime_color() {
		return "El color del coche es " + color;
	}
	
}
