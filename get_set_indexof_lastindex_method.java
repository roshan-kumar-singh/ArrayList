import java.util.*;
public class get_set_indexof_lastindex_method {
    public static void main(String[]args){
        ArrayList<Integer> al=new ArrayList<Integer>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value for arraylist");
        for(int i=1;i<=5;i++){
            al.add(s.nextInt());
        }
        System.out.println(al.get(1));
        al.set(1, 40);
        System.out.println(al.get(1));
        System.out.println(al.indexOf(10));
        System.out.println(al.lastIndexOf(10));
        System.out.println(al.indexOf(50));



    }
}
