import java.util.Scanner;

public class Colors {
    enum ColorList {
        Aquamarine,
        Blue,
        Denim,
        Fuchsia,
        Green,
        Ivory,
        Magenta,
        Pink,
        Red,
        Tan,
        Ultramarine,
        White,
        Yellow,
        Unknown
    }
    enum Alphabet {
        A, B, C, D, E, F, G, H, I, J, K, L, M, N, P, O, Q, R, S, T, U, W, X, Y, Z;
    }

    public static void main(String[] args){
        Alphabet letter = Colors.getFirstCharacter();
        ColorList color = Colors.getColor(letter); // Question about good practice - is Colors.getColor(Colors.getFirstCharacter()) ok?
        Colors.displayColor(color);
    }


    public static void displayColor(ColorList color) {
        ColorList readColor = color;
        while (true) {
            if (readColor != ColorList.Unknown) {
                System.out.println("Color connected with your letter is: " + readColor);
                return;
            }
            System.out.println("We don't know any letter connected with your letter, please try again");
            Alphabet letter1 = Colors.getFirstCharacter(); //How to debug loop,when we need to scan value once again?
            readColor = Colors.getColor(letter1);
        }
    }

    public static ColorList getColor(Alphabet letter){
        switch(letter) {
            case A:
                return ColorList.Aquamarine;
            case B:
                return ColorList.Blue;
            case D:
                return ColorList.Denim;
            case F:
                return ColorList.Fuchsia;
            case G:
                return ColorList.Green;
            case I:
                return ColorList.Ivory;
            case M:
                return ColorList.Magenta;
            case P:
                return ColorList.Pink;
            case R:
                return ColorList.Red;
            case T:
                return ColorList.Tan;
            case U:
                return ColorList.Ultramarine;
            case W:
                return ColorList.White;
            case Y:
                return ColorList.Yellow;
            default:
                return ColorList.Unknown;
        }
    }

    public static Alphabet getFirstCharacter(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Provide 1 letter A-Z");
            String letter = scanner.nextLine().trim().toUpperCase();
            if (letter.matches("[A-Z]")){
                return Alphabet.valueOf(letter);
            }
            System.out.println("Invalid value, make sure you provide only 1 letter A-Z");
        }

    }
}
