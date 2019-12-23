package pi004$JavaBasics;

public class Pi009$ClaseMath {

	public static void main(String[] args) {
		
		//Método sqrt - Devolver la raíz cuadrada de un número.
		
		//int raiz = Math.sqrt(9); //El método sqrt devuelve un double, por eso el int al principio no se puede usar.
		double raiz = Math.sqrt(9); //Se necesita almacenar el resultado en un double.
		System.out.println("La raíz cuadrada de 9 es "+raiz); //Devuelve un double, por eso imprimirá en consola 3.0.
		
		//Método round - Redondear un número
		float num1 = 5.85F;
		int redondeado = Math.round(num1); //Math.round puede recibir un float y devolver un int o puede recibir un double y devolver un long.
		System.out.println("5.85 redondeado es: "+redondeado);
		
		//Refundición - Convertir un tipo de dato a otro
		double num2 = 5.85F;
		int redondear = (int)Math.round(num2);
		System.out.println("5.85 redondeado es: "+redondear);
		
		//Math.pow - Elevar un número a una potencia
		double base = 5;
		double exponente = 3;
		int respuesta = (int)Math.pow(base, exponente); //Math.pow decibe 2 doublesy devuelve un double
		System.out.println("El número "+base+" elevado a "+exponente+" es "+respuesta);
	}

}
