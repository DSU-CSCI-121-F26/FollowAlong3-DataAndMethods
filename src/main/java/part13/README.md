# Part 13 — Methods

**We start this together in class · due before the next lecture · No AI**

Since Part 06, every `Challenge.java` has given you methods to finish, like this one from
Part 10:

```java
    public static int total(int[] nums) {
        return 0;   // YOUR CODE
    }
```

You filled in the inside, and the test called your method. **In this part you learn what
every piece of that top line means**, and you write your own methods from scratch.

**What you learn:**

- a **method** is a named block of code that runs when you **call** it
- **`void`**: a method that does something but gives nothing back
- **arguments** and **parameters**: how you send values **into** a method
- **return types** and **`return`**: how a method sends a value **back**
- **local variables**: a variable made inside a method only exists inside that method

Here is the Part 10 method again, piece by piece. By the end of this part, every piece will
make sense:

| Piece | What it means |
|---|---|
| `public` | Other files can use this method. That's how the test can call it |
| `static` | You can call it without making an object first. (For now: always write it) |
| `int` | The **return type**: this method gives back an `int` |
| `total` | The method's **name** |
| `(int[] nums)` | The **parameter**: the value that comes **in** |
| `return ...;` | Sends the answer **back** to whoever called the method |

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
| **A · Follow along** | `Methods.java` | 25 | `part13 follow-along: methods, parameters, return types` |
| **B · Comments** | `Methods.java` | 25 | `part13 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` | 25 | `part13 stretch: method predictions, square, average, rating` |
| **D · Challenge** | `Challenge.java` | 25 | `part13 challenge: sign and closerTo10` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part12/Stretch.java`. Look at your **Stretch B1** code (the scores) for
   **30 seconds**.
2. Close it.
3. Open `part13/Warmup.java`. **Without looking back**, type Stretch B1 again, inside a
   `main` method you type yourself. It uses an `ArrayList`, so you need
   `import java.util.ArrayList;` under the `package` line too.
4. Run it with the **green ▶** next to `main`. It should print `Total: 253`.
5. If it does not match, try to fix it yourself first. Look back only if you are really
   stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

**▶ [Open the video at about 2:27:54](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s)**

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

**Watch from about 2:27:54 to about 2:39:30.** That is about 12 minutes of video. It will
take you about 25 minutes, because you keep pausing to type. That is normal.

> The times might be off by a minute or two. Listen for what he says:
>
> - **Start** when he says *"I'm going to explain methods in Java."*
> - **Stop** when he says *"well everybody, those are methods."*

### His screen looks different from yours

**His class is called `Main`. Yours is called `Methods`.** Leave the `package part13;` line
and the `public class Methods` line alone. Type everything else, starting with
`public static void main(String[] args)`.

**Your new methods go OUTSIDE `main`, but INSIDE the class.** This is the most important
rule in this part. Put them **after** `main`'s closing `}` and **before** the class's closing `}`:

```java
public class Methods {
    public static void main(String[] args) {
        // calls go in here
    }

