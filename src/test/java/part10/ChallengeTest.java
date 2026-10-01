package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6222s
//        (this part's lesson starts here — GUIDE.md has it written out)

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".

class ChallengeTest {

    // ----- endsWith -----

    @Test
    void endsWithFirstMatches() {
        assertTrue(Challenge.endsWith(new int[] {7, 2, 3}, 7));
    }

    @Test
    void endsWithLastMatches() {
        assertTrue(Challenge.endsWith(new int[] {1, 2, 9}, 9));
    }

    @Test
    void endsWithOnlyMiddleMatchesIsFalse() {
        assertFalse(Challenge.endsWith(new int[] {1, 5, 3}, 5));
    }

    @Test
    void endsWithNoMatchIsFalse() {
        assertFalse(Challenge.endsWith(new int[] {4, 4, 4}, 6));
    }

    @Test
    void endsWithOneElementMatches() {
        assertTrue(Challenge.endsWith(new int[] {8}, 8));
    }

    @Test
    void endsWithLongerArrayLastMatches() {
        assertTrue(Challenge.endsWith(new int[] {0, 1, 2, 3, 4, 5, 6}, 6));
    }

    // ----- total -----

    @Test
    void totalOneTwoThree() {
        assertEquals(6, Challenge.total(new int[] {1, 2, 3}));
    }

    @Test
    void totalOneElement() {
        assertEquals(10, Challenge.total(new int[] {10}));
    }

    @Test
    void totalEmptyArrayIsZero() {
        assertEquals(0, Challenge.total(new int[] {}));
    }

    @Test
    void totalWithNegatives() {
        assertEquals(2, Challenge.total(new int[] {5, -4, 1}));
    }

    @Test
    void totalFiveScores() {
        assertEquals(419, Challenge.total(new int[] {88, 92, 75, 100, 64}));
    }
}
