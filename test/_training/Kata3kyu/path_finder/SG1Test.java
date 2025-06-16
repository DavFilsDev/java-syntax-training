package _training.Kata3kyu.path_finder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SG1Test {

    @Test
    public void testExampleWithValidPath() {
        String input = String.join("\n",
                ".S...",
                "XXX..",
                ".X.XX",
                "..X..",
                "G...X"
        );

        String output = SG1.wireDHD(input);

        assertTrue(output.contains("P"), "Expected path markers (P) in output");
        assertTrue(output.contains("S") && output.contains("G"), "Start and goal must be preserved");
        assertFalse(output.contains("Oh for crying out loud..."), "Should not return failure message");
    }

    @Test
    public void testExampleWithNoSolution() {
        String input = String.join("\n",
                "S....",
                "XX...",
                "...XX",
                ".XXX.",
                "XX..G"
        );

        String output = SG1.wireDHD(input);

        assertEquals("Oh for crying out loud...", output, "Should return failure message when no path exists");
    }

    @Test
    public void testTinyMap3x3Diagonal() {
        String input = String.join("\n",
                "S.X",
                ".X.",
                "X.G"
        );

        String output = SG1.wireDHD(input);

        assertTrue(output.contains("P") || output.equals("Oh for crying out loud..."),
                "Should return path with P or failure message if blocked");
    }

    @Test
    public void testPreserveSAndG() {
        String input = String.join("\n",
                "S...",
                "....",
                "...G"
        );

        String output = SG1.wireDHD(input);

        assertTrue(output.startsWith("S"), "S must not be replaced");
        assertTrue(output.contains("G"), "G must not be replaced");
        assertTrue(output.contains("P"), "There should be a path from S to G");
    }
}
