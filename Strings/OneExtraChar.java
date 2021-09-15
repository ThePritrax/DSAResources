package Strings;

public class OneExtraChar {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cagbed";

        System.out.println(extraChar(s1, s2));
    }

    public static char checkExtraChar(String s1, String s2) {

        // empty character to store the extra character
        char res = ' ';

        // we traverse through the string with extra character
        for(int i=0; i<s2.length(); i++){

            // we store every character in string 2 in a char c
            char c = s2.charAt(i);

            // we check if the char c is present in string 1 or not, and
            // store index of that character in n, if it is not present in string 1
            // -1 will be stored
            int n = s1.indexOf(c);

            // we check for -1 every time and store the character which has -1 index in
            // the empty char res and then return res
            if(n<0){
                res = c;
            }
        }
        return res;
    }
    
    // Optimized approach in O(n) time
    public static char extraChar(String s1, String s2){
        int sumof1 = 0;
        int sumof2 = 0;

        // we calculate the character code of both strings by adding the character
        // values of string 1 and 2 and then subtracting 1 from 2, which will the 
        // the character code of the extra character, which we return by converting
        // to integer value
        for(int i=0; i<s1.length(); i++){
            sumof1 += s1.charAt(i);
        }

        for(int i=0; i<s2.length(); i++){
            sumof2 += s2.charAt(i);
        }

        int res = sumof2 - sumof1;
        return (char)res;
        
    }
}
