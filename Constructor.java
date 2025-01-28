/*class Student{
    int id ;
     int age;
     Student(){
        this.id=id;
        this.age = age;
        System.out.println("HEllo World");
     }
}


public class Constructor {
    

   public static void main(String[] args) {
    Student obj = new Student();
   } 
} 
*/

//this Keyword
/* 
class ABC {
   int num;

   ABC(int num) {
       this.num = num; // Refers to the instance variable
   }

   void display() {
       System.out.println("Number: " + num);
   }
}

public class Constructor {
   public static void main(String[] args) {
       ABC obj = new ABC(25);
       obj.display();
   }
}
*/

/* 
//This() function
class XYZ {
   int num;
   String name;

   XYZ() {
       this(100, "Default"); // Calls the parameterized constructor
   }

   XYZ(int n, String nm) {
       num = n;
       name = nm;
   }

   void display() {
       System.out.println("Number: " + num + ", Name: " + name);
   }
}

public class Constructor {
   public static void main(String[] args) {
       XYZ obj = new XYZ(); // Default constructor calls parameterized constructor
       obj.display();
   }
}
*/


/* 
//Super Keyword
//The super keyword refers to the parent class. It is used to:

//Call parent class variables or methods.
//Call the parent class constructor.
//Example: Accessing Parent Class Variables

class Parent {
   int num = 50;
}

class Child extends Parent {
   int num = 100;

   void display() {
       System.out.println("Child num: " + num);
       System.out.println("Parent num: " + super.num); // Refers to parent class variable
   }
}

public class Constructor {
   public static void main(String[] args) {
       Child obj = new Child();
       obj.display();
   }
}

*/


/* 
//super()
//The super() keyword is used to call the parent class constructor. It must be the first statement in the child class constructor.

class Parent {
   Parent() {
       System.out.println("Parent Constructor");
   }
}

class Child extends Parent {
   Child() {
       super(); // Calls the parent class constructor
       System.out.println("Child Constructor");
   }
}

public class Constructor {
   public static void main(String[] args) {
       Child obj = new Child();
   }
}

*/
/* 
class ABC{
   ABC(){                         // 0 arg Cons
      this(10);                  // calls the another cons in same class ABC(Int i)
      System.out.println("A");
   }

   ABC(int i){                  // one arg Cons
      this(10,20);           // Calls the another con ABC(Int j , Int k)
      System.out.println("B");
   }

   ABC(int j , int k){
      System.out.println("C");
   }
}
   public class Constructor{
      public static void main(String[] args) {
         ABC aa = new ABC();
         //ABC ab = new ABC(10);
         //ABC ac = new ABC(10,20);
      }
   }

   */

/*class LMN{
   LMN(int i){
      System.out.println("Super Parent");
   }
}
class XYZ extends LMN{
   XYZ(int i , int j){
      super(i);
      System.out.println("2 Args Con");
   }
   XYZ(int i){
      super(i);
     System.out.println("Parent class Cons");
   }
}
class ABC extends XYZ{

   ABC(){                        
      super(10);                   // Call parent class const -> 1 arg con
      System.out.println("A");
   }
    
   ABC( int i){
      super(i,33);                 // call parent class Cons -> 2 arg con
      System.out.println("B");
   }
}
   public class Constructor{
      public static void main(String[] args) {
         ABC aa = new ABC();
         ABC ab = new ABC(10);
      }
   }
      */

/* 
class ABC{
   int num ;
   String name;,

    ABC(){
      this(0,"Default");
      System.out.println("Default Constructor Called");
    }

    ABC(int num , String name){
      this.num = num;
      this.name = name;
      System.out.println("Parametrized Cons Called ");
    }
    void display(){
      System.out.println("Number:" + num + ", Name:"+name);
    }

}

public class Constructor{
   public static void main(String[] args) {
      ABC a = new ABC();
      a.display();
      ABC b = new ABC(42,"Java");
      b.display();
   }
}
   */


class Parent{
   int num = 50;
   Parent(){
      System.out.println("Parent class con called");
   }

   void display(){
      System.out.println("Parent class Method called");
   }
}
class Child extends Parent{
   int num = 100;
   Child(){
      super();
      System.out.println("Child Class Con Called");
      System.out.println("Parent Class Con Called");
   }
   void show(){
      super.display();
      System.out.println("Child Class var :" + num);

   }
}
public class Constructor{
   public static void main(String[] args) {
      Child A = new Child();
      A.show();
   }
}