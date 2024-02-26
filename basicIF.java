import java.util.Scanner;

public class basicIF{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter is a frist numbers : ");
        int a=sc.nextInt();
        
        if(a%5==0){
            System.out.println("Numbers is divided by 5 : ");
        }
        if (a%5!=0){
            System.out.println("Numbers is not divided by 5 : ");
        }
         
        
        // Scanner sc=new Scanner(System.in);

        // System.out.println("Enter is a frist numbers : ");
        // int a=sc.nextInt();

        // // System.out.println(a*a);

        // if(a%2==0){
        //     System.out.println("Number is Even");
        // }else{
        //     System.out.println("Numbers is add");
        // }
    }
}