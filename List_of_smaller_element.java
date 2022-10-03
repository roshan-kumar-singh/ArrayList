import java.util.*;
public class List_of_smaller_element {
    public static void main(String[] args) {
        int arr[] = {10, 40, 80, 30, 20, 15};
        List<Integer> al = getsmaller(arr, 30);
        for (Integer x : al) {
            System.out.println(x);
        }
    }

    static List<Integer> getsmaller(int arr[], int k) {
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k) {
                al.add(arr[i]);
            }
        }
        return al;
    }

}
