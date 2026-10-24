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

⚙️ Framework Design & Core Components1. Base Class (QspiderDemoApp.java)Manages browser instantiation (ChromeDriver, EdgeDriver, FirefoxDriver) based on parameters.Maximizes the browser window and configures implicit wait timeouts.Handles application launch and pre-test setup using @BeforeClass or @BeforeMethod.Ensures clean teardown using driver.quit() in @AfterClass.2. Common Utilities (QspiderUtility.java)Wrapper methods for explicit synchronization (WebDriverWait, ExpectedConditions).JavaScript execution shortcuts for page scrolling and hidden clicks.Property file loaders to parse external files like WebElementFile.   3. External Resource Mapping (WebElementFile)Decouples UI element identifiers and configuration properties from test logic.Allows test modifications without requiring code recompilation.🧪 Test Scripts & Functional CoverageModule / ScriptTarget Functionality   PNGButton.java   Standard clicks, double-clicks, right-clicks, hover effects, and enabled/disabled states.CheckBox.java   Checking single/multiple checkboxes, default selection status, and toggle states.DropDown.java   Standard select dropdowns using Select (by index, value, visible text) and custom search dropdowns.FormValidation.java   Required input fields, regex validations, submission triggers, and inline validation warnings.Image.java   Broken image detection using HTTP response codes and verification of image rendering/attributes.Link.java   Broken link checks, navigation verifications, and target attribute handling (_blank).RadioButton.java   Mutual exclusion within radio groups and default checked/unchecked validations.TextField.java   Inputting keys, clearing inputs, placeholder text validation, and disabled text box checks.Toggle.java   Interacting with toggle switches, checking dynamic DOM attribute changes, and visual state verification.WebTable.java[cite: 1]Fetching row/column counts, dynamic table cell data extraction, headers verification, and search filtering.💻 Prerequisites & Environment SetupJava Development Kit (JDK): Ensure JDK 8 (or higher) is installed and JAVA_HOME is set.Apache Maven: Verify Maven is installed and accessible in the system PATH (mvn -version).Web Browsers: Ensure updated versions of Google Chrome, Microsoft Edge, or Mozilla Firefox are installed.🚀 How to Execute TestsMethod 1: Using testng.xml Suite Runner (Recommended)[cite: 1]Open the project in your IDE (Eclipse / IntelliJ).Right-click on testng.xml in the project root[cite: 1].Select Run As $\rightarrow$ TestNG Suite.Method 2: Running via Maven Command LineOpen a terminal in the root folder of the project (QspiderWebsite)[cite: 1]:Bash# Clean, compile, and run all tests specified in testng.xml
mvn clean test
Method 3: Running a Single Test Script DirectlyNavigate to src/test/java/QspiderDemoTestScriptAssignment/[cite: 1].Right-click any test file (e.g., Button.java or WebTable.java)[cite: 1].Select Run As $\rightarrow$ TestNG Test.📊 Reporting & OutputsOnce test execution completes, reports are automatically generated by TestNG in the test-output/ folder[cite: 1]:Detailed Summary Report: Open test-output/index.html in any web browser[cite: 1].Emailable Report: Open test-output/emailable-report.html for a quick pass/fail breakdown[cite: 1].👤 AuthorTanvi Suryawanshi
