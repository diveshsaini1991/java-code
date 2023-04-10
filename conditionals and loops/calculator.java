import java.util.Scanner;

public class calculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     float ans = 0;
     while (true){
        System.out.println("enter + for addition\nenter - for subtraction\nenter * for multiplication\nenter / for division\nenter % to find the remainder");
        System.out.print("enter the operator: ");
        char op = input.next().trim().charAt(0);

        if (op == '+' ||op == '-' ||op == '*' ||op == '/' ||op == '%' ){

            System.out.print("enter two numbers: ");
            float num1 = input.nextFloat();
            float num2 = input.nextFloat();

            if (op=='+'){
                ans=( num1 + num2);
            }

            if (op=='-'){
                ans=(num1-num2);
            

            if (op=='*'){
                ans=(num1*num2);
            }

            if (op=='/'){
                if (num2!=0){
                    ans=(num1/num2);
                }
                System.out.println("infinity");
                
            }

            if (op=='%'){
                if (num2!=0){
                    ans=(num1%num2);
                }
                System.out.println("infinity");
                
            }

         } else if (op=='x'||op=='X'){
                break;
            }

            else {
                System.out.println("invalid operator");
            }

            System.out.println(ans);

        

     }
     
    }
}
}
