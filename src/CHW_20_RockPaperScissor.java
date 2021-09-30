import java.util.Random;
import java.util.Scanner;

public class CHW_20_RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println(" Welcome to Rock paper scissor Game ");
        System.out.println("Enter 1 for Rock / Enter 2 for Paper /Enter 3 for Scissor");
        int CompChoice = 1+ r.nextInt(3);

        int userChoice = sc.nextInt();

        System.out.println("Computer: "+CompChoice);
        if ( userChoice<=0 || userChoice>3){
            System.out.println("Invalid Choice! \n Enter your number");
        }

      /*  while (CompChoice==0){
            CompChoice = r.nextInt(3);
            System.out.println("CompChoice"+CompChoice);*/
            if (userChoice==CompChoice){
                System.out.println("Match drawn!");
            }
            else if(userChoice==1 && CompChoice==2){
                System.out.println("Computer Win!");
            } else if(userChoice==1 && CompChoice==3){
                System.out.println("You Win!");
            }
                else if(userChoice==2 && CompChoice==1){
                System.out.println("You Win!");

            } else if(userChoice==2 && CompChoice==3){
                System.out.println("Computer Win!");
            }
                else if(userChoice==3 && CompChoice==1){
                System.out.println("Computer Win!");
            }
                else if(userChoice==3 && CompChoice==2){
                System.out.println("You Win!");
            }
        //}

    }
}
