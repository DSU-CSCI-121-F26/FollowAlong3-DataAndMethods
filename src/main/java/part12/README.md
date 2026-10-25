# Part 12 — ArrayList, 2D ArrayList, and the for-each loop

**We start this together in class · due before the next lecture · No AI**

An array has a fixed size. Once you make it, you can't add a fourth item to a list of
three. In this part you learn the **ArrayList**: a list that grows and shrinks while your program
runs. Then you make a list **of lists**, and learn a shorter loop for going through all of
them.

**What you learn:**

- **ArrayList**: a list you can `add` to, `get` from, `set`, `remove` from, and `clear`
- why an ArrayList holds `Integer` and never `int` (the wrapper classes from Part 11)
- **import**: a line at the top of a file that lets you use a tool from Java's library
- **2D ArrayList**: a list of lists, like a grocery list split into sections
- the **for-each loop**: a shorter way to go through every item in an array or list

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
| **A · Follow along** | `ArrayLists.java`, `TwoDArrayLists.java`, `ForEachLoop.java` | 25 | `part12 follow-along: ArrayList, 2D ArrayList, for-each loops` |
| **B · Comments** | the same three files | 25 | `part12 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` | 25 | `part12 stretch: list predictions, scores, playlist, seating chart` |
| **D · Challenge** | `Challenge.java` | 25 | `part12 challenge: countEvens and spread` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part11/Stretch.java`. Look at your **Stretch B1** code (the city name) for
   **30 seconds**.
2. Close it.
3. Open `part12/Warmup.java`. **Without looking back**, type Stretch B1 again, inside a
   `main` method you type yourself.
4. Run it with the **green ▶** next to `main`. It should print the same thing it printed
   last time.
5. If it does not match, try to fix it yourself first. Look back only if you are really
   stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

This part has **three short videos**, one after the other. Each one gets its own file.

| Video | Your file | Start | Stop |
|---|---|---|---|
| ArrayList | `ArrayLists.java` | **▶ [about 2:12:02](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s)** | about 2:16:20 |
| 2D ArrayList | `TwoDArrayLists.java` | **▶ [about 2:16:50](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8210s)** | about 2:23:45 |
| for-each loop | `ForEachLoop.java` | **▶ [about 2:23:57](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8637s)** | about 2:27:20 |

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

That is about 15 minutes of video. It will take you about 30 minutes, because you keep
pausing to type. That is normal.

> The times might be off by a minute or two. Listen for what he says:
>
> - **ArrayList starts** when he says *"I'm going to teach you guys all about ArrayLists."*
>   **Stop** when he says *"that is ArrayLists in Java."*
> - **2D ArrayList starts** when he says *"I'm going to be teaching you guys about
>   two-dimensional ArrayLists."* **Stop** when he says *"that's how two-dimensional
>   ArrayLists work."*
> - **for-each starts** when he says *"I'm going to teach you guys all about the for-each
>   loop."* **Stop** when he says *"that is everything you need to know to get started
>   with the for-each loop."*

### His screen looks different from yours

**His class is called `Main`. Yours are called `ArrayLists`, `TwoDArrayLists` and
`ForEachLoop`.** Leave the `package part12;` line and the `public class ...` line alone.
Type everything else, starting with `public static void main(String[] args)`.

**You need an `import` line.** `ArrayList` lives in a part of Java's library called
`java.util`. To use it, type this line **under `package part12;` and above
`public class ...`**:

```java
import java.util.ArrayList;
```

You need it in **all three files**. Without it, you get:

```
error: cannot find symbol
  symbol:   class ArrayList
```

**Shortcut:** click on the red word `ArrayList` and press `⌥ Enter` (Mac) or `Alt Enter`
(Windows), then choose **Import class**. IntelliJ adds the line for you. (You'll see him
add it in Eclipse. Same idea, different keys.)

**He watches his list change by moving his `for` loop around.** You don't have to. After
each change (`set`, `remove`, `clear`), add one line that prints the **whole list**:

```java
        System.out.println(food);
