# Part 11 — String methods and wrapper classes

**We start this together in class · due before the next lecture · No AI**

In this part you learn the tools that come built into every `String`, and you meet the
"wrapper" version of `int`, `double`, `char` and `boolean`.

**What you learn:**

- **String methods**: built-in tools you use with a dot, like `name.length()` or
  `name.toUpperCase()`
- that **Strings never change**. A method like `toUpperCase()` gives you a **new** String
  and leaves the old one alone
- **wrapper classes**: `Integer`, `Double`, `Character` and `Boolean`, the "object" versions
  of `int`, `double`, `char` and `boolean`
- **autoboxing** and **unboxing**: Java switching between the two versions for you

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
| **A · Follow along** | `StringMethods.java`, `WrapperClasses.java` | 25 | `part11 follow-along: String methods, wrapper classes` |
| **B · Comments** | `StringMethods.java`, `WrapperClasses.java` | 25 | `part11 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` | 25 | `part11 stretch: string predictions, trim, wrappers, username` |
| **D · Challenge** | `Challenge.java` | 25 | `part11 challenge: initials and swapEnds` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part10/Stretch.java`. Look at your **Stretch B1** code for **30 seconds**.
2. Close it.
3. Open `part11/Warmup.java`. **Without looking back**, type Stretch B1 again, inside a
   `main` method you type yourself.
4. Run it with the **green ▶** next to `main`. It should print the same thing it printed
   last time.
5. If it does not match, try to fix it yourself first. Look back only if you are really
   stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

This part has **two short videos**, one after the other. Each one gets its own file.

| Video | Your file | Start | Stop |
|---|---|---|---|
| String methods | `StringMethods.java` | **▶ [about 1:58:15](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7095s)** | about 2:03:35 |
| Wrapper classes | `WrapperClasses.java` | **▶ [about 2:04:27](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7467s)** | about 2:11:35 |

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

That is about 13 minutes of video. It will take you about 25 minutes, because you keep
pausing to type. That is normal.

> The times might be off by a minute or two. Listen for what he says:
>
> - **String methods start** when he says *"I'm going to teach you guys about a few useful
>   methods of the String class."* **Stop** when he says *"those are a few of the more
>   useful String methods."*
> - **Wrapper classes start** when he says *"I'm going to teach you guys about wrapper
>   classes."* **Stop** when he says *"that's the basics of wrapper classes."*

### His screen looks different from yours

**He makes a new project. You don't.** Your files already exist. Open `StringMethods.java`
for the first video and `WrapperClasses.java` for the second.

**His class is called `Main`. Yours is called `StringMethods` (or `WrapperClasses`).** Leave
the `package part11;` line and the `public class ...` line alone. Type everything else,
starting with `public static void main(String[] args)`.

**He types `name.` and a list of methods pops up.** Yours **will not** pop up, because you
turned autocomplete off in Part 00. That is expected. Just watch his list. You type the
method names yourself.

**He reuses the same variable name, `result`, for every method.** Each time, he turns the
old line into a comment first. **Do it differently:** give each one **its own name** and
print it, like this:

```java
        boolean equalsResult = name.equals("Bro");
        System.out.println(equalsResult);

        int lengthResult = name.length();
        System.out.println(lengthResult);
```

Why? If you use `result` twice, Java stops you:

```
error: variable result is already defined in method main(String[])
```

And with your own names, all of your code keeps running, so you have more to explain in
Section B.

**He uses his name, `"Bro"`.** Use `"Bro"` too, so your output matches the checks below.
You can try your own name after.

**For `trim`, he adds spaces to his name.** Make a **separate** variable with spaces in it
instead, so `name` stays `"Bro"` for everything else:

```java
        String spaced = "   Bro   ";
