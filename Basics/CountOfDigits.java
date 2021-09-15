package Basics;

public class CountOfDigits {
    public static void main(String[] args) {
        int num = 42069;

        int count = 0;

        // dividing a number by 10 reduces the number by one digit, so we count the times
        // the division is performed until the number becomes 0, and the count will be 
        // equal to the number of digits
        while(num > 0){
            num /= 10;
            count++;
        }

        System.out.println("Number of digits : " + count);
    }
}
