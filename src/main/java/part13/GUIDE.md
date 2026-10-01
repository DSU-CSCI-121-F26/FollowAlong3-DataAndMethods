# Part 13 Guide — Methods

**The video, written out step by step.**

This page teaches the same thing as the video from about **2:27:54 to 2:39:30**. You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line into `Methods.java` yourself.** Do not copy and
paste from this page. Each step has a time, like **(video 2:28:43)**, if you want to see
him do it.

---

## Step 1 — What is a method? (video 2:28:20)

A **method** is a block of code with a name. It runs whenever you **call** it, by writing
its name.

You already know one method: `main`. When you click ▶, Java calls `main`, and everything
between its `{ }` runs. In this part you make your **own** methods, and call them from `main`.

Open `part13/Methods.java`. Type the `main` method, with nothing inside yet:

```java
    public static void main(String[] args) {

    }
```

---

## Step 2 — Write a method called `hello` (video 2:28:43)

Your new method goes **outside `main`, but inside the class.** Click after `main`'s closing
`}`, press Enter, and type:

```java
    void hello() {
        System.out.println("hello");
    }
```

Your file now looks like this:

```java
public class Methods {
    public static void main(String[] args) {

    }

    void hello() {
        System.out.println("hello");
    }
}
```

What each piece of `void hello()` means:

| Piece | What it means |
|---|---|
| `void` | This method **gives nothing back**. It just does its job. (More on this in Step 8) |
| `hello` | The method's name. Method names start with a **lowercase** letter |
| `()` | Where values come in. Empty for now |
| `{ }` | The code that runs when the method is called |

If you put the method **inside** `main` by mistake, you get:

```
error: illegal start of expression
```

---

## Step 3 — Call it, and fix the `static` error (video 2:30:08)

Inside `main`, **call** the method by writing its name, with `()` and `;`:

```java
        hello();
```

Now `hello` is underlined in red. If you run it, you get:

```
error: non-static method hello() cannot be referenced from a static context
```

(His screen in Eclipse says *"cannot make a static reference to the non-static method."*
Same problem.)

**The fix:** put `static` in front of your method:

```java
    static void hello() {
        System.out.println("hello");
    }
```

Why? `main` is `static`, and a `static` method can only call other `static` methods
directly. You'll learn what `static` really means in Part 19. **For now: always write
`static` on your methods.**

**Run it.** Output:

```
hello
```

---

## Step 4 — Call it three times (video 2:31:06)

You can call a method **as many times as you want.** In `main`, call it three times:

```java
        hello();
        hello();
        hello();
```

**Run it.** Output:

```
hello
hello
hello
```

The code inside `hello` was written once, but it ran three times.

---

## Step 5 — Send a value in: arguments and parameters (video 2:31:34)

You can **send a value into** a method when you call it.

In `main`, above your calls, make a variable:

```java
        String name = "Bro";
```

Change your three calls to **one** call that sends `name` in:

```java
        hello(name);
```

Now it's red again. The method doesn't have a place to **receive** a value yet. Change the
method's first line to add a **parameter** inside the `()`:

```java
    static void hello(String name) {
        System.out.println("Hello " + name);
    }
```

Two new words:

| Word | What it is | Where |
|---|---|---|
| **argument** | The value you **send** | In the call: `hello(name)` |
| **parameter** | The variable that **receives** it | In the method's first line: `hello(String name)` |

A parameter has a **type** and a **name**, like any variable: `String name`.

**Run it.** Output:

```
Hello Bro
```

---

## Step 6 — The names don't have to match (video 2:32:30)

The argument and the parameter **don't need the same name.** He shows this by renaming the
parameter to `title`:

```java
    static void hello(String title) {
        System.out.println("Hello " + title);
    }
```

It still prints `Hello Bro`. Java sends the **value** `"Bro"`, not the name. You can try
this, then change it back to `name`.

**Why `hello` can't just use `main`'s `name` directly:** variables made inside `main` only
exist inside `main`. If `hello` tries to use `name` without a parameter, you get:

