//Getting and setting the name 
/* 
public class ThreadGettingSettingname {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Chaitanya");
        System.out.println(Thread.currentThread().getName());
    }
}
*/


// Getting and setting thread priority
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

class ThreadGettingSettingname {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setPriority(10); // Setting high priority for child thread
        t.start();

        for (int i = 0; i <10; i++) { // Changed from <= 10 to < 10 to match child thread
            System.out.println("Main Method");
        }
    }
}
