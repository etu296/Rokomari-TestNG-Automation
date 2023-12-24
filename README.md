# Selenium TestNG Project

## Overview

This project utilizes Selenium and TestNG for web automation testing in Java. TestNG is a testing framework inspired by JUnit and NUnit, and it provides additional functionalities. This README provides information on setting up and running the project.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [Test Structure](#test-structure)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java JDK installed. You can download it [here](https://www.oracle.com/java/technologies/javase-downloads.html).
- Maven installed. You can download it [here](https://maven.apache.org/download.cgi).
- WebDriver for your preferred browser installed. For example, ChromeDriver for Google Chrome. Download the appropriate version from [here](https://sites.google.com/chromium.org/driver/).

## Installation

1. ## Clone the repository:

   ```bash
   git clone https://github.com/your-username/selenium-testng-project.git
2. ## Navigate to the project directory:

cd selenium-testng-project

4.  ## Install the required dependencies:

mvn clean install


5. ## Configuration

Configure the following settings before running the tests:

1 Open the src/test/resources/config.properties file and update the base.url property with the URL of your web application.

2 Update the webdriver.path property in the src/test/resources/config.properties file with the correct path to your WebDriver executable.

6. ## Usage
Run the tests using the following command:
mvn test
By default, TestNG will discover and run all test cases in the src/test/java directory.

7. ## Test Structure
The test structure is organized as follows:

src/test/java: Contains individual test scripts.
src/main/java/pages: Contains Page Object Model (POM) classes for each web page.
src/main/java/utils: Contains utility functions and common functionalities.
src/test/resources/config.properties: Configuration file for storing constants and configuration settings.

8. ## Contributing
If you'd like to contribute to this project, please follow these steps:

Fork the project.
Create a new branch (git checkout -b feature/your-feature-name).
Commit your changes (git commit -m 'Add new feature').
Push to the branch (git push origin feature/your-feature-name).
Open a pull request.
