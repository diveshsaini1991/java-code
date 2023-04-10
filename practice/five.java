import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("input two numbers down here");
        int x = input.nextInt();
        int y = input.nextInt();

    if (x>y){
        System.out.println(x+" is the largest number");
    
    }
    else System.out.println(y+" is the largest number");
        

    }
}
