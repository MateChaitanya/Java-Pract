

//Yeild() Method
class MyThread extends Thread{
    public void run(){
        for(int i = 0; i < 10 ; i++){
            Thread.yield();
            System.out.println("Child Thread");
        }
    }
}

public class Threadmethods {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for(int i = 0 ; i < 10; i++){
            System.out.println("Main Thread");
        }
    }
}



//Sleep()
/* 
class Threadmethods{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Chaitu");
        Thread.sleep(5000);
        System.out.println("Software");
        Thread.sleep(5000);
        System.out.println("Solution");
    }
}
*/