package methods;

import java.util.Scanner;

public class armstromg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        // System.out.println(isarmstrong(n));
        for (int i = 100; i < 1000; i++) {
            if (isarmstrong(i)) {
                System.out.print(i+" ");
            }
        }

    }

    static boolean isarmstrong(int n) {
        int original = n;
        int sum= 0;

        while (n>0) {
            int rem = n%10;
            n=n/10;
            sum=sum+(rem*rem*rem);
            
        }
        return sum==original;
        
    }
}
