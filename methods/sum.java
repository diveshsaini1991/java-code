package methods;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int ans= sum2();
        System.out.println("this is the ans: "+ans);
    }
    static int sum2(){
        int num1,num2,sum;
        Scanner input = new Scanner(System.in);
        System.out.print("enter 1st no: ");
        num1 = input.nextInt();
        System.out.print("enter 2nd no: ");
        num2 = input.nextInt();
        sum= num1+num2;
        return sum;
    }
    static void sum() {
        int num1,num2,sum;
        Scanner input = new Scanner(System.in);
        System.out.print("enter 1st no: ");
        num1 = input.nextInt();
        System.out.print("enter 2nd no: ");
        num2 = input.nextInt();
        sum= num1+num2;
        System.out.println("the sum is: "+ sum);
        
    }
}
