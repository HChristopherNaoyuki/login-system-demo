# User Authentication System

## Description
This is a simple user authentication system implemented in Java. It allows users to register with a username and password, checking for specific formatting and complexity requirements. Users can then log in using their registered credentials.

## Features
- Username must contain an underscore and be no longer than 5 characters.
- Password must have:
  - At least 8 characters.
  - At least one uppercase letter.
  - At least one digit.
  - At least one special character (e.g., `!@#$%^&*()`).
- Successful registration and login messages.
- Error messages for incorrect username or password formats.

## Code Overview
- **UserAuthentication Class**: Contains user properties and methods for registration and login.
  - `checkUserName()`: Validates the username format.
  - `checkPasswordComplexity()`: Validates the password complexity.
  - `registerUser()`: Registers the user and checks the validity of their input.
  - `loginUser()`: Checks if the provided credentials match the registered ones.
  - `returnLoginStatus()`: Returns a message based on the login status.

## How to Run
1. Ensure you have the Java Development Kit (JDK) installed on your machine.
2. Compile the `UserAuthentication.java` file using your preferred Java IDE or command line.
3. Run the `UserAuthentication` class to launch the application.

## Usage
1. Input your desired username and password along with your first and last name for registration.
2. The system will check the username and password for formatting and complexity.
3. If registration is successful, input your username and password to log in.
4. The system will inform you if the login was successful or if there was an error.

## Example Workflow
1. Launch the application.
2. Enter a username (must contain `_` and be 5 characters or less).
3. Enter a password (must meet complexity requirements).
4. After successful registration, attempt to log in with the registered credentials.
