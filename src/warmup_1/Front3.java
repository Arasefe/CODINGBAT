package warmup_1;

public class Front3 {
    public static void main(String[] args) {
        System.out.println(front3("Soft Skills"));
    }
    public static String front3(String str) {
        if (str.length()<1){
            return "";
        }
        if (str.length()<2){
            return (str.substring(0,1))+(str.substring(0,1))+(str.substring(0,1));
        }
        if(str.length()>=3){
            return (str.substring(0,3))+(str.substring(0,3))+(str.substring(0,3));
        }
        if (str.length()<3){
            return (str.substring(0,2))+(str.substring(0,2))+(str.substring(0,2));
        }
        return "";
    }
}
