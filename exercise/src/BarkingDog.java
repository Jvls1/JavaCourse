public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 19);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean validHour = hourOfDay <= 23 && hourOfDay >= 0;
        if(validHour){
            return barking && hourOfDay < 8 || hourOfDay > 22;
        }else{
            return false;
        }
    }
}