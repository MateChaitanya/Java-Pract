/* 
//Method Overriding
class ABC {
    int i = 10;

    void m() { // Method 1
        System.out.println("A");
    }

    void m1() { // Method 2
        System.out.println("B");
    }
}

class XYZ extends ABC {
    @Override
    void m() {
        System.out.println("C");
    }

    void m2() {
        System.out.println("D");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        ABC a = new ABC();
        XYZ x = new XYZ();
        ABC ax = new XYZ();

        a.m();      // Output: A
        a.m1();     // Output: B
        // a.m2();  // CE: Method m2() is not defined in class ABC

        x.m();      // Output: C
        x.m1();     // Output: B
        x.m2();     // Output: D

        ax.m();     // Output: C (Dynamic method dispatch: XYZ's m() is called)
        ax.m1();    // Output: B
        // ax.m2(); // CE: Method m2() is not defined in class ABC
    }
}
 */


//Method overloading

class ABC {} // Parent class
class XYZ extends ABC {} // Child class

class LMN  // Class containing overloaded methods
{ 
    void M(ABC aa) { // Method with ABC as parameter
        System.out.println("A");
    }

    void M(XYZ xx) { // Method with XYZ as parameter
        System.out.println("B");
    }
}

public class Polymorphism { // Main class
    public static void main(String[] args) {
        ABC a = new ABC();   // Parent reference to Parent object
        XYZ x = new XYZ();   // Child reference to Child object
        ABC ax = new XYZ();  // Parent reference to Child object (polymorphic reference)

        LMN l = new LMN();   // Instance of LMN class

        l.M(a);  // Calls M(ABC) -> Output: A (Exact match for ABC parameter)
        l.M(x);  // Calls M(XYZ) -> Output: B (Exact match for XYZ parameter)
        l.M(ax); // Calls M(ABC) -> Output: A (ax is of type ABC, so ABC version is called)
    }
}