```

Printing an ArrayList shows every item inside `[ ]`. He uses this same trick in the second
video.

**In the for-each video, he turns his array into an ArrayList with the same name,
`animals`.** If you keep both, you get:

```
error: variable animals is already defined in method main(String[])
```

**Keep both, but call the ArrayList `animalList`.** Then you have both loops to explain in
Section B.

**Grey or yellow highlights are not errors.** IntelliJ may grey out the `String` inside
`new ArrayList<String>()` and suggest `<>`. Both ways work. Only **red** means something is
wrong.

### Check your output as you go

**Check 1 (about 2:15:02): add and a for loop.** In `ArrayLists.java`:

```
pizza
hamburger
hotdog
```

**Check 2 (about 2:15:20 to 2:16:20): set, remove, clear.** With a
`System.out.println(food);` after each change, three more lines:

```
[sushi, hamburger, hotdog]
[sushi, hamburger]
[]
```

`set(0, "sushi")` **replaced** pizza. `remove(2)` took out hotdog. `clear()` emptied the
list, so you see `[]`.

**Check 3 (about 2:18:30 to 2:20:00): the three shopping lists.** In `TwoDArrayLists.java`:

```
[pasta, garlic bread, donuts]
pasta
[soda, coffee]
```

**Check 4 (about 2:20:50 to 2:23:45): the list of lists.** Four more lines:

```
[[pasta, garlic bread, donuts], [tomatoes, zucchini, peppers], [soda, coffee]]
[pasta, garlic bread, donuts]
pasta
coffee
```

**Check 5 (about 2:24:35 to 2:27:20): for-each.** In `ForEachLoop.java`, the four animals
print **twice**: once from the array, once from the ArrayList.

```
cat
dog
rat
bird
cat
dog
rat
bird
```

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `cannot find symbol` and `class ArrayList` | You forgot `import java.util.ArrayList;` at the top of **this** file |
| `unexpected type`, `required: reference`, `found: int` | You wrote `ArrayList<int>`. Use the wrapper class: `ArrayList<Integer>` |
| `cannot find symbol` and `variable length` | Arrays use `.length`. ArrayLists use **`.size()`** |
| `IndexOutOfBoundsException: Index 3 out of bounds for length 1` | You asked for a position that doesn't exist. Positions go from 0 to `size() - 1` |
| `incompatible types: int cannot be converted to String` | You added a number to a list of `String`s. Put text in quotes |
| `variable animals is already defined` | Two variables with the same name. Rename the ArrayList to `animalList` |
| `';' expected` on your for-each line | Inside a for-each, it is a **colon** `:`, not a semicolon: `for (String i : animals)` |
| You fixed your code, but the output did not change | You ran a **different file**. Use the ▶ **next to `main`** in the file you are working on |

### ✅ Commit Section A

When all three files match the checks, type this in the terminal:

```bash
git add -A
git commit -m "part12 follow-along: ArrayList, 2D ArrayList, for-each loops"
```

---

## In-class exercise — team roster (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy. The
`import java.util.ArrayList;` line is already there for you.

### Step 1 — Build a roster

Inside `main`, under the `STEP 1` comment, build a list of players and print this, **line by
line**:

```
Roster: [Davis, Brooks, Lee, Kim]
Size: 4
First: Davis
After set: [Davis, Brooks, Lopez, Kim]
After remove: [Davis, Lopez, Kim]
Players:
- Davis
- Lopez
- Kim
Team: [[Davis, Lopez], [Kim, Ortiz]]
Defense captain: Kim
```

Things to figure out together:

- Make an `ArrayList<String>` called `roster`. `add` the four names.
- Printing a whole ArrayList with `println` gives you the `[ ... ]` for free.
- `After set:` replaces **Lee** with **Lopez**. What index is Lee at? (Counting starts at 0.)
- `After remove:` takes out **Brooks**. What index is Brooks at **now**?
- `Players:` uses a **for-each** loop over `roster`, printing `"- "` before each name.
- `Team:` is a **2D ArrayList**. Make two lists, `offense` (Davis, Lopez) and `defense`
  (Kim, Ortiz). Then make an `ArrayList<ArrayList<String>>` called `team` and `add` both.
- `Defense captain:` is the **first** name in the **second** list. That is two `get`s in a
  row.

### Step 2 — Fix the bugs

Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't stop
your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Read the **red error**. What is Java telling you?
3. Fix the line. Run the program.
4. Do the next line.

| Broken line | The error Java gives you |
|---|---|
| `ArrayList<int> nums = new ArrayList<int>();` | `unexpected type` … `required: reference` `found: int` |
| `ArrayList<String> words = new ArrayList<String>;` | `'(' or '[' expected` |
| `System.out.println(roster.length);` | `cannot find symbol` … `symbol: variable length` |

**Hints:** an ArrayList can only hold objects, so whole numbers need the wrapper class
`Integer`. Making a new ArrayList needs `( )` at the end. Arrays have `.length`, but an
ArrayList uses the method `.size()`.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part12 in-class: team roster"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **all three files**, put a `//` comment **above every line
of code**, saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes the `import` line,
  `public class ...`, `public static void main(...)`, every `add`, `get`, `set`, `remove`,
  every loop, and every `System.out.println(...)`.
