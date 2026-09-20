import java.util.Scanner;

/*
Capital S in Scanner and System:
 These are Classes built into Java.
 Because they are classes,they must start with an uppercase letter.
 */

public class Loops {
    public static void main ( String[] args) {
        Scanner in = new Scanner ( System.in );
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(n);
        }


    }
}
