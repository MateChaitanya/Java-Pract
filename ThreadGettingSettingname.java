public class ThreadGettingSettingname {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Chaitanya");
        System.out.println(Thread.currentThread().getName());
    }
}
