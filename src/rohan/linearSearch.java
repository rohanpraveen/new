package rohan;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2,45, 13, 64,12};

        System.out.println(find(64,arr));

        }
    static boolean find(int num, int[] arr){

        for(int i : arr ){
            if( i == num){

                return true;
            }
        }
        return false;

    }

}
