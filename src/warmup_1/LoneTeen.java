package warmup_1;

public class LoneTeen {
    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen, but not both.
     */
    public static void main(String[] args) {
        System.out.println(loneTeen(13,32));
    }
    public static boolean loneTeen(int a, int b) {
        boolean aTeen= (a<=19 && a>=13);
        boolean bTeen= (b<=19 && b>=13);
        return (aTeen && !bTeen) ||(!aTeen&&bTeen);
    }

}
