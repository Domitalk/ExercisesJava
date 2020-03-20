public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println("Test 1 should return true");
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println("Test 2 should return false");
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println("Test 3 should return true");
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println("Test 4 should return false");
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));


    }

    public static boolean areEqualByThreeDecimalPlaces(double firstArg, double secondArg) {
//        TIP: Use paper and pencil.
//        TIP: Use casting.

        return true;
    }
}
