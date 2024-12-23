public class ABC {
    int i = 10; // Instance variable
    static int j = 20; // Static variable

    void m() { // Instance method
        ++i; // Increment the instance variable
        System.out.println(i); // Print the updated value of 'i'
    }

    static void m1() { // Static method
        ++j; // Increment the static variable
        System.out.println(j); // Print the updated value of 'j'
    }

    public static void main(String[] args) {
        ABC a = new ABC(); // First object of ABC
        ABC b = new ABC(); // Second object of ABC

        a.m(); // Call m() on object 'a'. Increment 'i' of 'a' and print it.
        b.m(); // Call m() on object 'b'. Increment 'i' of 'b' and print it.

        ABC.m1(); // Call m1() on the class. Increment 'j' and print it.
        ABC.m1(); // Call m1() on the class. Increment 'j' again and print it.
    }
}
