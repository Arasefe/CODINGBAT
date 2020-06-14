package warmup_1;

public class Max1020 {
    /*
    Given 2 positive int values, return the larger value
    that is in the range 10..20 inclusive, or return 0 if neither is in that range.
     */
    public static void main(String[] args) {
        System.out.println(max1020(11,19));
    }
    public static int max1020(int a, int b) {
            if(a>=10 && a<=20 && b>=10 && b<=20 && a>b){
                return a;
            }else if(a>=10 && a<=20 && b>=10 && b<=20 && b>a){
                return b;
            }else if(a>=10 && a<=20){
                return a;
            }else if(b>=10 && b<=20){
                return b;
            }else{
                return 0;
            }
        }
    }

