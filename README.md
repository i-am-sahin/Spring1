# Spring1 - Spring Framework Learning Project

A comprehensive Spring Framework demonstration project showcasing various Spring concepts including dependency injection, bean configuration, and different configuration approaches.

## 📋 Table of Contents
- [Overview](#overview)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Features Demonstrated](#features-demonstrated)
- [Getting Started](#getting-started)
- [Configuration Methods](#configuration-methods)
- [Key Concepts](#key-concepts)
- [Running the Project](#running-the-project)
- [Build and Test](#build-and-test)

## 🎯 Overview

This project is designed as a learning resource for Spring Framework fundamentals. It demonstrates the evolution from traditional object creation to Spring's Inversion of Control (IoC) and Dependency Injection patterns through practical examples.

## 🛠 Technologies Used

- **Java** - Core programming language
- **Spring Framework 6.2.7** - IoC container and dependency injection
- **Maven** - Build automation and dependency management
- **JUnit 3.8.1** - Unit testing framework

## 📁 Project Structure

```
src/
├── main/
│   ├── java/com/sahin/
│   │   ├── Alien.java              # Main business class with dependencies
│   │   ├── App.java                # Application entry point
│   │   ├── Computer.java           # Interface for computer types
│   │   ├── Desktop.java            # Desktop implementation
│   │   ├── Laptop.java             # Laptop implementation
│   │   └── config/
│   │       └── AppConfig.java      # Java-based Spring configuration
│   └── resources/
│       └── spring.xml              # XML-based Spring configuration
└── test/
    └── java/com/sahin/
        └── AppTest.java            # Unit tests
```

## ✨ Features Demonstrated

### 1. **Dependency Injection Patterns**
- Constructor injection
- Setter injection
- Field injection using `@Autowired`

### 2. **Bean Configuration Methods**
- **XML Configuration** - Traditional Spring XML configuration
- **Java Configuration** - Modern annotation-based configuration
- **Component Scanning** - Automatic bean discovery

### 3. **Spring Annotations**
- `@Component` - Mark classes as Spring beans
- `@Autowired` - Automatic dependency injection
- `@Value` - Inject primitive values
- `@Qualifier` - Specify which bean to inject when multiple candidates exist
- `@Primary` - Mark preferred bean when multiple candidates exist
- `@Scope` - Define bean lifecycle (singleton, prototype)

### 4. **Bean Scopes**
- **Singleton** - Default scope (one instance per container)
- **Prototype** - New instance for each request

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- Maven 3.6 or higher

### Installation

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd Spring1
   ```

2. **Build the project**
   ```bash
   mvn clean compile
   ```

3. **Run the application**
   ```bash
   mvn exec:java -Dexec.mainClass="com.sahin.App"
   ```

## ⚙️ Configuration Methods

### Java-Based Configuration (Currently Active)
The project uses `AppConfig.java` with `@Configuration` and `@ComponentScan` annotations:

```java
@Configuration
@ComponentScan("com.sahin")
public class AppConfig {
    // Bean definitions using @Bean annotation (commented out)
}
```

### XML-Based Configuration (Alternative)
The project includes `spring.xml` demonstrating XML configuration:
- Bean definitions with `<bean>` elements
- Property injection
- Constructor injection
- Autowiring by type/name

## 🔑 Key Concepts

### 1. **Inversion of Control (IoC)**
- Spring container manages object creation and lifecycle
- Reduces tight coupling between classes

### 2. **Dependency Injection**
- `Alien` class depends on `Computer` interface
- Spring automatically injects appropriate implementation (`Desktop` or `Laptop`)

### 3. **Interface-Based Design**
- `Computer` interface with `Desktop` and `Laptop` implementations
- Promotes loose coupling and easy testing

### 4. **Bean Lifecycle Management**
- Constructor execution tracking
- Singleton vs Prototype scope demonstration

## 🏃‍♂️ Running the Project

### Main Application
```bash
mvn exec:java -Dexec.mainClass="com.sahin.App"
```

**Expected Output:**
```
Desktop Object Created!
Alien Object Created!
21
Coding!
Compiling Using Desktop!
```

### Running Tests
```bash
mvn test
```

## 🔧 Build and Test

### Compile the project
```bash
mvn compile
```

### Run tests
```bash
mvn test
```

### Package as JAR
```bash
mvn package
```

The built JAR will be available at `target/Spring1-1.0.jar`

## 📚 Learning Objectives

By exploring this project, you will understand:

1. **Traditional vs Spring Approach**: How Spring eliminates manual object creation
2. **Configuration Flexibility**: Multiple ways to configure Spring applications
3. **Dependency Management**: How Spring resolves and injects dependencies
4. **Bean Scopes**: Different object lifecycle patterns
5. **Annotation Usage**: Modern Spring development practices

## 🔄 Code Evolution

The project shows the evolution from:
1. **Manual Object Creation** (commented out in `App.java`)
2. **XML Configuration** (available in `spring.xml`)
3. **Java Configuration** (current implementation)

## 📝 Notes

- The project includes extensive comments showing different approaches
- Multiple configuration examples are preserved for learning purposes
- Both XML and Java-based configurations are available for comparison

## 🤝 Contributing

This is a learning project. Feel free to:
- Add more examples
- Improve documentation
- Add additional Spring features
- Enhance test coverage

## 📩 Contact

**Sahin Islam**
- 📧 LinkedIn: [Sahin Islam](https://linkedin.com/in/sahinislam)
- 📁 GitHub: [i-am-sahin](https://github.com/i-am-sahin)

## 📄 License

This project is open-source and available under the MIT License.

---

*This project is designed for educational purposes to demonstrate Spring Framework fundamentals.*
