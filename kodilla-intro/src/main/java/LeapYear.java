public class LeapYear {
    public static void main (String[] args){
        int year = 2000;
        boolean isLeap = checkYear(year);

        System.out.println(year);

        if (isLeap == true) {
            System.out.println("Rok przestępny");
        } else {
            System.out.println("Rok nie jest przestępny");
        }
    }

    private static boolean checkYear (int a) {
        boolean result; //should it be undefined or is it better to do boolean result = true; and overwrite in if/else?

        if (a % 4 != 0) {
            result = false;
        } else if (a % 100 != 0) {
            result = true;
        } else if (a % 400 != 0) {
            result = false;
        } else {
            result = true;
        }

        return result;
    }
}
