import java.util.Scanner;

public class countnums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the no. down here");
        int no = input.nextInt();
        System.out.println("input the digit down here");
        int dig = input.nextInt();
        int count= 0;
        int temp = no;
        while(no>0) {
            int rem = no %10;
            if(rem==dig){
                count++;
            }
            no=no/10;
        }
        System.out.println(dig + " comes "+ count + " times in "+ temp);
    }        

}
