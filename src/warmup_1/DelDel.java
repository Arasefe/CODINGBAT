package warmup_1;

public class DelDel {
    /*
    Given a string, if the string "del" appears starting at index 1,
    return a string where that "del" has been deleted.
    Otherwise, return the string unchanged.
     */
    public static void main(String[] args) {
        System.out.println(delDel("hello"));
    }
    public static String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            // First char + rest of string starting at 4
            return str.substring(0, 1) + str.substring(4);
        }
        // Otherwise return the original string.
        return str;
    }
}
