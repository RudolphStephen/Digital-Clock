# ⌚ DIGITAL CLOCK (JavaFX)

### A real-time digital clock application built using JavaFX, featuring a classic 7-segment display aesthetic and control buttons.

---

## 🌟 FEATURES

* **7-Segment Display:** Time is displayed using a classic digital aesthetic, constructed with custom `DigitLine` and `Clockdigit` classes.
* **Real-Time Clock:** Uses `javafx.animation.Timeline` to update the time every second.
* **AM/PM Indicator:** Includes a dedicated indicator that switches between AM and PM (implemented by changing text color).
* **Customizable Look:**
    * **Active Color:** Red (`Color.RED`) for active segments and colons.
    * **Inactive Color:** Dark Slate Gray (`Color.DARKSLATEGRAY`) for inactive segments, giving a backlit effect.
    * **Background:** Solid Black (`Color.BLACK`).
* **Clock Controls:** Dedicated "Start" and "Stop" buttons to control the time animation.
* **Time Format:** Displays time in the 12-hour format (HH:MM:SS) with an AM/PM indicator.

---

## 🛠️ BUILT WITH

* **Language:** Java
* **Framework:** JavaFX
* **Core Components:** `Application`, `Stage`, `Scene`, `HBox`, `VBox`, `Timeline`, `KeyFrame`, `LocalTime`.

---

## 🚀 SETTING UP

This project requires a Java Development Kit (JDK) with JavaFX support to compile and run.

### Prerequisites

* **Java Development Kit (JDK):** Version 11 or later is recommended.
* **JavaFX SDK:** Ensure your environment or IDE (like VS Code, Eclipse, or IntelliJ) is configured for JavaFX development.

### Running Locally

1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/YourUsername/digital-clock.git](https://github.com/YourUsername/digital-clock.git)
    cd digital-clock
    ```

2.  **Compile the Code:**
    Compile the Java files, including the necessary JavaFX modules. (The exact command may vary based on your module path setup.)

3.  **Run the Application:**
    Execute the main driver class.

    ```bash
    # Assuming standard JavaFX run configuration
    java ClockDriver 
    ```

4.  **Control the Clock:**
    Once the application window appears, click the **"Start"** button to begin the time animation, and **"Stop"** to pause it.

---

 📂 PROJECT STRUCTURE

The project is divided into several cohesive classes:

| Class | Description |
| :--- | :--- |
| `ClockDriver.java` | The main application class that extends `Application`. It sets up the stage, scene, and adds the `Clock` object and the **Start/Stop** buttons. |
| `Clock.java` | Extends `HBox`. This is the core logic class that manages the six `Clockdigit` objects, the colons, the `AmPmIndicator`, and contains the `startClock()` method with the animation logic (`Timeline` and `KeyFrame`). |
| `Clockdigit.java` | Extends `Pane`. Represents a single digit (0-9). It is composed of seven `DigitLine` objects and contains the `setValue()` method to illuminate the correct segments for a given number. |
| `DigitLine.java` | Extends `Rectangle`. Represents a single segment of the 7-segment display. It provides `turnOn()` (sets color to Red) and `turnOff()` (sets color to Dark Slate Gray) methods. |
| `AmPmIndicator.java` | Extends `VBox`. Manages the display of "AM" and "PM" text indicators and changes their color to reflect the current time period. |

---

## 📝 ANIMATION LOGIC (`Clock.java`)

The clock's animation is handled by a `Timeline` that fires an event every second. The time is not set directly from `LocalTime.now()` inside the loop; instead, the logic simulates an overflow:

1.  The last digit (`myDigit6` - seconds unit) is incremented by 1.
2.  A series of `if` statements check if any digit overflows (e.g., 10 for units, 6 for tens).
3.  If a digit overflows (e.g., seconds unit goes from 9 to 10), it resets to 0, and the digit to its left is incremented (e.g., seconds tens digit).
4.  The AM/PM state is toggled when the hour digits reach `12:00:00`.

---

## ✍️ AUTHOR

**Rudolph Stephen**
* **Version:** 1st February 2025


---

## ⚖️ License

Distributed under the **Apache 2.0**. See the project root for the full `LICENSE` file (if you choose to add one).
