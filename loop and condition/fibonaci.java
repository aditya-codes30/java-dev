import java.util.Scanner;

public class fibonaci {
    public static void main (String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the nth value whose fibonaci number you want to find---");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int  count = 2;
          
        while (count<=n) {
            int temp = b;
            b = a+b;
            a = temp ;
            count++ ;
           
        }
System.out.println(b);

    

    }
    
}
