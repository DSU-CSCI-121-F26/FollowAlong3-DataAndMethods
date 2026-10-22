package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        starts at about 2:27:54 — stop at about 2:39:30, when he says "those are methods"
// Guide: GUIDE.md in this folder, steps 1–11
//
// Part 13 — methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Methods.
//    Leave the "package part13;" line and the "public class Methods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Methods {
    public static void main(String[] args) {
        String name = "Bro";
        int age = 21;
        hello(name, age);
        int x =3;
        int y = 4;
        int z = add(x,y);
        System.out.println(z);
        System.out.println(add(x,y));

    }
    static void hello(String title, int age) {
        System.out.println("Hello " + title);
        System.out.println("You are "+ age);
    }
    static int add(int x, int y) {
       return x+y;
    }

}
