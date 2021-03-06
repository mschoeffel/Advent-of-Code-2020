# Advent-of-Code-2020
Advent of Code is a yearly returning series of `25` (`50`) tasks created by `Eric Wastl`. **Credits see below.**

Every day in December, till 25., a new task is released.
If you manage to solve this task you receive **one star** and a part two of this task, that adds a little extra question to the first part, is unlocked.
If you manage to solve the additional part two aswell you earn a **second star**.
So you can earn a **total number of 50 stars** and complete 25 tasks with an extra question to each. 
Each day the tasks get a little harder.

You can solve the tasks with whatever language you like or like to learn.
To me this project offers a great opportunity to take a look into other programming languages and learn new skills.

This repository shows my solutions to the tasks.
I also added the tasks / questions to each day as `README.md`. So everybody can follow the code made and check it against the task.
Given data by the task is always stored inside of the day directory. 
Default `.txt` except any other format is given by the task.

## Language
This year I took `Java` and tried to solve the tasks using this language.

## Score
| Day | Part one | Part two |
|----|----|----|
| [Day 01](https://github.com/mschoeffel/Advent-of-Code-2020/tree/main/src/main/java/de/mschoeffel/Day01) | :star: | :star: |
| [Day 02](https://github.com/mschoeffel/Advent-of-Code-2020/tree/main/src/main/java/de/mschoeffel/Day02) | :star: | :star: |
| [Day 03](https://github.com/mschoeffel/Advent-of-Code-2020/tree/main/src/main/java/de/mschoeffel/Day03) | :star: | :star: |
| [Day 04](https://github.com/mschoeffel/Advent-of-Code-2020/tree/main/src/main/java/de/mschoeffel/Day04) | :star: | :star: |
| [Day 05](https://github.com/mschoeffel/Advent-of-Code-2020/tree/main/src/main/java/de/mschoeffel/Day05) | :star: | :star: |
| [Day 06](https://github.com/mschoeffel/Advent-of-Code-2020/tree/main/src/main/java/de/mschoeffel/Day06) | :star: | :star: |
| [Day 07](https://github.com/mschoeffel/Advent-of-Code-2020/tree/main/src/main/java/de/mschoeffel/Day07) | :star: | :star: |
| [Day 08](https://github.com/mschoeffel/Advent-of-Code-2020/tree/main/src/main/java/de/mschoeffel/Day08) | :star: | :star: |
| [Day 09](https://github.com/mschoeffel/Advent-of-Code-2020/tree/main/src/main/java/de/mschoeffel/Day09) | :star: | :star: |
| [Day 10](https://github.com/mschoeffel/Advent-of-Code-2020/tree/main/src/main/java/de/mschoeffel/Day09) | :star: | :star: |
| [Day 11]() | :clock10: | :clock10: |
| [Day 12]() | :clock10: | :clock10: |
| [Day 13]() | :clock10: | :clock10: |
| [Day 14]() | :clock10: | :clock10: |
| [Day 15]() | :clock10: | :clock10: |
| [Day 16]() | :clock10: | :clock10: |
| [Day 17]() | :clock10: | :clock10: |
| [Day 18]() | :clock10: | :clock10: |
| [Day 19]() | :clock10: | :clock10: |
| [Day 20]() | :clock10: | :clock10: |
| [Day 21]() | :clock10: | :clock10: |
| [Day 22]() | :clock10: | :clock10: |
| [Day 23]() | :clock10: | :clock10: |
| [Day 24]() | :clock10: | :clock10: |
| [Day 25]() | :clock10: | :clock10: |
## Credits
All credits of the tasks and questions and a huge thanks go to `Eric Wastl` (Twitter: `@ericwastl`)\
See his Website: [Advent of Code](https://adventofcode.com/) for further information.

## Structure
Every day a new directory with an `Day[NUMBER]App` file inside gets created. 
This file contains the solutions to both tasks of the day in separate functions. 
The `main` function would run both tasks of this day and print out the solutions.
If data is given by the task it will also be stored inside of this directory.
The tasks of the day are also given as `README.md` in the day directory.
Tests are provided for every day within the junit test directory and can be executed with the `mvn test` command.
In the `Utils` directory some helper functions are stored that can be used by every day.

You can execute all days using the `App` given in the main directory and entering the number of the day you want to execute.