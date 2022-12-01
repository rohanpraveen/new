package arrayPrograms;

public class duplicateElements {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 1, 2,5,4,3};

        for (int i = 0; i < arr1.length; i++)


            //compare elements repeated elements

        {
            for (int j = i +1 ; j < arr1.length; j++)
                if (arr1[i] == arr1[j]) {
                    System.out.println(arr1[j]);
                }
        }
        }
    }

