package Strings;

public class BasicsOfStrings {
    public static void main(String[] args) {
        subString();
        System.out.println();
        System.out.println();
        compareString();
        System.out.println();
        System.out.println();
        stringOperations();
        System.out.println();
        stringBuilderBuffer();
    }

    // function to extract characters or substrings from the given string
    public static void subString(){
        String s1 = "real";
        System.out.println("Length of the string is : " + s1.length());
        System.out.println("Character at index 2 is : " + s1.charAt(2));
        System.out.println("Substring starting from index 1 is : " + s1.substring(1));

        // starting index is included, ending index is excluded i.e. character at index 0
        // is printed but character at index 2 is not
        System.out.println("Substring between index 0 and 2 is : " + s1.substring(0,2));

        String s2 = "halamadrid";
        System.out.println(s2 + " contains madrid : " + s2.contains("madrid"));

        String s3 = "madrid";
        // gives the index of first occurrence of s3 in s2
        System.out.printf("Index at which %s is present in %s is : %d",s3, s2, s2.indexOf(s3));

        System.out.println();

        String s4 = "gloryglorymanutd";
        String s5 = "glory";
        // if we specify an index, then the function starts the check from that index, hence it skips
        // the first index, which is the first occurrence and gives the index of second occurrence
        System.out.printf("Index at which %s occurs for the 2nd time in %s is : %d", s5, s4, s4.indexOf(s5, 1));
    }

    // function to compare the content and the reference of different strings
    public static void compareString(){

        // when strings are initialized directly using literals and their content is same,
        // java doesn't allocate new memory to them, both the strings refer to the same object 
        // str1 -> (madrid) <- str2
        String str1 = "madrid";
        String str2 = "madrid";

        // when we specifically create a new object String, then a new object is created even if
        // it has the same content as any other object
        String str3 = new String("madrid");
        
        // the double equals operator doesn't compare the contents of the strings, it only checks
        // if both strings are referring to the same object or not
        // that's why in the first case we get the same reference, but in the second case we don't
        if (str1==str2) {
            System.out.println("Same reference");
        } else {
            System.out.println("Not the same reference");
        }

        if (str1==str3) {
            System.out.println("Same reference");
        } else {
            System.out.println("Not the same reference");
        }

        // compareTo compares the two string lexicographically i.e. if the two strings are same it returns 0
        // if two strings have different lengths but same characters upto that length, then it returns the diff in length
        // i.e. mad and madden, same characters but lengths differ, and the difference is 3
        // else if two strings have different characters, it gives the difference between the first occurrence of different
        // characters i.e. happy and jolly, here h and j differ and the difference is 2
        String str4 = "madtid";
        System.out.printf("Lexicographic difference between %s and %s is : %d", str1, str4, str1.compareTo(str4));
        System.out.println();

        // when using == these two strings were not equal because they pointed to two different objects, but
        // equals function only compares the contents of the strings, hence here it returns true
        System.out.printf("String %s and %s are equal : %b", str1, str3, str1.equals(str3));
    }

    public static void stringOperations(){
        String s1 = "Interview";
        String s2 = "interview";

        // same as equals but ignores the upper or lower case of characters
        System.out.printf("Ignoring the cases, %s and %s are same : %b", s1, s2, s1.equalsIgnoreCase(s2));

        System.out.println();

        // converts all characters of the string to upper case
        System.out.printf("%s to upper case will be : %s", s1, s1.toUpperCase());

        System.out.println();

        // this is used to get a substring from the original string
        // if only start index is specified, then the substring will be till the end of the string
        // to get a specific substring, both start and end index + 1 is to be provided
        // end index + 1 because the end index is excluded, so we need to add 1 to it for it to be considered
        String part1 = s1.substring(4);
        System.out.println("The substring is : " + part1);

        String part2 = s1.substring(0, 5);
        System.out.println("The substring is : " + part2);
    }

    // function to perform operations on string builder and buffer
    // these functions are not common to strings
    // but builder and buffer have these functions as common
    public static void stringBuilderBuffer(){
        StringBuilder str = new StringBuilder("mandem");
        System.out.println("Original string : " + str);
        str.reverse();
        System.out.println("Reversed string : " + str);
        str.append("damn");
        System.out.println("String after appending damn : " + str);
        str.setCharAt(1, 'i');
        System.out.println("String after changing character at index 1 to i : " + str);
        str.delete(5, 9);
        System.out.println("String after deleting from index 5 to 8 : " + str);
        str.insert(3, "my");
        System.out.println("String after inserting my at index 3 is : " + str);
    }
}
