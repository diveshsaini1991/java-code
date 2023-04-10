import java.util.Scanner;

import javax.xml.transform.stream.StreamSource;


public class nestedswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empid = input.nextInt();
        String dep = input.next();

        switch (empid) {
            case 1: 
            System.out.println("divesh saini");
            switch(dep) {
                case "it":
                System.out.println("IT dep");
                break;
                case "wk":
                System.out.println("work dep");
            }
            break;
            case 2: 
            System.out.println("om saini");
            switch(dep) {
                case "it":
                System.out.println("IT dep");
                break;
                case "wk":
                System.out.println("work dep");

            }
            break;
            case 3:
            System.out.println("ishan");
            switch (dep) {
                case "it":
                System.out.println("IT dep");
                break;
                case "wk":
                System.out.println("work dep");

            }
            break;
            default:
            System.out.println("id is not correct");


        }
        
    }
}
