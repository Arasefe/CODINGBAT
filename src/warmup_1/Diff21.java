package warmup_1;

public class Diff21 {
    public static void main(String[] args) {
        System.out.println(diff21(231));

    }
    public static int diff21(int n) {
        if (n<=21)
            return 21-n;
        else
            return 2*(n-21);

    }

}
