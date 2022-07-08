import java.util.Random;

public class Loops {
    public static void main (String[] args) {
        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        int[] numbers = new int[] {1, 3, 5, 7};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println();
        System.out.println("Suma elementów tablicy to " + sumArray(numbers)); // does not work until sumArray() set to static
        System.out.println();
        System.out.println("Liczba losowań dla sumy 20 to " + getCountOfRandomNumber(20)); // had to add import java.util.Random;
    }


    public static int sumArray(int digits[]) {
        int sum = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            sum = sum + digits[i];
        }
        return sum;
    }

    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }

}
