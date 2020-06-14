package warmup_1;

public class SleepIn {
    public static void main(String[] args) {
        System.out.println(sleepIn(false,false));
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        // boolean result=!weekday &&! vacation;
        // boolean result1=weekday &&! vacation;
        // boolean result3=!weekday && vacation;
        if(!weekday||vacation){
            return true;
        }
        return false;
    }

}
