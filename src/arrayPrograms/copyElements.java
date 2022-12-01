package arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class copyElements {
    public static void main(String[] args) {
        int[] arr1 =new int[] {1,2,3,4,6};
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i :arr1){
            arr2.add(i);
        }
        System.out.println(arr2);

    }
}
