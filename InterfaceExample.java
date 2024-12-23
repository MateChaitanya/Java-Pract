// Interface declaration
interface Animal {
    void eat();  // Abstract method
    void sleep(); // Abstract method
}

// Class implementing the interface
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps in a kennel.");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog myDog = new Dog();
        myDog.eat();
        myDog.sleep();
    }
}