```
error: cannot find symbol
  symbol:   variable name
```

That's why you pass it in.

---

## Step 7 — Two arguments (video 2:34:25)

In `main`, add an age, and send **both** values:

```java
        int age = 21;
        hello(name, age);
```

It's red again. If you run it, you get:

```
error: method hello in class Methods cannot be applied to given types;
  required: String
  found:    String,int
  reason: actual and formal argument lists differ in length
```

Read it like this: **required** is what the method takes (one `String`). **found** is what
you sent (a `String` and an `int`). They have to **match**: same number, same types, same
order.

Fix it by adding a second parameter, separated by a comma. Then use it:

```java
    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }
```

**Run it.** Output:

```
Hello Bro
You are 21
```

---

## Step 8 — Return types: a method that gives an answer back (video 2:35:24)

So far, `hello` **does** something (prints), but gives nothing back. That's what `void`
means.

Some methods **work something out and give the answer back.** He shows this with a method
that adds two numbers.

> **He deletes all his `hello` code here. Don't.** Keep it. Put the new code underneath.

In `main`, **under** your `hello(name, age);` line, add:

```java
        int x = 3;
        int y = 4;
```

Then, **below** your `hello` method (still inside the class), write a new method:

```java
    static int add(int x, int y) {
        int z = x + y;
        return z;
    }
```

What's new:

| Piece | What it means |
|---|---|
| `int` (instead of `void`) | The **return type**. This method gives back an `int` |
| `return z;` | Sends the value of `z` **back** to whoever called `add` |

If the return type says `int` but you forget the `return` line, you get:

```
error: missing return statement
```

---

## Step 9 — Call `add`, and use the answer (video 2:37:00)

In `main`, call it:

```java
        add(x, y);
```

**Run it.** Nothing new prints. **That's not a bug.** `add` gave back `7`, but nobody did
anything with it. The answer just disappeared.

Change that line to **store** the answer, then print it:

```java
        int z = add(x, y);
        System.out.println(z);
```

**Run it.** Output:

```
Hello Bro
You are 21
7
```

### Two variables called `z`? (video 2:37:50)

There's an `int z` in `main` **and** an `int z` in `add`. That's allowed. Each one is a
**local variable**: it only exists inside the `{ }` of the method that made it. `main`
can't see `add`'s `z`, and `add` can't see `main`'s.

---

## Step 10 — Print the answer directly (video 2:38:30)

You don't have to store the answer first. You can put the call **right inside**
`println`:

```java
        System.out.println(add(x, y));
```

Java runs `add(x, y)` first, gets `7`, then prints it. **Run it.** One more `7`:

```
Hello Bro
You are 21
7
7
```

---

## Step 11 — A shorter `add` (video 2:39:14)

Inside `add`, you don't need the `z` variable. You can return the math directly. Change
`add` to:

```java
    static int add(int x, int y) {
        return x + y;
    }
```

**Run it.** The output doesn't change. Same answer, less code.

---

## Your finished program

Your `Methods.java` should look something like this now. **Compare it to yours. Do not
copy it.**

<details>
<summary>Click to compare</summary>

```java
package part13;

// (the comments at the top of your file)

public class Methods {
    public static void main(String[] args) {
        String name = "Bro";
        int age = 21;

        hello(name, age);

        int x = 3;
        int y = 4;

        int z = add(x, y);
        System.out.println(z);
        System.out.println(add(x, y));
    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }

    static int add(int x, int y) {
        return x + y;
    }
}
```

Output:

```
Hello Bro
You are 21
7
7
```

</details>

---

## The whole video in four sentences

1. A **method** is a named block of code that runs when you **call** it.
2. Values you send **in** are **arguments**. The method receives them in **parameters**,
   and they must match in number, type and order.
3. `void` means the method gives nothing back. Any other type (like `int`) means it
   **returns** a value of that type, using `return`.
4. Variables made inside a method are **local**: they only exist inside that method.

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B: put a
comment above every line, **in your own words**. Do not copy the explanations from this
guide.
