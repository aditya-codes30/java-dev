import java.util.Scanner;


public class largest {
    public static void main ( String [] args ) {
    
        Scanner in = new Scanner(System.in);
            System.out.println("enter the first value");
            int a = in.nextInt();
             System.out.println("enter the second value");
            int b = in.nextInt();
             System.out.println("enter the third value");
            int c = in.nextInt();
        /*
        i was making mistake by using input at the place of in 
        if you used in name after scanner classs then you can't use other name while taking value
        */
    //    int max = a;
    //       if(b>max ) {
    //        max = b;
    //       }
    //       if (c>max){
    //         max = c ;
    //       }
    //        System.out.println(max);
    // }
           int max = Math.max(c, Math.max(a, b));
            
        System.out.println("the largest value out of the three no is " + max);
                


    }

}