- **No:** lines that are only `}`, empty lines, and comments you already have.

**What makes a good comment?** Say what the line **does** and **what the list looks like
after it.** Do not just repeat the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// import` | `// lets me use ArrayList, which lives in java.util and is not loaded by default` |
| `// add pizza` | `// puts "pizza" at the end of the list. It is the first item, so it is at index 0` |
| `// remove 2` | `// takes out the item at index 2 (hotdog). The list shrinks to 2 items` |
| `// for each` | `// goes through animals one at a time. Each time, i is the next animal` |

Here is what a commented line looks like in your file:

```java
        // replaces whatever is at index 0 (pizza) with sushi. The size stays 3
        food.set(0, "sushi");
```

**Rules:**

1. **Your own words.** Do not copy sentences from the guide or the video. I want to know
   what **you** think the line does.
2. **Not sure what a line does?** Write your best guess, and add `(not sure)` at the end.
   An honest guess gets credit. A skipped line does not.
3. **Run all three files again when you're done.** Comments must not change the output. If
   it changed, a comment is missing its `//`.

### ✅ Commit Section B

```bash
git add -A
git commit -m "part12 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet, and no `import`. **Type
both yourself.** Put all of Stretch A and B inside the same `main`, one after the other.

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.**

```java
ArrayList<String> colors = new ArrayList<String>();
colors.add("red");
colors.add("green");
colors.add("blue");
colors.set(1, "yellow");
colors.remove(0);
System.out.println(colors);
System.out.println(colors.size());
System.out.println(colors.get(0));
for (String c : colors) {
    System.out.print(c + " ");
}
System.out.println();
```

2. **Above that code**, write what you think it will print, inside a comment:

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
[yellow, blue]
2
yellow
yellow blue 
```

- `set(1, "yellow")` replaces **green** (index 1), so the list is `[red, yellow, blue]`.
- `remove(0)` takes out **red**. Everything **slides down** one spot. Now `yellow` is at
  index 0.
- The last line has a space after `blue`, because the loop prints `" "` after every color.

</details>

### Stretch B — use them yourself

**B1.** Add up scores. Type this, then run it:

```java
ArrayList<Integer> scores = new ArrayList<Integer>();
scores.add(90);
scores.add(75);
scores.add(88);
int sum = 0;
for (int s : scores) {
    sum = sum + s;
}
System.out.println("Total: " + sum);
```

Output:

```
Total: 253
```

Notice it is `ArrayList<Integer>` (the wrapper class), but the loop can use `int s`.
That's **unboxing** from Part 11.

**Keep B1 short and neat.** The next part's warm-up is typing it again from memory.

**B2.** A playlist. Make an `ArrayList<String>` called `playlist` with four songs: `Song A`,
`Song B`, `Song C`, `Song D`. Then:

1. Use a **regular** `for` loop (with `i`) to print each song with a number in front.
2. Remove the **second** song.
3. Print how many songs are left, and the whole list.

Print exactly this:

```
1. Song A
2. Song B
3. Song C
4. Song D
Songs left: 3
[Song A, Song C, Song D]
```

**Hints:** the number is `(i + 1)`, because `i` starts at 0. The second song is at
index **1**.

**B3.** A seating chart: a 2D ArrayList.

