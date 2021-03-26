import java.util.Scanner;

public class Game {
    public static void runGame(String c1, String c2) {
        int win = 0;
        if (c1.equals("rock") && c2.equals("rock")) win=0;
        else if (c1.equals("rock") && c2.equals("paper")) win=2;
        else if (c1.equals("rock") && c2.equals("scissors")) win=1;
        else if (c1.equals("paper") && c2.equals("rock")) win=1;
        else if (c1.equals("paper") && c2.equals("paper")) win=0;
        else if (c1.equals("paper") && c2.equals("scissors")) win=2;
        else if (c1.equals("scissors") && c2.equals("rock")) win=2;
        else if (c1.equals("scissors") && c2.equals("paper")) win=1;
        else if (c1.equals("scissors") && c2.equals("scissors")) win=0;

        if (win != 0) System.out.printf("Player %d win!\r\n", win);
        else System.out.println("Draw!");
    }

    public static void checkValid(String s) {
        if (!s.equals("rock") && !s.equals("paper") && !s.equals("scissors")) {
            throw new java.lang.IllegalArgumentException("Bad Choice!");
        }
    }
}
