Validator Library

A lightweight, reusable Java validation library for numbers, strings, and collections.
Provides type-safe, fluent, and flexible validation utilities that can be used across any Java project.

Features :-

Number Validation : 

 - Check for positive, non-zero, non-negative values

 - Supports both primitives and Number objects

 - Optional Consumer-based fail handling

String Validation : 

 - Check for non-empty strings

 - Enforce maximum length with custom handling

Collection & Map Validation : 

 - Ensure collections and maps are not null or empty


 Usage : 

1. Build and install the library locally:

cd /path/to/validator-lib
mvn clean install

this will add the library in your .m2 folder.

2. Add the dependency in your other project’s pom.xml:

<dependency>
    <groupId>org.validator</groupId>
    <artifactId>validator-lib</artifactId>
    <version>1.0.0</version>
</dependency>


3. Maven will pull it from your local repository (~/.m2/repository)

