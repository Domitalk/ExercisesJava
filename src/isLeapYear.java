public class isLeapYear {
    public static void main(String[] args) {
        System.out.println("Test 1 is false ");
        System.out.println(isItLeapYear(-1600));
        System.out.println("Test 2 is true");
        System.out.println(isItLeapYear(1600));
        System.out.println("Test 3 is false");
        System.out.println(isItLeapYear(2017));
        System.out.println("Test 4 is true");
        System.out.println(2000);


    }

    public static boolean isItLeapYear(int year) {
        // change this to isLeapYear for the exercise to pass
        // year must be >= 1 && <= 9999
        // check number datatype
        // else return false
        // if valid, calculate if the year is leap year and return true if it is
        // else return false

//        1. If the year is evenly divisible by 4, go to step
//        2. Otherwise, go to step 5.2. If the year is evenly divisible by 100, go to step
//        3. Otherwise, go to step 4.3. If the year is evenly divisible by 400, go to step
//        4. Otherwise, go to step 5.4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
//        5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

//        The following years are not leap years:
//        1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
//        This is because they are evenly divisible by 100 but not by 400.

//        The following years are leap years:
//        1600, 2000, 2400
//        This is because they are evenly divisible by both 100 and 400.

        return true;
    }
}
