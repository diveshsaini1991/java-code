
    import java.util.Scanner;

public class newswitch {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        String fruit = input.next();

        switch (fruit) {
            case "mango"->System.out.println("king of fruits");                
            case "apple"->System.out.println("a sweet red fruit");                
            case "orange"->System.out.println("a round fruit");               
            default->System.out.println("i dont know about it");    
        }
    }
}


