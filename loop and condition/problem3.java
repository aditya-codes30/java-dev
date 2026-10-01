// que no 3 -- Write a Java program to:

// take a number from the user
// take a digit from the user
// count how many times that digit appears in the number
// print the count






import java.util.Scanner;


public class problem3  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number --");
        long n = in.nextLong();
        System.out.println("Enter the digit you want to find how many time it appear in given number ---");
        int x = in.nextInt();
        int count = 0;

        while (n > 0) {
            long rem = n%10;
            if (rem == x) {
                count++;

            }
            n = n/10;
        }
    System.out.println(count);


    }
    
    
}
