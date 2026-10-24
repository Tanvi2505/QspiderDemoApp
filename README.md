# QspiderWebsite - TestNG & Selenium Automation Framework

An end-to-end Web UI Test Automation Framework engineered in **Java (JavaSE-1.8)** using **Selenium WebDriver** and **TestNG**. This suite automates and validates various functional components of the Qspiders Demo App platform, adhering to modular programming standards and data-driven testing practices.

---

## 📋 Table of Contents
1. [Project Overview](#-project-overview)
2. [Tech Stack & Dependencies](#-tech-stack--dependencies)
3. [Project Directory Architecture](#-project-directory-architecture)
4. [Framework Design & Core Components](#-framework-design--core-components)
5. [Test Scripts & Functional Coverage](#-test-scripts--functional-coverage)
6. [Prerequisites & Environment Setup](#-prerequisites--environment-setup)
7. [How to Execute Tests](#-how-to-execute-tests)
8. [Reporting & Outputs](#-reporting--outputs)
9. [Author](#-author)

---

## 📌 Project Overview

The **QspiderWebsite** project is built to test and verify essential web UI elements and user interactions on the demo application. It features:
- Centralized driver setup and lifecycle controls via base classes.
- Reusable utility classes for common Selenium operations (waits, screenshots, JavaScript execution, dropdown handling).
- External locator/test data management using property/resource files (`WebElementFile`).
- Multi-component UI validation covering forms, tables, media, dynamic inputs, and buttons.

---

## 🛠 Tech Stack & Dependencies

- **Programming Language**: Java (JavaSE-1.8)
- **Automation Engine**: Selenium WebDriver (v4.x)
- **Test Framework**: TestNG (v7.x)
- **Build & Dependency Management**: Apache Maven
- **Configuration & Test Runner**: `testng.xml`
- **IDE**: Eclipse IDE / IntelliJ IDEA

---

## 📂 Project Directory Architecture

```text
QspiderWebsite
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── QspidersDemoAppAssignment
│   │   │       ├── QspiderDemoApp.java          # Base Class: Driver setup, preconditions (@BeforeClass/@BeforeMethod), and teardown
│   │   │       └── QspiderUtility.java          # Generic utilities (waits, element actions, property file readers)
│   │   └── resources
│   │
│   └── test
│       ├── java
│       │   └── QspiderDemoTestScriptAssignment
│       │       ├── Button.java                  # Button interaction & state tests
│       │       ├── CheckBox.java                # Checkbox selection & verification tests
│       │       ├── DropDown.java                # Single & multi-select dropdown tests
│       │       ├── FormValidation.java          # Field validation, submissions, and alert handling
│       │       ├── Image.java                   # Image visibility and broken asset checks
│       │       ├── Link.java                    # Link redirections and HTTP status checks
│       │       ├── RadioButton.java             # Radio button toggle and selection tests
│       │       ├── TextField.java               # Text inputs, clearing, and boundary checks
│       │       ├── Toggle.java                  # Toggle switch state validations
│       │       └── WebTable.java                # Table cell, row, and column dynamic parsing
│       └── resources
│           └── WebElementFile                   # External locator mappings and environment test data
│
├── JRE System Library [JavaSE-1.8]              # Java Runtime Environment dependencies
├── Maven Dependencies                           # External libraries managed via pom.xml
├── target/                                      # Compiled class files and artifacts
├── test-output/                                 # TestNG execution logs and HTML reports
├── pom.xml                                      # Maven dependencies and build plugins
└── testng.xml                                   # Suite execution and runner XML

