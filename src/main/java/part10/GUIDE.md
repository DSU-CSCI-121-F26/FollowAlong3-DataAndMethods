# Part 10 Guide — Arrays and 2D arrays

**The video, written out step by step.**

This page teaches the same thing as two pieces of the video:

- **Arrays:** from **1:43:42** to about **1:49:45** → you type in `ArrayBasics.java`
- **2D arrays:** from **1:50:51** to about **1:57:41** → you type in `TwoDArrays.java`

You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line yourself.** Do not copy and paste from this page.
Each step has a time, like **(video 1:43:53)**, if you want to see him do it.

---

# Part A — Arrays (`ArrayBasics.java`)

## Step 1 — What is an array? (video 1:43:42)

So far, each variable has held **one** value. An **array** holds **many** values in **one**
variable.

He says arrays are "really not that complicated, but they can seem kind of intimidating."
Let's go slowly.

Open `part10/ArrayBasics.java`. Type `main` inside the class, like every time. Everything
below goes inside `main`.

---

## Step 2 — Make an array of cars (video 1:43:53)

He starts with a normal String variable:

```java
        String car = "Camaro";
```

Then he turns it into an array. Change that line to this:

```java
        String[] cars = {"Camaro", "Corvette", "Tesla"};
```

Three things changed:

1. **`[]` after `String`.** The square brackets mean "an array of Strings," not just one
   String.
2. **Curly braces `{ }` around the values,** with commas between them.
3. **The name is plural:** `cars`, not `car`. That's not required, but it reminds you it
   holds more than one.

### Getting one value out

Each spot in an array is called an **element**. Think of them like **parking spots**, each
with a number. The numbers are called **indexes**.

**Computers start counting at 0.** So:

| Index | Element |
|---|---|
| `0` | `"Camaro"` |
| `1` | `"Corvette"` |
| `2` | `"Tesla"` |

To get an element, write the array's name, then the index in square brackets: `cars[0]`.

You can also **change** an element. Under your array line, type:

```java
        cars[0] = "Mustang";
        System.out.println(cars[0]);
```

**Run it.** Output:

```
Mustang
```

The Camaro in spot 0 was replaced by a Mustang.

Now print the other two. Add:

```java
        System.out.println(cars[1]);
        System.out.println(cars[2]);
```

**Run it.** Output:

```
Mustang
Corvette
Tesla
```

---

## Step 3 — An element that doesn't exist (video 1:45:51)

What if you ask for spot **3**? Add this line and run it:

```java
        System.out.println(cars[3]);
```

The program **crashes**. In the Run window you see:

```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at part10.ArrayBasics.main(ArrayBasics.java:19)
```

(Your line number at the end will be different.)

An **exception** is an error that happens **while the program is running**. This one says:
"You asked for index 3, but this array only has 3 elements." Those are indexes 0, 1 and 2.
There is no 3.

**Notice:** the array has **length 3**, but the **last index is 2**. The last index is
always one less than the length, because counting starts at 0.

He fixes it by adding a fourth car to the list. Change your array line to:

```java
        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
```

**Run it.** No crash. The last line prints `BMW`.

---

## Step 4 — Every element must be the same type (video 1:46:36)

Try adding a **number** to your array of Strings:

```java
        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW", 123};
```

You get a red underline, and this error:

```
error: incompatible types: int cannot be converted to String
```

An array of Strings can only hold **Strings**. An array of `int`s can only hold `int`s.
Every element must match the type in front of the `[]`.

**Take the `123` back out.**

---

## Step 5 — The second way to make an array (video 1:47:09)

Sometimes you know **how many** spots you need, but not the values yet. Then you make an
**empty** array first and fill it in later.

**Delete everything inside `main`**, and type this instead:

```java
        String[] cars = new String[3];
```

This means: "make a new array with room for **3** Strings." The spots are empty for now.

Now fill each spot, and print them:

```java
        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
```

**Run it.** Output:

```
Camaro
Corvette
Tesla
```

> **Try this:** put `//` in front of `cars[1] = "Corvette";` and run it again. The middle
> line prints `null`. **`null` means "nothing is here."** An empty String spot holds `null`
> until you put something in it. Take the `//` back out.

---

## Step 6 — Print every element with a `for` loop (video 1:48:37)

