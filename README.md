## Java 8

Environment variables

* PATH = `D:\DesktopApps\jdk8\bin`
* JAVA_HOME = `D:\DesktopApps\jdk8`

| Sign | Reserved word | Description |
|:-:|:--|:--|
| + | Public | No security |
| - | Private | Class security |
| # | Protected | Inheritance security |
| ~ | Default | Package security |

Access control: **Access Modifiers**

| Modifiers | Same Class | Same Package | Subclass | Universe |
|:---------:|:---:|:---:|:---:|:---:|
| private   | yes |     |     |     |
| default   | yes | yes |     |     |
| protected | yes | yes | yes |     |
| public    | yes | yes | yes | yes |

### Private

The private modifier in Java is the most restrictive of all, basically any element of a class that is private
it can be accessed only by the same class and nothing else. That is, if, for example, an attribute is private, it can only
be accessed by methods or constructors of the same class. No other class regardless of the relationship they have can
have access to them.

### Default

Java gives us the option of not using an access modifier and when not, the element will have an access known as default
o Default access that allows both the class itself and the classes in the same package to access said components (from
here the importance of always declaring a package to our classes).

### Protected

The protected access modifier allows us to access the components with this modifier from the same class, classes
from the same package and classes that inherit from it (even in different packages).

### Public

The access modifier public is the most permissive of all, basically public is the opposite of private in all respects
(logically), this means that if a component of a class is public, we will have access to it from any class or
instance regardless of the package or its origin.

Order: **Public** => **Protected** => **Default** => **Private**

## Oracle Certified Associate Java SE 8 Programmer

Exam 150 minutes, is needed grade 65% about 45 correct answers, total questions 70, ~200 USD

## UML (Unified Modeling Language)

It is a graphic language for the modeling and development of software systems

```md
+ Dog **object name**
  + name **attributes**
  + breed
    + run() **methods**
    + bark()
```

```java
public abstract class Name {
  public void SayHi(){
    System.out.println("Hola");
  }
  public abstract void Sing() // Abstract method (no logic is declared)
}
```

## Interface

In an interface all methods must be abstract

```java
public interface class Name
```

The interface does not use extends, implements are used (implements have multiple inheritance)

```java
public class ConcreteClass implements ClassInterface
```

Syntax for an inheritance

```java
modifier class myClassName extends something {}
```

For an overrride the access modifier must be the same or less restrictive than the original

## Definitions

* Encapsulation: attributes can only be accessed through methods
* Polymorphism: Something that can be done in different ways, but does the same thing
* Java data collections replace arrays, they automatically create spaces
* Garbage collector: When objects are no longer used they are removed so they don't take up memory space
* The garbage colector is dynamic and depends on the resources of the machine
* Bytecodes are inside `*.class` files
* Represent a package in Java with the word `Package`
* Garbage Collector can vary dramatically across JVM implementations, `System.gc` (unnecessary) by default is 512 mb
* A class can be only public of default
* Characteristics OOP: Abstraction, polymorphism, inheritance and encapsulation
* A comment for the Java API is with: `/** This way */`
* A specific class is one that does not carry the word abstract
* All the methods of an abstract class must be implemented in a concrete class
* Write an algorithm once to be used in many situations: `Abstraction = Functions`
* `public` and `default` are the only file modifiers that are at level of the entire `Class at file level`
* All access modifiers are attributes, methods, and constructors. And neither is a block of code
* The general rule of encapsulation is to hide the methods and set them as private and use only public `set` and `get` methods
* Compiling using the `-d` option when we have packages
* Keyword `this` is used to distinguish local variables from remote variables
* You can declare `Public` or `Private` as variables because Java is Case Sensitive. Reserved words are `public` and `private`
* Both `[]` and `...` indicate arrays (although they are not the same type of array both can be used in the main method)
* In the main method, the order of the `[]` or `...` doesn't matter
* The `do-while` is executed at least once unlike `while`
* Local variables are all those declared within methods
* Initialization of the variables of all numbers is `0` except for long which is `0L`
* A ternary operator `?` Is like an if but it's used for comparison and assignment at the same time
* The diference between continue and break is that break instantly destroys the cicle and continue moves to the next
* Polymorphism is the main part of Java object-oriented programming
* Abstract methods must be implemented separately whenever an extends is done
* An abstract class cannot be instantiated
* `Instance of` is to validate that an object belongs to the type of object that we want to validate
* classCastException: it is for when we want to compare an object with an object to which it does not belong
* If doesn't find `int` will go for `long` then `double`, but will never go for `float` and would be an error
* The java pool only reaches up to 128 but it can be modified
* Always compare strings with equals, not with == so as not to compare memory references, compare values
* Inner classes can be `static` or not
* Polymorphism: Method overload, a declared method with a different list of methods
* jOptionPane is a static method, which means that the calse name must be used in front of the method
* A constructor is a special method that has the same class name

