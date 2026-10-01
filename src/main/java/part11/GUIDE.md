# Part 11 Guide — String methods and wrapper classes

**The videos, written out step by step.**

This page teaches the same thing as two videos:

- **String methods**, from about **1:58:15 to 2:03:35** → you type in `StringMethods.java`
- **Wrapper classes**, from about **2:04:27 to 2:11:35** → you type in `WrapperClasses.java`

You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line yourself.** Do not copy and paste from this page.
Each step has a time, like **(video 1:59:11)**, if you want to see him do it.

---

# Video 1 — String methods (`StringMethods.java`)

## Step 1 — Make a String (video 1:58:50)

A `String` is text, like a name or a sentence. It is a **reference data type**. That means
it is an object, and objects come with **methods**: built-in tools you can use with a dot.

Open `part11/StringMethods.java`. Inside the class, type the `main` method. Then, inside
`main`, make a String:

```java
    public static void main(String[] args) {
        String name = "Bro";

    }
```

He uses his name, `"Bro"`. **Use `"Bro"` too**, so your output matches this page. You can
try your own name when you are done.

> **When he types `name.`, a list of methods pops up on his screen.** On yours, nothing pops
> up, because you turned autocomplete off. That is expected. You type the method names
> yourself.

---

## Step 2 — `equals` (video 1:59:11)

`equals` checks if two Strings have **exactly** the same letters. It gives back a
`boolean`: `true` or `false`.

Under `String name = "Bro";`, type:

```java
        boolean equalsResult = name.equals("Bro");
        System.out.println(equalsResult);
```

**Run it.** Output:

```
true
```

> **He calls his variable `result` every time, and turns the old line into a comment
> before each new one. Don't.** Give each one its own name, like `equalsResult`. If you use
> `result` twice, you get this error:
>
> ```
> error: variable result is already defined in method main(String[])
> ```
>
> A name can only be used **once** inside the same `main`.

Now try it with a lowercase `b`:

```java
        boolean lowerResult = name.equals("bro");
        System.out.println(lowerResult);
```

**Run it.** The new line says:

```
false
```

`equals` **cares about capital letters.** `"Bro"` and `"bro"` are different.

---

## Step 3 — `equalsIgnoreCase` (video 2:00:08)

What if you don't care about capitals? Use `equalsIgnoreCase`:

```java
        boolean ignoreResult = name.equalsIgnoreCase("bro");
        System.out.println(ignoreResult);
```

**Run it.** So far, your output is:

```
true
false
true
```

---

## Step 4 — `length` (video 2:00:18)

`length()` counts the characters in a String. It gives back an `int`.

```java
        int lengthResult = name.length();
        System.out.println(lengthResult);
```

New output line:

```
3
```

`"Bro"` has 3 letters. **Don't forget the `()`.** Without them you get:

```
error: cannot find symbol
  symbol:   variable length
```

---

## Step 5 — `charAt` (video 2:00:46)

`charAt` gives back **one character** at a position. The position is called an **index**.

**Indexes start at 0, not 1.**

| Index | 0 | 1 | 2 |
|---|---|---|---|
| Character in `"Bro"` | `B` | `r` | `o` |

```java
        char charResult = name.charAt(0);
        System.out.println(charResult);
```

New output line:

```
B
```

What if you ask for an index that does not exist, like `name.charAt(3)`? The program
crashes when it runs:

```
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 3 out of bounds for length 3
```

"Out of bounds" means "that position does not exist." `"Bro"` only has 0, 1 and 2.

---

## Step 6 — `indexOf` (video 2:01:13)

`indexOf` is the opposite of `charAt`. You give it a letter, and it tells you **where** it
is. It gives back an `int`.

He tries `"B"` first (that gives `0`), then `"o"`. Type the `"o"` version:

```java
        int indexResult = name.indexOf("o");
        System.out.println(indexResult);
```

New output line:

```
2
```

`o` is at index 2. Look back at the table in Step 5.

**Careful:** the answer is an `int`, so the variable must be an `int`. If you write
`char indexResult = ...`, you get:

```
error: incompatible types: possible lossy conversion from int to char
```

---

## Step 7 — `isEmpty` (video 2:01:43)

`isEmpty()` gives back `true` if the String has **no characters at all** (`""`), and
`false` otherwise.

```java
        boolean emptyResult = name.isEmpty();
        System.out.println(emptyResult);
```

New output line:

```
false
```

`"Bro"` is not empty. (He changes his name to `""` to show you `true`. You can try it, then
change it back.)

---

## Step 8 — `toUpperCase` and `toLowerCase` (video 2:02:10)

These give back a **new** String with all capitals, or all lowercase.

```java
        String upperResult = name.toUpperCase();
        System.out.println(upperResult);

        String lowerCaseResult = name.toLowerCase();
        System.out.println(lowerCaseResult);
```

New output lines:

```
BRO
bro
```

**Important:** `name` is still `"Bro"`. These methods do **not** change `name`. They make a
brand-new String and give it back. That is why you store it in a new variable.

---

## Step 9 — `trim` (video 2:02:41)

`trim()` removes spaces at the **start and end** of a String. Spaces in the middle stay.

He adds spaces to his name to show this. **You make a separate variable instead,** so
`name` stays `"Bro"`:

```java
        String spaced = "   Bro   ";
        String trimResult = spaced.trim();
        System.out.println("[" + spaced + "]");
        System.out.println("[" + trimResult + "]");
```

