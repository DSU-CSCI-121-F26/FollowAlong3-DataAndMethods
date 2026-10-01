package part12;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        (this part's lesson starts here — GUIDE.md has it written out)

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".

class ChallengeTest {

    // A quick way to make an ArrayList with numbers already in it.
    private static ArrayList<Integer> list(Integer... values) {
        return new ArrayList<>(List.of(values));
    }

    // ---- countEvens ----

    @Test
    void countEvensMixed() {
        assertEquals(3, Challenge.countEvens(list(2, 1, 2, 3, 4)));
    }

    @Test
    void countEvensAllEven() {
        assertEquals(3, Challenge.countEvens(list(2, 4, 6)));
    }

    @Test
    void countEvensNoneEven() {
        assertEquals(0, Challenge.countEvens(list(1, 3, 5)));
    }

    @Test
    void countEvensEmptyList() {
        assertEquals(0, Challenge.countEvens(list()));
    }

    @Test
    void countEvensZeroAndNegatives() {
        assertEquals(3, Challenge.countEvens(list(0, -2, -3, -4)));
    }

    // ---- spread ----

    @Test
    void spreadMixed() {
        assertEquals(7, Challenge.spread(list(3, 9, 2, 5)));
    }

    @Test
    void spreadOneNumber() {
        assertEquals(0, Challenge.spread(list(42)));
    }

    @Test
    void spreadAllSame() {
        assertEquals(0, Challenge.spread(list(5, 5, 5)));
    }

    @Test
    void spreadWithNegatives() {
        assertEquals(15, Challenge.spread(list(-5, 10, 0)));
    }

    @Test
    void spreadBiggestFirst() {
        assertEquals(90, Challenge.spread(list(100, 50, 10)));
    }
}
