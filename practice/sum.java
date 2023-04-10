import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("welcome to my calculator lite");
        System.out.println("for adding two no.s");
        Scanner input = new Scanner (System.in);
        System.out.println("enter 1st no. down here");
        float no_one = (input.nextFloat());
        System.out.println("enter 2nd no. down here");
        float no_two = (input.nextFloat());

        float sum = no_one + no_two;
        System.out.println("sum = " + sum);

    }
}
