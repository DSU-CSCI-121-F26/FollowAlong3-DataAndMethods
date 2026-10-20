# Part 10 — Arrays and 2D arrays

**We start this together in class · due before the next lecture · No AI**

Until now, every variable held **one** value. In this part you learn the **array**: one variable
that holds **many** values, like a row of parking spots. Then you learn the **2D array**: a
grid with rows and columns, like a whole parking lot.

**What you learn:**

- how to make an array, and get or change one of its values
- why counting starts at **0**, and what happens if you go past the end
- how to use a `for` loop to go through every value in an array
- **2D arrays**: rows and columns, printed with nested loops

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
| **A · Follow along** | `ArrayBasics.java`, `TwoDArrays.java` | 25 | `part10 follow-along: arrays and 2D arrays` |
| **B · Comments** | `ArrayBasics.java`, `TwoDArrays.java` | 25 | `part10 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` | 25 | `part10 stretch: prediction, foods, scores, and seating chart` |
| **D · Challenge** | `Challenge.java` | 25 | `part10 challenge: endsWith and total` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part09/Stretch.java`. Look at your **Stretch B1** (the one that prints `Sum: 55`)
   for **30 seconds**.
   It is in your **last repo, FollowAlong2-ControlFlow**. Easiest way to see it: on GitHub, open your
   fork of FollowAlong2-ControlFlow → `src/main/java/part09/Stretch.java`.
2. Close it.
3. Open `part10/Warmup.java`. **Without looking back**, type it again, from memory. You have
   to type `main` yourself too.
4. Run it with the **green ▶** next to `main`. It should print:

```
Sum: 55
```

5. If it does not match, try to fix it yourself first. Look back at `part09/Stretch.java`
   only if you are really stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

This part has **two** pieces of the video. Each one goes in its own file.

| Video piece | Starts | Stops | Your file |
|---|---|---|---|
| Arrays | **1:43:42** | about **1:49:45** | `ArrayBasics.java` |
| 2D arrays | **1:50:51** | about **1:57:41** | `TwoDArrays.java` |

**▶ [Open the video at 1:43:42 (arrays)](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6222s)**
**▶ [Open the video at 1:50:51 (2D arrays)](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6651s)**

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

That is about 13 minutes of video. It will take you about 25 minutes, because you keep
pausing to type. That is normal.

> The times might be off by a minute. Listen for what he says:
>
> - **Arrays start** when he says *"an array is used to store multiple values in a single
>   variable."* **Stop** when he says *"so that's what an array is."*
> - **2D arrays start** when he says *"a 2D array is an array of arrays."* **Stop** when he
>   says *"so that is the basics of 2D arrays."*
> - Skip the "like and subscribe" part between them.

### His screen looks different from yours

He uses a program called **Eclipse**. You use **IntelliJ**. The Java code is exactly the
same. Here is what to do when they don't match:

**His class is called `Main`. Yours are called `ArrayBasics` and `TwoDArrays`.** Leave the
`package part10;` line and the `public class ...` line alone. Type everything else, starting
with `main`. (Java class names can't start with a number, so it's `TwoDArrays`, not
`2DArrays`.)

**He changes the same code as he goes.** In the arrays video, he makes an array one way,
then shows a second way. When he shows the second way, **delete the first version** and
type the new one, like he does. At the end, your file only has the second way plus the
loop. That's fine.

**His error messages look a little different.** Eclipse says "type mismatch." IntelliJ says
`incompatible types`. They mean the same thing. The README and guide show you IntelliJ's
version.

**His crash message is in the Console.** Yours shows in the **Run** window, in red.

**He copies and pastes lines to go faster.** **You type them.**

### Check your output as you go

**Check 1 (about 1:45:00): change spot 0.** After `cars[0] = "Mustang";` and three
`println`s:

```
Mustang
Corvette
Tesla
```

**Check 2 (about 1:45:51): ask for a spot that doesn't exist.** Print `cars[3]`. The
program **crashes** with this in red:

```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at part10.ArrayBasics.main(ArrayBasics.java:19)
```

That's **supposed** to happen. (Your line number at the end may be different.) Then add
`"BMW"` to the list, like he does, and the crash goes away.

**Check 3 (about 1:47:09): the second way, `new String[3]`.** After filling in the three
spots and printing them:

```
Camaro
Corvette
Tesla
```

**Check 4 (about 1:48:37): the `for` loop.** The loop prints all three cars again, so you
see the list **twice**:

```
Camaro
Corvette
Tesla
Camaro
Corvette
Tesla
```

**Check 5 (about 1:53:36): the 2D grid.** Run `TwoDArrays`. There's an empty line at the
top, then:

```
Camaro Corvette Silverado 
Mustang Ranger F-150 
Ferrari Lambo Tesla 
```

**Check 6 (about 1:55:34): the second way for 2D.** Fill the grid in with `{ }` rows
instead. The output is **exactly the same** as Check 5.

### Stuck? Check these first

These are real error messages you might see:

| What you see | What is usually wrong |
|---|---|
| `java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3` | You asked for a spot past the end. An array of length 3 has spots **0, 1, 2**. In a loop, use `i < cars.length`, **not** `i <= cars.length` |
| `incompatible types: int cannot be converted to String` | You put a number in an array of Strings. Every element must be the same type as the array |
| `cannot find symbol` and `symbol: method length()` | For arrays, it's `cars.length` with **no** `()` |
| A line prints `null` | That spot is empty. You made the array with `new String[3]` but never put anything in that spot |
| `variable cars is already defined` | You made the second version without deleting the first. Delete the old `String[] cars = ...` line |
| `';' expected` near the end of the 2D `{ }` | The whole `{ ... };` needs a **semicolon** after the last `}` |
| The 2D grid is all on one line | The `System.out.println();` is missing, or it's inside the **inner** loop. It goes inside the **outer** loop, before the inner loop |
| You fixed your code, but the output did not change | You ran a **different file**. Use the ▶ **next to `main`** in the file you are working on |

### ✅ Commit Section A

When both files match the checks, type this in the terminal:

```bash
git add -A
git commit -m "part10 follow-along: arrays and 2D arrays"
```

---

## In-class exercise — temperature log and map (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

### Step 1 — A log, then a map

Inside `main`, under the `STEP 1` comment, make the program print this:

```
=== TEMPERATURE LOG ===
Reading 0: 70
Reading 1: 72
Reading 2: 68
Reading 3: 75
Reading 4: 71
Highest: 75
=== MAP ===
# . #
. R .
# . #
```

Things to figure out together:

- Put the five temperatures in **one** `int` array. Print them with a `for` loop. Why does
  the first reading say `0`, not `1`?
- To find the highest: start a variable at the **first** reading. Inside the loop, if a
  reading is bigger, save it instead. (That's an `if` from part 06.)
- The map is a **2D array** of Strings: 3 rows, 3 columns. Print it with a loop inside a
  loop, with a space after each value.

### Step 2 — Fix the bugs

> **Different from before:** some of these bugs are more than one line long, so this time
> each bug has its **own** `/* ... */`. Instead of moving a line, you delete the `/*` and
> `*/` around **one** bug.

Under `STEP 2` there are three bugs. Each one is inside its own `/* ... */` comment, so it
does not stop your program from running. One at a time:

1. Pick **one** bug. Delete its `/*` line and its `*/` line. Now Java can see it.
2. Read the **red error**, or run it and read what it prints.
3. Fix it. Run the program.
4. Do the next bug.

| The bug | What happens |
|---|---|
| `int[] readings = new int[];` | Red error: `array dimension missing`. Java needs to know how many spots to make |
| `System.out.println(speeds.length());` | Red error: `cannot find symbol` … `symbol: method length()` |
| `names[3] = "Ana";` in an array of 3 | **No red error.** It crashes when you run it (see below) |

The last one crashes when it runs:

```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at part10.InClass.main(InClass.java:30)
```

An array of 3 has spots `0`, `1` and `2`. There is no spot `3`. (Your line number might be
different.)

**About the second one:** for an **array**, it's `.length` with **no** `( )`. For a
**String**, it's `.length()` **with** `( )`. Easy to mix up.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part10 in-class: temperature log and map"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **both** `ArrayBasics.java` and `TwoDArrays.java`, put a `//`
comment **above every line of code**, saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes `public class ...`,
  `public static void main(...)`, every line that makes or changes an array, every `for`
  line, and every `System.out...` line.
