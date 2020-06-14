package warmup_1;

public class SumDouble {
    public static void main(String[] args) {
        System.out.println(sumDouble(12,234));
    }
    public static int sumDouble(int a, int b) {
        if (a!=b){
            return a+b;
        }
        else {
            return 2*(a+b);
        }
    }

}
