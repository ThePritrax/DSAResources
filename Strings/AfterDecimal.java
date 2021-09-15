package Strings;

public class AfterDecimal {
    public static void main(String[] args) {
        String decNum = "69.420";
        System.out.println(decimalNumbers(decNum));
    }

    public static String decimalNumbers(String str){

        // first we get the index of the decimal point
        int decPoint = str.indexOf(".");

        // the required decimal number substring will be starting from
        // index of decimal point + 1 till the end
        String dec = str.substring(decPoint + 1);

        // if no decimal point is present, decPoint will be -1, so we print an empty string
        if (decPoint<0) {
            return "";
        }
        return dec;
    }
    
}
