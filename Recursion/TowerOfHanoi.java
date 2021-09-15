package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println(toh(3, 1, 2, 3));
    }

    static long toh(int n, int A, int B, int C){
        long count = 0;

        // base case, when only one tile is present, we simply move it
        // from rod 1 to 3 and print the move.
        // Also we return the number of moves as 1.
        if(n == 1){                                   
            System.out.println("Disk " + n + " : " + A + " -> " + C);
            return 1;
        }

        // we increment count every time this function is called
        count += toh(n-1, A, C, B);

        // we also need count the number of times the independent
        // move is being made, which will be done when the print
        // line is executed
        System.out.println("Disk " + n + " : " + A + " -> " + C);
        count = count + 1;
        
        // we again increment the count every time this function is called
        count += toh(n-1, B, A, C);

        return count;
    }
}

// A=1 B=2 C=3
// from using  to
//   1    2    3   ->  A  B  C
//   1    3    2   ->  A  C  B
//   2    1    3   ->  B  A  C