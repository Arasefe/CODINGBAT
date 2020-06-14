package warmup_1;

import jdk.swing.interop.SwingInterOpUtils;

public class BackAround {
    public static void main(String[] args) {
        System.out.println(backAround("Java OCA"));
    }
    public static String backAround(String str) {
        if (str.length()>=1){
            String last=str.substring(str.length()-1);
            return last+str+last;

        }
        return "";
    }

}
