import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
            
        

        System.out.println("hlo sir welcome to my calculator");
        System.out.println("what do you want to do sir");
        System.out.println("press 1 for sum \npress 2 for subtraction \npress 3 for Multiplication \npress 4 for division ");
        int f = input.nextInt();

        
        //sum

        if (f == 1) {
            System.out.println("enter 1st number for addition");
            float a = input.nextFloat();
            System.out.println("enter 2nd number for addition");
            float b = input.nextFloat();
            System.out.println("result of these two numbers sum is "+(a+b));
        }

        //substract

        if (f == 2) {
            System.out.println("enter 1st number for substraction");
            float a = input.nextFloat();
            System.out.println("enter 2nd number for substraction");
            float b = input.nextFloat();
            System.out.println("result of these two numbers subtraction is "+(a-b));
        }

        //Multiplication

        if (f == 3) {
            System.out.println("enter 1st number for Multiplication");
            float a = input.nextFloat();
            System.out.println("enter 2nd number for Multiplication");
            float b = input.nextFloat();
            System.out.println("result of these two numbers multiplication is "+(a*b));
        }

        //division

        if (f == 4) {
            System.out.println("enter 1st number for division");
            float a = input.nextFloat();
            System.out.println("enter 2nd number for division");
            float b = input.nextFloat();
            System.out.println("result of these two numbers division is "+(a/b));
        }
        
       System.out.println("thanks for using my calculator"); 
    }
    


}
