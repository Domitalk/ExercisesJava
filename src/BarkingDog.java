public class BarkingDog {

    public static void main (String[] args) {

        System.out.println("Test 1 should return true");
        System.out.println(shouldWakeUp(true, 1));

        System.out.println("Test 2 should return false");
        System.out.println(shouldWakeUp(false, 2));

        System.out.println("Test 3 should return false");
        System.out.println(shouldWakeUp(true, 8));

        System.out.println("Test 4 should return false");
        System.out.println(shouldWakeUp(true, -1));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // hour of day should be between 0-23
        // if dog is barking && hour is before 8 || after 22 return true
        // else return false
        // if hour of day is less than 0 || greater than 23 return false

    }
}
