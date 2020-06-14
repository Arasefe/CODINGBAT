package string_2;

public class CountHi {
    public static void main(String[] args) {
        String str = "abc hi ho";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count += 1;
            }
            System.out.println(count);

        }
    }
}