# Student Grading System (Java)

A console-based Java application designed to calculate a student's academic performance for a semester. The system accepts course profiles, computes standardized letter grades, tracks credit loads, and calculates the final Cumulative Grade Point Average (GPA) using a 5-point scale system.

---

## 🚀 Key Features

* **Dynamic Course Management:** Uses a custom `Static Nested Class` structure to safely allocate an array of object references based on the total courses registered.
* **Overwrite Protection:** Implements strict logical `else-if` conditional checks to evaluate precise numeric scores.
* **Precise Math Evaluation:** Forces explicit casting for double-precision float calculations to prevent integer division clipping.
* **Formatted Transcript Display:** Utilizes text alignment padding flags (`System.out.printf`) to generate a clean tabular layout matrix.

---

## 📊 Grading Criteria (5-Point Scale)

| Score Range | Assigned Grade | Grade Points |
| :--- | :---: | :---: |
| 70 – 100 | **A** | 5 |
| 60 – 69 | **B** | 4 |
| 50 – 59 | **C** | 3 |
| 45 – 49 | **D** | 2 |
| 40 – 44 | **E** | 1 |
| Below 40 | **F** | 0 |

---

## 🛠️ Requirements & Setup

### Prerequisites
* Java Development Kit (JDK) 8 or higher installed on your local machine.

### Compilation
Open your terminal window inside the project directory and run the compilation tool:
```bash
javac Student.java
```

### Execution
Launch the compiled bytecode application profile using:
```bash
java Student
```

---

## 💻 Sample Output Interface Run

```text
==========================================
        STUDENT GRADING SYSTEM
==========================================
Enter Student Name: John Doe
Hey John Doe, how many courses did you take in the first semester: 2

--- Course 1 ---
Enter Coursecode: MTH101
Enter Course Units: 4
Enter Score: 75

--- Course 2 ---
Enter Coursecode: PHY101
Enter Course Units: 3
Enter Score: 52

==========================================
        FINAL ACADEMIC SUMMARY
==========================================
Student Name: John Doe
------------------------------------------
COURSE       UNITS    SCORE    GRADE 
MTH101       4        75       A     
PHY101       3        52       C     
------------------------------------------
Total Units Registered: 7
Cumulative Grade Point Average (GPA): 4.14
===========================================
```

---

## 🏗️ Code Architecture Blueprint

* **`Student`:** Main execution orchestration boundary wrapper context class.
* **`CourseData`:** A structural `static nested class` module holding primitive variables: `courseCode`, `score`, `unit`, `grade`, and `gradePoints`. This model encapsulates entity metrics uniformly.

---

## 📝 License
This project is open-source and available under the MIT License.
