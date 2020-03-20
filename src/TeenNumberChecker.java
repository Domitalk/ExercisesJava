public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println("Test 1 should return true");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println("Test 2 should return true");
        System.out.println(hasTeen(23, 15, 42));
        System.out.println("Test 3 should return false");
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("Test 4 should return false");
        System.out.println(isTeen(9));
        System.out.println("Test 5 should return true");
        System.out.println(isTeen(13));

    }
    public static boolean hasTeen(int firstArg, int secondArg, int thirdArg) {
        // should return true if one of the params is within the range of 13 - 19 inclusively
        // else return false
        return true;
    }

    public static boolean isTeen(int firstArg) {
        // same as above just with one arg... maybe piggyback off the other one
        return true;
    }
}
