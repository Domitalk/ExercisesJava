public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println("toMilesPerHour(1.5); → should return value 1");
        System.out.println(toMilesPerHour(1.5));

        System.out.println("toMilesPerHour(10.25); → should return value 6");
        System.out.println(toMilesPerHour(10.25));

        System.out.println("printConversion(1.5); → should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h");
        printConversion(1.5);

        System.out.println("printConversion(10.25); → should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h");
        printConversion(10.25);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        double mph = kilometersPerHour / 1.609;
        return Math.round(mph);
    }

    public static void printConversion(double kilometersPerHour) {
        long mph = toMilesPerHour(kilometersPerHour);
        if (mph == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
        }
    }
}
