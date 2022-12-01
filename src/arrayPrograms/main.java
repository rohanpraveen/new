package arrayPrograms;

public class main {

    public static void main(String[] args) {
        int[] a = {1,2,4,5,6,7,8,9,10,11,12,41,13,44,532,2,1,3,-1,-21};
        int target = 10;
        int ans = linearSearch(a,target);
        System.out.println(ans);
    }
    // search an array : return the index if item found
    // return -1 if not found
    // search for the element and return the element
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0 ){
            return  -1;
        }
        for(int element :arr){
            if(element == target){
                return element;
            }
        }

        return -1;

    }
}