The `[` and `]` are just there so you can **see** where the spaces are. New output lines:

```
[   Bro   ]
[Bro]
```

---

## Step 10 — `replace` (video 2:03:03)

`replace` swaps every copy of one character for another. You give it two things: the
**old** character and the **new** one.

```java
        String replaceResult = name.replace('o', 'a');
        System.out.println(replaceResult);
```

New output line:

```
Bra
```

Use **single quotes on both** (`'o'`, `'a'`) or **double quotes on both** (`"o"`, `"a"`).
If you mix them, you get:

```
error: no suitable method found for replace(String,char)
```

### Your finished `StringMethods.java` output

```
true
false
true
3
B
2
false
BRO
bro
[   Bro   ]
[Bro]
Bra
```

---

# Video 2 — Wrapper classes (`WrapperClasses.java`)

## Step 11 — What is a wrapper class? (video 2:04:56)

Java has two kinds of data types:

- **Primitive types**: `boolean`, `char`, `int`, `double` (and a few others). Lowercase
  names. They are simple and fast.
- **Reference types**: objects, like `String`. Capital first letter. They are slower, but
  they come with **methods**, and some tools only work with them.

Every primitive type has a matching **wrapper class**: an object version of it.

| Primitive | Wrapper class |
|---|---|
| `boolean` | `Boolean` |
| `char` | `Character` |
| `int` | `Integer` |
| `double` | `Double` |

The rule: **capital first letter**, and the name is spelled out (`Integer`, not `Int`;
`Character`, not `Char`).

**Why care?** In Part 12 you meet `ArrayList`. It can **only** hold objects, so to store
numbers in one, you need `Integer` instead of `int`.

---

## Step 12 — Autoboxing (video 2:07:30)

**Autoboxing** means Java turns a primitive value into its wrapper class **for you**. You
just write `=` like normal.

Open `part11/WrapperClasses.java`. Type the `main` method. Inside it, type:

```java
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
```

Each one is an **object** now, but you set it just like a normal variable.

---

## Step 13 — String was a reference type all along (video 2:08:12)

He adds one more:

```java
        String e = "Bro";
```

Notice `String` has always had a **capital S**. That's because `String` has always been a
reference type, just like the wrapper classes.

> **Grey or yellow highlights are not errors.** IntelliJ may grey out `c`, `d` and `e`
> because you never use them, or put a yellow line under something. Those are just
> suggestions. Only **red** means something is wrong.

---

## Step 14 — Wrapper classes have methods (video 2:09:09)

He types `a.`, then `b.`, `c.` and `d.`, to show that each one has a list of methods, like
`String` does. Yours won't pop up. **You don't need to type anything for this step.** Just
know that the methods are there.

---

## Step 15 — Unboxing (video 2:10:05)

**Unboxing** is the reverse of autoboxing: Java turns the wrapper object **back** into a
primitive when it needs to. So you can use `a` and `b` in an `if` just like normal values.

Under your variables, type:

```java
        if (a == true) {
            System.out.println("This is true");
        }

        if (b == '@') {
            System.out.println("This is true");
        }
```

**Run it.** Output:

```
This is true
This is true
```

Both are `true`. Even though `a` is a `Boolean` object and `b` is a `Character` object,
Java unboxes them so the `==` comparison works.

### The trade-off (video 2:10:50)

He ends with this point:

- **Wrapper classes:** have methods, and work with tools like `ArrayList`. But they are
  **slower**.
- **Primitives:** **faster**. Use them unless you need a wrapper.

### Try this too (not in the video)

Unboxing works with math too. Add these lines and run it:

```java
        System.out.println(c + 1);
        System.out.println(d * 2);
```

```
124
6.28
```

Delete them again before you commit, or keep them and comment them in Section B. Your choice.

---

## Your finished programs

**Compare them to yours. Do not copy them.**

<details>
<summary>Click to compare StringMethods.java</summary>

```java
package part11;

// (the comments at the top of your file)

public class StringMethods {
    public static void main(String[] args) {
        String name = "Bro";

        boolean equalsResult = name.equals("Bro");
        System.out.println(equalsResult);

        boolean lowerResult = name.equals("bro");
        System.out.println(lowerResult);

        boolean ignoreResult = name.equalsIgnoreCase("bro");
        System.out.println(ignoreResult);

        int lengthResult = name.length();
        System.out.println(lengthResult);

        char charResult = name.charAt(0);
        System.out.println(charResult);

        int indexResult = name.indexOf("o");
        System.out.println(indexResult);

        boolean emptyResult = name.isEmpty();
        System.out.println(emptyResult);

        String upperResult = name.toUpperCase();
        System.out.println(upperResult);

        String lowerCaseResult = name.toLowerCase();
        System.out.println(lowerCaseResult);

        String spaced = "   Bro   ";
        String trimResult = spaced.trim();
        System.out.println("[" + spaced + "]");
        System.out.println("[" + trimResult + "]");

        String replaceResult = name.replace('o', 'a');
        System.out.println(replaceResult);
    }
}
```

</details>

<details>
<summary>Click to compare WrapperClasses.java</summary>

```java
package part11;

// (the comments at the top of your file)

public class WrapperClasses {
    public static void main(String[] args) {
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

        if (a == true) {
            System.out.println("This is true");
        }
        if (b == '@') {
            System.out.println("This is true");
        }
    }
}
```

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B: put a
comment above every line, **in your own words**. Do not copy the explanations from this
guide.
