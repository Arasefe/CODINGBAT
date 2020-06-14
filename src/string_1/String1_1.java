package string_1;

import java.util.Scanner;

public class String1_1 {
    public static void main(String[] args) {
       String str="";
        String result = "";
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the string");
        str=input.next();
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1)) {
                str = str.substring(1, str.length() - 1);
                System.out.println(str);
                break;
            }
            if (str.charAt(i) != str.charAt(str.length() - 1) && str.charAt(i) == 'x') {
                str = str.substring(1, str.length());
                System.out.println(str);
                break;
            }
            if (str.charAt(i) != str.charAt(str.length() - 1) && str.charAt(i) != 'x'){
                str = str.substring(0, str.length() - 1);
                System.out.println(str);
                break;
            }
            System.out.println(str);
        }
        System.out.println(result);
    }
}
