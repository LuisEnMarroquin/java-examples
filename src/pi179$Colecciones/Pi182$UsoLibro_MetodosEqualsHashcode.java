package pi179$Colecciones;

public class Pi182$UsoLibro_MetodosEqualsHashcode { // Lo que determina que los objetos son iguales es el IBSN, no es el ttulo ni el autor

	public static void main(String[] args) {
		
		Libros Libros1 = new Libros("Programando en Java", "Luis Marroquín", 25);
		
		Libros Libros2 = new Libros("Programando en Java 2", "Luis Marroquín", 25);
		
		if(Libros1.equals(Libros2)) { // El método equals de la clase Object no es capaz de dsitinguir si 2 objetos son iguales en clases propias, por eso hay que sobreescribirlo
			System.out.println("Es el mismo libro");
		} else {
			System.out.println("No es el mismo libro"); // Dirá esto porque hay que sobreescribir el método equals (se hace en ejemplos siguientes)
		}
		
		System.out.println(Libros1.hashCode());
		System.out.println(Libros2.hashCode());

	}

}

class Libros {
	
	public Libros(String titulo, String autor, int ISBN) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
	}
	
	public String getDatos() {
		return "El título es :" + titulo + ". El autor es: " + autor + ". El ISBN es; " + ISBN + "."; 
	}
	
	/*@Override // Sobreescribiendo el método 'equals'
	public boolean equals(Object obj) { // Este método equals dirá 'true' cuando el ISBN de 2 libros sea igual
		if(obj instanceof Libros) { // Verifica que el objeto que se le pasa sea una instancia de la clase Libros (es decir que sea un objeto de tipo Libros)
			Libros otro = (Libros)obj; // Casting: Se convierte la variable de tipo Object 'obj' en una variable de tipo 'Libros' y se genera una variable llamada 'otro'
			if(this.ISBN == otro.ISBN) { // Verificando que los ISBN sean iguales
				return true;
			} else {
				return false; // Porque el ISBN no es igual
			}
		} else {
			return false; // Porque no es un objeto de tipo 'Libros'
		}
	}*/
	
	// Autogenerate equals and hashCode with eclipse => Source - Generate hashCode() and equals() - Check only 'ISBN'
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libros other = (Libros) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}

	private String titulo;
	private String autor;
	private int ISBN;
	
}