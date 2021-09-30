import java.util.Scanner;

public class CHW_06_Excercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks:Out of 100 ");
      /*  System.out.println("Subject 1: ");
        float sub1 = sc.nextFloat();
        if (!validateMarks(sub1)) {
            sub1 = sc.nextFloat();
            validateMarks(sub1);
        }*/
        float sub1 = getSub(sc, "Maths");
        float sub2 = getSub(sc, "Science");
        float sub3 = getSub(sc, "Social");
        float sub4 = getSub(sc, "English");
        float sub5 = getSub(sc, "Urdu");
        /*System.out.println("Subject 2: ");
        float sub2 = sc.nextFloat();
        System.out.println("Subject 3: ");
        float sub3 = sc.nextFloat();
        System.out.println("Subject 4: ");
        float sub4 = sc.nextFloat();
        System.out.println("Subject 5: ");
        float sub5 = sc.nextFloat();*/
        float total = sub1 + sub2 + sub3 + sub4 + sub5;
        float TotalPercentage = (total) / 500 * 100;
        System.out.print("Total Percentage: ");
        System.out.println(TotalPercentage + "%");

    }

    static float getSub(Scanner scanner, String subject) {
        float marks;
        do {
            System.out.println("Enter Marks for " + subject);
            marks = scanner.nextFloat();
        } while (!validateMarks(marks));

        return marks;
    }


    static private boolean validateMarks(float marks) {
        if (marks > 100 || marks < 0) {
            System.out.println("Invalid Marks \nPlease re-enter correct marks");
            return false;
        } else {
            return true;
        }
    }
}