1. Make an `ArrayList<String>` called `row1` with `Ana` and `Ben`.
2. Make an `ArrayList<String>` called `row2` with `Cam`, `Dee` and `Eli`.
3. Make an `ArrayList<ArrayList<String>>` called `seats`, and add both rows.
4. Use a for-each loop **inside** another for-each loop to print each row.
5. Print the person in the back corner using `get` twice.

Print exactly this:

```
Row: Ana Ben
Row: Cam Dee Eli
Back corner: Eli
```

**Hints:** the outside loop is `for (ArrayList<String> row : seats)`. Inside it, print
`"Row:"` with `print` (not `println`), then loop through `row` printing `" " + person`,
then a `System.out.println();` to end the line. The back corner is row 1, seat 2.

### ✅ Commit Section C

```bash
git add -A
git commit -m "part12 stretch: list predictions, scores, playlist, seating chart"
```

---

## Section D — Challenge (25 points)

*On your own.*

Do this in `Challenge.java`. It already has **two methods** in it, and the `import` line.
Each method has a line that says `// YOUR CODE`. **Change only those lines.** You can add
more lines above them inside the method.

A **test** checks your answers. To run it:

1. In `Challenge.java`, press `⌘ ⇧ T` (Mac) or `Ctrl ⇧ T` (Windows). This jumps to
   `ChallengeTest.java`.
2. Click the **green ▶** next to `class ChallengeTest`. Choose **Run**.
3. **Green ✔** means right. **Red ✗** means wrong. Click a red one and compare
   **expected** (the right answer) with **but was** (yours).

**Never change the test file.** Only change `Challenge.java`.

> **Some tests are green before you start.** That's because the starting code gives back
> `0`, and a few of the right answers happen to be `0`. They will stay green when you're
> done, as long as your code is right.

### `countEvens(ArrayList<Integer> nums)`

Give back **how many** numbers in the list are even.

| Call | Gives back |
|---|---|
| `countEvens([2, 1, 2, 3, 4])` | `3` |
| `countEvens([1, 3, 5])` | `0` |
| `countEvens([])` (empty list) | `0` |
| `countEvens([0, -2, -3, -4])` | `3` |

**Plan it in steps:**

1. Make an `int count = 0;`
2. Use a for-each loop to go through `nums`.
3. If a number is even (`n % 2 == 0`), add 1 to `count`.
4. After the loop, `return count;`

### `spread(ArrayList<Integer> nums)`

Give back the **biggest** number minus the **smallest** number. The list always has at least
one number.

| Call | Gives back |
|---|---|
| `spread([3, 9, 2, 5])` | `7` (9 − 2) |
| `spread([42])` | `0` |
| `spread([-5, 10, 0])` | `15` (10 − (−5)) |

**Plan it in steps:**

1. Make `max` and `min`, and start **both** at the first number: `nums.get(0)`.
2. Go through every number. If it's bigger than `max`, it's the new `max`. If it's smaller
   than `min`, it's the new `min`.
3. After the loop, `return max - min;`

**Why start at `nums.get(0)` and not `0`?** If every number is negative, a `max` that starts
at `0` would never change, and you'd get the wrong answer.

**✅ Done when:** all 10 tests show a **green ✔**.

### ✅ Commit Section D

```bash
git add -A
git commit -m "part12 challenge: countEvens and spread"
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
a1b2c3d part12 challenge: countEvens and spread
e4f5a6b part12 stretch: list predictions, scores, playlist, seating chart
c7d8e9f part12 comments: explained every line of the follow-along code
9d8c7b6 part12 in-class: team roster
0a1b2c3 part12 follow-along: ArrayList, 2D ArrayList, for-each loops
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part12 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part12 log"
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

**Finished early? Start Part 13.** You don't have to wait for class.

---

## My log

Fill this in before you push. Type your answers after the colons.

```
Started: Tuesday, October 20th
Finished: Tuesday, October 20th
The line that took me the longest: the spread method - line 39
```

---

## Want more help?

- **Think Java** (free online book): [Chapter 7 — Arrays and References](https://books.trinket.io/thinkjava2/chapter7.html)
  has the enhanced for loop (the for-each loop).
  [Chapter 13 — Objects of Arrays](https://books.trinket.io/thinkjava2/chapter13.html)
  uses `ArrayList`.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
