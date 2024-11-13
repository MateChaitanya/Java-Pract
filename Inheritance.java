/*class parentClass{
    void display(){
        System.out.println("Parent class method");
    }
}

class childClass extends parentClass{
    void show() {
        System.out.println("Child class method");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        childClass child1 = new childClass();
        child1.display();
        System.out.println();
        child1.show();
    }
}*/

class A{
    void methodA(){
        System.out.println("Method of A class");
    }
}
class B extends A{
    void methodB(){
        System.out.println("Method of B class");
    }
}
class C extends B{
    void methodC(){
        System.out.println("Method of C class");
    }
}
public class Inheritance{
     public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        System.out.println();
        obj.methodB();
        obj.methodC();

     }
}