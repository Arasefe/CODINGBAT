package warmup_1;

public class NotString {
    public static void main(String[] args) {
        System.out.println(notString("candy"));
    }
    public static String notString(String str) {
        if (!str.startsWith("not")){
            return "not "+str;
        }else {
            return str;
        }
    }

}
