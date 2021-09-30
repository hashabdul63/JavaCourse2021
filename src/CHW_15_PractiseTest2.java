import java.util.Locale;

public class CHW_15_PractiseTest2 {
    public static void main(String[] args) {
        //Write a Java program to convert a string to lowercase.
        //String Name = "Abdul Hashim Mohammed";
        //System.out.println(Name.toLowerCase(Locale.ROOT));

        //Write a Java program to replace spaces with underscores.
        //System.out.println(Name.replace(' ', '_'));

        //Write a Java program to fill in a letter template which looks like below:
        //String letter = "Dear <|name|>, Thanks a lot";
        //System.out.println(letter.replace("name", "Haris Ali Khan"));

        //Write a Java program to detect double and triple spaces in a string.
        String st = "This string consist of  double   triple spaces";
        System.out.println(st.indexOf("  "));
        System.out.println(st.indexOf("   "));

        //Write a program to format the following letter using escape sequence characters.
        String name = "My Name is \n Abdul Hashim Mohammed \t Thanks";
        System.out.println(name);

    }
}
