package pi032$POO_ConstruccionDeObjetos;

public class Pi032$POO_Coche { 
	
	private int ruedas;
	private int largo;
	private int ancho;
	//private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador; //Declarando 2 variables de tipo boolean en la misma linea.
	
	public Pi032$POO_Coche() { //Método constructor.
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		//motor = 1600;
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
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true; // this. hace referencia al asientos_cuero que es un String que está dentro de esta clase.
		}else {
			this.asientos_cuero=false; // El otro asientos_cuero era de tipo boolean.
		}
	}
	
	//getter-5
	public String dime_asientos() {
		if(asientos_cuero==true) { // Es lo mismo poner 'if(asientos_cuero)'
			return "El coche tiene asientos de cuero.";
		}else {
			return "El coche no tiene asientos de cuero.";
		}
	}
	
	//setter-3
	public void configura_climatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) { //Las cadenas se comparan con el método equals, no de esta forma: 'climatizador=="si"'
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	//getter-6
	public String dime_climatizador() {
		if(climatizador==true) {
			return "El coche lleva climatizador.";
		}else {
			return "El coche no lleva climatizador.";
		}
	}
	
	//setter y getter (a la vez) //Uso desaconsejado en la POO.
	public String dime_peso_coche() {
		
		int peso_carroceria = 500;
		peso_total = peso_plataforma + peso_carroceria;

		if(asientos_cuero == true) {
			peso_total=peso_total + 50; // +50 porque los asientos de cuero pesan 50kg.
		}
		
		if(climatizador==true) {
			peso_total=peso_total + 20; // +20 porque el climatizador pesa 20 kg.
		}
		
		return "El peso del coche es " + peso_total;
		
	}
	
	
	//getter-7
	public int precio_coche() {
		
		int precio_final = 10_000; //Precio final del coche sin asientos de cuero y sin climatizador.
	
		if(asientos_cuero==true) {
			precio_final += 2000;
		}
		
		if(climatizador==true) {
			precio_final += 1500;
		}
		
		return precio_final;
	
	}
	
}





//
