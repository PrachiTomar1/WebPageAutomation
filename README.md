# Web Automation Testing with Selenium (Java)

# 📌 Overview

This project automates web testing using Selenium WebDriver with Java and TestNG. The script searches on Google, clicks results, and verifies page titles.

# 🚀 Prerequisites

Before getting started, make sure you have:

Java JDK 11+ installed

Maven for managing dependencies

Google Chrome installed

ChromeDriver that matches your Chrome version

TestNG for running tests

Git for version control

# 📂 Setup Instructions

# 1️⃣ Clone the Repository

First, download the project to your local system:

$ git clone https://github.com/your-username/selenium-web-testing.git
$ cd selenium-web-testing

# 2️⃣ Install Dependencies

Run the following command to install all required libraries:

$ mvn clean install

# 3️⃣ Update ChromeDriver Path

Make sure your WebTest.java file includes the correct path for ChromeDriver:

System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

▶️ Running the Tests

To execute the test script, run:

$ mvn test

Alternatively, you can run the WebTest class directly in your IDE (IntelliJ/Eclipse).

# 📊 What the Test Does

Opens Google

Searches for "Selenium WebDriver"

Clicks the first search result

Verifies that the page title contains "Selenium"

Navigates back and searches for "Test Automation"

Ensures new search results appear

# 📢 Deploying with Jenkins

Want to automate test execution? Follow these steps:

Install the Maven plugin in Jenkins.

Create a new Jenkins job and configure it to run mvn test.

Schedule periodic runs to keep your tests automated.

# 📌 Test Reports

Test results will be displayed in the console. To enhance reporting, consider integrating Extent Reports or Allure Reports.

# 🤝 Contributing

If you'd like to improve this project, feel free to fork it, create a feature branch, and submit a pull request.

# Author: Prachi Tomar
# Repository: https://github.com/PrachiTomar1/WebPageAutomation