## Java Technology

* Programming language
* Development environment
* Aplication environment
* Development environment
* It has a similar syntax to C++
* It´s used for developing applets (unsafe) and apps
* Enum means options

## Abstract

* An abstract class cannot be instantiated they are generally inherited
* When a normal class inherits from an abstract, all methods must be implemented
* Before an interface was 100% abstract, now in Java version 8 only the methods are abstract.
* Abstract method only declared, Methods are always public
* All variables are public, static and final (constant)
* A method with code implementation is added the default access modifier.
* In one interface has multiple inheritance
* All abstract methods of an abstract interface must be implemented
* Except if the class that does implements is abstract
* Abstract methods should not be obligatory implemented there

```java
public abstract class AnimalsWithFourLegs implements Domestics {
  public class void=AbstractMethod(); // It may or may not have an abstract method
  public void walk(){
    System.out.println("Walks with 4 legs");
  }
}
```

## Kind of variables

1. `class` variables
2. `method` variables

## Return statement

* If a method returns something: `return`
* If it doesn't return anything: `void`

## OOP

It is better to have high cohesion and lower coupling in object-oriented programming

* Lower Coupling: That so many things do not depend on each other
  * If A uses B but B does not use B then they are loosely coupled
  * If both A and B are used together, then they are tightly coupled

## Constructor

* For a constructor only variables are initialized
* The constructor name must be the same as the class
* The constructor is only for initializing variables and has the same class name

```java
public class Dog {
  private int weight;
  public Dog() {
    weight = 42;
  }
}
```

### Multiple constructors

The constructor with no arguments is default and is generated if there are no constructors within the class

```java
public class ExampleVariables {
  public ExampleVariables (String a) {
    System.err.println("Constructor with arguments");
  }
  public ExampleVariables (){
  this("Val1");
    System.err.println("Constructor without arguments");
  }
  public static void main(String[] args) {
    ExampleVariables Val1 = new ExampleVariables();
  }
}
```

* There are only 2 ways to call a constructor
  * With the word `super` to call a superior class
  * With the word `this` to a constructor of this same class

### Characteristics

* They have an access level
* They have no return type
* Same class name
* Initialize variables
* A default constructor is created automatically (whatever you declare it or not)
* When creating a new one the one that is by default is deleted

## Identifiers

* Are names given to a variable, class or method
* Can start with a Unicode character, underscore(_) or dollar sign($)
* Are case sensitive and have no maxium length
* Preferably not capitalized by convention

## Structure of a method

```java
public int suma(int A, int B) { // return int
  return a + b;
}
public void saludo() { // return void
  System.out.println("Hola");
  return;
)
```

* Identifiers are simbolic names given to classes, methods and variables
  * Can contain capitals and small letters, `_` and `$`
  * Should not start with a number and should not be a Java restricted word

## Final

* In a class, there will no longer be inheritance in that class
* In a variable it can no longer be modified
* For a method so that it cannot be overwritten
* A final class cannot be inherited
* A final method cannot be overwritten
* A final variable becomes a constant

## Sum

```java
byte a = 5;
byte b = 11;
// byte c = a + b; // Error
// byte c = (int)a+b; // Casting
int c = (byte)(a + b);
int d = a + b; // This is fine
```

