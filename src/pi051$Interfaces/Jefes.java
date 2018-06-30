package pi051$Interfaces; //Esta es la primera interfaz del curso.

public interface Jefes extends Trabajadores{ //Esta es una jerarquía de interfaces: 'Jefes' hereda de 'Trabajadores'
	
	/*public abstract*/ String tomar_decisiones(String decision); //Es público y abstracto aunque no se pongo eso. //Los métodos de una interfaz deben ser siempre publicos y abstractos.
	
}
