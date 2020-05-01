package pildoras;

public class P006_PrimitiveTypes {

  public static void main(String editable[]) {

    // There are 8 primitive data types in Java

    byte bpos = 127;
    byte bneg = -128;
    System.out.println("byte: " + bpos + " and " + bneg);

    short spos = 32767;
    short sneg = -32768;
    System.out.println("short: " + spos + " and " + sneg);

    int ipos = 2147483647;
    int ineg = -2147483648;
    System.out.println("int: " + ipos + " and " + ineg);

    long lpos = 9223372036854775807L;
    long lneg = -9223372036854775808L;
    System.out.println("long: " + lpos + " and " + lneg);

    double dpos = 98.39803725463423234545563347;
    double dneg = -23.34351346334522466424745344;
    System.out.println("double: " + dpos + " and " + dneg);

    float fpos = 38.39803445323345646542711253467353777F;
    float fneg = -54.346454834325463234244536423599234F;
    System.out.println("float: " + fpos + " and " + fneg);

    char unicodeChars = 'a'; // Use single quotes
    System.out.println("char: " + unicodeChars);

    boolean true_false = true;
    System.out.println("boolean: " + true_false);

  }

}
