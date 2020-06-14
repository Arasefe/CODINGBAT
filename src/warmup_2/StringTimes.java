package warmup_2;

public class StringTimes {
    /*
    Given a string and a non-negative int n,
    return a larger string that is n copies of the original string.
     */
    public static void main(String[] args) {
        System.out.println(stringTimes("Aras",3));
    }
    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;      // could use += here
        }
        return result;
    }

}
