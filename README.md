Create a class with a static method. This method takes three parameters: Login Password confirmPassword All fields are of the String data type.
The login length must be less than 20 characters and must not contain spaces.
If login does not meet these requirements, throw a WrongLoginException.
The password length must be less than 20 characters, must not contain spaces, and must contain at least one digit.
Also, password and confirmPassword must be equal. If password does not meet these requirements, throw a WrongPasswordException.
Exception classes WrongPasswordException and WrongLoginException are custom exception classes with two constructors - one by default,
the second accepts the exception message and passes it to the Exception class constructor. The method returns true if the values are valid or false otherwise.
Place classes in packages: the class for checking values should be in its own separate package, classes for exceptions - in their own.
Create a Runner class to test this class. Try to solve the problem in two ways:
1. Using the methods of the String class "out of the box", for example the contains method
2. Splitting the string into an array of chars (string toCharArray()) and traversing and checking the array.
