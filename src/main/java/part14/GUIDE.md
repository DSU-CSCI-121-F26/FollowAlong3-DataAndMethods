# Part 14 Guide — Overloaded methods and printf

**The video, written out step by step.**

This page teaches the same thing as the video in two parts:

- **Video 1 — Overloaded methods**, from about **2:40:18 to 2:45:29**. Type it in
  `OverloadedMethods.java`.
- **Video 2 — printf**, from about **2:45:54 to 2:56:50**. Type it in `Printf.java`.

You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line yourself.** Do not copy and paste from this page.
Each step has a time, like **(video 2:41:34)**, if you want to see him do it.

---

# Video 1 — Overloaded methods

## Step A1 — What is an overloaded method? (video 2:40:33)

**Overloaded methods** are methods that share the **same name** but have **different
parameters**. (Parameters are the inputs listed in the method's parentheses.)

Java allows this because every method needs its own **method signature**. A signature is:

> the method's **name** + its **list of parameters**

So two methods can share a name, as long as their parameters are different.

Open `part14/OverloadedMethods.java`. Inside the class, type an empty `main` first:

```java
    public static void main(String[] args) {

    }
```

## Step A2 — Your first `add` method (video 2:41:00)

Methods go **inside the class** but **outside `main`**. Click **below** `main`'s closing
`}`, but still **above** the class's last `}`. Type:

```java
    static int add(int a, int b) {
        return a + b;
    }
```

- `static` — `main` can call it directly. (You learn more about `static` in part 19.)
- `int` — this method gives back an `int`.
- `add` — the method's name.
- `(int a, int b)` — it takes two `int`s, called `a` and `b`.
- `return a + b;` — it gives back their sum.

## Step A3 — The same signature twice does not work (video 2:41:34)

Now try making a second `add` with the **exact same** inputs. Type it under the first one:

```java
    static int add(int a, int b) {
        return a + b;
    }
```

IntelliJ underlines it in red. The error is:

```
error: method add(int,int) is already defined in class OverloadedMethods
```

Both methods have the name `add` **and** the inputs `(int, int)`. Same signature. Java
cannot tell them apart.

There are two ways to fix it:

1. Give it a different name. That works, but then it is not overloading anymore.
2. **Give it different parameters.** That is what he does.

Change the second one so it takes **three** numbers:

```java
    static int add(int a, int b, int c) {
        return a + b + c;
    }
```

The red line goes away. Then add a **third** version that takes **four** numbers:

```java
    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
```

## Step A4 — Make each one say which it is (video 2:42:34)

To see which `add` runs, put a print line at the **top** of each one, before the `return`.
The first one:

```java
    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }
```

Do the same in the second one (`#2`) and the third one (`#3`). He copies and pastes the line.
**You type it** each time.

## Step A5 — Call `add` with the wrong number of inputs (video 2:43:07)

Inside `main`, type:

```java
        int x = add(1);
```

Red underline. The error is:

```
error: no suitable method found for add(int)
```

There is no `add` that takes **one** `int`. You can pass **two, three or four** `int`s, but
not one. Delete that line.

## Step A6 — Call each version (video 2:43:20)

Inside `main`, type:

```java
        int x = add(1, 2);
        System.out.println(x);
```

**Run it.** Output:

```
This is overloaded method #1
3
```

Java looked at what you passed in (two `int`s) and picked the version that takes two `int`s.

Now he changes the call to pass **three** numbers, then **four**. To see all three at once,
add these lines under the first two:

```java
        int y = add(1, 2, 3);
        System.out.println(y);
        int z = add(1, 2, 3, 4);
        System.out.println(z);
```

**Run it.** Output:

```
This is overloaded method #1
3
This is overloaded method #2
6
This is overloaded method #3
10
```

## Step A7 — Different types count too (video 2:44:15)

Java looks at **how many** inputs there are, and also **what type** they are. So you can
have more `add` methods that take `double`s.

Below your three `int` versions, type three **`double`** versions. Change **every** `int`
to `double`, including the return type, and number them #4, #5 and #6:

```java
    static double add(double a, double b) {
        System.out.println("This is overloaded method #4");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method #5");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method #6");
        return a + b + c + d;
    }
```

Now call one of them. The answer is a `double`, so store it in a `double`. Add this to the
bottom of `main`:

```java
        double d = add(1.0, 2.0, 3.0, 4.0);
        System.out.println(d);
```

**Before you run it:** which number will it print, #4, #5 or #6?

**Run it.** The last two lines of the output:

```
This is overloaded method #6
10.0
```

Four `double`s, so Java picks #6, the one that takes four `double`s.

## Summary of Video 1 (video 2:45:07)

- Overloaded methods share a **name** but have **different parameters**.
- Java chooses which one to run by looking at the **number** of inputs, their **types**,
  and their **order**.
- Two methods with the same name **and** the same parameters is an error.

<details>
<summary>Click to compare your finished OverloadedMethods.java</summary>

```java
package part14;

// (the comments at the top of your file)

public class OverloadedMethods {
    public static void main(String[] args) {
        int x = add(1, 2);
        System.out.println(x);
        int y = add(1, 2, 3);
        System.out.println(y);
        int z = add(1, 2, 3, 4);
        System.out.println(z);
        double d = add(1.0, 2.0, 3.0, 4.0);
        System.out.println(d);
    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }

    static double add(double a, double b) {
        System.out.println("This is overloaded method #4");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method #5");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method #6");
        return a + b + c + d;
    }
}
```

Output:

```
This is overloaded method #1
3
This is overloaded method #2
6
This is overloaded method #3
10
This is overloaded method #6
10.0
```

</details>

---

# Video 2 — printf

## Step B1 — What printf does (video 2:46:11)

`printf` is another way to print, like `print` and `println`. It lets you **control the
format**: how many spaces, how many decimal places, and more.

`printf` needs at least **two things** in its parentheses, separated by a comma:

1. A **format string**: the text you want to print, with **spots** marked by `%`.
2. A **value** to put in the spot.

Open `part14/Printf.java`. Type `main`, and inside it, type:

```java
        System.out.printf("This is a format string %d\n", 123);
```

**Run it.** Output:

```
This is a format string 123
```

The `%d` is a **format specifier**. It marks the spot. Java **replaces it** with `123`.

**Important:** `printf` is like `print`, not `println`. It does **not** go to a new line by
itself. That is why the format string ends with `\n` (from part 01). **He does not always add
`\n`. You should**, on every `printf` in this part, so each result is on its own line.

Try moving `%d` to the **start** of the text: `"%d This is a format string\n"`. Now `123`
prints at the start. The value goes wherever the `%` spot is.

Delete that line when you are done trying it.

## Step B2 — Make five variables (video 2:49:15)

To try different types, he makes one variable of each. Type these inside `main`:

```java
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;
```

You can pick your own `char` and put **your name** in `myString`.

## Step B3 — Conversion characters (video 2:48:45)

The letter after `%` is called a **conversion character**. It must **match the type** of
the value:

| Letter | Type | Think of it as |
|---|---|---|
| `%b` | `boolean` | **b**oolean |
| `%c` | `char` | **c**haracter |
| `%s` | `String` | **s**tring |
| `%d` | `int` | **d**ecimal (a whole number) |
| `%f` | `double` | **f**loating point (a number with a decimal point) |

Type one `printf` for each:

```java
        System.out.printf("%b\n", myBoolean);
        System.out.printf("%c\n", myChar);
        System.out.printf("%s\n", myString);
        System.out.printf("%d\n", myInt);
        System.out.printf("%f\n", myDouble);
```

**Run it.** Output:

```
true
@
Bro
50
1000.000000
```

`%f` shows **six** digits after the decimal point unless you say otherwise. You fix that in
Step B5.

**What if the letter does not match?** Try `%d` with `myDouble`:

```java
        System.out.printf("%d\n", myDouble);
```

It compiles, but when you run it, the program crashes:

```
Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.Double
```

That means: "`%d` is for whole numbers, but you gave me a `Double`." Delete that line.

## Step B4 — Width (video 2:51:30)

A number **between `%` and the letter** sets the **width**: the **minimum** number of
characters to print. Type:

```java
        System.out.printf("Hello %10s\n", myString);
```

**Run it.** Output:

```
Hello        Bro
```

`Bro` gets 10 characters of room: 7 spaces, then the 3 letters. The text is pushed to the
**right**.

A **minus sign** pushes it to the **left** instead. Type this one too. The `!` at the end is
only there so you can **see** where the spaces are:

```java
        System.out.printf("Hello %-10s!\n", myString);
```

Output:

```
Hello Bro       !
```

## Step B5 — Precision (video 2:53:13)

For `double`s, a **dot and a number** before the `f` sets how many digits come after the
decimal point. Type:

```java
        System.out.printf("You have this much money %f\n", myDouble);
        System.out.printf("You have this much money %.2f\n", myDouble);
        System.out.printf("You have this much money %.1f\n", myDouble);
```

**Run it.** Output:

```
You have this much money 1000.000000
You have this much money 1000.00
You have this much money 1000.0
```

`%.2f` is the one you use for money: exactly two digits, for cents.

## Step B6 — Flags (video 2:54:29)

**Flags** are symbols right after the `%`. Each one adds an effect:

| Flag | What it does |
|---|---|
| `-` | left side (left-justify) |
| `+` | always show a `+` or `-` sign |
| `0` | fill the empty space with zeros |
| `,` | put a comma every three digits |

Type these one at a time, and run after each:

```java
        System.out.printf("You have this much money %-20f!\n", myDouble);
        System.out.printf("You have this much money %20f!\n", myDouble);
        System.out.printf("You have this much money %+f\n", myDouble);
        System.out.printf("You have this much money %+f\n", -myDouble);
        System.out.printf("You have this much money %020f\n", myDouble);
        System.out.printf("You have this much money %,f\n", myDouble);
```

Output:

```
You have this much money 1000.000000         !
You have this much money          1000.000000!
You have this much money +1000.000000
You have this much money -1000.000000
You have this much money 0000000001000.000000
You have this much money 1,000.000000
```

- **Lines 1–2:** a width of 20. With `-` the number sits on the **left**. Without it, the
  number sits on the **right**. Right side is useful for lining up a column of numbers.
- **Lines 3–4:** `+` shows the sign. `-myDouble` is negative 1000, so it shows `-`.
- **Line 5:** `0` with a width of 20 fills the empty space with zeros.
- **Line 6:** `,` adds a comma at the thousands place.

## Summary of Video 2 (video 2:56:05)

A format specifier is built like this, from left to right:

```
%  [flags]  [width]  [.precision]  conversion-letter
```

For example, `%,10.2f` means: commas, at least 10 characters wide, 2 digits after the point,
a `double`. You can try it.

<details>
<summary>Click to compare your finished Printf.java</summary>

```java
package part14;

// (the comments at the top of your file)

public class Printf {
    public static void main(String[] args) {
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("%b\n", myBoolean);
        System.out.printf("%c\n", myChar);
        System.out.printf("%s\n", myString);
        System.out.printf("%d\n", myInt);
        System.out.printf("%f\n", myDouble);

        System.out.printf("Hello %10s\n", myString);
        System.out.printf("Hello %-10s!\n", myString);

        System.out.printf("You have this much money %f\n", myDouble);
        System.out.printf("You have this much money %.2f\n", myDouble);
        System.out.printf("You have this much money %.1f\n", myDouble);

        System.out.printf("You have this much money %-20f!\n", myDouble);
        System.out.printf("You have this much money %20f!\n", myDouble);
        System.out.printf("You have this much money %+f\n", myDouble);
        System.out.printf("You have this much money %+f\n", -myDouble);
        System.out.printf("You have this much money %020f\n", myDouble);
        System.out.printf("You have this much money %,f\n", myDouble);
    }
}
```

Output:

```
true
@
Bro
50
1000.000000
Hello        Bro
Hello Bro       !
You have this much money 1000.000000
You have this much money 1000.00
You have this much money 1000.0
You have this much money 1000.000000         !
You have this much money          1000.000000!
You have this much money +1000.000000
You have this much money -1000.000000
You have this much money 0000000001000.000000
You have this much money 1,000.000000
```

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B: put a
comment above every line, **in your own words**. Do not copy the explanations from this
guide.
