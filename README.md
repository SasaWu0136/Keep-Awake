# KeepAwake 🟢

**Prevents your computer screen from sleeping** by simulating tiny mouse movements at regular intervals.

Ideal for:
- Long-running monitoring scripts
- Background computations
- Presentations or live demos
- Avoiding screen lock / power-saving modes

---

## Features

- Moves the mouse **1 pixel** every **60 seconds**, then back
- Completely unobtrusive — no interference with normal use
- Pure Java implementation — **cross-platform** (Windows, macOS, Linux)
- Zero external dependencies

---

## Quick Start

### 1. Compile

```bash
javac KeepAwake.java

2. Run

Output:
KeepAwake started. Screen will stay awake. Press Ctrl+C to stop.

3. Stop
Press Ctrl + C in the terminal.

How It Works
Uses Java’s java.awt.Robot class:

Reads the current mouse position
Every 60 seconds, moves the cursor +1 pixel horizontally
Waits another 60 seconds, then moves it back

This tiny activity is enough to convince the OS that the user is active, preventing idle timeouts and screen sleep.

Notes

Runs with standard user privileges
Some corporate environments may block Robot due to security policies
Run only when needed; remember to stop it afterward


Contributing
Issues and Pull Requests are welcome!
Ideas:

Add a GUI for start/stop and interval configuration
System tray icon with on/off toggle
Configurable move distance or interval


License
MIT License – Free to use, modify, and distribute.

Author
Sasa Wu
GitHub: @your-github-username
Initial release: 2025-11-10

Keep the screen awake — stay focused, stay productive!
