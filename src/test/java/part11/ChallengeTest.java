package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7095s
//        (this part's lesson starts here — GUIDE.md has it written out)

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".

class ChallengeTest {

    // ---- initials ----

    @Test
    void initialsLowercaseNames() {
        assertEquals("J.S.", Challenge.initials("jordan", "smith"));
    }

    @Test
    void initialsCapitalizedNames() {
        assertEquals("A.L.", Challenge.initials("Ada", "Lovelace"));
    }

    @Test
    void initialsOneLetterNames() {
        assertEquals("A.B.", Challenge.initials("a", "b"));
    }

    @Test
    void initialsAllCaps() {
        assertEquals("B.C.", Challenge.initials("BRO", "CODE"));
    }

    // ---- swapEnds ----

    @Test
    void swapEndsFourLetters() {
        assertEquals("eodc", Challenge.swapEnds("code"));
    }

    @Test
    void swapEndsFiveLetters() {
        assertEquals("oellh", Challenge.swapEnds("hello"));
    }

    @Test
    void swapEndsTwoLetters() {
        assertEquals("ba", Challenge.swapEnds("ab"));
    }

    @Test
    void swapEndsOneLetter() {
        assertEquals("a", Challenge.swapEnds("a"));
    }

    @Test
    void swapEndsEmpty() {
        assertEquals("", Challenge.swapEnds(""));
    }

    @Test
    void swapEndsSameEnds() {
        assertEquals("racecar", Challenge.swapEnds("racecar"));
    }
}
