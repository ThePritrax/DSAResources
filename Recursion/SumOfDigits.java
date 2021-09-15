package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digitSum(738));  
    }
    
    static int digitSum(int n){
        // base case will be when only a single digit is left
        if(n < 10){
            return n;
        }

        // we assume that we already know the the sum of all digits
        // except the last digit, so we add the last digit and call the
        // function for the number other than the current digit
        return n%10 + digitSum(n/10);
    }
}
