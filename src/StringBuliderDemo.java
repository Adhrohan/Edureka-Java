public class StringBuliderDemo {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Edureka");
        StringBuilder newString = s1.append("!!!");
        System.out.println(newString);
        System.out.println(newString.reverse());

    }
}
