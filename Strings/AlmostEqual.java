package Strings;

public class AlmostEqual {
    public static void main(String[] args) {
        String s1= "mandem";
        String s2 = "ermanerdem";

        System.out.println(countOfDiff(s1, s2));
    }

    public static int countOfDiff(String s1, String s2){
        int count=0;

        for(int i=0; i<s1.length(); i++){
            if(s2.indexOf(s1.charAt(i)) < 0){
                count++;
            }
        }

        return count;
    }
    
}
