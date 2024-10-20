import java.util.Scanner;

public class UserAuthentication
{
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public UserAuthentication(String username, String password, String firstName, String lastName)
    {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean checkUserName()
    {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity()
    {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[!@#$%^&*()].*");
    }

    public String registerUser()
    {
        if (!checkUserName())
        {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
        else if (!checkPasswordComplexity())
        {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.";
        }
        else
        {
            return "User registered successfully.";
        }
    }

    public boolean loginUser(String enteredUsername, String enteredPassword)
    {
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }

    public String returnLoginStatus(boolean isLoggedIn)
    {
        if (isLoggedIn)
        {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        }
        else
        {
            return "Username or password incorrect, please try again.";
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        UserAuthentication user = new UserAuthentication(username, password, firstName, lastName);
        String registrationMessage = user.registerUser();
        System.out.println(registrationMessage);

        System.out.println("Enter your username to login:");
        String enteredUsername = scanner.nextLine();
        System.out.println("Enter your password to login:");
        String enteredPassword = scanner.nextLine();

        boolean isLoggedIn = user.loginUser(enteredUsername, enteredPassword);
        String loginStatusMessage = user.returnLoginStatus(isLoggedIn);
        System.out.println(loginStatusMessage);
    }
}
