package warmup_1;

public class In1020 {
    public static void main(String[] args) {
        System.out.println(in1020(12,21));
    }
    public static boolean in1020(int a, int b) {
        if (((a>=10) && (a<=20) || ((b>=10) && (b<=20)))){
            return true;

        }
        else{
            return false;
        }
    }
}
