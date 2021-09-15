package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String org = "priyansh";
        String rev = "";

        System.out.println(revString(org, rev));
    }

    public static String revString(String original, String reverse){
        int lastIndex = original.length();

        // we traverse the original string from the end and add each character to a new string
        // reverse, then return the reverse string
        for(int i=lastIndex-1; i>=0; i--){
            reverse += original.charAt(i);
        }

        return reverse;
    }
    
}
