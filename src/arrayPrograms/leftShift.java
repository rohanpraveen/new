package arrayPrograms;

import java.util.Scanner;

public class leftShift {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        // input array
        for (int k : arr) {
            System.out.print(k + " ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println();
        // taking numbers to shift the array
        System.out.println("Enter numbers to shift: ");

        int numShift = sc.nextInt();
        // shift the elements
        for (int a = 0; a < numShift; a++) {


            int first = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                // shift by 1 element
                arr[i] = arr[i + 1];

            }
            arr[arr.length - 1] = first;
        }
        //final array after shifting
        for (int i : arr) {
            System.out.print(i + " ");
        }




    }


}
