package warmup_1;

public class Front22 {
    public static void main(String[] args) {
        System.out.println(front22("kitten"));
    }
    public static String front22(String str) {
        String result="";
        if (str.length()<2){
            return str+str+str;
        }
        if (str.length()<1){
            return "";
        }
        String add=str.substring(0,2);
        result=add+str+add;
        return result;
    }
}
