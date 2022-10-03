import java.sql.SQLOutput;
import java.util.ArrayList;
public class contain_remove_method {
    public static void main(String[]args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("geeks");
        al.add("ide");
        al.add("courses");
        System.out.println(al.contains("ide"));
        al.remove(1);
        System.out.println(al.contains("ide"));
        al.remove("courses");
        System.out.println(al.contains("courses"));

    }
}
