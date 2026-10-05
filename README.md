# 📚 CDAC Coursework — Python & Java Assignments

This repository is a collection of coursework and programming assignments completed during the CDAC program. It contains Python and Java exercises covering programming fundamentals, data structures, object-oriented programming, exception handling, file processing, transaction logic, and practical problem-solving.

## 🎯 Purpose

The repository is primarily an academic practice archive rather than a single deployable application. Each assignment folder contains independent programs designed to practice a specific language feature, algorithm, or programming concept.

Current repository inventory includes:

- **53 Python source files**
- **28 Java source files**
- **26 compiled Java `.class` files**
- **4 ZIP archives**
- **2 PDF documents**
- Supporting VS Code configuration

## 🧭 Coursework Modules

### Module 1 — Python

Path:

```text
28014_Module1_Python_Assignment_HarshitGarg/
```

The Python coursework is organized into assignment sets `A01` through `A07`.

Concepts represented in the repository include:

- Input/output and conditional statements
- Leap-year, prime-number, odd/even, grading, and calculator problems
- Fibonacci sequences and arithmetic utilities
- String manipulation and text analysis
- Email/domain extraction
- Character and frequency analysis
- Anagram grouping
- Palindrome problems
- Shift-cipher style transformations
- Collections and data-processing exercises
- Queue, list, dictionary, and set-oriented problems
- File and record-processing simulations
- Exception handling and validation
- Transaction processing with rollback
- Server-log parsing and traffic filtering
- Custom iterator/result-set behavior
- Small simulation and rendering exercises

#### Example Python exercises

| Area | Example |
|---|---|
| Basics | Leap Year Checker, Fibonacci Generator, Prime Checker |
| Strings | Sentence Analysis, Anagram Grouping, Longest Palindromic Substring |
| Algorithms | Josephus-style elimination, duplicate detection, filtering |
| Data handling | Record simulations and structured data processing |
| Error handling | Custom exceptions and validation |
| Transactions | Atomic transaction processing with rollback |
| Log processing | Server log analyzer and traffic classifier |

### Module 3 — Java

Path:

```text
28014_Module3_Java_Assignment_HarshitGarg/
```

The Java coursework contains several assignment sets plus an additional `Assigment4` directory.

Topics represented include:

- Java syntax and console input
- Arithmetic operations
- Conditional logic
- Student/result calculations
- Temperature conversion
- Salary and billing calculations
- Array processing
- Searching and duplicate detection
- Simple calculators
- Object-oriented programming
- Banking/account-management exercises

## 🗂️ Repository Structure

```text
cdacn/
├── .vscode/
├── 28014_Module1_Python_Assignment_HarshitGarg/
│   ├── 28014_HarshitGarg_A01/
│   ├── 28014_HarshitGarg_A02/
│   ├── 28014_HarshitGarg_A03/
│   ├── 28014_HarshitGarg_A04/
│   ├── 28014_HarshitGarg_A05/
│   ├── 28014_HarshitGarg_A06/
│   └── 28014_HarshitGarg_A07/
├── 28014_Module3_Java_Assignment_HarshitGarg/
│   ├── 28014_HarshitGarg_A01/
│   ├── 28014_HarshitGarg_A02/
│   ├── 28014_HarshitGarg_A03/
│   └── Assigment4/
├── DOC-20261005-WA0005.pdf
├── DOC-20261005-WA0010.pdf
└── link.txt
```

## 🐍 Running Python Programs

Most Python files are standalone console programs and can be executed independently.

Example:

```bash
python 28014_Module1_Python_Assignment_HarshitGarg/28014_HarshitGarg_A01/Ex1_leapYearChecker.py
```

On systems where `python` maps to another interpreter, use:

```bash
python3 path/to/program.py
```

Many exercises expect interactive input from the terminal.

## ☕ Running Java Programs

Java source files can be compiled with the JDK.

Example:

```bash
javac 28014_Module3_Java_Assignment_HarshitGarg/Assigment4/BankAccountManagement.java
java -cp 28014_Module3_Java_Assignment_HarshitGarg/Assigment4 BankAccountManagement
```

