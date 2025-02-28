# MYSNAKELADDER

## Overview
MYSNAKELADDER is a simple console-based Snake and Ladder game implemented in Java. It allows two players to roll a dice and progress through the board while encountering ladders that help them advance and snakes that bring them down. The game continues until one player reaches position 100.

## Features
- Two-player gameplay.
- Dice roll simulation using Java's `Random` class.
- Ladders to boost player positions.
- Snakes that reduce player progress.
- Automatic turn-based system.
- Console output for tracking player movements and game progress.

## How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/MYSNAKELADDER.git
   ```
2. Navigate to the project directory:
   ```sh
   cd MYSNAKELADDER
   ```
3. Compile the Java file:
   ```sh
   javac MYSNAKELADDER.java
   ```
4. Run the program:
   ```sh
   java MYSNAKELADDER
   ```

## Game Rules
- Each player starts at position `0`.
- Players take turns rolling a dice (values 1 to 6).
- If a player lands on a ladder, they move up to a specified position.
- If a player lands on a snake, they move down to a specified position.
- The first player to reach exactly `100` wins the game.
- If a dice roll would take a player beyond `100`, the roll is ignored for that turn.

## Code Structure
- **`main` method**: Initializes player positions and starts the game loop.
- **`startgame` method**: Handles the game flow, turns, and victory conditions.
- **`rolladice` method**: Simulates a dice roll and prints the result.
- **`checkLadderOrSnake` method**: Determines if a player landed on a ladder or snake and updates their position accordingly.
- **`creators` method**: Holds placeholder values for the creators of the game.

## Authors
- **Uttam**
- **Piyush**

## License
This project is open-source and available under the [MIT License](LICENSE).

## Contributions
Contributions are welcome! Feel free to submit a pull request or open an issue to suggest improvements or report bugs.

## Contact
For any inquiries, please reach out to the creators or open an issue in the repository.

---
Enjoy playing MYSNAKELADDER! 🎲🐍🪜

