public class SimpleArray {
    public static void main (String[] args) {
        String[] favouriteAnimals = new String[] {"kot", "szop", "wombat", "opos", "kapibara", "panda mała"};
        String animal = favouriteAnimals[3];
        int numberOfElements = favouriteAnimals.length;

        System.out.println("Trzecie ulubione zwierzę to " + animal);
        System.out.println("Tablica ma " + numberOfElements + " elementów");


    }
}