```

**In the wrapper video he types `a.` and `b.` to show you lists of methods.** Again, yours
will not pop up. Just watch.

**Yellow or grey highlights are not errors.** In `WrapperClasses.java`, IntelliJ may put a
yellow line under `a == true` or grey out `c`, `d` and `e`. Those are suggestions. Only
**red** means something is wrong.

### Check your output as you go

After each step, run your code. If you used the same names and order as the guide, your
output grows like this.

**Check 1 (about 1:59 to 2:00:20): `equals` and `equalsIgnoreCase`.**

```
true
false
true
```

`equals` cares about capital letters, so `"Bro"` and `"bro"` are **not** equal.
`equalsIgnoreCase` does not care, so they are.

**Check 2 (about 2:00:20 to 2:01:45): `length`, `charAt`, `indexOf`.** Three more lines:

```
3
B
2
```

`"Bro"` has 3 letters. The character at index 0 is `B`. The letter `o` is at index 2.
**Counting starts at 0, not 1.**

**Check 3 (about 2:01:45 to 2:03:35): `isEmpty`, `toUpperCase`, `toLowerCase`, `trim`,
`replace`.** The rest:

```
false
BRO
bro
[   Bro   ]
[Bro]
Bra
```

The square brackets are there so you can **see** the spaces. The guide shows how.

**Check 4 (about 2:07:30 to 2:11:35): wrapper classes.** In `WrapperClasses.java`:

```
This is true
This is true
```

Even though `a` is a `Boolean` (capital B), `a == true` works like a normal `boolean`. That
is **unboxing**.

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `variable result is already defined in method main(String[])` | You used the same variable name twice. Give each one its own name |
| `cannot find symbol` and `class string` | `String` needs a **capital S** |
| `cannot find symbol` and `variable length` | You forgot the `()`. It is `name.length()`, with parentheses |
| `possible lossy conversion from int to char` | `indexOf` gives back an `int`, not a `char`. Use `int` for its variable |
| `no suitable method found for replace(String,char)` | Use the **same kind of quotes** on both sides: `replace('o', 'a')` or `replace("o", "a")` |
| `StringIndexOutOfBoundsException: Index 3 out of bounds for length 3` | You asked for a position that does not exist. `"Bro"` only has positions 0, 1 and 2 |
| You fixed your code, but the output did not change | You ran a **different file**. Use the ▶ **next to `main`** in the file you are working on |

### ✅ Commit Section A

When both files match the checks, type this in the terminal:

```bash
git add -A
git commit -m "part11 follow-along: String methods, wrapper classes"
```

---

## In-class exercise — clean up a messy name (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

### Step 1 — Clean up a name

Inside `main`, under the `STEP 1` comment, start with this messy name. It has extra
spaces at both ends:

```java
String name = "  jordan smith  ";
```

Then, together, use the String methods from the video to print this, **line by line**:

```
Trimmed: [jordan smith]
Length: 12
Shout: JORDAN SMITH
First letter: j
Space at: 6
Handle: jordan_smith
Is it jordan_smith? true
Is it JORDAN_SMITH? true
Doubled: 24
```

Things to figure out together:

- **Trim first.** Save `name.trim()` in a new variable called `clean`. Use `clean` for
  everything after that. Remember: `trim()` does **not** change `name`. Strings never
  change. It gives you a **new** String.
- The `[` `]` around `jordan smith` are there so you can **see** that the spaces are gone.
- `Space at: 6` comes from `indexOf(" ")`. Counting starts at **0**, so `j` is at 0.
- `Handle:` uses `replace(" ", "_")`. Save it in a variable called `handle`.
- The two `Is it` lines: one uses `equals`, one uses `equalsIgnoreCase`. Which is which?
- `Doubled:` is wrappers. Store `clean.length()` in an **`Integer`** called `letters`, then
  put `letters * 2` in an **`int`**. Java unboxes the `Integer` for you.

### Step 2 — Fix the bugs

Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't stop
your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Read the **red error**. What is Java telling you?
3. Fix the line. Run the program.
4. Do the next line.

| Broken line | The error Java gives you |
|---|---|
| `int size = "Sting".length;` | `cannot find symbol` … `symbol: variable length` |
| `String initial = "Sting".charAt(0);` | `incompatible types: char cannot be converted to String` |
| `String shout = "Sting".toUppercase();` | `cannot find symbol` … `symbol: method toUppercase()` |

**Hints:** `length` is a method, so it needs `( )`. `charAt` gives back a `char`, not a
`String`, so the variable type has to match. Method names are case-sensitive: look at the
capital letters in `toUpperCase`.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part11 in-class: name cleanup"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **both** `StringMethods.java` and `WrapperClasses.java`, put
a `//` comment **above every line of code**, saying **in your own words** what that line
does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes `public class ...`,
  `public static void main(...)`, every variable, every `if`, and every
  `System.out.println(...)`.
- **No:** lines that are only `}`, empty lines, and comments you already have.

**What makes a good comment?** Say what the line **does** and **what it gives back.** Do
not just repeat the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// length` | `// length() counts the letters in name and gives back 3, which I store in lengthResult` |
| `// charAt 0` | `// charAt(0) gives back the first letter, because counting starts at 0` |
| `// uppercase` | `// makes a NEW string in all capitals. name itself does not change` |
| `// Integer c` | `// Integer is the object version of int. Java puts 123 inside it for me (autoboxing)` |

Here is what a commented line looks like in your file:

