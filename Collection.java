import java.util.ArrayList;
import java.util.Collections;

public class Collection {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();
        l.add(16);
        l.add(0);
        l.add(11);
        l.add(10);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
    }
}
