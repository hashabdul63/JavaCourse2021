import java.util.Scanner;

public class CHW_18_Switch {
    public static void main(String[] args) {
        System.out.println("Enter your Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age){
            case  18:
                System.out.println("You are an Adult");
                break;
            case 23:
                System.out.println(" You are fucking with your life");
                break;
            case 30:
                System.out.println("You are fucked up in your life");
                break;
            default:
                System.out.println("After Fucked up you can try to manage ur life");


        }

        /*if (age >18){
            System.out.println("you are eligible get 20 points");
        }
        else if(age >25){
        System.out.println("you are eligible get 30 points");
    }   else if (age >30){
            System.out.println("you are eligible get 25 points");
        }
        else{
            System.out.println("you are not eligible to get points");*/
        }
        }