```java
        // equals checks if two strings have exactly the same letters, capitals count
        boolean equalsResult = name.equals("Bro");
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
git commit -m "part11 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.** Put
all of Stretch A and B inside the same `main`, one after the other.

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.**

```java
String word = "Java";
System.out.println(word.length());
System.out.println(word.charAt(1));
System.out.println(word.indexOf("v"));
System.out.println(word.toUpperCase());
System.out.println(word.replace('a', 'o'));
System.out.println(word.equals("java"));
System.out.println(word.equalsIgnoreCase("java"));
System.out.println(word);
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
4
a
2
JAVA
Jovo
false
true
Java
```

- `charAt(1)` is the **second** letter, because counting starts at 0.
- `replace` changes **every** `a`, not just the first one.
- `equals("java")` is `false` because of the capital `J`.
- **The last line is the big one.** After `toUpperCase()` and `replace(...)`, `word` is
  **still** `Java`. String methods give you a **new** String. They never change the old
  one.

</details>

### Stretch B — use them yourself

**B1.** Clean up a city name. Type this, then run it:

```java
String city = "  Dover  ";
String clean = city.trim();
System.out.println(clean.toUpperCase());
System.out.println(clean.length());
System.out.println(clean.charAt(0));
```

Output:

```
DOVER
5
D
```

**Keep B1 short and neat.** The next part's warm-up is typing it again from memory.

**B2.** Wrapper classes. Make these variables using the **wrapper** types, then use them
like normal numbers:

- an `Integer` called `apples` set to `5`, and an `Integer` called `oranges` set to `10`
- an `int` called `fruit` that adds them together
- a `Double` called `price` set to `9.99`
- a `Boolean` called `isOpen` set to `true`

Print exactly this:

```
Fruit: 15
Two cost: 19.98
The store is open
```

**Hints:** `"Two cost: " + price * 2` does the math first, then joins it to the text. The
last line comes from an `if (isOpen)`.

**B3.** Make a username. Start with:

```java
String first = "Jordan";
String last = "Smith";
```

Using only `toLowerCase()` and `charAt(0)`, make a username that is **the first letter of
the first name plus the whole last name**, all lowercase. Then print it, and print it again
with `@desu.edu` on the end:

```
jsmith
jsmith@desu.edu
```

**Hint:** `first.toLowerCase().charAt(0)` gives you the `'j'`. Join it to the last name
with `+`.

### ✅ Commit Section C

```bash
git add -A
git commit -m "part11 stretch: string predictions, trim, wrappers, username"
```

---

## Section D — Challenge (25 points)

*On your own.*

Do this in `Challenge.java`. It already has **two methods** in it. Each one has a line that
says `// YOUR CODE`. **Change only those lines.**

A **test** checks your answers. To run it:

1. In `Challenge.java`, press `⌘ ⇧ T` (Mac) or `Ctrl ⇧ T` (Windows). This jumps to
   `ChallengeTest.java`.
2. Click the **green ▶** next to `class ChallengeTest`. Choose **Run**.
3. **Green ✔** means right. **Red ✗** means wrong. Click a red one and compare
   **expected** (the right answer) with **but was** (yours).

**Never change the test file.** Only change `Challenge.java`.

> **One test is green before you start.** The starting code gives back `""` (empty), and
> `swapEnds("")` really should give back `""`. It will stay green when you're done, as long
> as your code is right.

### `initials(String first, String last)`

Give back the first letter of each name, **in capitals**, each followed by a period.

| Call | Gives back |
|---|---|
| `initials("jordan", "smith")` | `"J.S."` |
| `initials("Ada", "Lovelace")` | `"A.L."` |
| `initials("a", "b")` | `"A.B."` |

**Hint:** `first.toUpperCase().charAt(0)` is the first letter, in capitals.

> ⚠️ **Watch out for this trap.** If you add two `char`s with `+`, Java adds their **number
> codes**, not the letters. `'J' + 'S'` gives `157`, not `"JS"`. Put a String like `"."`
> between them and the problem goes away, because `char + String` makes a String.

### `swapEnds(String s)`

Give back the word with its **first and last letters swapped**. If the word is shorter than
2 letters, give it back **unchanged**.

| Call | Gives back |
|---|---|
| `swapEnds("code")` | `"eodc"` |
| `swapEnds("hello")` | `"oellh"` |
| `swapEnds("ab")` | `"ba"` |
| `swapEnds("a")` | `"a"` |
| `swapEnds("")` | `""` |

**You need one new String method** that was not in the video: `substring`.
`s.substring(1, s.length() - 1)` gives you **everything except the first and last
letters**. For `"hello"`, that is `"ell"`.

**Plan it in steps:**

1. If `s.length()` is less than 2, `return s;`
2. Get the first letter: `s.charAt(0)`
3. Get the last letter: `s.charAt(s.length() - 1)` (the last position is always length − 1)
4. Return: last letter + middle + first letter

**✅ Done when:** all 10 tests show a **green ✔**.

### ✅ Commit Section D

```bash
git add -A
git commit -m "part11 challenge: initials and swapEnds"
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
a1b2c3d part11 challenge: initials and swapEnds
e4f5a6b part11 stretch: string predictions, trim, wrappers, username
c7d8e9f part11 comments: explained every line of the follow-along code
9d8c7b6 part11 in-class: name cleanup
0a1b2c3 part11 follow-along: String methods, wrapper classes
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part11 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part11 log"
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

**Finished early? Start Part 12.** You don't have to wait for class.

---

## My log

Fill this in before you push. Type your answers after the colons.

```
Started: October 20th Tuesday
Finished: October 20th Tuesday
The line that took me the longest: understanding the swapEnds
```

---

## Want more help?

- **Think Java** (free online book): [Chapter 9 — Immutable Objects](https://books.trinket.io/thinkjava2/chapter9.html).
  Read the parts about Strings being immutable (they never change) and about wrapper
  classes. For more String methods, see [Chapter 6](https://books.trinket.io/thinkjava2/chapter6.html).
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
