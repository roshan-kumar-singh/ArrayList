import java.util.ArrayList;
public class add_method {
    public static void main(String[]args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("geeks");
        al.add("ide");
        al.add("courses");
        System.out.println(al);
        al.add(1,"practice");
        System.out.print(al);

    }
}