- **No:** lines that are only `}` or `};`, and empty lines. In the 2D `{ }` version, you can
  write **one** comment above the whole block instead of one per row.

**What makes a good comment?** Say what the line **does** and **why**. Do not just repeat
the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// array` | `// make an array with room for 3 car names. The spots are empty (null) until I fill them` |
| `// cars 0` | `// put "Camaro" in the first spot. The first spot is 0, not 1` |
| `// for loop` | `// go through every spot: i goes 0, 1, 2 and stops before it reaches the length (3)` |
| `// print cars i` | `// print whichever car is in spot i this time through the loop` |
| `// inner loop` | `// for the row I'm on, go across each column. cars[i].length is how many columns that row has` |

Here is what a commented line looks like in your file:

```java
        // cars.length is 3, so i will be 0, 1, then 2, and the loop stops before 3
        for (int i = 0; i < cars.length; i++) {
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
git commit -m "part10 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.** Put all
of the stretch code in the same `main`, one part under the other.

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.**

```java
int[] nums = {4, 8, 15, 16};
System.out.println(nums[1]);
System.out.println(nums.length);
nums[0] = nums[3] + 1;
System.out.println(nums[0]);
for (int i = nums.length - 1; i >= 0; i--) {
    System.out.print(nums[i] + " ");
}
System.out.println();
int[][] grid = {{1, 2, 3}, {4, 5, 6}};
System.out.println(grid[1][0]);
System.out.println(grid.length + " rows, " + grid[0].length + " columns");
```

2. **Above that code**, write what you think it will print. Put your guess inside a
   comment:

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
8
4
17
16 15 8 17 
4
2 rows, 3 columns
```

