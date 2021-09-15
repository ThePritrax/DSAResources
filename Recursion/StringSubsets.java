package Recursion;

public class StringSubsets {
    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str, " ", 0);
    }

    static void printSubsets(String str, String curr, int index){
        if(index==str.length()){
            System.out.print(curr + " ");
            return;
        }

        printSubsets(str, curr, index+1);
        printSubsets(str, curr+str.charAt(index), index+1);
    }
}
