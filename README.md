# Introduction

Karate is an open-source API testing framework that enables test automation using Behavior-Driven Development (BDD). It is built on top of Cucumber and allows for writing tests in a simple, Gherkin-based syntax without requiring Java coding.

## Table of Contents

1. [Prerequisites](#prerequisites)
2. [Steps to Install](#steps-to-install)
   - [Java Installation](#Java-Installation)
   - [Maven Installation](#Maven-Installation)
   - [Karate Installation](#Karate-Installation)
3. [Project Structure](#project-structure)
4. [Running Tests](#running-tests)
5. [Test Data Management](#test-data-management)
6. [Writing Tests](#writing-tests)

 
# Prerequisites
Ensure you have the following installed before setting up Karate:

## Steps to Install

### Java Installation
Karate requires Java 8 or higher.

Install Java (Windows/Linux/Mac)
Windows: Download and install Java from Oracle JDK or use AdoptOpenJDK.

Linux/macOS: Install via terminal:
sudo apt update && sudo apt install openjdk-11-jdk  # Ubuntu/Debian
brew install openjdk@11  # macOS (using Homebrew)

Verify Java installation:
java -version

### Maven Installation
Maven is required for managing Karate dependencies and running tests.
Install Maven (Windows/Linux/Mac)
Windows: Download and install Maven from Apache Maven and configure the PATH.

Linux/macOS: Install via terminal:
sudo apt install maven  # Ubuntu/Debian
brew install maven  # macOS

Verify Maven installation:
mvn -version

## Clone the repository: 
   git clone https://github.com/sharad-dubey/Quapitestkarate-main.git

### Karate Installation

Karate is a standalone framework and does not require a separate installation. It can be used with Maven or Gradle.

1. Using Maven (Recommended)

The Karate dependencies are already in file pom.xml:
Run the following command to download dependencies:
mvn clean test

### Project Structure

├── src/test/java/InventoryFlow        # Feature files
│   ├── addNewItemNonExistingId.feature       # Example feature file  
│   ├── createNewItemWithExistingId.feature
│   ├── getItemDetails.feature
│   ├── getItemDetailsById.feature
│   ├── itemCreationWithMissingFields.feature
│   ├── recentCreatedItem.feature
├── src/test/java/                  # JSON test data files
│   ├── ExistingIdEntry.json       # Example test data  
│   ├── JsonResponseThirdItem.json       
│   ├── MissingInformationEntry.json       
│   ├── NewIdEntry.json            
├── src/test/java/InventoryFlow        # TestRunner file
│   ├── TestRunner.java       
├── src/test/java/Karate-config.js   # Karate configuration
├── README.md              # Project documentation
├── pom.xml              # Project dependencies



## Running Tests

mvn clean test

## Report generated at
/target/karate-reports/karate-summary.html

## Test Data Management
All test data is maintained in JSON files within the src/test/java/ directory. 
Example: ExistingIdEntry.json
{"id": "10","name": "Hawaiian","image": "hawaiian.png","price": "$14"}


## Writing Tests
Write your test in the feature files in the src/test/java/InventoryFlow/ directory using Gherkin-based syntax.


