import java.util.*;
public class traversal_using_iterator {
    public static void main(String[]args){
        List<String> al = new ArrayList<String>();
        al.add("gfg");
        al.add("ide");
        al.add("courses");
        Iterator it=al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
