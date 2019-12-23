package pi040$Herencia;

public class Pi040$Furgoneta extends Pi040$Coche{ //extends trae todas las características y métodos de un coche.
	
	//Propiedades que son propias de esta clase Furgoneta.
	private int capacidad_carga;
	private int plazas_extra;
	
	//Constructor para esta clase Furgoneta, porque aunque herede el constructor de coche, ese constructor no tiene 'capacidad_carga' ni 'plazas_extra' que son propias de esta clase
	public Pi040$Furgoneta(int plazas_extra, int capacidad_carga) {
		super(); //Llamará al constructor de la clase padre 'Pi040$POO_Coche' para traer los datos que este tiene por ejemplo: ruedas = 4; largo = 2000; ancho = 300; etc.
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
	}
	
	//getter-a
	public String dimeDatosFurgoneta() {
		return "La capacidad de carga es " + capacidad_carga + " kilos y las plazas extra son " + plazas_extra + ".";
	}
	
}