- `nums[1]` is the **second** number, `8`, because counting starts at 0.
- `nums.length` is how many numbers there are: `4`.
- `nums[3]` is `16`, so `nums[0]` becomes `17`.
- The loop starts at the **last** index (`length - 1`, which is 3) and counts **down**, so
  it prints the array backwards. Spot 0 is now `17`.
- `grid[1][0]` is row 1, column 0: `4`.
- `grid` has 2 rows. `grid[0]` (the first row) has 3 columns.

</details>

### Stretch B — three small array programs

**B1. Favorite foods.** Make an array of **three** foods you like. Use a `for` loop to print
each one:

```
I like pizza
I like tacos
I like wings
```

Use your own foods. Keep it short, about 4 lines. **The next part's warm-up is B1, from memory.**

**B2. Test scores.** Make this array of `int`s: `{88, 92, 75, 100, 64}`. Use a `for` loop to
add them all up. Then print the total and the **average**:

```
Total: 419
Average: 83.8
```

**Hints:**

- Start with `int sum = 0;`. In the loop, `sum += scores[i];`.
- Average = sum ÷ how many scores. **Careful:** `419 / 5` is `83` in Java, because both are
  `int`s, and `int` division chops off the decimal. To keep the `.8`, turn one of them into
  a `double` first:

```java
double average = (double) sum / scores.length;
```

**B3. Seating chart.** Make a 2D array of names, 2 rows and 3 columns:

```java
String[][] seats = {
        {"Ana", "Ben", "Cal"},
        {"Dee", "Eli", "Fay"}
};
```

