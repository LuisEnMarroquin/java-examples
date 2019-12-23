package pi031$POO_PasoDeParametros;

public class Pi031$POO_Coche { 
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador; //Declarando 2 variables de tipo boolean en la misma linea.
	
	public Pi031$POO_Coche() { //Método constructor.
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
	
	// Sintaxis de un método Setter(para modificar un valor): public(para que se pueda acceder desde otra clase) void(porque no devuelve ningún dato) nombre_método() { código }
	
	//setter-1
	public void establece_color(String color_coche /*Cuando hay algo aquí hay que pasar obligatriamente un parámetro*/) { //Paso de parámetros.
		//color="azul"; //Esta linea causa que siempre que se mande a llamar este método Setter defina el color como azul siempre.
		color = color_coche;
	}
	
	//getter-3
	public String dime_color() {
		return "El color del coche es " + color;
	}
	
	//getter-4
	public String dime_datos_generales() {
		return "La plataforma del vehiculo tiene " +ruedas+ " ruedas. \n" + 
		"Mide " +largo/1000+ " metros, con un ancho de " +ancho+ " cm. \n" + 
		"Y un peso de plataforma de " +peso_plataforma+ " kg.";
	}
	
	//No importa si se pone primero el getter o el setter.
	
	//setter-2
	public void configura_asientos(String asientos_cuero) { //Coincide el nombre de la variable(que da propiedad a la clase) con el nombre del argumento/parámetro.
		if(asientos_cuero=="si") {
			this.asientos_cuero=true; // this. hace referencia al asientos_cuero que es un String que está dentro de esta clase.
		}else {
			this.asientos_cuero=false; // El otro asientos_cuero era de tipo boolean.
		}
	}
	
	//getter-5
	public String dime_asientos() {
		if(asientos_cuero==true) {
			return "El coche tiene asientos de cuero.";
		}else {
			return "El coche no tiene asientos de cuero.";
		}
	}
	
	//getter-6 (este getter no sirve para nada y lo agregé yo para quitar la advertencia del eclipse)
	public String quitandoLaAdvertenciaAmarillaDelEclipse() {
		return "Hola: " + motor + peso_total + climatizador;
	}
	
}
