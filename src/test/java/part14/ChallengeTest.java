package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s
//        (this part's lesson starts here — GUIDE.md has it written out)

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".

class ChallengeTest {

    @Test
    void tagBold() {
        assertEquals("<b>hi</b>", Challenge.tag("b", "hi"));
    }

    @Test
    void tagItalic() {
        assertEquals("<i>Yay</i>", Challenge.tag("i", "Yay"));
    }

    @Test
    void tagLongName() {
        assertEquals("<h1>Menu</h1>", Challenge.tag("h1", "Menu"));
    }

    @Test
    void tagEmptyText() {
        assertEquals("<p></p>", Challenge.tag("p", ""));
    }

    @Test
    void tagOneInputUsesB() {
        assertEquals("<b>hi</b>", Challenge.tag("hi"));
    }

    @Test
    void tagOneInputAnotherWord() {
        assertEquals("<b>Wow</b>", Challenge.tag("Wow"));
    }

    @Test
    void moneyOneDecimal() {
        assertEquals("$3.50", Challenge.money(3.5));
    }

    @Test
    void moneyZero() {
        assertEquals("$0.00", Challenge.money(0));
    }

    @Test
    void moneyWholeNumber() {
        assertEquals("$2.00", Challenge.money(2));
    }

    @Test
    void moneyRoundsUp() {
        assertEquals("$20.00", Challenge.money(19.999));
    }

    @Test
    void moneyRoundsToTwoDigits() {
        assertEquals("$1234.57", Challenge.money(1234.567));
    }
}