For individual exercises, compile the `.java` file and run its corresponding class name.

### Recommended JDK

Use a current LTS JDK such as Java 17 or newer unless a particular CDAC lab requires another version.

## 🧪 Selected Examples

### Atomic Transaction Processing

`Ex6_AtomicTransactionProcessingwithLogRollback.py` demonstrates:

- Custom exception classes
- Batch processing
- Deposits and withdrawals
- Validation of transaction types and amounts
- Overdraft detection
- Deep-copy rollback
- Success and rollback logging

### Server Log Analyzer

`Ex6_ServerLogAnalyzer&TrafficClassifier.py` demonstrates:

- Regular-expression parsing
- Structured extraction of IP, timestamp, method, resource, status, and byte fields
- Ignoring selected private-network addresses
- Invalid-line handling
- Conversion of numeric fields

### Custom Database Record Simulator

`Ex6_CustomDatabaseRecordSimulator.py` demonstrates:

- Custom record objects
- Input validation
- Custom exceptions
- Iterator implementation
- Result-set behavior
- Integer and string-based lookup

### Java Bank Account Management

`Assigment4/BankAccountManagement.java` demonstrates a simple object-oriented console application with:

- Account number and customer details
- Balance management
- Deposit operation
- Withdrawal validation
- Account display
- Repeated processing for multiple account objects

## 🧠 Skills Practiced

This archive provides hands-on practice with:

- Python fundamentals
- Java fundamentals
- Control flow
- Functions
- Collections
- Strings
- Algorithms
- Exception handling
- File I/O
- Regular expressions
- Iterators
- Object-oriented programming
- Input validation
- Basic transaction design
- Problem decomposition

## 📦 Generated and Supporting Files

The repository also contains compiled Java bytecode and compressed assignment archives.

### `.class` files

Compiled Java outputs are present alongside some source files. These can be regenerated from the `.java` sources and generally do not need to be committed in a source-focused repository.

### ZIP archives

Some Java assignment sets are also stored as ZIP files, including archive copies associated with the coursework.

### PDF documents

Two PDF files are included at the repository root as supporting coursework/documentation material.

## ⚠️ Repository Hygiene & Security

`link.txt` currently contains a cloud-storage URL and a password in plain text. **Treat this as sensitive information.**

Recommended action:

1. Remove or redact the credential from the public repository.
2. Rotate the password immediately if it is still valid.
3. If the link is required for collaboration, store it through a private, access-controlled mechanism instead of committing credentials.

Also consider cleaning generated `.class` files and duplicate ZIP archives from the repository if the goal is to maintain a source-only coursework archive.

## 🔧 Recommended `.gitignore`

A cleaner source-oriented version of this repository could ignore generated Java bytecode and common local files:

```gitignore
*.class
__pycache__/
*.py[cod]
.vscode/
*.log
```

If `.vscode/settings.json` is intentionally shared for the coursework environment, keep `.vscode/` tracked and remove only the entries you do not want committed.

## 📈 Suggested Learning Roadmap

1. Complete Python fundamentals and control flow.
2. Strengthen strings, lists, dictionaries, sets, and functions.
3. Practice algorithms and problem-solving patterns.
4. Learn exception handling and file processing.
5. Build confidence with Java syntax and OOP.
6. Revisit assignments and refactor repetitive programs into reusable methods/classes.
7. Add tests and edge-case coverage to the strongest exercises.

## 🚀 Future Improvements

- Add a top-level index linking every assignment.
- Add sample input/output to important exercises.
- Standardize filename and folder naming.
- Add unit tests for reusable logic.
- Remove generated `.class` files from source history.
- Replace plain-text credentials with secure access mechanisms.
- Group especially strong exercises into mini-projects.
- Add short explanations of the algorithms used.

## 📄 License

No `LICENSE` file is currently present in the repository. A formal open-source license should therefore not be assumed.

## 👨‍💻 Author

**Harshit Garg**

GitHub: [@Harshit765G4](https://github.com/Harshit765G4)

---

This repository is maintained as a personal CDAC coursework and programming-practice archive.