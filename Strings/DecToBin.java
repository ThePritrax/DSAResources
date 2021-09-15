package Strings;

public class DecToBin {
    public static void main(String[] args) {
        int num = 2;
        System.out.println("Binary form of " + num + " is " + decimalToBinary(num));
    }

    public static String decimalToBinary(int decNum){
        // we initialize an empty string to store the binary number representation in
        String binNum = "";

        // we keep dividing the number by 2 till it is equal to zero and store
        // the remainders in reverse order, since the Most Significant Bit
        // is the last remainder in this division
        while(decNum>0){

            // we first store the new remainder and then add the previous string
            // to it so as to store the numbers in reverse order as it should be
            binNum = (decNum%2) + binNum;

            // with each iteration we divide the number by 2
            decNum /= 2;
        }

        return binNum;
    }
    
}
