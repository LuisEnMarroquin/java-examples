# Oracle Certified Associate Java SE 8 Programmer (Es mejor que el que es solo associated )
Jorge Carmona Mil = carmonamil@gmail.com

## Editar las variables del entorno
CLASSPATCH = .;   //   Podría ser CLASSPATH = .;
JAVA_HOME = C:\Program Files\Java\jre1.8.0_151
PATH = C:\Program Files\Java\jre1.8.0_151\bin

Fases:
1. UML = Lenguaje Unificado de Modelado (diagramas de flujo)
2. OCA JP (curso)
3. Objetivos de certificación
4. Simuladores
5. Exámen

Exam: 150 minutes, is needed grade 65% about 45 correct answers, total questions 70, price aprox. 3000 mxn. Maybe 200 USD.

# UML (Unified Modeling Language)
	- Es un lenguaje grafico para el modelado y desarrollo de sistemas de software.
		+ Perro (nombre del objeto)
			+ nombre (atributos)
			+ raza
				+ ladrar() (métodos)
				+ correr()
				
## Nota en diagrama UML = Hoja con esquina doblada.
## Paquete en diagrama UML = Casa con chimenea (Se usa para organizar elementos en grupos). Se divide en carpetas que pueden tener subcarpetas.

## MVC = Modelo (son las clases, es decir los diagramas UML, "solo las variables declaradas") Vista (Frontend = GUI) Controlador (lógica de negocio "lógica del programa").

Características para los atributos:			+ public		- private (solo puede ser vista por mi clase Perro y por nadie más)				
											#protected (solo ciertas clases)		default (sin simbolo - Es como un private pero no es un private)

- Las asociaciones entre las clases se representan mediante una linea que las une.					Esposo --> Esposa

- Relación involutiva: Clase con 2 referencias a un objeto. 

- Simbolo de rombo significa perte de (suma o agregación). El objeto que se agrega existe independientementa de aquel que lo contiene.				
## Composición (parte de: )					Si destruyes el perro las 4 patas dejan de existir					```Perro(rombo relleno)1----4Patas```

