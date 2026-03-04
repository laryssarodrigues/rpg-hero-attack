# System of Heroes

## About the Project

This project consists of a system that registers different types of heroes and simulates their attacks based on their classes (types). Each hero has a name, age, and type, and performs a specific attack according to their category.

## Features

- Hero registration with name, age, and type
- Different types of heroes available:
  - **Wizard** - Attack with magic
  - **Warrior** - Attack with sword
  - **Monk** - Attack with martial arts
  - **Ninja** - Attack with shuriken
  - **Archer** - Default attack (if type not identified)

## Project Structure

The project consists of two main classes:

### `Hero.java`
Main class that defines the properties and behaviors of heroes:
- **Attributes**: name, age, type
- **Methods**: 
  - `title()` - Displays the system title
  - `attack()` - Determines and executes the attack based on the hero's type

### `Main.java`
Class responsible for running the program:
- Creates a list of heroes with different types
- Iterates through the heroes displaying their information and attacks

## Usage Example
\==================  
&emsp;&nbsp; SYSTEM OF HEROES  
\==================  
-> Hero 1: Holly  
Result: The wizard attacked using a magic.  
-> Hero 2: Way  
Result: The warrior attacked using a sword.  
-> Hero 3: Poo  
Result: The monk attacked using a martial arts.  
-> Hero 4: Lynn  
Result: The ninja attacked using a shuriken.  
-> Hero 5: Klow  
Result: The archer attacked using a arm.

---
Developed by Laryssa Rodrigues.
