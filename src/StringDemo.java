import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        int i = 100;
        String s1 = "Edureka";
        String s2 = "Edureka";
        System.out.println("Printing equality of string: " + s1.equals(s2));
        System.out.println("Changing int i to a string: " + String.valueOf(i));
        System.out.println("Replacing the targeted character in a string : "+s1.replace("E","e"));
        System.out.println("Comparing the value of string s1 to s2: "+s1.compareTo(s2));
        System.out.println("Changing s1 to uppercase: "+s1.toUpperCase());
        System.out.println("Getting the length of a string"+s1.length());
        System.out.println("Starting a string from index of: " + s1.substring(3));
        System.out.println(string("Yogesh").length());
        System.out.println(string("Yogesh").substring(2));

    }

    public static String string(String input){
        String name = "Yogesh";
        return  name;
    }
}
