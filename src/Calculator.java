import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers");
        int numbers = sc.nextInt();
        System.out.print("Choose option");
        System.out.println("Press 1 to select addition \n Press 2 to Subtraction  \n Press 3 for Multiplication \n Press 4 for Division");
        int myOption = sc.nextInt();
        if (myOption < 1 || myOption > 4) {
            System.out.println("Option is Invalid");
            return;

        }
        switch (myOption) {
            case 1:


        }

    }
}
