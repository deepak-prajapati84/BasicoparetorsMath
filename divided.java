import java.util.Scanner;

public class divided{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter adividend : ");
        int a=sc.nextInt();
        System.out.println("Enter divisor : ");
        int b=sc.nextInt();

        int q=a/b;
        int r=a-(b*q);

        System.out.println("The result is : " + a  + " dividend by b "+ b + " is final "+ r);
    }
}