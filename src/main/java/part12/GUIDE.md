# Part 12 Guide — ArrayList, 2D ArrayList, and the for-each loop

**The videos, written out step by step.**

This page teaches the same thing as three videos:

- **ArrayList**, from about **2:12:02 to 2:16:20** → you type in `ArrayLists.java`
- **2D ArrayList**, from about **2:16:50 to 2:23:45** → you type in `TwoDArrayLists.java`
- **for-each loop**, from about **2:23:57 to 2:27:20** → you type in `ForEachLoop.java`

You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line yourself.** Do not copy and paste from this page.
Each step has a time, like **(video 2:13:48)**, if you want to see him do it.

---

# Video 1 — ArrayList (`ArrayLists.java`)

## Step 1 — What is an ArrayList? (video 2:12:30)

An **ArrayList** is a list that can **grow and shrink** while your program runs. A normal
array can't: once you make an array of 3, it stays 3.

One rule: an ArrayList can only hold **objects** (reference types). So it can hold
`String`s, but **not** `int`s. To store whole numbers, you use the wrapper class from
Part 11: `Integer`.

---

## Step 2 — The import line (video 2:13:48)

`ArrayList` is not loaded automatically. It lives in a part of Java's library called
`java.util`, and you have to **import** it.

Open `part12/ArrayLists.java`. Under `package part12;` and **above** `public class
ArrayLists`, type:

```java
import java.util.ArrayList;
```

The top of your file now looks like this:

```java
package part12;

import java.util.ArrayList;

// (the comments)

public class ArrayLists {
```

If you forget the import, every `ArrayList` turns red, and you get:

```
error: cannot find symbol
  symbol:   class ArrayList
```

**Shortcut:** click on a red `ArrayList` and press `⌥ Enter` (Mac) or `Alt Enter`
(Windows), then choose **Import class**.

*(The captions on the video say "import java.util.arrays". That's a captions mistake. The
correct line is `import java.util.ArrayList;`.)*

---

## Step 3 — Make an ArrayList (video 2:12:45)

Type the `main` method. Inside it, type:

```java
        ArrayList<String> food = new ArrayList<String>();
```

Piece by piece:

| Piece | What it means |
|---|---|
| `ArrayList` | Capital **A** and capital **L** |
| `<String>` | What kind of thing the list holds. These are **angle brackets** `< >` |
| `food` | The name of your list |
| `new ArrayList<String>()` | Makes a new, empty list. Don't forget the `()` at the end |

What if you try `ArrayList<int>`? You get:

```
error: unexpected type
  required: reference
  found:    int
```

That means "I need an object type here." Use `ArrayList<Integer>` instead.

---

## Step 4 — `add` (video 2:14:01)

`add` puts an item at the **end** of the list.

```java
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
```

Now the list holds three items, at index 0, 1 and 2:

| Index | 0 | 1 | 2 |
|---|---|---|---|
| Item | `pizza` | `hamburger` | `hotdog` |

---

## Step 5 — Print them with a `for` loop: `size` and `get` (video 2:14:20)

To go through the list, use a `for` loop, like you did with arrays. Two differences:

- Arrays use `.length`. **ArrayLists use `.size()`.**
- Arrays use `[i]`. **ArrayLists use `.get(i)`.**

```java
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
```

**Run it.** Output:

```
pizza
hamburger
hotdog
```

If you write `food.length` by mistake, you get:

```
error: cannot find symbol
  symbol:   variable length
```

---

## Step 6 — `set`, `remove`, `clear` (video 2:15:20)

He shows three more methods. After each one, he runs his loop again to see the change.
**You do it a quicker way:** add a line that prints the **whole list**. Printing an
ArrayList shows every item inside `[ ]`.

**`set` replaces** the item at an index:

```java
        food.set(0, "sushi");
        System.out.println(food);
```

```
[sushi, hamburger, hotdog]
```

Pizza is gone. Sushi took its place. The list is still 3 long.

**`remove` takes out** the item at an index (video 2:15:53):

```java
        food.remove(2);
        System.out.println(food);
```

```
[sushi, hamburger]
```

**`clear` empties** the whole list (video 2:16:07):

```java
        food.clear();
        System.out.println(food);
```

```
[]
```

### Your `ArrayLists.java` output

```
pizza
hamburger
hotdog
[sushi, hamburger, hotdog]
[sushi, hamburger]
[]
```

---

# Video 2 — 2D ArrayList (`TwoDArrayLists.java`)

## Step 7 — Three shopping lists (video 2:18:31)

A **2D ArrayList** is a **list of lists**. His example is a grocery list split into
sections: bakery, produce and drinks.

Open `part12/TwoDArrayLists.java`. Add `import java.util.ArrayList;` above the class, like
before. Type the `main` method. Inside it, make the first list:

```java
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
```

Then two more (video 2:19:30). **Type them. Don't copy and paste** the first one, like he
does:

```java
        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("soda");
        drinksList.add("coffee");
```

The lists **don't have to be the same size.** Drinks only has 2 items.

---

