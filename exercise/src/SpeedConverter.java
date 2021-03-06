public class SpeedConverter {

    public static void main(String[] args) {
        toMilesPerHour(25.0);
        printConversion(25.0);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            return Math.round(kilometersPerHour / 1.609);
        } else {
            return -1;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");

        } else {
            System.out.println("Invalid Value");
        }
    }
}
