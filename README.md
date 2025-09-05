# LibraryManager 📚

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![CLI](https://img.shields.io/badge/CLI-4EAA25?style=for-the-badge&logo=gnu-bash&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-FF6B6B?style=for-the-badge)

A console-based Java application to manage library books with comprehensive CRUD operations, advanced search functionality, and efficient data management using LinkedHashMap.

---

## ✨ Features

- 📖 **Add Books** - Register new books with unique ID, title, and author information
- 👀 **View All Books** - Display complete library inventory in formatted table
- 🔍 **Search by ID** - Find specific books using their unique identifier
- 👨‍💼 **Search by Author** - Find all books written by a specific author
- 🔤 **Sort by Title** - Display books in alphabetical order by title
- 🔢 **Sort by ID** - Display books sorted numerically by their ID
- 🗑️ **Remove Books** - Delete books from the library database by ID
- 📋 **Interactive Menu** - User-friendly console interface with numbered options
- 📊 **Library Statistics** - View collection overview and book counts

---

## 🛠️ Tech Stack

- **Java** - Core programming language
- **LinkedHashMap** - Efficient data storage and retrieval
- **Object-Oriented Programming** - Clean, modular code architecture
- **Scanner Class** - User input handling
- **Console Interface** - Command-line user interaction
- **File Handling** - Data persistence capabilities

---

## 📂 Project Structure

```
LibraryManager/
├── Book.java               # Book entity class
├── LibraryDatabase.java    # CRUD operations and book management logic
├── Main.java              # Menu-driven interface and entry point
└── README.md              # Project documentation
```

### File Overview

- **`Book.java`** - Book entity class with properties (ID, title, author) and methods
- **`LibraryDatabase.java`** - Core database operations, search, and sorting functionality
- **`Main.java`** - User interface and application entry point

---

## ⚙️ Installation & Setup

### Prerequisites
- **Java JDK** (version 8 or higher)
- **Command Line Interface** (Terminal/Command Prompt)

### Quick Start

1. **Clone the repository**
   ```bash
   git clone https://github.com/heetnandu01/LibraryManager.git
   cd LibraryManager
   ```

2. **Compile the Java files**
   ```bash
   javac *.java
   ```

3. **Run the application**
   ```bash
   java Main
   ```

---

## 📖 Usage

### Main Menu Options

Upon running the application, you'll see an interactive menu:

```
========== LIBRARY MANAGEMENT SYSTEM ==========
1. Add New Book
2. View All Books
3. Search Book by ID
4. Search Books by Author
5. Sort Books by Title
6. Sort Books by ID
7. Remove Book by ID
8. Library Statistics
9. Exit
```

### Operations Guide

1. **Add Book** - Enter unique book ID, title, and author name
2. **View All** - Display complete library inventory in table format
3. **Search by ID** - Find specific book using its unique identifier
4. **Search by Author** - Locate all books by a particular author
5. **Sort by Title** - View books alphabetically ordered by title
6. **Sort by ID** - Display books in numerical order by ID
7. **Remove Book** - Delete book from library using its ID
8. **Statistics** - View library collection overview
9. **Exit** - Save and close the application

---

## 🎯 Key Features Explained

### Advanced Search Functionality
- **ID-based Search**: O(1) lookup time using LinkedHashMap
- **Author Search**: Find all books by specific authors
- **Flexible Matching**: Case-insensitive search options

### Sorting Capabilities
- **Alphabetical Sorting**: Books sorted by title A-Z
- **Numerical Sorting**: Books sorted by ID in ascending order
- **Preserves Original Data**: Non-destructive sorting operations

### Data Management
- **Unique ID System**: Prevents duplicate book entries
- **LinkedHashMap Storage**: Maintains insertion order while providing fast access
- **Input Validation**: Ensures data integrity and prevents errors

---

## 🔧 Core Components

### Book Class
```java
// Book entity with properties:
- Book ID (Unique identifier)
- Title
- Author
- Additional metadata methods
```

### LibraryDatabase Class
```java
// Core functionalities:
- Add/Remove Books
- Search Operations
- Sorting Algorithms
- Data Validation
- Statistics Generation
```

### Main Class
```java
// User interface:
- Menu-driven system
- Input handling
- Error management
- User experience optimization
```

---

## 🚀 Example Usage

```bash
# Compile the project
javac *.java

# Run the application
java Main

# Example workflow:
# 1. Choose option 1 (Add New Book)
# 2. Enter Book ID: 101
# 3. Enter Title: "The Great Gatsby"
# 4. Enter Author: "F. Scott Fitzgerald"
# 5. Book successfully added to library!
```

### Sample Output
```
========== ALL BOOKS ==========
ID    | Title                 | Author
------|----------------------|-------------------
101   | The Great Gatsby     | F. Scott Fitzgerald
102   | To Kill a Mockingbird| Harper Lee
103   | 1984                 | George Orwell
===============================
Total Books: 3
```

---

## 🧪 Testing Scenarios

### Functional Testing
1. **Add Books** - Test with various titles and authors
2. **Search Operations** - Verify ID and author-based searches
3. **Sorting Functions** - Test alphabetical and numerical sorting
4. **Delete Operations** - Verify removal and error handling
5. **Duplicate Handling** - Test with duplicate IDs
6. **Edge Cases** - Empty inputs, special characters, long strings

### Data Validation Testing
- Invalid book IDs (negative, zero, duplicates)
- Empty or null titles/authors
- Special character handling
- Boundary value testing

---

## 🤝 Contributing

1. **Fork the repository**
2. **Create feature branch**
   ```bash
   git checkout -b feature/enhancement-name
   ```
3. **Commit your changes**
   ```bash
   git commit -m 'Add new feature: enhancement description'
   ```
4. **Push to the branch**
   ```bash
   git push origin feature/enhancement-name
   ```
5. **Open a Pull Request**

### Development Guidelines
- Follow Java naming conventions
- Implement comprehensive error handling
- Add meaningful comments
- Maintain code consistency
- Test thoroughly before submitting

---

## 📋 System Requirements

- **Java JDK 8+**
- **Terminal/Command Prompt access**
- **Minimum 50MB RAM**
- **Basic Java compilation knowledge**

---
