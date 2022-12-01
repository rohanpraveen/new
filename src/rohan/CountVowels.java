package rohan;

import java.util.*;

class CountVowels {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowels = countVowels(str);
        System.out.println(vowels);
    }

    // TODO: Implement this method
    static boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        return(ch=='A'||ch =='E'||ch=='I'||ch=='O'||ch=='U');
    }
    static int countVowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i))) // Check for vowel
                ++count;
        return count;
    }
    // this is o(n) tc
    // nested for loop is o(n^2) which is bad.





}

