package rohan;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class twoDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = sc.nextInt();
            }
        }
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        for(int[] a : arr ){
            System.out.println(Arrays.toString(a));
        }

    }
}



