# 🏢 Employee Payroll System 💰

## 📌 Overview

The **Payroll Management System** is a Java-based application designed to manage employee payroll. It supports both full-time and part-time employees, allowing for salary calculations based on employment type. The system also provides functionalities to add, remove, and display employee details.

## 🚀 Features

- **👥 Employee Management**: Supports both full-time and part-time employees.
- **💵 Salary Calculation**:
  - 🏢 Full-time employees have a fixed monthly salary.
  - ⏳ Part-time employees are paid based on hours worked and hourly rate.
- **🛠️ CRUD Operations**:
  - ➕ Add employees to the payroll.
  - ❌ Remove employees based on their ID.
  - 📄 Display employee details.
- **🧑‍💻 Object-Oriented Approach**: Implements abstraction and inheritance.

## 🛠️ Technologies Used

- **☕ Java** (OOP principles)
- **📂 Collections Framework** (ArrayList for managing employees)




## 🔍 Classes and Responsibilities

### 1. `Employee` (Abstract Class) 🏢

- **Attributes**: `name`, `id`
- **Methods**: `calculateSalary()` (abstract), `getName()`, `getId()`, `toString()`

### 2. `FullTimeEmployee` (Extends `Employee`) 💼

- **Attribute**: `monthlySalary`
- **Implements** `calculateSalary()` returning a fixed monthly salary.

### 3. `PartTimeEmployee` (Extends `Employee`) ⏳

- **Attributes**: `hoursWorked`, `hourlyRate`
- **Implements** `calculateSalary()` by multiplying hours worked with the hourly rate.

### 4. `PayrollSystem` 📊

- Uses `ArrayList<Employee>` to store employees.
- **Provides methods to**:
  - ✅ `addEmployee(Employee employee)`: Add an employee to the payroll.
  - ❌ `removeEmployee(int id)`: Remove an employee using their ID.
  - 📋 `displayEmployee()`: Print all employee details.

## ▶️ How to Run

1. **Compile the Java files**:
   ```sh
   javac com/pack1/*.java
   ```
2. **Run the ****`PayrollSystem`**** class**:
   ```sh
   java com.pack1.PayrollSystem
   ```


## 🔮 Future Enhancements

- 🖥️ Implement a graphical user interface (GUI) for better interaction.
- 🗄️ Integrate database support for persistent data storage.
- 🔄 Add additional employee types (e.g., contract-based employees).

## ✍️ Author

- **Prathamesh Shelke** 🚀

