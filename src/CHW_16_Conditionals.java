import java.util.Scanner;

public class CHW_16_Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: " );
        int Age = sc.nextInt();
        if (Age >=18 ){
            System.out.println("This person is eligible to drive");
        }
        else {
            System.out.println("This person cannot drive");
    }
}}
