import java.util.Scanner;

public class Try{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter is a value : ");
        int i=sc.nextInt();

        System.out.println("Enter is B Value : ");
        int j=sc.nextInt();
        
        int a=(i/j)*j;
        int b=(j/i)*i;
        
        System.out.println("Result is : "+ (a+b));


        /*  int a=20,b=90;
            int i=(a/b)*b;
            System.out.println(i);
        */
    }
}