# CustomerCare System

## Overview

The **CustomerCare** system is a Java-based application designed to manage customer information in various domains such as:

* **Automobile**
* **Travel**
* **Home**
* **Family**
* **Commercial**
* **Calendar events**

It integrates with a **database** for storage/retrieval and uses a **Swing GUI** for user interaction.

---

## Features

* Search for customers by keyword or ID.
* Retrieve detailed customer information:

  * Automobile
  * Travel
  * Home
  * Family
  * Commercial
  * Calendar
* Insert and update member records for each domain.
* GUI interface for displaying search results and details.

---

## Project Structure

* **CustomerCare.java** → Core application logic and database operations.
* **Utilities.java** (referenced) → Manages DB connection, statements, and result sets.
* **DatabaseConstant.java** (referenced) → Stores DB connection strings, credentials, and constant values.
* **GUIForCustomerCare.java** (referenced) → Handles the user interface.

---

## Requirements

* **Java 8+**
* **JDBC-compatible Database** (configured in `DatabaseConstant.java`)
* Dependencies:

  * `java.sql.*`
  * `javax.swing.*`

---

## Setup

1. Clone or download the repository.
2. Configure your database connection in **`DatabaseConstant.java`**:

   ```java
   public static final String URL = "jdbc:mysql://localhost:3306/yourDB";
   public static final String USER = "yourUsername";
   public static final String PASSWORD = "yourPassword";
   ```
3. Compile the project:

   ```bash
   javac customerCare/CustomerCare.java
   ```
4. Run the program:

   ```bash
   java customerCare.CustomerCare
   ```

---

## Usage

* **Search Customers**
  Enter a keyword or customer ID to retrieve customer details.
* **Submit Records**
  Add or update information across different categories (auto, home, travel, etc.).
* **GUI Interaction**
  Results are displayed through the `GUIForCustomerCare` interface.

---

## Notes

* Ensure your database schema matches the queries in the code.
* The GUI components (`GUIForCustomerCare`) must be implemented to visualize the data.

---
