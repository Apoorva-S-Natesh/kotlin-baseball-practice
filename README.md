### Mission - Number Baseball

#### **Test Execution Guide**

* On **Mac or Linux**, execute:

  ```
  ./gradlew clean test
  ```
* On **Windows**, execute:

  ```
  gradlew.bat clean test
  ```

  or

  ```
  ./gradlew.bat clean test
  ```

Ensure that all tests pass as follows:

```
BUILD SUCCESSFUL in 0s
```

---

### 🚀 Functional Requirements

The game is a basic number baseball game where you have to guess a three-digit number consisting of unique digits from 1 to 9.

* If the same number is in the same position, it's a **strike**.
* If the same number is in a different position, it's a **ball**.
* If there are no matching numbers, it's **nothing**.

The objective is to guess the 3-digit number that the opponent (computer) has selected.
For example, if the opponent's number is **425**:

* If the player inputs **123**, the output is `1 strike`.
* If the player inputs **456**, the output is `1 ball 1 strike`.
* If the player inputs **789**, the output is `nothing`.

The computer randomly selects three unique digits from 1 to 9. The player inputs three digits, and the computer responds with the result.

The game continues until the player correctly guesses all three numbers.
After the game ends, the player can choose to restart the game or exit.

If the player inputs an incorrect value, the program must throw an **IllegalArgumentException** and terminate.

---

### 📦 Input and Output Requirements

#### **Input:**

* A three-digit number with unique digits.
* After the game ends, the user inputs **1 or 2** to restart or exit.

#### **Output:**

* Display the result in terms of **balls and strikes**.

  * Example: `1 ball 1 strike`
* If there are no matching numbers:

  * Output: `nothing`
* If the player guesses all three numbers correctly:

  * Output:

    ```
    3 strikes
    You have guessed all three numbers correctly! Game Over
    ```
* Display the start message:

  ```
  Starting the Number Baseball Game.
  ```

---

### ✅ Example Output

```
Starting the Number Baseball Game.
Enter a number: 123
1 ball 1 strike
Enter a number: 145
1 ball
Enter a number: 671
2 balls
Enter a number: 216
1 strike
Enter a number: 713
3 strikes
You have guessed all three numbers correctly! Game Over
Enter 1 to restart, 2 to exit.
1
Enter a number: 123
1 ball
...
```

---

### 🎯 Programming Requirements

* The game must be implemented using **Kotlin 1.9.0**. If it does not run correctly in this version, it will be scored as zero.
* Implement only in **Kotlin**, not Java.
* The program's entry point is **Application's main()**.
* Do not modify **build.gradle(.kts)** or use external libraries.
* Follow **Kotlin coding conventions**.
* Do not use **System.exit()** to terminate the program.
* Once the implementation is complete, all tests in **ApplicationTest** must pass. If any test fails, the assignment will be scored as zero.
* Unless explicitly stated, do not change or move files or package names.

---

### 📦 Libraries

* Use the **Randoms** and **Console** APIs provided by **camp.nextstep.edu.missionutils**.
* To generate random values, use **Randoms.pickNumberInRange()**.
* To read user input, use **Console.readLine()**.

**Example Usage:**

```kotlin
val computer = mutableListOf<Int>()
while (computer.size < 3) {
    val randomNumber = Randoms.pickNumberInRange(1, 9)
    if (!computer.contains(randomNumber)) {
        computer.add(randomNumber)
    }
}
```