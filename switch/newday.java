import java.util.Scanner;

public class newday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        switch (day){
            case 1,2,3,4,5-> System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
        }
    }
}