package pi161$ProgramacionGenerica;

public class Pi165$ClaseGenericaPropia <T> { // Por convención las letras de los argumentos de tipo son: U, T ó K

	public Pi165$ClaseGenericaPropia() {
		primero = null;
	}
	
	public void setPrimero(T nuevoValor) { // T = CualquierTipoDeObjeto = Objeto Genérico
		primero = nuevoValor;
	}
	
	public T getPrimero() {
		return primero;
	}
	
	private T primero;
	
}
