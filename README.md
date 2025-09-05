# **krish_jain_S64_Attendance_management_project**

## Attendance System

A simple Java project that prints a welcome message. This is the initial setup for the Attendance System project.

---

## 📌 Project Setup

### 1. Check JDK and Git Installation
Run the following commands to ensure Java and Git are installed:
```bash
  java -version
  javac -version
  git --version
```

### 2. Project Structure
```
krish_jain_S64_Attendance_management_project/
├── README.md
└── src/
    └── com/
        └── school/
            └── Main.java
```

### 3. Compile the Program
From the project root directory:
```bash
  javac src/com/school/Main.java
```

### 4. Run the Program
From the project root directory:
```bash
  java -cp src com.school.Main
```
---
## ✅ Expected Output
```
==================================
 Welcome to Attendance System!
==================================
```

## Part 2: Student and Course Management

### Files Added
- `src/com/school/Student.java`
- `src/com/school/Course.java`

### Features
- Defined `Student` and `Course` classes.
- Created arrays of `Student` and `Course` objects.
- Displayed their details using methods.

### Compile and Run
```bash
  javac src/com/school/*.java
  java -cp src com.school.Main
```

## ✅ Expected Output
```
==================================
 Welcome to Attendance System!
==================================

===== Students =====
Student ID: 1
Student Name: Alice
-------------------------
Student ID: 2
Student Name: Bob
-------------------------
Student ID: 3
Student Name: Charlie
-------------------------
===== Courses =====
Course ID: 101
Course Name: Mathematics
-------------------------
Course ID: 102
Course Name: Science
-------------------------
```
---