Printing each element on its own line works for 3 cars. But what about 300? Use a `for`
loop (part 08). Add this at the end of `main`:

```java
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
```

- **`cars.length`** is how many elements the array has. Here it's 3.
- The loop goes `i` = 0, 1, 2. It stops when `i` is 3, because 3 is not `< 3`.
- **`cars[i]`** uses the counter as the index. So it prints `cars[0]`, then `cars[1]`, then
  `cars[2]`.

**Use `<`, not `<=`.** With `<=`, the loop would try `cars[3]`, and you'd get the
`ArrayIndexOutOfBoundsException` from Step 3.

**Notice:** `cars.length` has **no parentheses**. That's different from Strings, which you'll
see on part 11.

**Run it.** Output:

```
Camaro
Corvette
Tesla
Camaro
Corvette
Tesla
```

The first three lines come from your three `println`s. The last three come from the loop.

---

# Part B — 2D arrays (`TwoDArrays.java`)

## Step 7 — What is a 2D array? (video 1:50:51)

A **2D array** is an **array of arrays**. Think of it as a grid with **rows** and
**columns**, like a parking lot. Each spot has a row number and a column number.

Open `part10/TwoDArrays.java`. Type `main` inside the class.

---

## Step 8 — Make a 3 × 3 parking lot (video 1:50:51)

Type:

```java
        String[][] cars = new String[3][3];
```

- **Two** sets of square brackets, `[][]`, mean a 2D array.
- `new String[3][3]` means **3 rows**, and **3 columns** in each row. That's 9 spots.

To reach a spot, give **two** indexes: `cars[row][column]`. Both start at 0.

Now fill in all 9 spots:

```java
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";
```

Here's the parking lot you just made:

| | column 0 | column 1 | column 2 |
|---|---|---|---|
| **row 0** | Camaro | Corvette | Silverado |
| **row 1** | Mustang | Ranger | F-150 |
| **row 2** | Ferrari | Lambo | Tesla |

**He copies and pastes rows to go faster. You type them.**

---

## Step 9 — Print the whole grid with nested loops (video 1:53:36)

Remember nested loops from part 08? The outer loop does **rows**, and the inner loop does
**columns**. Under your 9 lines, type:

```java
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
```

**Run it.** Output:

```

Camaro Corvette Silverado 
Mustang Ranger F-150 
Ferrari Lambo Tesla 
```

Just like the rectangle on part 08, there's an empty line at the top, because `println()`
runs **before** each row.

---

## Step 10 — What do `cars.length` and `cars[i].length` mean? (video 1:53:36)

He says the inner loop's condition "is going to look a little funky." Here's what it means:

- **`cars.length`** is the number of **rows**. A 2D array is an array of rows, so its length
  is how many rows it has: **3**.
- **`cars[i]`** is **one row**. It's a normal array of Strings.
- **`cars[i].length`** is the number of **columns in that row**: also **3** here.

And `cars[i][j]` means "row `i`, column `j`."

---

## Step 11 — The second way: fill it in right away (video 1:55:34)

Just like regular arrays, you can put the values in when you make the 2D array. Each row is
its own `{ }`, and the whole thing goes inside one more `{ }`.

**Delete** the `new String[3][3]` line **and** your 9 lines that fill in the spots. Put this
in their place, at the top of `main`:

```java
        String[][] cars = {
                {"Camaro", "Corvette", "Silverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla"}
        };
```

- Each inner `{ }` is one **row**.
- There's a **comma** after each row, except the last.
- There's a **semicolon** after the final `}`.
- Putting each row on its own line is not required. It just makes it look like a grid.

**Keep your nested loops.** **Run it.** The output is **exactly the same** as Step 9.

---

## Your finished programs

Your files should look something like these now. **Compare them to yours. Do not copy
them.**

<details>
<summary>Click to compare ArrayBasics.java</summary>

```java
package part10;

// (the comments at the top of your file)

public class ArrayBasics {
    public static void main(String[] args) {
        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
```

</details>

<details>
<summary>Click to compare TwoDArrays.java</summary>

```java
package part10;

// (the comments at the top of your file)

public class TwoDArrays {
    public static void main(String[] args) {
        String[][] cars = {
                {"Camaro", "Corvette", "Silverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla"}
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
```

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B:
put a comment above every line, **in your own words**. Do not copy the explanations from
this guide.
