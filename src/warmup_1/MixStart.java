package warmup_1;

public class MixStart {
    public static void main(String[] args) {
        System.out.println(mixStart("Mix snacks"));
    }
    public static boolean mixStart(String str) {
        if (str.length()>=3 && str.substring(1,3).equals("ix")){
            return true;
        }
        else {
            return false;
        }
    }

}
