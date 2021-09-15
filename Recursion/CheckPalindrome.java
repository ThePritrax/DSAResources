package Recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "racecar";
        int n = str.length();
        int first = 0;
        int last = n-1;
        System.out.println("Is " + str + " a palindrome? : " + checkPal(str, first, last));
    }
    
    static boolean checkPal(String str, int first, int last){
        // base case will be when first becomes equal to last (even length)
        // or when first crosses last (odd length) then return true
        if(first>=last){
            return true;
        }

        // first we check if the first and last characters are equal or not,
        // if they aren't, we instantly return false
        // if they are, we move onto the recursive call
        if(str.charAt(first) != str.charAt(last)){
            return false;
        }

        // using the recursive leap of faith, we assume that we already
        // know whether the substring excluding the first and the last character
        // is a palindrome or not, and so we return the true/false value
        // obtained by calling the function for that substring
        return checkPal(str, first+1, last-1);
    }
}

