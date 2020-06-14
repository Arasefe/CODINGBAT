package warmup_1;

public class MissingChar {
    public static void main(String[] args) {
        System.out.println(missingChar("Too many cooks spoil the broth",12));
    }
    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);

        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(n+1, str.length());

        return front + back;
    }

}
