# Mailerlite UI framework

This project contains automated tests for the Mailerlite website using Selenium and Java.

## Table of Contents

- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [Running Tests](#running-tests)

## Project Structure

The project follows the Page Object Model (POM) design pattern with the following structure:

- **pages:** Contains page classes representing different pages of the website.
- **tests:** Contains test classes for different test scenarios.
- **data:** Includes Lombok classes for data representation.
- **config:** Stores configuration files, e.g., URLs.

## Setup and Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/AlmirRekanovic/mailerlite-ui.git
    ```

2. Navigate to the project directory:

    ```bash
    cd mailerlite-ui
    ```

3. Ensure you have Java and Maven installed.

4. Download dependencies:

    ```bash
    mvn clean install
    ```

## Running Tests

Run tests using the following command:

```bash
mvn test
