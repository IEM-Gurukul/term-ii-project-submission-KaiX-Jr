[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

Nova – Command Line AI Assistant in Java

## Problem Statement (max 150 words)

In today’s digital world, users interact with intelligent systems to perform everyday tasks. However, building full-scale AI systems requires complex machine learning models and resources. This project aims to develop a simplified command-line AI assistant using Java that can simulate intelligent behavior using rule-based processing. The assistant can respond to user queries such as greetings, time requests, basic calculations, and task management. The goal is to demonstrate object-oriented design principles, modular architecture, and efficient command handling while creating an interactive system that mimics real-world AI assistants.

## Target User

Students and beginner users who want a simple interactive assistant to perform basic tasks using command-line interface.

## Core Features
- Greeting detection (hello, hi, etc.)
- Time and date display
- Calculator for basic operations
- Joke generator
- To-do list manager
- Help command
- Exit system

## OOP Concepts Used

Abstraction: Command interface for all commands  
Inheritance: Different command classes extend base behavior  
Polymorphism: execute() method behaves differently for each command  
Exception Handling: Invalid inputs handled safely  
Collections: HashMap for command storage, ArrayList for tasks  
Threads: Optional reminder feature (if implemented)

---

## Proposed Architecture Description

The system follows a modular command-based architecture. User input is processed by a CommandProcessor which maps commands to their respective classes using a HashMap. Each command implements a common Command interface, ensuring scalability and maintainability. The Assistant class manages the interaction loop, while separate classes handle specific functionalities such as calculation, time retrieval, and task management.

## How to Run
1. Compile the project:
   javac Main.java

2. Run the program:
   java Main

3. Enter commands like:
   hello
   time
   calculate 5 + 3
   add task study
   show tasks
   exit

## Git Discipline Notes
Minimum 10 meaningful commits required.
