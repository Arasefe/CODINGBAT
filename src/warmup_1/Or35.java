package warmup_1;

public class Or35 {
    public static void main(String[] args) {
        System.out.println(or35(8));
    }
    public static boolean or35(int n) {
        if (n%3==0||n%5==0){
            return true;
        }
        else{
            return false;
        }
    }

}
