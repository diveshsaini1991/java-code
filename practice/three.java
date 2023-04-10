import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        System.out.println("hlo sir\nplease enter principal amount down here");
        Scanner input = new Scanner (System.in);
        float p = input.nextFloat();
        System.out.println("now sir please enter annual intrest rate down here");
        float r = input.nextFloat();
        System.out.println("now for the last step please enter time in years");
        float t = input.nextFloat();
        float a = p*(1+(r/100)*t);
        System.out.print("final amount after "+t+ " years will be "+a);
        float i = a-p;
        System.out.println(" and intrest on it will be "+i);
    }
}