## Method overload

* For overloaded methods the argument list varies
* Occurs only in the same class, there is no inheritance

```java
public void println(int i);
public void println(float f);
public void println(String s);
```

## Inferface

| Type | Word | Example |
|:-:|:-:|:-:|
| Same | extends | clase extends clase - interface extends interface |
| Different | implements | clase implements interface |

## Inheritance and implementation case

* `interfaceA` - `methodA` (defined)
* `interfaceB` extends `interfaceA` - `methodB` (defined)
* abstract `classC` implements `interfaceB` - `methodC` (defined) `methodB` (defined / implemented)
* Since it is abstract it can implement or not the interface methods
* `classD` extends `classC` - Should implement `methodA` and `methodC` because `methodB` was already implemented

## Exceptions

* Error
* Verifiable: **Exception**
* No verifiable: **Runtime error**

### Handle exceptions

1. try
2. catch
3. finally

## Arrays

* Arrays are a data set of the same type
* They were invented so that you didn't have to be declaring so many variables and just declaring an array.
* An array is an ubject that is created with the word new.
* When you want to access a position that does not exist in an array will throw this error: `java.lang.ArrayIndexOutOfBoundsException`
* The `[]` will indicate that it is an array.
* All Java classes inherit from another, by default they all inherit from `Object = extends Object`

Declaration of a two-dimensional array

```java
int [][] twoDim = new int [][4]; // Illegal: The first array must have a value, the second is optional
int [][] twoDim = new int [4][4]; // Correct
for (int element : list) {
  System.out.println(element);
}
p = 2_333_456 = 2333456 // Those underscores are to make the number more readable for the programmer
```

## String

* String is not a primitive type
* Every time String is used there is no reference to a primitive type, a class is referenced
* Intanciate means to use a class
* Writting `String myname = "Luis"` says that `myname` is an object

# React

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

[![Standard](https://img.shields.io/badge/code_style-standard-brightgreen.svg)](https://standardjs.com)
[![GitLab](https://gitlab.com/LuisEnMarroquin/react/badges/master/pipeline.svg)](https://gitlab.com/LuisEnMarroquin/react/pipelines)
[![GitHub](https://github.com/LuisEnMarroquin/react-github-gitlab-pages/workflows/Pages/badge.svg)](https://github.com/LuisEnMarroquin/react-github-gitlab-pages/actions)

## Available Scripts

In the project directory, you can run:

### `yarn start`

Runs the app in the development mode.<br>
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.

The page will reload if you make edits.<br>
You will also see any lint errors in the console.

### `yarn test`

Launches the test runner in the interactive watch mode.<br>
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `yarn build`

Builds the app for production to the `build` folder.<br>
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.<br>
Your app is ready to be deployed!

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### `yarn eject`

**Note: this is a one-way operation. Once you `eject`, you can’t go back!**

If you aren’t satisfied with the build tool and configuration choices, you can `eject` at any time. This command will remove the single build dependency from your project.

Instead, it will copy all the configuration files and the transitive dependencies (Webpack, Babel, ESLint, etc) right into your project so you have full control over them. All of the commands except `eject` will still work, but they will point to the copied scripts so you can tweak them. At this point you’re on your own.

You don’t have to ever use `eject`. The curated feature set is suitable for small and middle deployments, and you shouldn’t feel obligated to use this feature. However we understand that this tool wouldn’t be useful if you couldn’t customize it when you are ready for it.

## Learn More

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).

### Code Splitting

This section has moved here: https://facebook.github.io/create-react-app/docs/code-splitting

### Analyzing the Bundle Size

This section has moved here: https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size

### Making a Progressive Web App

This section has moved here: https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app

### Advanced Configuration

This section has moved here: https://facebook.github.io/create-react-app/docs/advanced-configuration

### Deployment

This section has moved here: https://facebook.github.io/create-react-app/docs/deployment

### `yarn build` fails to minify

This section has moved here: https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify
