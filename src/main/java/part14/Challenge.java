package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s
//        rewatch "overloaded methods" (about 2:40:18) and "printf" (about 2:45:54)
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Finish the THREE methods below. (tag has two versions. That is
// this part's topic: overloading.) Then run ChallengeTest until every test is green.
// Change only the lines marked YOUR CODE.

public class Challenge {

    // Wrap text in an HTML tag with the given name.
    // tag("b", "hi")     should return "<b>hi</b>"
    // tag("i", "Yay")    should return "<i>Yay</i>"
    // tag("h1", "Menu")  should return "<h1>Menu</h1>"
    public static String tag(String name, String text) {
        return "<" + name + ">" + text + "</" + name + ">";   // YOUR CODE
    }

    // The same name, but only ONE input. Always use the tag "b".
    // tag("hi")    should return "<b>hi</b>"
    // tag("Wow")   should return "<b>Wow</b>"
    public static String tag(String text) {
        return tag("b", text);   // YOUR CODE
    }

    // Turn a number into money: a dollar sign and exactly 2 digits after the point.
    // money(3.5)      should return "$3.50"
    // money(0)        should return "$0.00"
    // money(19.999)   should return "$20.00"
    // Hint: String.format works exactly like printf, but it RETURNS the text
    //       instead of printing it.
    public static String money(double amount) {
        return "$" + String.format("%.2f", amount);   // YOUR CODE
    }
}
//Completed at 10-27-2026
//Hardest part was the Stretch B2