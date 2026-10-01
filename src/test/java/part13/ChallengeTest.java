package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        (this part's lesson starts here — GUIDE.md has it written out)

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".

class ChallengeTest {

    // ---- sign ----

    @Test
    void signPositive() {
        assertEquals("positive", Challenge.sign(5));
    }

    @Test
    void signNegative() {
        assertEquals("negative", Challenge.sign(-3));
    }

    @Test
    void signZero() {
        assertEquals("zero", Challenge.sign(0));
    }

    @Test
    void signOne() {
        assertEquals("positive", Challenge.sign(1));
    }

    @Test
    void signMinusOne() {
        assertEquals("negative", Challenge.sign(-1));
    }

    // ---- closerTo10 ----

    @Test
    void closerTo10FirstWins() {
        assertEquals(8, Challenge.closerTo10(8, 13));
    }

    @Test
    void closerTo10SecondWins() {
        assertEquals(8, Challenge.closerTo10(13, 8));
    }

    @Test
    void closerTo10Tie() {
        assertEquals(0, Challenge.closerTo10(8, 12));
    }

    @Test
    void closerTo10BothTen() {
        assertEquals(0, Challenge.closerTo10(10, 10));
    }

    @Test
    void closerTo10Negative() {
        assertEquals(20, Challenge.closerTo10(-5, 20));
    }

    @Test
    void closerTo10ExactlyTen() {
        assertEquals(10, Challenge.closerTo10(10, 9));
    }
}
