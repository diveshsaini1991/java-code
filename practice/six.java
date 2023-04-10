import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("for converting currency from \nrs to usd press 1\nusd to rs press 2 ");
        int f = input.nextInt();
    if (f==1) {
        System.out.println("input amount");
        float amount = input.nextFloat();
        System.out.println(amount/79.63);

    }
    else  System.out.println("input amount");
    float amount = input.nextFloat();
    System.out.println(amount*79.63);


    }
}
