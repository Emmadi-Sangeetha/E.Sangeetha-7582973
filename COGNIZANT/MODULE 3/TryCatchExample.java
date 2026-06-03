import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        try{

            System.out.print("Enter a: ");
            int a=sc.nextInt();

            System.out.print("Enter b: ");
            int b=sc.nextInt();

            System.out.println(a/b);

        }catch(ArithmeticException e){

            System.out.println("Cannot Divide By Zero");
        }

        sc.close();
    }
}