    static void hello() {
        // your new method goes out here
    }
}
```

If you put a method **inside** `main`, you get:

```
error: illegal start of expression
```

**Eclipse and IntelliJ word the `static` error differently.** He gets *"cannot make a
static reference to the non-static method."* In IntelliJ it says:

```
error: non-static method hello() cannot be referenced from a static context
```

Same problem, same fix: put `static` in front of your method.

**About halfway through, he deletes his `hello` code to start a new example. Don't.** Keep
`hello` and its call, and put the new `add` code **underneath** in `main`, with the `add`
method **under** `hello`. Then you have all of it to explain in Section B.

**He writes `static void hello`, without `public`.** That's fine inside one file. The
methods in `Challenge.java` say `public` so the test file can use them.

### Check your output as you go

**Check 1 (about 2:31:10): `hello()` called three times.**

```
hello
hello
hello
```

**Check 2 (about 2:33:10): `hello(name)` with one argument.** Change your calls so you call
it once, with `name`:

```
Hello Bro
```

**Check 3 (about 2:35:00): `hello(name, age)` with two arguments.**

```
Hello Bro
You are 21
```

**Check 4 (about 2:37 to 2:39): `add` returns a value.** After `int z = add(x, y);` and
printing `z`, and then printing `add(x, y)` directly, two more lines:

```
Hello Bro
You are 21
7
7
```

> **At about 2:37 he calls `add(x, y)` and nothing prints.** That's not a bug. The method
> gave back `7`, but nobody **did** anything with it. You have to store it or print it.

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `non-static method hello() cannot be referenced from a static context` | Put `static` in front of your method: `static void hello()` |
| `illegal start of expression` on your method's first line | Your method is **inside** `main`. Move it below `main`'s closing `}` |
| `method hello in class Methods cannot be applied to given types;` then `required: String` `found: String,int` | The call and the method don't match. The call sends 2 values, but the method only has 1 parameter. Add the missing parameter: `(String name, int age)` |
| `missing return statement` | The method says it gives back an `int`, but there's no `return` line. Add `return z;` (or `return x + y;`) |
| `cannot find symbol` and `variable name` inside `hello` | `hello` can't see `main`'s variables. Pass `name` in as an argument, and give `hello` a matching parameter |
| You call `add(x, y)` and nothing prints | It worked. You just didn't print the answer. Use `System.out.println(add(x, y));` |
| You fixed your code, but the output did not change | You ran a **different file**. Use the ▶ **next to `main`** in the file you are working on |

### ✅ Commit Section A

When your output matches Check 4, type this in the terminal:

```bash
git add -A
git commit -m "part13 follow-along: methods, parameters, return types"
```

---

## In-class exercise — break it into methods (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

### Step 1 — Same output, less repeating

This time `InClass.java` already has working code in `main`. **Run it first.** It prints:

```
----------
Hello, Davis!
----------
Hello, Brooks!
----------
Total yards: 10
Total yards: 42
```

It works, but it repeats itself. Together, we break it into **three methods**. Put them
**after** `main`'s closing `}` and **before** the class's closing `}` (there is a comment
marking the spot). Write `static` on each one.

| Method | What it does | Gives back |
|---|---|---|
| `line()` | prints `----------` | nothing (`void`) |
| `greet(String name)` | prints `Hello, ` + the name + `!` | nothing (`void`) |
| `add(int a, int b)` | adds the two numbers | an `int`, with `return` |

Then change `main` so it **calls** your methods instead of repeating the code:

- Each `System.out.println("----------");` becomes `line();`
- Each `Hello` line becomes a call to `greet`, with the name in the `( )`.
- `int total = 7 + 3;` becomes `int total = add(7, 3);` (and the same for `total2`).

**Run it again.** The output must be **exactly the same** as before. That is the point:
methods change how the code is organized, not what it does.

### Step 2 — Fix the bugs

Do this **after** Step 1, once your three methods exist. Under `STEP 2` there are three
broken lines, inside a `/* ... */` comment so they don't stop your program from running.
One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Read the **red error**. What is Java telling you?
3. Fix the line. Run the program.
4. Do the next line.

| Broken line | The error Java gives you |
|---|---|
| `line;` | `not a statement` |
| `greet();` | `method greet in class InClass cannot be applied to given types;` … `required: String` `found: no arguments` |
| `String yards = add(2, 3);` | `incompatible types: int cannot be converted to String` |

**Hints:** calling a method always needs `( )`, even when there is nothing inside them.
`greet` was built to take a `String`, so you have to send it one. `add` gives back an
`int`, so the variable that catches it has to be an `int`.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part13 in-class: break it into methods"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In `Methods.java`, put a `//` comment **above every line of
code**, saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes `public class Methods`, the `main`
  line, **the first line of each of your methods**, every call, every variable, every
  `return`, and every `System.out.println(...)`.
- **No:** lines that are only `}`, empty lines, and comments you already have.

**What makes a good comment?** For a method's first line, say **what goes in** and **what
comes back.** For a call, say **what gets sent** and **what happens to the answer.**

| ❌ Not enough | ✅ Good |
|---|---|
| `// hello method` | `// a method named hello. It takes in a name and an age, and gives nothing back (void)` |
| `// call hello` | `// runs hello, sending it name and age. It prints two lines` |
| `// add` | `// a method that takes in two ints and gives back an int: their sum` |
| `// return` | `// sends x + y back to the line in main that called add` |

Here is what a commented line looks like in your file:

```java
        // calls add with 3 and 4. add gives back 7, and I store it in z
        int z = add(x, y);
```

**Rules:**

1. **Your own words.** Do not copy sentences from the guide or the video. I want to know
   what **you** think the line does.
2. **Not sure what a line does?** Write your best guess, and add `(not sure)` at the end.
   An honest guess gets credit. A skipped line does not.
3. **Run it again when you're done.** Comments must not change the output. If it changed, a
   comment is missing its `//`.

### ✅ Commit Section B

```bash
git add -A
git commit -m "part13 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.**
Every method you write goes **outside `main`, inside the class**. All the calls go inside
`main`.

### Stretch A — guess first

1. Type this. The first part goes **inside** `main`. The three methods go **below** `main`.
   **Do not run it yet.**

```java
    // inside main:
        int x = 5;
        change(x);
        System.out.println(x);
        System.out.println(twice(x));
        System.out.println(twice(twice(x)));
        greet("Sam", 3);

    // below main, inside the class:
    static void change(int x) {
        x = 100;
    }

    static int twice(int n) {
        return n * 2;
    }

    static void greet(String who, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("Hi " + who + "! ");
        }
        System.out.println();
    }
