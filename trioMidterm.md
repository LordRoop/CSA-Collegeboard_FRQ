## Roop and Jacqueline
#### List of tech terms required to show FRQ year-to-date competency
#### Casting, specifically for Division
- Gives us the ability to divide two numbers without needing to round them first
```java
10/3; //returns 3 as remainder is not displayed, and the value cannot return as a double as both 10 and 3 are ints
10/(double) 3; // Becomes 3.333... because 3 is temporarily cast as the double 3.0 to perform the division and return a double value
```
#### Casting, specifically for Truncating or Rounding
- Gives us the ability to *downcast* (truncate decimal values by turning a double into an int)
```java
double Doublevalue = 1.9;
int IntValue = (int) DoubleValue; // IntValue is now 1 after truncating the double 1.9 and cutting out values after the decimal
```
#### Wrapper Classes, why wrap int, double
- Allows using primitive data as objects (hence why it's called wrapper, because the class "wraps" the data)
- Particularly useful when using ArrayList because it can only store objects
```java
import java.util.ArrayList;
public class WrapperExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Michael");
        names.add("Bill");
    }
}
```
#### Concatenation, rules on mixed type Concatenation
- Attaching two strings (or other equivalent data types) together through an additive symbol
```java
System.out.println("Con" + "cat"); // returns "concat" (be careful of spacing)
System.out.println("My favorite number is " + 4); // Would return error as string data type cannot be added to integer
System.out.println("My favorite number is " + Integer.toString(4)); // Fixed version of previous line
```
#### Math class, specifically Random usage
- Class simplifies mathematical operations such as exponents, absolute values, and randomization
- Can also be used for constants such as e and pi
- Math.random gives random float from 0 to 1, but can be used with multiplication to get whole numbers
```java
int length = 5;
double squareArea = Math.pow(length, 2); // area of a square = l * l or l^2
int randomNumber = (int)(Math.random() * 10) + 1; // randomly generates number form 1-10, 0 is avoided
```
#### Compound Boolean Expression
- Using && joins 2 boolean expressions, checking if both are true
```java
public class TestNum
{
   public static void main(String[] args)
   {
     int score = 10; // Try -10 and 110
     if (score < 0 || score > 100)
     {
         System.out.println("Score has an illegal value.");
     }
     if (score >= 0 && score <= 100)
     {
         System.out.println("Score is in the range 0-100");
     }

   }
```
#### Truth Tables
- Defines boolean functions for each possible value
- Each column is for a variable, and each row represents each possible combination of the variable values, and the column specifies the value of the function
#### De Morgan's Law
- Method of handling complex conditionals
- Depending on the 2 booleans, (oversixfoot and looks fit) an output is produced
```java
public class DeMorgans {
        public static void main(String[] args) {
            boolean oversixfoot = false;
            boolean looksfit = true;

            if (oversixfoot && looksfit){
                System.out.println("You are like Allen");
            }
            else if (!(oversixfoot || !looksfit)){
                System.out.println("You are Charlie");
            }
            else if (oversixfoot || looksfit){
                System.out.println("You are normal");
            }
        }

    }
```
#### Comparing Numbers
- '==' compares equality of numbers
- '!=' is non-equality
- '>' greater than (opposite for less than)
- '>=' greater than equal to (opposite for less than or equal to)
```java
while (i != 5){
    System.out.println("I am still counting");
    i++
}
System.out.println("I am done counting");
```
#### Comparing Strings
- '==' does not work
- Built in string op 'String.equals' can be used to compare strings
```java
if("test".equals("notTest")){
 System.out.println("strings are the same");
} else {
 System.out.println("strings are not the same");
}
```
#### Comparing Numbers
- Compare numbers using `==` (equals) and `!=` (not equals)
- `>` for greater than, `>=` for greater or equal to. Vice versa
```java
if(3 > 4) {
 System.out.println("3 is greater than 4");
} else {
 System.out.println("3 is not greater than 4");
}
```
#### for loop, enhanced for loop
- For loops continue to run while a set of 3 parameters are in play
- Parameter 1 executes at the start (usually the iteration variable 'i')
- Parameter 2 defines the condition to execute
- Parameter 3 is executed after each iteration of the code block
- For loops can be enhanced using array iteration and string manipulation (known as for each)
```java
for(int i=0; i < 5; i++){
    System.out.println(i); // prints each i value, or each iteration of the code
//output will be 0, 1, 2, 3, 4, 5 then exit
}

String[] students = {"Bobby", "Robby", "Lobby", "Tobby"};
for(String i : students){
    System.out.println(i + " you got an F"); // like the name, the *for* loop will print the line for *EACH* student in the array
}
```
#### while loop versus do while loop
- While loops check the condition first before running internals
- Do while executes once and then checks the condition
```java
int x = 5;

while(x < 4){
    System.out.println("This is a while loop"); // will not print, since x is already greater than 4
}

do{
    System.out.println("This is a do while loop"); // will print once, then exit as condition is N/A
}while(x < 4);
```
#### nested loops
- Loops can be placed inside each other for more complex functions and applications
```java
for(int i=0; i < 3; i++){ //re-runs the inner loop
        for(int j=0; i < 5; j++){
            System.out.println(j); //prints inner loop iteration
        }
        }
//output would be 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5
```
#### Big O notation (Hash map, Binary Search, Single loop, Nested Loop)
- Describes how efficient an algorithm is (*O* for upper bound, *Ω* for lower bound)
- *O* quantifies the time taken to complete an algorithm given *n* amount of data input
- *O*(1)/constant is the simplest, then *O*(log *n*)/logarithmic, *O*(*n*)/linear, *O*(*n*^2)/quadratic, *O*(2^*n*)/exponential, so on...
- Binary search algorithm is *O*(log *n*), but data must be sorted to use binary search
```java
public class CalculateTime {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        if (2 + 2 == 4) {
            System.out.println("2 plus 2 is 4");
        }
        long timeElapsed = System.nanoTime() - startTime;
        System.out.println("This program took " + (double) timeElapsed / 1000000000 + " seconds to run.");
    }
}
```
#### Creating a Class, describe Naming Conventions
- "class" keyword is the class declaration statement
- Naming convention for class identifier is CamelCase
#### Constructor, describe why there is no return
- Special method that initializes object attributes and is called when the object is created.
#### Accessor methods, relationship to getter
- Used to return private variables
#### Mutator methods, relationship to setter, describe void return type
- Used to edit private variables. Void literally means void (ignore) the type, used for no returns.
#### Static variables, Class variables
- Variables that are owned by the class and don't change
#### Static methods, Class methods
- Static method can be called without creating an object (ex. public static void main)
#### this Keyword
- Simplifies naming as you can specifically reference variables from the current method
- Variables can have the same name and be modified/referenced separately
```java
public class Coordinates {
  public int x = 0;
  public int y = 0;
  
  //constructor
  public PointForm(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
```
#### main method, tester methods
- Allows you to run the code within the class (makes the java file executable)
- Follows this format:
```java
public static void main(String[] args) {
    className objectName = new className();
    objectName.methodName();
}
```
#### Inheritance, extends
- Creates a subclass of the original parent class
```javs
class Camaro extends Car {

    private String year;

    public Camaro() {
        super.model = "Camaro";
    }

    public Camaro(String year) {
        super.model = "Camaro";
        this.year = year;
    }
```
#### Subclass constructor, super Keyword
#### Overloading a method, same name different parameters
#### Overriding a method, same signature of a method
-  Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
```java
// Base Class
class Parent {
    void show()
    {
        System.out.println("Parent's show()");
    }
}
class Main {
    public static void main(String[] args)
    {
        // If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called
        Parent obj1 = new Parent();
        obj1.show();
  
        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
        Parent obj2 = new Child();
        obj2.show();
    }
}
```
#### Abstract Class, Abstract Method
- An abstract class is a class that is declared abstract, because it may or may not include abstract methods.
```java
abstract class Car {

    String model;

    public void honk() { System.out.println(model + " Honked"); }
    public void crash() { System.out.println(model + " crashed"); }
    public void stop() { System.out.println(model + " stopped"); }

}
```
#### Object superclass methods: toString(), compare(), clone()
- A toString() eturns any value given to it in string format.
```java
   public int getViewCount( ) {
        System.out.println("This video has " + Integer.toString(viewCount));
        return viewCount;
        }
```
- The compare() method in Java compares two class specific objects (x, y) given as parameters.
```java
public int compare(x,y);
```
- The clone() method clones things. It creates a new instance of the class of the current object and initializes all its fields with the fields of the corresponding object.
```java
class Test2 implements Cloneable {
    int a;
    int b;
    Test c = new Test();
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
```
#### Late binding of object, referencing superclass object, ie Animal a = new Chicken(); Animal b = new Goat();
#### Polymorphism + Inheritence
- Polymorphism lets you perform methods inherited from different classes
- Allows for reusability of code
``` java
class CSA {
  public void codeSound() {
    System.out.println("The animal makes a sound");
  }
}

class Mort extends CSA { // extends lets us inherit from the CSA class
  public void codeSound() {
    System.out.println("Mort goes: Code Code Code!");
  }
}

class TPT extends CSA { // extends lets us inherit from the CSA class
  public void codeSound() {
    System.out.println("TPT goes: Learn Learn Learn!");
  }
}
class Main {
  public static void main(String[] args) {
    CSA myCSA = new CSA();  // Create a CSA object
    CSA myMort = new Mort();  // Create a Mort object
    CSA myTPT = new TPT();  // Create a TPT object
    myCSA.codeSound();
    myMort.codeSound();
    myTPT.codeSound();
  }
}
``` 
