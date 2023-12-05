# Fees Management System

This is a simple console-based application written in Java that simulates a fees management system for students.

## Classes

The application consists of three main classes:

1. `Student`: This class represents a student with properties like `id`, `name`, `totalFeesPaid`, and `totalFeesDue`. It also has methods to get these properties and to make a payment.

2. `FeesManagementSystem`: This class represents the fees management system. It maintains a list of students and has methods to add a student and find a student by their ID.

3. `FeesManagementApp`: This is the main class that runs the application. It creates an instance of `FeesManagementSystem` and provides a menu for the user to interact with the system.

## How to Run

To run the application, compile and run the `FeesManagementApp` class. The application will display a menu with options to add a student, make a payment, view student details, and exit the application.

## Features

- Add a new student with their ID, name, total fees paid, and total fees due.
- Make a payment for a student using their ID. The payment amount will be added to the total fees paid and subtracted from the total fees due.
- View the details of a student, including their ID, name, total fees paid, and total fees due.

Please note that this is a simple application and does not persist data. Once the application is closed, all data will be lost. 

## Future Enhancements

- Data persistence: Save the students' data to a file and load it when the application starts.
- Error handling: Add more robust error handling for invalid inputs.
- User interface: Develop a graphical user interface (GUI) for a better user experience. 


## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change. Please make sure to update tests as appropriate. 
