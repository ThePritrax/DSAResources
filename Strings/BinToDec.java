package Strings;

public class BinToDec {
    public static void main(String[] args) {
        String str = "10010";
        System.out.println("Decimal form of " + str + " is " + binaryToDecimal(str));
    }

    public static int binaryToDecimal(String binNum){
        int decNum = 0;
        int powOfTwo = 1;

        // we traverse the string from the end
        for(int i=binNum.length() - 1; i>=0; i--){

            // we subtract 0 from each character to convert it into it integer by
            // subtracting the ASCII value of character and the ASCII value of 0
            // then we multiply it by the power of two respective to the chars index
            decNum += (binNum.charAt(i) - '0') * powOfTwo;

            // we increase the power of two by multiplying it by 2 after each iteration
            powOfTwo *= 2;
        }

        return decNum;
    }
    
}
