package warmup_1;

public class IcyHot {
    public static void main(String[] args) {
        System.out.println(icyHot(98,99));
    }
    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1>100) && (temp2<0)){
            return true;
        }
        if ((temp1<0) && (temp2>100)){
            return true;
        }
        else{
            return false;
        }
    }
}
