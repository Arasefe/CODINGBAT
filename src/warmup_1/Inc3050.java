package warmup_1;

public class Inc3050 {
    /*
    Given 2 int values, return true if they are both in the range 30..40 inclusive,
    or they are both in the range 40..50 inclusive.
     */
    public static void main(String[] args) {
        System.out.println(in3050(32,65));
    }
    public static boolean in3050(int a, int b) {
        if ((a>=30&&a<=40)&&(b>=30&&b<=40)||(a>=40&&a<=50)&&(b>=40&&b<=50)){
            return true;
        }
        else{
            return false;
        }
    }


}
