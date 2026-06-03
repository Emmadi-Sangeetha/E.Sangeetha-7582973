import java.util.Scanner;

public class CustomExceptionDemo {

    static void validate(int age)
            throws InvalidAgeException{

        if(age<18)
            throw new InvalidAgeException(
                    "Age must be 18 or above");
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        try{

            System.out.print("Enter Age: ");
            int age=sc.nextInt();

            validate(age);

            System.out.println("Eligible");

        }catch(Exception e){

            System.out.println(e.getMessage());
        }

        sc.close();
    }
}