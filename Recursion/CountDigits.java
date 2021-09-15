package Recursion;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(digitCount(123456));
    }
    
    static int digitCount(int n){
        if(n<10){
            return 1;
        }

        return 1 + digitCount(n/10);
    }
}
