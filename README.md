# Unit-Converter-Application-Task1-
Purpose
The Unit Converter application is a simple Java program designed to help users convert between different units of measurement. It primarily focuses on converting lengths (centimeters to meters and vice versa) and weights (grams to kilograms and vice versa). This application is particularly useful for students, professionals, and anyone needing quick unit conversions.

Functionality
User Input:

The application prompts the user to input a numerical value representing the quantity to be converted.
The user is then asked to select the source unit (the unit of the input value).
Next, the user selects the target unit (the unit to which they want to convert).
Unit Conversion:

The application performs the conversion based on the selected units.
Supported conversions include:
Centimeters to Meters
Meters to Centimeters
Grams to Kilograms
Kilograms to Grams
Error Handling:

The application checks for input mismatches (e.g., if the user inputs a non-numeric value when a number is expected) and provides appropriate feedback, prompting the user to enter a valid number.
Output:

After processing the input, the application outputs the converted value to the user.
Code Breakdown
Here's a breakdown of the key components of the Java code:

Imports: The program imports Scanner for user input and InputMismatchException for handling input errors.

Main Method: The entry point of the program, where user interactions take place. It includes:

Creating a Scanner object for reading input.
Prompting the user for a value and reading it with error handling.
Asking the user to select source and target units.
Calling a method to perform the conversion and printing the result.
Conversion Logic: The convertUnits method handles the actual conversion based on the selected source and target units. It contains simple conditional statements to perform the calculations.

Example Usage
The user runs the program.
They enter a value (e.g., 150).
The user selects the source unit (e.g., 1 for Centimeters).
The user selects the target unit (e.g., 2 for Meters).
The program outputs the converted value (e.g., 1.5).
