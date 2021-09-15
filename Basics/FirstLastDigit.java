package Basics;

public class FirstLastDigit {
    public static void main(String[] args) {
        int num = 8472;
        System.out.println("The first digit is : " + firstDigit(num));
        System.out.println("The last digit is : " + lastDigit(num));
    }

    public static int firstDigit(int n) {

        // we know that dividing a number by 10, removes the last digit
        // of the number, so we keep on dividing till we get a single digit
        // number, i.e. number < 10
        while (n >= 10){
            n /= 10;
        }
        return n;
    }

    public static int lastDigit(int n) {

        // modulus gives the remainder, so a number % 10 will return
        // the last digit of the number
        return (n % 10);
    }
}