## Step 8 — Print a list, and get one item (video 2:18:50)

```java
        System.out.println(bakeryList);
        System.out.println(bakeryList.get(0));
        System.out.println(drinksList);
```

**Run it.** Output:

```
[pasta, garlic bread, donuts]
pasta
[soda, coffee]
```

> **He forgets to rename one line** after copying it, and gets the wrong list. That's one
> more reason to type each line yourself.

---

## Step 9 — The list of lists (video 2:20:49)

Now make one big list that holds the three small lists. Its type is an ArrayList **of**
`ArrayList<String>`:

```java
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        System.out.println(groceryList);
```

Look at the type closely: `ArrayList<` `ArrayList<String>` `>`. The outside list holds
inside lists, and each inside list holds Strings.

On the right side, `new ArrayList<>()` has **empty** angle brackets. Java fills in the type
for you from the left side. (He may type the full type there. Both work.)

**Run it.** New output line:

```
[[pasta, garlic bread, donuts], [tomatoes, zucchini, peppers], [soda, coffee]]
```

Each inner list has its own `[ ]`.

---

## Step 10 — `get` twice (video 2:22:35)

`groceryList.get(0)` gives you the **first inside list**. Then you can call `.get(...)` on
**that** list to get one item.

```java
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(0));
        System.out.println(groceryList.get(2).get(1));
```

**Run it.** New output lines:

```
[pasta, garlic bread, donuts]
pasta
coffee
```

Read `groceryList.get(2).get(1)` from left to right: "list number 2 (drinks), then item
number 1 in that list (coffee)." Remember, both start counting at 0.

---

# Video 3 — The for-each loop (`ForEachLoop.java`)

## Step 11 — An array of animals (video 2:24:35)

A **for-each loop** goes through **every** item in an array or list, one at a time. It's
shorter and easier to read than a regular `for` loop. The trade-off: it's less flexible.
You don't get an index number, and it always goes through everything, in order.

Open `part12/ForEachLoop.java`. Add `import java.util.ArrayList;` above the class. Type the
`main` method. Inside it, make an array:

```java
        String[] animals = {"cat", "dog", "rat", "bird"};
```

---

## Step 12 — Write the for-each loop (video 2:25:12)

```java
        for (String i : animals) {
            System.out.println(i);
        }
```

Read the first line out loud like this: **"for each String `i` in `animals`."** The colon
`:` means "in."

| Piece | What it means |
|---|---|
| `String` | The type of each item |
| `i` | A name for "the current item." Each time around the loop, it's the next animal |
| `:` | "in." A **colon**, not a semicolon |
| `animals` | The array or list to go through |

**Run it.** Output:

```
cat
dog
rat
bird
```

If you type `;` instead of `:`, you get a confusing error:

```
error: ';' expected
```

---

## Step 13 — The same loop with an ArrayList (video 2:26:22)

A for-each loop works on an ArrayList too.

> **He changes his array into an ArrayList with the same name, `animals`.** If you keep
> your array, a second `animals` gives you:
>
> ```
> error: variable animals is already defined in method main(String[])
> ```
>
> **Keep your array, and call the ArrayList `animalList`.**

Under your first loop, type:

```java
        ArrayList<String> animalList = new ArrayList<String>();
        animalList.add("cat");
        animalList.add("dog");
        animalList.add("rat");
        animalList.add("bird");

        for (String i : animalList) {
            System.out.println(i);
        }
```

**Run it.** Output: the animals, twice. Once from the array, once from the ArrayList.

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

The loop looks **exactly the same** for both. That's the nice thing about for-each.

---

## Your finished programs

**Compare them to yours. Do not copy them.**

<details>
<summary>Click to compare ArrayLists.java</summary>

```java
package part12;

import java.util.ArrayList;

// (the comments at the top of your file)

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        food.set(0, "sushi");
        System.out.println(food);

        food.remove(2);
        System.out.println(food);

        food.clear();
        System.out.println(food);
    }
}
```

</details>

<details>
<summary>Click to compare TwoDArrayLists.java</summary>

```java
package part12;

import java.util.ArrayList;

// (the comments at the top of your file)

public class TwoDArrayLists {
    public static void main(String[] args) {
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("soda");
        drinksList.add("coffee");

        System.out.println(bakeryList);
        System.out.println(bakeryList.get(0));
        System.out.println(drinksList);

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(0));
        System.out.println(groceryList.get(2).get(1));
    }
}
```

</details>

<details>
<summary>Click to compare ForEachLoop.java</summary>

```java
package part12;

import java.util.ArrayList;

// (the comments at the top of your file)

public class ForEachLoop {
    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "rat", "bird"};

        for (String i : animals) {
            System.out.println(i);
        }

        ArrayList<String> animalList = new ArrayList<String>();
        animalList.add("cat");
        animalList.add("dog");
        animalList.add("rat");
        animalList.add("bird");

        for (String i : animalList) {
            System.out.println(i);
        }
    }
}
```

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B: put a
comment above every line, **in your own words**. Do not copy the explanations from this
guide.
