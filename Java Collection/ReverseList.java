import java.util.*;

public class ReverseList {
    public static void main(String[] args) {

        // ArrayList
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Original ArrayList: " + arr);

        for (int i = 0, j = arr.size()-1; i < j; i++, j--) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
        }
        System.out.println("Reversed ArrayList: " + arr);

        // LinkedList
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("\nOriginal LinkedList: " + ll);

        int left = 0, right = ll.size()-1;
        while(left < right){
            int temp = ll.get(left);
            ll.set(left, ll.get(right));
            ll.set(right, temp);
            left++;
            right--;
        }
        System.out.println("Reversed LinkedList: " + ll);
    }
}
