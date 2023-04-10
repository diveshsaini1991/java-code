package methods;

import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter your name here: ");
    String naam=input.next();
    String a=greet(naam);   
    System.out.println(a); 
    }
    static String greet (String name){
        String b= "hlo "+ name;
        return b;
    }

    
}
