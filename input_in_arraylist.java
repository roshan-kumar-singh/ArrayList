import java.util.ArrayList;

public class input_in_arraylist {
    public static void main(String []args){
        ArrayList<Integer>al=new ArrayList<Integer>();
        for(int i=1;i<=100;i++){
            al.add(i);
        }
        System.out.print(al+" ");
    }
}
