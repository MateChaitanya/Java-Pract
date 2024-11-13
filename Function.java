import java.util.Scanner;

/*public class Function {
    public static void printMyName (String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name =sc.next();

        printMyName(name);
    }
}*/


public class Function{
    //A METHOD to calculate sum of 2 numbers - a & b
    public static void sum ( int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int a=20;
        int b=20;
        sum(a,b);// call the function 
    }
}
