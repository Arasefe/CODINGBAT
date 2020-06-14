package warmup_1;

public class LastDigit {
    /*
    Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
    Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
     */
    public static void main(String[] args) {
        System.out.println(lastDigit(7,123));
    }
    public static boolean lastDigit(int a, int b) {
        if (b>a){
            boolean result1= b%10==a;
            return result1;

        }
        if (a>b){
            boolean result3=a%10==b;
            return result3;
        }
        else {
            boolean result2= b%10!=a;
            return result2;
        }
    }
}
