package warmup_1;

public class StartHi {
    public static void main(String[] args) {
        System.out.println(startHi("Erkan Kosan bir totos mu?"));
    }
    public static boolean startHi(String str) {
        if(str.startsWith("hi")){
            return true;
        }
        else{
            return false;
        }
    }

}
