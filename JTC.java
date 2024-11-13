/*public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "RaaR";
        System.out.println(isPalindrome(str));
    }
}*/

/* 

public class JTC {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setSid(101);
        s1.setSname("Vivek");
        s1.setSemail("vivek@jtcindia.org");

        Student s2 = new Student();
        s2.setSid(102);
        s2.setSname("Rahul");
        s2.setSemail("rahul@jtcindia.org");

        System.out.println("----Student Details----");
        System.out.println("s1.sid :- " + s1.getSid());
        System.out.println("s1.sname :- " + s1.getSname());
        System.out.println("s1.semail :- " + s1.getSemail());
        System.out.println("----Student Details----");
        System.out.println("s2.sid :- " + s2.getSid());
        System.out.println("s2.sname :- " + s2.getSname());
        System.out.println("s2.semail :- " + s2.getSemail());
    }
}

class Student {
    private int sid;
    private java.lang.String sname;
    private java.lang.String semail;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public java.lang.String getSname() {
        return sname;
    }

    public void setSname(java.lang.String sname) {
        this.sname = sname;
    }

    public java.lang.String getSemail() {
        return semail;
    }

    public void setSemail(java.lang.String semail) {
        this.semail = semail;
    }
}

*/


/* 
public class JTC {

    // Declared Instance Variables
    public java.lang.String geek; // Use fully qualified name to avoid conflicts
    public int i;
    public Integer I;

    // Default Constructor
    public JTC() {
        // Initializing Instance Variables
        this.geek = "Shubham Jain";
        this.i = 0; // Explicit initialization for int
    }

    // Main Method
    public static void main(String[] args) {
        // Object Creation
        JTC name = new JTC();

        // Displaying Output
        System.out.println("Geek name is: " + name.geek);
        System.out.println("Default value for int is " + name.i);

        // toString() called internally
        System.out.println("Default value for Integer is " + name.I);
    }
}
*/


public class JTC {
    public static void main(String[] args)
    {
        // x is a local variable
        int x = 10;
 
        // message is also a local
        // variable
        String message = "Hello, world!";
 
        System.out.println("x = " + x);
        System.out.println("message = " + message);
 
        if (x > 5) {
            // result is a
            // local variable
            String result = "x is greater than 5";
            System.out.println(result);
        }
        for (int i = 0; i < 3; i++) {
            String loopMessage
                = "Iteration "
                  + i; // loopMessage is a local variable
            System.out.println(loopMessage);
        }
 
        
    }
}
