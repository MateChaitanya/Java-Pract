//Reversed the String
/* 
public class Practice {
    public static void main(String[] args) {
        String Original = "Chaitanya";
        String reversed = " ";
        for (int i = Original.length()-1; i >= 0; i--) {
            reversed += Original.charAt(i);
        }
            System.out.println("Reversed String : " + reversed);
        }
    }
*/

/* 
public class Practice{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swaping: a="+ a + ", b=" +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swaping: a="+a+", b="+b);
    }
}
    */
/* 
    public class Practice{
        public static void main(String[] args) {
            int num =5;
            int a = 0, b=1;
            for(int i =0; i< num ; i++){
                System.out.println(a + " ");
                int next = a+b;
                a = b;
                b = next;
            }
        }
    }
*/
/* 
public class Practice{
    public static void main(String[] args) {
        int num = 10;
        if(num % 2 == 0){
            System.out.println("Is even no");
        }else{
            System.out.println("IS odd no");
        }
    }
}*/

class Practice{
    public static void main(String[] args) {
        int number = 123456;
        int reverse = 0;

        while(number!=0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number/10;

        }
        System.out.println(reverse);
    }
}