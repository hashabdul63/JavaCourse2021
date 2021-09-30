import java.util.Scanner;

public class CHW_19_PractiseSet3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your website: ");
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("Organisational Website ");
        }
        else if(website.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if (website.endsWith(".in")){
            System.out.println("Indian website");

        }
/*        System.out.println("Enter the Year");
        int Year = sc.nextInt();
        boolean LeapYear =Year%4==0&& Year % 100 != 0 || Year % 400 == 0;
        if (LeapYear) {
            System.out.println("It is a leap Year");
        }
        else {
            System.out.println("It is not a Leap year");
        }*/


    /*    Scanner sc = new Scanner(System.in);

        System.out.println("enter your Number: ");
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println(" Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("No days");
        }*/
/*        System.out.println("Enter the amount you earned: ");

        float tax = 0;
        float income = sc.nextFloat();
        if (income < 2.5) {
            tax = income * 0;
        }
        else if (income >2.5f && income<=5.0f) {
            tax = income * 0.05f;
        }
        else if (income > 5.0f && income <=10.0f) {
            tax =  income * 0.20f;
        }
        else if (income > 10.0f) {
            tax = income * 0.30f ;
        }
        System.out.println("The total tax paid by the employee "+ tax);
*/





    /*    byte m1,m2,m3;
        System.out.println("Enter your marks of Physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks of Maths  ");
        m2 = sc.nextByte();
        System.out.println("Enter your marks of Chemistry");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your Overall percentage is :"+avg);
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
        System.out.println("You have been promoted");
    }
        else {
            System.out.println("You have not been promoted!");*/
        }
    }