```

2. **Above `main`'s code**, write what you think it will print, inside a comment:

```java
/* MY GUESS:
   ...
*/
```

3. Now run it.
4. Were you wrong about any line? **Keep your wrong guess.** Under it, add a comment that
   says why you were wrong.

<details>
<summary>Click to see the answer. Only after you have run it!</summary>

```
5
10
20
Hi Sam! Hi Sam! Hi Sam! 
```

- **The first line surprises almost everyone.** `change(x)` sets **its own** `x` to `100`.
  That `x` is a **local variable** inside `change`. It's a copy. `main`'s `x` is still
  `5`.
- `twice(twice(x))`: the inside runs first. `twice(5)` is `10`, then `twice(10)` is `20`.
- `greet` is `void`, so you can't print it. It does its own printing.

</details>

### Stretch B — write your own methods

**B1.** A `square` method. Type this, then run it:

```java
    // inside main:
        System.out.println(square(4));
        System.out.println(square(9));

    // below main:
    static int square(int n) {
        return n * n;
    }
```

Output:

```
16
81
```

**Keep B1 short and neat.** The next part's warm-up is typing it again from memory.

**B2.** Write a method called `average` that takes **three** `int`s and **returns** their
average as a `double`. Call it from `main` like this:

```java
        System.out.println(average(90, 80, 85));
        System.out.println(average(1, 2, 2));
```

Output:

```
85.0
1.6666666666666667
```

**Hints:** the return type is `double`. Divide by `3.0`, not `3`. (Dividing two `int`s
throws away the decimal. `5 / 3` is `1`, but `5 / 3.0` is `1.666...`.)

**B3.** Write a method called `rating` that takes an `int` number of stars and **returns** a
`String`:

| Stars | Gives back |
|---|---|
| 5 | `"Amazing"` |
| 3 or 4 | `"Good"` |
| 1 or 2 | `"Bad"` |
| anything else | `"Invalid"` |

Call it from `main` with `5`, `4`, `1` and `9`, printing each answer:

```
Amazing
Good
Bad
Invalid
```

**Hint:** use `if` / `else if` / `else`, with a `return` inside each part.

### ✅ Commit Section C

```bash
git add -A
git commit -m "part13 stretch: method predictions, square, average, rating"
```

---

## Section D — Challenge (25 points)

*On your own.*

Do this in `Challenge.java`. It already has **two methods** in it. Look at their first
lines. **Now you know what every word means.** Each method has a line that says
`// YOUR CODE`. **Change only those lines.** You can add more lines above them inside the
method.

A **test** checks your answers. To run it:

1. In `Challenge.java`, press `⌘ ⇧ T` (Mac) or `Ctrl ⇧ T` (Windows). This jumps to
   `ChallengeTest.java`.
2. Click the **green ▶** next to `class ChallengeTest`. Choose **Run**.
3. **Green ✔** means right. **Red ✗** means wrong. Click a red one and compare
   **expected** (the right answer) with **but was** (yours).

**Never change the test file.** Only change `Challenge.java`.

> **Some tests are green before you start.** That's because the starting code gives back
> `0`, and a couple of the right answers happen to be `0`. They will stay green when you're
> done, as long as your code is right.

### `sign(int n)`

Give back `"positive"`, `"negative"` or `"zero"`.

| Call | Gives back |
|---|---|
| `sign(5)` | `"positive"` |
| `sign(-3)` | `"negative"` |
| `sign(0)` | `"zero"` |

### `closerTo10(int a, int b)`

Give back whichever number is **closer to 10**. If they are **equally close**, give back
`0`.

| Call | Gives back | Why |
|---|---|---|
| `closerTo10(8, 13)` | `8` | 8 is 2 away, 13 is 3 away |
| `closerTo10(13, 8)` | `8` | same, the other way round |
| `closerTo10(8, 12)` | `0` | both are 2 away: a tie |
| `closerTo10(-5, 20)` | `20` | −5 is 15 away, 20 is 10 away |

**Hint:** "how far from 10" is `Math.abs(a - 10)`. `Math.abs` turns a negative number
positive. You saw the `Math` class in Part 05. Work out both distances first, store them in
two variables, then compare them.

**✅ Done when:** all 11 tests show a **green ✔**.

### ✅ Commit Section D

```bash
git add -A
git commit -m "part13 challenge: sign and closerTo10"
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
a1b2c3d part13 challenge: sign and closerTo10
e4f5a6b part13 stretch: method predictions, square, average, rating
c7d8e9f part13 comments: explained every line of the follow-along code
9d8c7b6 part13 in-class: break it into methods
0a1b2c3 part13 follow-along: methods, parameters, return types
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part13 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part13 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong3-DataAndMethods`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I cannot see
them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** retype your Stretch B1 from memory.

**Finished early? Start Part 14.** You don't have to wait for class.

---

## My log

Fill this in before you push. Type your answers after the colons.

```
Started: Wednesday October 21
Finished:  Wednesday October 21
The line that took me the longest: closerTo10
```

---

## Want more help?

- **Think Java** (free online book): [Chapter 4 — Methods and Testing](https://books.trinket.io/thinkjava2/chapter4.html).
  Read the parts about defining new methods, parameters and arguments, and return values.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
