package Strings;

public class PatternSearch {
    public static void main(String[] args) {
        String str = "MickeyMouseClubHouse";
        String pat = "ouse";

        searchThePattern(str, pat);
    }

    public static void searchThePattern(String original, String pattern){

        // we get the first index where the pattern is present in the original string
        int position = original.indexOf(pattern);
        System.out.print("Pattern is present at index : ");

        // we run the loop until we get -1 as the position, which means the pattern is no
        // more present in the original string
        while (position >= 0) {
            // we print the first index of pattern and then others after it
            System.out.print(position + " ");

            // every time we find a position of the pattern, we start our next search from 
            // the next index
            position = original.indexOf(pattern, position + 1);
        }
    }
    
}
