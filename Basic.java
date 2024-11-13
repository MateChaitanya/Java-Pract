/*public class Basic {
    public static void main(String[] args) {
        int num = 7;
        int factorial = 1;
        for(int i = 1; i <= num ;i++){
            factorial *= i;

        }
        System.out.println(" Factorial of num " + num + " is "+ factorial);
    }
}*/

/*public class Basic{
    public static void main(String[] args) {
        int num = 121;
         int original = num;
         int reversed = 0;


         while (num !=0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num/10;

         }

         if(original == reversed){
            System.out.println(original+" is palindrome");
         }else{
            System.out.println(original+" is not palindrome");
         }
    }
}*/

/*public class Basic{
    public static void main(String[] args) {
        int num =10;
        int a = 0;
        int b = 1;

        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");
            int next = a+b;
            a=b;
            b=next;
        }
    }
}*/

/*public class Basic{
    public static void main(String[] args) {
        
        String Original= " Chaitanya";
        String reversed = " ";
        for (int i = Original.length()-1; i>= 0; i--) {
            reversed += Original.charAt(i);
        }
              System.out.println("Reversed string :" + reversed);

    }
}*/

/*
public class Basic{
    public static void main(String[] args) {
        int n = 10;
        int sum = n*(n+1)/2;
        System.out.println("SUm of first natural number is : " + sum);
    }
}
*/

/*public class Basic{
    public static void main(String[] args) {
        int a =10;
        int b = 20;

        System.out.println("Before Swaping values are "+ a + "," + b );
        int t = a;
        a=b;
        b=t;
        System.out.println("After Swaping values are "+a+","+b);
    }
}*/

/* public class Basic{
    public static void main(String[] args) {
        String original = "Chaitanya";
        String reversed = " ";
        for (int i = original.length()-1; i >=0; i--) {
            reversed += original.charAt(i);

        }
        System.out.println("Reversed string :" + reversed);
    }
}*/

/*public class Basic{
    public static void main(String[] args) {
        int n = 10;
        long factorial =1;
        for(int i = 1; i <= n ; i++){
        factorial *= i;
        }
        System.out.println("Factorial of "+n+" is :"+factorial);
    }
}*/

/*public class Basic{
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};
        if(issorted(arr)){
            System.out.println("The array is Sorted");
        }else{
            System.out.println(" The array is not sorted");
        }
    }
        public static boolean issorted(int []arr){

            for (int i = 0; i < arr.length; i++) {
                if(arr[i]> arr[i+1]){
                    return false;
                }
            }
            return true;

        }
    }
    */

/*import java.util.Arrays;

public class Basic{
        public static void main(String[] args) {
            int arr[] = { 2,3,6,9,10,5};
            if(arr.length < 3){
                System.out.println("The length of array must have three char");
            }else{
                Arrays.sort(arr);
                int thirdLargest = arr[arr.length-3];
                System.out.println("Third largest no is : " + thirdLargest);


            }
        }
    }*/


    /*public class Basic {
        public static void main(String[] args) {
            String original = "ABBA";
            if (isPalindrome(original)) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
        }
    
        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;
    
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;  // Return false if characters don't match
                }
                left++;  // Move the left pointer to the right
                right--; // Move the right pointer to the left
            }
            return true; // Return true if the string is a palindrome
        }
    }*/

    public class Basic{
        public static void main(String[] args) {
            String original = "ABc";
            String reversed = " ";

            for (int i = original.length()-1; i >= 0; i--) {
                reversed += original.charAt(i);
            }
            System.out.println(" Reversed String is "+reversed);
        }
    }
    