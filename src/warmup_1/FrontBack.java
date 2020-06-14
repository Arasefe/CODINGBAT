package warmup_1;

public class FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("Asylum Seeker"));
    }
    public static String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }


}
