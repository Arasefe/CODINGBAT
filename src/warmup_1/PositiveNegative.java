package warmup_1;

public class PositiveNegative {
    public static void main(String[] args) {
        System.out.println(posNeg(-34,-4566,false));
    }
    public static boolean posNeg(int a, int b, boolean negative) {
        if (a<0 && b>0 && negative==false){
            return true;
        }
        if (a<0 && b<0 && negative==true){
            return true;
        }
        if (a>0 && b<0 && negative==false){
            return true;
        }
        else{
            return false;
        }

    }

}
