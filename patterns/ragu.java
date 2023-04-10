import java.util.Scanner;

public class ragu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your phy. marks:");
        float phy=input.nextFloat();
        System.out.println("enter your che. marks:");
        float che=input.nextFloat();
        System.out.println("enter your math marks:");
        float math=input.nextFloat();
        System.out.println("enter your eng. marks:");
        float eng=input.nextFloat();

        float tot = phy+che+math+eng;
        float p= (tot/400)*100;

        System.out.println("your phy marsks are: "+phy);
        System.out.println("your che marsks are: "+che);
        System.out.println("your math marsks are: "+math);
        System.out.println("your eng marsks are: "+eng);
        System.out.println("your total marks are: "+tot);
        System.out.println("your % is: "+p+"%");
    }
}