- Superclase (clase con otras clases dentro) Formas --> Círculo , Triangulo , Cuadrado.						````Superclase --> Subclase```
```Class Formas{
	//Tiene algo
}
Class Circulo extends Formas{
	//Tiene otra cosa
}
```

## Abstracción (algo abstracto) Una interfaz es un nivel más de abstracción.				```public interface class Name```			```public abstract class Name```

## Método concreto
```
public abstract class Name{
	public void Saludar(){
	Syso("Hola");
	}
	public abstract void cantar() //Método abstracto (no se declara la lógica)
}
```

// Clase abstracta (lleva la palabra abstract)			//Clase concreta no lleva la palabra abstract.

## En una interfaz todos los métodos deben ser abstractos.													```public interface class Name```
### En la interfaz no se usa extends, se usa implements (implements tiene herencia multiple).				```public class ClaseConcreta implements ClassInterface```

## Encapsulación (solo se puede acceder a los atributos por medio de métodos)
## Polymorfism (Tener multiples formas) (Algo que se puede hacer de diferentes maneras, pero hace lo mismo)

# Data types: Stings, int and floats.

# Conditionals if else, for, while...

# Java data colections reemplazan a los arrays. Crean espacios automáticamente.

# Goals
## Implement error-handling techniques using exception handling. (try, catch)
## GUI with swing or somethig more modern. (no viene en el exámen)
## Implement I/O to read and write from data or text files.
## Create multitheaded programs.
## Create a simple Transmission Control Protocol / Internet Protocol (TCP/IP) client that comunicates through sockets. (no viene en el exámen)

// What is SAP = Its a client of Java (GOOGLE SEARCH)

## Exceptions: En la parte del código.
## Assertions: Prueba de cada módulo / Solo para las pruebas y checar si funciona el módulo.

## Before attending this course you should have completed "Fundamentals of the Java Programming Lnaguage" or have:
	- Created and compiled programs with C or C++

## Courrier is used for the class names.

## Garbage colector = Cuando se dejan de utilizar los objetos se quitan para que no ocupen espacio de memoria.

# Write once, run everywhere.

# Java Technology.
	- Programming language.
	- Development environment.
	- Aplication environment.
	- Development environment.
	- It has a similar syntax to C++.
	- It´s used for developing applets (unsafe) and apps.
	
## Garbage colection Java (es dinámico y depende de los recursos de la máquina)

## Cada implementación de JVM debe poder ejecutar archivos .class (bytecodes)

# javac nombre.java
# java nombre

## Niveles de acceso: +public #protected -private _default (todas la clases de dentro del mismo paquete pueden acceder a esta variable)

## Representaing a package in Java is with the word "Package"

## En UML = Linea punteada (Interfaz), Linea no punteada (Extends), Agregación (modulo innecesario)

## Garbage Collector can vary dramatically across JVM implementations. System.gc (unnecessary) = By default is 512 mb.

- A class can be only public of default

- Características de la POO: Abstracción, polimorfismo, herencia y encapsulamiento.

## Un comentario para la API de Java se hace /** ASI */

## Para representar la abstraccion en Java se usa la palabra reservada abstract
- public abstract class AnimalesCuatroPatas implements Domesticos{
	public class void=MetodoAbstracto(); //Puede llevar o no método abstracto
	@Override
	public void caminar(){
		System.out.println("Camina con 4 patas");
	} //Para una clase abstracta el enfasis es en que hace, no en lo que hace
} //Una clase abstracta no se puede instanciar.

## Una clase concreta es la que no lleva la palabra abstract.

// Todos los métodos de una clase abstracta deben ser implementados en una clase concreta.

## Abstraction =	Functions - Write an algorithm once to be used in many situations.

## Modifier: 4 types of data access

## Hay 2 tipos de variables, las de clase y las de método 

## Que el método devuelva algo = return || Que no devuelva nada = void

- public y DEFAULT son los unicos modificadores de archivo que están a nivel de toda la "Clase a nivel de archivo"
- Todos lo modificadores de acceso son atributos, métodos y constructores. Y ninguno es un bloque de código.

- Para hacer referencia a un objeto se usa un punto. || d.setWeight(42); || d.weight = 42; // Only permissible if weight is public.

## Es mejor que se tenga una alta cohesión (High Cohesion) y más bajo el acoplamiento (Loose Coupling) en la programación orientada a objetos.
	- El acoplamiento debil (Loose Coupling) = Que no dependan tantas cosas unas de otras
		- Si A usa B pero B no usa B entonces están debilmente acopladas.
		- Si tanto A como B se utilizan entre si, entonces están fuertemente acopladas.

## La regla general del encapsulamiento es ocultar los metodos y ponerlos como privete y utilizar solo metodos public, set y get.

## Para un constructor solo se inicializan variables
```	public class Dog{
		private int weight;
		public Dog() { //El nombre del constructor tiene que ser el mismo de la clase.
			weight = 42;
		}
	}```
```	public class EjemploVariables{
		public EjemploVariables (String a){
			System.err.println("Constructor con valor");
		}
		public EjemploVariables (){
		this("Valor1");
			System.err.println("Constructor sin argumentos");
		}
		//public class EjemploVariables{} //Este es el constructor por defecto y solo se genera si no hay constructores dentro de la clase.
		public static void main(String[] args) {
			EjemploVariables Valor1 = new EjemploVariables();
		}
	}```
- Solo hay 2 maneras de llamar a un constructor. Con la palabra super para llamar a una clase superior. Y con la palabra this a un constructor de esta misma clase.

## Compiling Using the -d option = Para cuando tenemos paquetes.
	- cd JavaProyects/Shipping/src (it continues)
	
Terminology recap
- Class
- Object
- Attribute modificador + 
- Method
- Constructor = modificador + nombre de la clase + llava de apertura + llave de cerrado
- Package = import carpeta.carpeta.*;

# Module 3: Identifiers, Keywords and Types.

# Caracteristicas de los constructores
	- Nivel Acceso
	- NO tienen tipo de retorno
	- Mismo nombre de la clase
	- Inicializa variables
	- Se crean de manera automática un contructor por default (lo declares o no) y al momento de crear uno nuevo se elemina el que es por default.

# this = es para distingir las variables locales de las varibales a distancia
```	public class Animal{
	public int edad;
	public Animal (int edad){
	this edad = edad;}}```

# Regla de los identificadores
	- Are names given to a variable, class or method.
	- Can start with a Unicode letter, underscore(_) or dollar sign($)
	- Are case sensitive and have no maxium length
		- Examples: identifier - userName - _sys_var - $change - user_name (preferentemente no con mayusculas por convencion)

# Se puede declararar Public o Private como variables porque JAVA es Case Sensitive las palabras revervadas de JAVA son public y private.

## Estructura de un método: 		public int suma(int A, int B){
									return a+b; }
// Una estructura de un método con un return void.
public void saludo(){
	System.out.println("Hola");
	return;
)

## Integral primates use 3 forms: Decimal, octal and hexadecimal.
	- Octals start with 0: 077 (octal) = 63 (decimal)
	- Hexadecimals start with 0x: 0xBAAC;

## Se puede dar a un dato de tipo char un valor en ASCCI o en //Resumen4OperadoresDecHexOctChar.java	

## Para debuggear es necesario que se establesca un breakpoint en NETBEANS, es decir que se le pique al número de linea a la izquierda.

## Identifiers are simbolic names given to classes, methods and variables.
	- Can contain capitals and small letters, underscore _ and dollar sign $
	- Should not start with a number and should not be a Java restricted word.
	
## Variables locales y a distancia
	- Las variables locales deben ser inicializadas antes de ser utilizadas

## Pregunta de paquetes (8)
	- Only C and D are correct.
## Pregunta de quitar imports.
	- se quitan todos los import (son 4)
## Pregunta 10 (Son correctas a c d e)
## Pregunta 11 solo es correcta la e

[] y ... indican arreglos (aunque no sean el mismo tipo de arreglos pero ambos se pueden usar en el main)
Regla main: En la variable main no importa el orden de los [] o los ...

## El do while se ejecuta por lo menos una vez a diferencia del while.

## Todas las variables a distancia se declaran fuera de un método
	- Inicializacion de las varibales de todos los números es 0 excepto para long que es 0L
	- Las variables locales son todas las que se declaran dentro de los métodos

## Un operador ternario (?) es como si fuera un if pero es solo para hacer una comparación y una asignación a la vez

## Diference between continue and break is that break instantly destroys the cicle and continue move to the next ??????

## FINAL
	- En una clase, ya no habrá herencia en esa clase.
	- En una variable ya no se puede modificar.
	- Para un método para que no pueda ser sobreescrito.

## Polimorfismo es la parte principal de la progamación orientada a objetos de Java.

## Los métodos abstractos se deben implementar aparte siempre que se haga un extends ??

## Una clase abstracta no puede ser instanciada.

## instance of es para validar que un objeto pertenece al tipo dle objeto que queremos validar.

## Para el examen: classCastException es para cuando queremos comparar un objeto con un objeto al que no pertenece.

## Métodos sobrecargados = la lista de argumentos varia.
	- Si no encuentra int ira por long si no irá por double, pero nunca entrará al float ya que habría un error

## El resultado de una suma siempre será un int.
	byte a = 5;
	byte b = 11;
	// byte c = a+b; //Error
	// byte c = (int)a+b; //Así solo se estará casteando (conviertiendo a int el a pero la suma seguirá siendo un int)
	int c = (byte)(a+b);
	int d = a+b; //Esto es correcto
	
## sobrecarga de métodos ocurre solo en la misma clase, no hay herencia.
	public void println(int i);
	public void println(float f);
	public void println(String s);

## El pool de java solo llega haste 128 pero se puede modificar
	
## Siempre comparar cadenas con equals, no con == para no comparar las referencias de memoria, comparar los valores.
	
## Una clase final no se puede heredar
## Un método final no se puede sobreescribir
## Una variable final se convierte en constante

## Enum = Opciones
## Una clase abstract no se puede instanciar generalmente se heredan 
	- Cuando una clase normal hereda de una abstracta hay que implementar todos los métodos
	- Antes una interfaz era 100% abstracta, ahora en la version 8 de Java solamente los métodos son abstractos.
		- Método abstracto solo se declara, Los métodos siempre son publicos
		- Todas las variables son públicas, estaticas y finales (constantes)
		- Un método con implementeción de código se le agrega el modificador de acceso default.
		- En una inferfaz ha herencia multiple

## Inferfaz
	- Iguales extends			clase extends clase			interface extends interface
	- Diferentes implements		clase implements interface

## Todos los métodos abstractos de una interfaz abstracta deben ser implementados. 
	- EXCEPTO SI LA CLASE QUE HACE IMPLEMENTS ES ABSTRACTA (ahí no se deben de implementar a fuerzas los métodos abstractos)

## Caso de herencia e implementacion
	- interfaceA - métodoA(definido)
	- interfaceB extends interfaceA - métodoB(definido)
	- abstract classC implements interfaceB - métodoC(definido) métodoB(definido/implementado) 
			(como es abstracta puede implementar o no los métodos de las interfaces)
	- classD extends classC - Debe implementar métodoA y métodoC ya que el métodoB ya fue implementado

## Las clases internas pueden ser 'static' o no.

## Excepciones
	- Error
	- Verificables: Exception
	- No verificables: Runtime

1- try
2- catch
3- finally

1- throws - Va en la firma del método
2- throw - código





	


