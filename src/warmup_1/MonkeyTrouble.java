package warmup_1;

public class MonkeyTrouble {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(false, true));
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || !aSmile && !bSmile) {
            return true;

        }
        return false;
    }

}