Use nested loops to print it like this, with a tab `\t` after each piece:

```
Row 1:	Ana	Ben	Cal	
Row 2:	Dee	Eli	Fay	
```

**Hints:**

- The outer loop goes through the rows. At the start of each row, print `"Row "`, then the
  row number, then `":\t"`.
- The row index starts at **0**, but people count from **1**. So print `(row + 1)`.
- After the inner loop, `System.out.println();` ends the row.

### ✅ Commit Section C

```bash
git add -A
git commit -m "part10 stretch: prediction, foods, scores, and seating chart"
```

---

## Section D — Challenge (25 points)

*On your own.*

Open `Challenge.java`. It has **two methods** for you to finish. A **test** checks your
answers.

### How the methods work

- The **top line** of each method is already written. Don't change it.
- The **inputs** are inside the parentheses. This time, one input is an **array**: `int[] nums`.
  It already has numbers in it when your code runs.
- Your answer goes after **`return`**. Replace the line marked `// YOUR CODE`.

### The two problems

**1. `endsWith(int[] nums, int target)`** — return `true` if the **first** number **or** the
**last** number in the array equals `target`. Otherwise return `false`. The array always
has at least one number.

| Call | Returns | Why |
|---|---|---|
| `endsWith(new int[] {7, 2, 3}, 7)` | `true` | the first number is 7 |
| `endsWith(new int[] {1, 2, 9}, 9)` | `true` | the last number is 9 |
| `endsWith(new int[] {1, 5, 3}, 5)` | `false` | 5 is only in the middle |

**Hints:**

- The first number is `nums[0]`.
- The last number is `nums[nums.length - 1]`. (If the length is 3, the last index is 2.)
- "Or" in Java is `||`.
- You don't need a loop for this one.

**2. `total(int[] nums)`** — return all the numbers in the array, added up.

| Call | Returns |
|---|---|
| `total(new int[] {1, 2, 3})` | `6` |
| `total(new int[] {10})` | `10` |
| `total(new int[] {})` | `0` (an empty array adds up to 0) |

**Hint:** this is just like Stretch B2. Start a sum at 0, loop through the array, add each
number, then `return` the sum.

### Run the test

1. In `Challenge.java`, press `⌘ ⇧ T` (Mac) or `Ctrl ⇧ T` (Windows). This opens
   `ChallengeTest.java`.
2. Click the **green ▶** next to `class ChallengeTest`. Choose **Run 'ChallengeTest'**.
3. **Red ✗** means that answer is wrong. Click it and read **expected** (the right answer)
   and **but was** (what your code gave).
4. Fix your code. Run the test again. Keep going until **every test is green ✔**.

A few tests may be green before you start. That's because the starting code happens to be
right for those. **All of them must be green at the end.**

**Never change `ChallengeTest.java`.** Only change `Challenge.java`.

### ✅ Commit Section D

```bash
git add -A
git commit -m "part10 challenge: endsWith and total"
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
a1b2c3d part10 challenge: endsWith and total
e4f5a6b part10 stretch: prediction, foods, scores, and seating chart
c7d8e9f part10 comments: explained every line of the follow-along code
9d8c7b6 part10 in-class: temperature log and map
0a1b2c3 part10 follow-along: arrays and 2D arrays
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part10 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part10 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong3-DataAndMethods`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I cannot see
them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** type your Stretch B1 (favorite foods) again, from memory.

**Finished early? Start Part 11.** You don't have to wait for class.

---

## My log

Fill this in before you push. Type your answers after the colons.

```
Started:Monday October 19 
Finished:Tuesday, October 20
The line that took me the longest:
```

---

## Want more help?

- **Think Java** (free online book): [Chapter 7 — Arrays and References](https://books.trinket.io/thinkjava2/chapter7.html).
  Read the first few sections, about making arrays and going through them with a loop.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
