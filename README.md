# Java Thread Demonstration

## Author Details
- Name: Riddhi Poddar
- PRN: 2307016105
- Batch: B2

## Overview
This Java program demonstrates multithreading using the Runnable interface. Two threads are created and started from the main method. Each thread prints a sequence of numbers with a specific start value, increment, and delay.

## Files

### Main.java
This is the main class that launches the program.

#### Method: main
Signature:
public static void main(String[] args)

Description:
- Creates and starts two threads using the MyThread class.
- Thread 1: Starts at 1, increments by 2, prints every 300 milliseconds.
- Thread 2: Starts at 100, increments by 20, prints every 1000 milliseconds.

### MyThread.java
This file defines the MyThread class, which implements the Runnable interface.

#### Class: MyThread implements Runnable

Fields:
- int init: starting value for the thread.
- int increment: value to add on each iteration.
- int delay: time in milliseconds between prints.

#### Constructor:
Signature:
public MyThread(int init, int increment, int delay)

Description:
Initializes the thread with starting value, increment, and delay.

#### Method: run
Signature:
public void run()

Description:
- Runs an infinite loop.
- Prints the current value.
- Increments the value by the specified amount.
- Sleeps for the given delay.
- Catches InterruptedException if the thread is interrupted.

Note:
Use ctrl + c to stop the program since it runs an infinite loop.
