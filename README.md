# Campus Course & Records Manager (CCRM)

## Author

Aryan Mauryakant
Registration Number: 24BAI10142

---

## Overview

A simple Java console application for managing students, courses, and enrollments.
This is a Java SE console-based project that demonstrates core object-oriented programming concepts along with practical file handling and system design.

The application allows basic management of students, courses, and enrollments through a menu-driven command-line interface.

Concepts used in this project include:

* Object-Oriented Programming (OOP)
* Enums
* Builder Pattern
* Singleton Pattern
* File I/O using NIO.2
* Recursion
* CLI-based interaction

---

## Features

* Add and list students
* Add and list courses
* Enroll students into courses
* View enrollments
* Backup system data
* Read and write files using NIO

---

## Project Structure

```
src/
  edu/ccrm/
    domain/      -> Core classes and enums
    service/     -> Business logic
    io/          -> File handling and backup
    util/        -> Utility functions
    config/      -> Singleton configuration
    cli/         -> Main application

test-data/       -> Sample CSV files
```

---

## Requirements

* Java JDK (version 8 or above)
* Command line / terminal

---

## How to Compile and Run

### Linux / macOS

```bash
chmod +x compile_and_run.sh
./compile_and_run.sh
```

OR manually:

```bash
javac -d out $(find src -name "*.java")
java -cp out edu.ccrm.cli.CCRMApp
```

---

### Windows (PowerShell)

```powershell
Get-ChildItem -Recurse -Filter *.java | % { $_.FullName } > sources.txt
javac -d out @sources.txt
java -cp out edu.ccrm.cli.CCRMApp
```

---

## Sample Data

The `test-data` folder contains sample CSV files for testing.

---

## Notes

* The project uses a modular structure based on Java packages.
* Data used in the application is currently in-memory for demonstration.
* Backup functionality creates timestamped folders.

---

## Conclusion

This project demonstrates how core Java concepts can be applied to build a structured and functional console-based application. It also highlights how modular design and clean separation of concerns improve maintainability.
