package methods;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter two no's to swap: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int temp= a;
        a=b;
        b= temp;
        System.out.println(a +" "+ b);
        
    }
}
