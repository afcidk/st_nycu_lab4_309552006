import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to Rock-Paper-Scissors game ===");
        System.out.println("Enter Player 1 choice (rock, paper or scissors):");

        String c1 = sc.nextLine();
        Game.checkValid(c1);
        System.out.println("Enter Player 2 choice (rock, paper or scissors):");
        String c2 = sc.nextLine();
        Game.checkValid(c2);
    }
}
