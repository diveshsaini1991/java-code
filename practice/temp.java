import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter temp in c down here");
        float tempc = (input.nextFloat());
        float tempf = (tempc * 9/5)+32;
        
        System.out.println("temp in f is " +tempf);

    }
}
