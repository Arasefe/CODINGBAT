package warmup_1;

public class ParrotTrouble {
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 4));
    }

    public static boolean parrotTrouble(boolean talking, int hour) {

        return (talking && (hour > 20 || hour < 7));

    }

}
