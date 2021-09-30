import java.util.Locale;
import java.util.Scanner;

public class CHW_13_Strings {
    public static void main(String[] args) {
//        String name = new String("Hashim");
//        System.out.println(name);
        //int a = 18;
        //float b = 28.0f ;
        //System.out.printf(" The value of a is %d and Value of b is %f", a , b);
        //Scanner sc = new Scanner(System.in);
        //String st = sc.nextLine();
        //System.out.println(st);
        String value = "Hashim";
        System.out.println(value);

        String lstring = value.toLowerCase(Locale.ROOT);
        System.out.println(lstring);
       String ustring = value.toUpperCase(Locale.ROOT);
        System.out.println(ustring);
        String nonTrimString = "          Hashim        ";
        System.out.println(nonTrimString);
        String trimmedString = nonTrimString.trim();
        System.out.println(trimmedString);
        System.out.println(value.substring(1,5));
        System.out.println(value.replace('i','a'));
        System.out.println(value.replace("h", "ier"));

    }
}
