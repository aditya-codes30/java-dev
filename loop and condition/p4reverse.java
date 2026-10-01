// problem 4----
// Reverse the user given number

import java.util.Scanner;
public class p4reverse {
    public static void main(String[] args) {
        int n = 123456;
        int ans = 0;
        while ( n > 0 ){
            int rem = n%10;
            n = n/10;
            ans = 10*ans+rem;
        
        }
        System.out.println(ans);
        
    }
    
}
