package string_2;

import java.util.Scanner;

public class DoubleChar {
    public static void main(String[] args) {
        /*
        Given a string, return a string where for every char in the original, there are two chars.
        doubleChar("The") → "TThhee"
        doubleChar("AAbb") → "AAAAbbbb"
        doubleChar("Hi-There") → "HHii--TThheerree"
         */
        String newStr="";
        Scanner input=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE STRING");
        String str=input.nextLine();
        for (int i=0;i<str.length();i++){
            newStr=newStr+str.charAt(i)+str.charAt(i);

        }
        System.out.println(newStr);
    }
}
