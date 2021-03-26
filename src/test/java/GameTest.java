import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(output));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(stdout);
    }

    @Test
    void p1win_1() {
        Game.runGame("paper", "rock");
        assertEquals("Player 1 win!\r\n", output.toString());
    }

    @Test
    void p1win_2() {
        Game.runGame("rock", "scissors");
        assertEquals("Player 1 win!\r\n", output.toString());
    }

    @Test
    void p1win_3() {
        Game.runGame("scissors", "paper");
        assertEquals("Player 1 win!\r\n", output.toString());
    }

    @Test
    void p2win_1() {
        Game.runGame("scissors", "rock");
        assertEquals("Player 2 win!\r\n", output.toString());
    }
    @Test
    void p2win_2() {
        Game.runGame("rock", "paper");
        assertEquals("Player 2 win!\r\n", output.toString());
    }
    @Test
    void p2win_3() {
        Game.runGame("paper", "scissors");
        assertEquals("Player 2 win!\r\n", output.toString());
    }

    @Test
    void draw_1() {
        Game.runGame("scissors", "scissors");
        assertEquals("Draw!\r\n", output.toString());
    }

    @Test
    void draw_2() {
        Game.runGame("rock", "rock");
        assertEquals("Draw!\r\n", output.toString());
    }

    @Test
    void draw_3() {
        Game.runGame("paper", "paper");
        assertEquals("Draw!\r\n", output.toString());
    }

    @Test
    void invalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            Game.checkValid("ggg");
        });
    }
}