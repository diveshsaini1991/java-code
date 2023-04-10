import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        System.out.println("input any no. to see if its even or odd ");
    Scanner input = new Scanner (System.in);
    int no = input.nextInt();
    if (no % 2 == 0 ) {
        System.out.println(no + " is a even no.");
    
    }
    else
    System.out.println(no + " is a odd no.");
    
    
    }

}