package Strings;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "priyansh";

        System.out.println(str1 + " is a palindrome : " + isPalindrome(str1));
        System.out.println(str2 + " is a palindrome : " + isPalindrome(str2));
    }
    
    public static boolean isPalindrome(String str){
        // we initialize start and end pointers at start of the string
        // and end of the string
        int start = 0;
        int end = str.length() - 1;

        // we traverse until start is less than end, and check if character at both indexes
        // are same or not, if it is not same, we return false, else if same we continue and increment
        // and decrement the start and end pointers respectively
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
