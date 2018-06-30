package pi004$JavaBasics;

public class Pi006$TiposPrimitivos {
	
	public static void main (String editable[]) {
		
		//Hay 8 tipos de datos primitivos en Java
		
		byte bpos = 127;
		byte bneg = -128;
		System.out.println("byte: " +bpos+ " y " +bneg);
		
		short spos = 32767;
		short sneg = -32768;
		System.out.println("short: " +spos+ " y " +sneg);
	
		int ipos = 2147483647;
		int ineg = -2147483648;
		System.out.println("int: " +ipos+ " y " +ineg);
		
		long lpos = 9223372036854775807L;
		long lneg = -9223372036854775808L;
		System.out.println("long: " +lpos+ " y " +lneg);
		
		double dpos = 98.39803725463423234545563347;
		double dneg = -23.34351346334522466424745344;
		System.out.println("double: " +dpos+ " y " +dneg);
		
		float fpos = 38.39803445323345646542711253467353777F;
		float fneg = -54.346454834325463234244536423599234F;
		System.out.println("float: " +fpos+ " y " +fneg);
		
		char caracteresUnicode = 'a';
		//Los char se usan para representar caracteres unicode.
		//Los char van a fuerzas en comillas simples.
		System.out.println("char: " + caracteresUnicode);
		
		boolean true_false = true;
		System.out.println("boolean: "+true_false);
		
	}

}
