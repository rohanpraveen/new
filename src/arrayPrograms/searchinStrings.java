package arrayPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class searchinStrings {
    public static void main(String[] args) {
        String name = "rohan";
        char target = 'o';
        //System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)) {
                return true;
            }
            
        }
        return false;

    }
}
