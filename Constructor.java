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
