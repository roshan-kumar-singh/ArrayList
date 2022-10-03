import java.util.*;
public class clear_isempty_method {
    public static void main(String[]args){
        ArrayList<Integer>al=new ArrayList<Integer>();
        System.out.println("Enter the value for arraylist");
        Scanner s = new Scanner(System.in);
        for(int i=1;i<=4;i++){
            al.add(s.nextInt());

        }
        System.out.println(al.isEmpty());
        al.clear();
        System.out.println(al.isEmpty());
    }
}
