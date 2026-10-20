package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7467s
//        starts at about 2:04:27 — stop at about 2:11:35, when he says "that's the basics of wrapper classes"
// Guide: GUIDE.md in this folder, steps 11–15
//
// Part 11 — wrapper classes
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WrapperClasses.
//    Leave the "package part11;" line and the "public class WrapperClasses" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class WrapperClasses {
    public static void main(String[] args) {
                // Declare a Boolean wrapper class variable and assign it the value true[span_4](start_span)[span_4](end_span)
                Boolean a = true;

                // Check if the wrapper object 'a' equals true explicitly using standard comparison
                if (a == true) {
                    // Print out the confirmation text if the condition is met[span_5](start_span)[span_5](end_span)
                    System.out.println("This is true");
                }

                // Check the boolean wrapper variable directly in the condition via unboxing
                if (a) {
                    // Print out the confirmation text if the unboxed value is true[span_6](start_span)[span_6](end_span)
                    System.out.println("This is true");
                }
            }
        }


