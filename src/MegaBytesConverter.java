public class MegaBytesConverter {
    public static void main(String[] args) {
        System.out.println("2500 KB = 2 MB and 452 KB");
        printMegaBytesAndKiloBytes(2500);

        System.out.println("Invalid Value because parameter is less than 0.");
        printMegaBytesAndKiloBytes(-1024);

        System.out.println("5000 KB = 4 MB and 904 KB");
        printMegaBytesAndKiloBytes(5000);
    }

//    TIP: Be extremely careful about spaces in the printed message.
//    TIP: Use the remainder operator
//    TIP: 1 MB = 1024 KB
//    NOTE: Do not set kilobytes parameter value inside your method.
//    NOTE: The solution will not be accepted if there are extra spaces.
//    NOTE: The printMegaBytesAndKiloBytes method  needs to be defined as public static like we have been doing so far in the course.
//    NOTE: Do not add a  main method to solution code.


    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
//        The method should not return anything (void) and it needs to calculate the megabytes
//        and remaining kilobytes from the kilobytes parameter.
//        Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
//        XX represents the original value kiloBytes.
//        YY represents the calculated megabytes.
//        ZZ represents the calculated remaining kilobytes.
//        For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"
//        If the parameter kiloBytes is less than 0 then print the text "Invalid Value".

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainderKB = kiloBytes % 1024;
            int megaBytes = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderKB + " KB");
        }

    }
}
