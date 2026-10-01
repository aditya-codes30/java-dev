import java.util.Scanner;

public class calulator1 {
    public static void main ( String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        float a = in.nextInt();
        System.out.print("Enter the second value : ");
        float b = in.nextInt();
            System.out.println("1- addition, 2- subtraction, 3- multiplication, 4- devision ");
            System.out.println("choose mathmatical operation by above no  ");
            int d = in.nextInt();
            if (d == 1) {
                System.out.println("addition result  " + (a + b));
            } else if (d == 2) {
                System.out.println("subtraction result" + (a - b));
            } else if (d == 3) {
                System.out.println("multiplication result  " + (a * b));
            } else if (d == 4 && b != 0) {
                System.out.println("Devision result  " + (a / b));
            } else if (d == 4) {
                System.out.println("devision by zero -- INVALID COMMAND");
            } else {
                System.out.println("INVALID COMMAND");
            }
        

    }
    
}
