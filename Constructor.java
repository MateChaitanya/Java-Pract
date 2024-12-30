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


