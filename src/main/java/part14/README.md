# Part 14 — Overloaded methods and printf

**We start this together in class · due before the next lecture · No AI**

In part 13 you learned to write your own methods. In this part you learn two new tricks: giving
**several methods the same name**, and printing numbers and text **in exactly the shape you
want**.

**What you learn:**

- **overloaded methods**: two or more methods with the **same name** but **different
  inputs**. Java picks the right one by looking at what you pass in.
- **method signature**: a method's name plus the list of its inputs. Every method in a class
  needs a different signature.
- **`printf`**: a way to print that lets you control spacing, decimal places, plus signs,
  zeros and commas.
- **format specifier**: a `%` followed by a letter, like `%d` or `%s`. It marks the spot
  where a value goes.

> **Before you start:** open any `.java` file. Click inside it. Type `Sys` and wait two
> seconds. If a list pops up, **stop.** Autocomplete is back on. Do
> [Part 00, step 4](https://github.com/DSU-CSCI-121-F26/FollowAlong1-Basics/blob/main/src/main/java/part00/README.md#step-4--turn-off-the-autocomplete-and-the-ai) again
> before you type anything else.

---

## How this part works

**In class, together:** we start Section A (follow along), and we do the **in-class
exercise** together.

**On your own:** you finish whatever we did not get to, then do Sections B, C and D.

## How this part is graded

This part has **four graded sections**. Each one is worth **25 points**.

| Section | File | Points | Your commit message |
|---|---|---|---|
| **A · Follow along** | `OverloadedMethods.java`, `Printf.java` | 25 | `part14 follow-along: overloaded methods and printf` |
| **B · Comments** | `OverloadedMethods.java`, `Printf.java` | 25 | `part14 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` | 25 | `part14 stretch: overloading and printf receipts` |
| **D · Challenge** | `Challenge.java` | 25 | `part14 challenge: tag and money` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part13/Stretch.java`. Look at your **Stretch B1** for **30 seconds**.
2. Close it.
3. Open `part14/Warmup.java`. **Without looking back**, type your Stretch B1 again, including
   `main`. Make it print the same thing it printed before.
4. Run it with the **green ▶** next to `main`.
5. If it does not match, try to fix it yourself first. Look back at `part13/Stretch.java`
   only if you are really stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

This part has **two videos**. Each part goes in its **own file**.

| Part | Topic | Video | Your file |
|---|---|---|---|
| A | Overloaded methods | **[about 2:40:18 to 2:45:29](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s)** | `OverloadedMethods.java` |
| B | printf | **[about 2:45:54 to 2:56:50](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9954s)** | `Printf.java` |

That is about 16 minutes of video. It will take you about 30 minutes, because you keep
pausing to type. That is normal.

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

> The times might be off by a minute. Listen for what he says:
>
> - **Video 1 starts** when he says *"in this video I'm going to teach you guys all about
>   overloaded methods."*
> - **Video 2 starts** when he says *"in this video I'm going to teach you guys all about
>   the print F method."*
> - **Each part stops** when he says *"if you would like a copy of all this code."*

### His screen looks different from yours

He uses a program called **Eclipse**. You use **IntelliJ**. The Java code is exactly the
same. Here is what to do when things don't match:

**His class is called `Main`. Yours is called `OverloadedMethods` (Video 1) and `Printf`
(Video 2).** Leave the `package part14;` line and the `public class ...` line alone. Type
everything else inside the class.

**In Video 1, his `add` methods go outside `main`.** They go **inside** the class's `{ }`,
but **below** `main`'s closing `}`. If you put them inside `main`, you get a red error.

**He makes his `add` methods `static`.** Type `static` just like he does. You learn what it
means in part 19. For now: a method that `main` calls directly needs `static`.

**He copies a method and pastes it to make the next one.** **You type each one.** Yes, all
six. Typing them is how you notice what changes from one to the next.

**In Video 2, he prints without going to a new line.** `printf` is like `print`: it does
**not** move to a new line by itself. So **you** add `\n` at the end of every format string,
like `"%b\n"`. That puts each result on its own line, so you can check it. (You learned
`\n` in part 01.)

**In Video 2, he turns old lines into comments as he goes.** You don't have to. Keep every
line, with `\n` at the end, and your output grows one line at a time.

**His `myString` is `"Bro"`.** You can use your own name. Then your output shows your name
where his shows `Bro`, and the spaces change to match its length.

### Check your output as you go

#### Video 1 — Overloaded methods (`OverloadedMethods.java`)

**Check 1 (about 2:41:34): two methods with the same name and the same inputs.** He writes
`add(int a, int b)` twice. It does not work. IntelliJ underlines it in red, and the error
is:

```
error: method add(int,int) is already defined in class OverloadedMethods
```

Two methods cannot have the same **signature**. He fixes it by giving the second one three
inputs instead of two.

**Check 2 (about 2:43:07): calling `add` with only one number.** He tries `add(1)`. There
is no `add` that takes just one `int`, so it fails:

```
error: no suitable method found for add(int)
```

**Check 3 (about 2:43:20): calling each version.** Each `add` prints which one it is,
then `main` prints the sum. Calling `add(1, 2)`, then `add(1, 2, 3)`, then
`add(1, 2, 3, 4)`, your output is:

```
This is overloaded method #1
3
This is overloaded method #2
6
This is overloaded method #3
10
```

**Check 4 (about 2:44:15): three more versions that take `double`s.** He adds three more
`add` methods with `double` inputs, numbered #4, #5 and #6. Then he calls
`add(1.0, 2.0, 3.0, 4.0)` and stores the answer in a `double`. Java picks #6, because it
takes **four `double`s**:

```
This is overloaded method #6
10.0
```

#### Video 2 — printf (`Printf.java`)

He makes five variables first: `boolean myBoolean = true;`, `char myChar = '@';`,
`String myString = "Bro";`, `int myInt = 50;`, `double myDouble = 1000;`.

**Check 5 (about 2:49:15): conversion characters.** The letter after `%` must match the
type of the value. `%b` boolean, `%c` char, `%s` String, `%d` int, `%f` double:

```
true
@
Bro
50
1000.000000
```

`%f` shows **six** digits after the point unless you tell it otherwise.

**Check 6 (about 2:51:30): width.** A number between `%` and the letter sets the
**minimum** number of characters. `"Hello %10s"` gives `Bro` 10 spaces of room, pushed to
the right. A minus sign, `%-10s`, pushes it to the left instead. Put a `!` after it so you
can see the spaces:

```
Hello        Bro
Hello Bro       !
```

**Check 7 (about 2:53:13): precision.** `.2` before the `f` means "2 digits after the
point":

```
You have this much money 1000.000000
You have this much money 1000.00
You have this much money 1000.0
```

**Check 8 (about 2:54:29 to 2:56:05): flags.** `-` left side, plain width right side,
`+` always show the sign, `0` fill with zeros, `,` add commas:

```
You have this much money 1000.000000         !
You have this much money          1000.000000!
You have this much money +1000.000000
You have this much money -1000.000000
You have this much money 0000000001000.000000
You have this much money 1,000.000000
```

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `method add(int,int) is already defined` | Two methods have the same name **and** the same inputs. Change the inputs of one of them |
| `no suitable method found for add(int)` | You called `add` with inputs that no version of `add` takes. Count your numbers |
| Red error on `static int add` | Your method is **inside** `main`. Move it below `main`'s closing `}` |
| `missing return statement` | Your `add` method has no `return` line, or it is spelled wrong |
| `IllegalFormatConversionException: d != java.lang.Double` | You used `%d` for a `double`. Use `%f`. (And `f != java.lang.Integer` means the opposite: `%f` for an `int`. Use `%d`) |
| `MissingFormatArgumentException: Format specifier '%s'` | You wrote a `%` spot but forgot to put the value after the comma |
| All your printf output is on one long line | Add `\n` at the end of each format string |
| You fixed your code, but the output did not change | You ran a **different file**. Use the ▶ **next to `main`** in the file you are working on |

### ✅ Commit Section A

When both files match their checks, type this in the terminal:

```bash
git add -A
git commit -m "part14 follow-along: overloaded methods and printf"
```

---

## In-class exercise — scoreboard (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

### Step 1 — Two `average` methods and a scoreboard

**1a.** Under the `STEP 1a` comment (outside `main`, but inside the class's `{ }`), write
**two methods with the same name**:

- `average(int a, int b)` returns the average of two numbers.
- `average(int a, int b, int c)` returns the average of three numbers.

Both start with `static double average(`. Divide by `2.0` and `3.0`, not `2` and `3`, so the
answer keeps its decimal part.

**1b.** Under `STEP 1b`, inside `main`, use `printf` to print this scoreboard:

```
Player   Average
Davis       13.5
Brooks      15.0
Lee         13.5
```

- Davis is `average(12, 15)`. Brooks is `average(9, 14, 22)`. Lee is `average(20, 7)`.
- The names use `%-8s` (8 wide, pushed to the **left**).
- The numbers use `%8.1f` (8 wide, pushed to the **right**, **1** digit after the point).
- The header line uses `%-8s%8s`.
- Every format string ends with `\n`.

Things to figure out together: **how does Java know which `average` to use?** (Count what
you pass in.)

### Step 2 — Fix the bugs

Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't
stop your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Run it. Read the error. What is Java telling you?
3. Fix the line. Run the program.
4. Do the next line.

| Broken line | What happens |
|---|---|
| `System.out.printf("%d points\n", 7.5);` | It runs, then **crashes**: `IllegalFormatConversionException: d != java.lang.Double` |
| `System.out.printf("%.1f\n", average(1, 2, 3, 4));` | Red error: `no suitable method found for average(int,int,int,int)` |
| `System.out.printf("%s scored %d\n", "Davis");` | It runs, prints `Davis scored `, then **crashes**: `MissingFormatArgumentException: Format specifier '%d'` |

**Notice:** two of these are **not red**. IntelliJ is happy, and the program crashes only
when it runs. Not every mistake shows up before you press ▶.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part14 in-class: scoreboard"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **both** `OverloadedMethods.java` and `Printf.java`, put a `//`
comment **above every line of code**, saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes `public class ...`,
  `public static void main(...)`, **each `static ... add(...)` line**, every `return`, every
  variable, and every `System.out...` line.
- **No:** lines that are only `}`, empty lines, and the comments you already typed from the
  video.

**What makes a good comment?** Say what the line **does** and **why the output looks the
way it does.** Do not just repeat the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// add method` | `// version of add that takes THREE ints, so add(1, 2, 3) runs this one` |
| `// return a + b` | `// sends the sum back to the line that called add` |
| `// printf` | `// %d marks where myInt goes, and \n moves to a new line after` |
| `// %-10s` | `// gives the name 10 spaces of room and pushes it to the LEFT, so the spaces come after it` |

Here is what a commented line looks like in your file:

```java
        // .2 means only 2 digits after the decimal point, like money
        System.out.printf("You have this much money %.2f\n", myDouble);
```

**Rules:**

1. **Your own words.** Do not copy sentences from the guide or the video. I want to know
   what **you** think the line does.
2. **Not sure what a line does?** Write your best guess, and add `(not sure)` at the end.
   An honest guess gets credit. A skipped line does not.
3. **Run both files again when you're done.** Comments must not change the output. If it
   changed, a comment is missing its `//`.

### ✅ Commit Section B

```bash
git add -A
git commit -m "part14 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.** Your
extra methods go **inside the class but outside `main`**, just like the `add` methods.

### Stretch A — guess first

1. Type these three methods **below `main`**:

```java
    static int twice(int n) {
        return n * 2;
    }

    static double twice(double n) {
        return n * 2;
    }

    static String twice(String s) {
        return s + s;
    }
```

2. Type this code **inside `main`**. **Do not run it yet.**

```java
        System.out.println(twice(3));
        System.out.println(twice(2.5));
        System.out.println(twice("ab"));
        System.out.printf("[%5d]\n", 42);
        System.out.printf("[%-5d]\n", 42);
        System.out.printf("[%.1f]\n", 3.14159);
        System.out.printf("[%,d]\n", 1234567);
```

3. **Above that code**, write what you think it will print, inside a comment:

```java
        /* MY GUESS:
           ...
        */
```

4. Now run it.
5. Were you wrong about any line? **Keep your wrong guess.** Under it, add a comment that
   says why you were wrong.

<details>
<summary>Click to see the answer. Only after you have run it!</summary>

```
6
5.0
abab
[   42]
[42   ]
[3.1]
[1,234,567]
```

- `twice(3)` gets the **int** version, so the answer is an int: `6`.
- `twice(2.5)` gets the **double** version, so the answer has a decimal point: `5.0`.
- `twice("ab")` gets the **String** version, and `+` on Strings joins them: `abab`.
- The square brackets show you where the spaces are.

</details>

### Stretch B — receipts

Put this code under your Stretch A code, in the same `main`.

**B1.** Print one line of a receipt with `printf`. Type this, then run it:

```java
        String item = "Pizza";
        int qty = 2;
        double price = 12.5;
        System.out.printf("%-10s x%d  $%.2f\n", item, qty, price * qty);
```

Output:

```
Pizza      x2  $25.00
```

Notice: **three** `%` spots, so **three** values after the format string, in the same order.

**B2.** Write **three overloaded methods** named `area`, below `main`:

- `area(int side)` returns the area of a square: `side * side` (an `int`)
- `area(int width, int height)` returns the area of a rectangle (an `int`)
- `area(double radius)` returns the area of a circle: `Math.PI * radius * radius` (a
  `double`)

Then in `main`, print these three lines. Use `%d` for the two `int` answers and `%.2f` for
the `double` one:

```
Square:    16
Rectangle: 15
Circle:    12.57
```

Use `area(4)`, `area(3, 5)` and `area(2.0)`.

**B3.** Print this whole receipt, using **only `printf`**. The columns must line up. Use a
**width** for every column: `%-10s` for the item, `%3d` for the quantity, `%8.2f` for the
cost.

```
Item       Qty     Cost
Pizza        2    25.00
Wings       10    12.99
Soda         3     4.50
TOTAL             42.49
```

**Hint:** the header row and the TOTAL row print text where the numbers go. Use `%3s` and
`%8s` there instead of `%3d` and `%8.2f`. For TOTAL, the quantity is an empty String `""`.

### ✅ Commit Section C

```bash
git add -A
git commit -m "part14 stretch: overloading and printf receipts"
```

---

## Section D — Challenge (25 points)

*On your own.*

Open `Challenge.java`. It has **three** methods for you to finish: **two** called `tag` and
one called `money`. Two methods with the same name? That's this part's topic: **overloading**.

Each method has comments above it showing what it should return. **Change only the lines
marked `// YOUR CODE`.**

**Hint for `money`:** `String.format` works **exactly like `printf`**, but instead of
printing the text, it **gives it back** to you. So
`String.format("%.2f", 3.5)` gives back `"3.50"`. Put a `$` in front.

**Hint for `tag(String text)`:** it can call the other `tag`.

### Run the test

1. Open `Challenge.java`.
2. Press `⌘ ⇧ T` (Mac) or `Ctrl ⇧ T` (Windows). This jumps to `ChallengeTest.java`.
3. Click the **green ▶** next to `class ChallengeTest`. Choose **Run**.
4. **Red ✗** means that answer is wrong. Click it and compare **expected** (the right
   answer) with **but was** (what your code gave).
5. Fix your code. Run the test again. Keep going until **all 11 tests are green ✔**.

**Never change `ChallengeTest.java`.** Only change `Challenge.java`.

### ✅ Commit Section D

```bash
git add -A
git commit -m "part14 challenge: tag and money"
```

---

## Hand it in: push before the next lecture

### 1. Fill in your log

At the bottom of this page, fill in the three lines under **My log**.

### 2. Check your commits

In the terminal, type:

```bash
git log --oneline
```

Near the top of the list, you should see **your commits for this part**, newest first:

```
a1b2c3d part14 challenge: tag and money
e4f5a6b part14 stretch: overloading and printf receipts
c7d8e9f part14 comments: explained every line of the follow-along code
9d8c7b6 part14 in-class: scoreboard
0a1b2c3 part14 follow-along: overloaded methods and printf
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part14 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part14 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong3-DataAndMethods`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I cannot see
them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** type your Stretch B1 receipt line again, from memory.

**Finished early? Start Part 15.** It is in the **next repo, FollowAlong4-Objects**. Its README
shows you how to set it up (about 5 minutes). You don't have to wait for class.

---

## My log

Fill this in before you push. Type your answers after the colons.

```
Started: Sunday, October 25
Finished: Sunday, October 25
The line that took me the longest: stretch B3
```

---

## Want more help?

- **Think Java** (free online book): [Chapter 4 — Methods and Testing](https://books.trinket.io/thinkjava2/chapter4.html)
  for methods, and [Chapter 3 — Input and Output](https://books.trinket.io/thinkjava2/chapter3.html)
  for formatting output with `printf`.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
