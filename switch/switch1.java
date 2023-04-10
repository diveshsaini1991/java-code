import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        String fruit = input.next();

        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("a sweet red fruit");
                break;
            case "orange":
                System.out.println("a round fruit");
                break;
            default:
                System.out.println("i dont know about it");    




        }





    }
}
