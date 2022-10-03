import java.util.ArrayList;
import java.util.List;

public class traversal_using_each_method {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(5);
        al.forEach(x-> System.out.println(x));


    }
}
