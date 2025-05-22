package login;

public class Login {
    private String username;
    private String password;
    private String cellNumber;

    public Login() {
    }

    public Login(String username, String password, String cellNumber) {
        this.username = username;
        this.password = password;
        this.cellNumber = cellNumber;
    }

    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[^a-zA-Z0-9].*");
    }

    public boolean checkCellPhoneNumber(String number) {
        return number.startsWith("+27") && number.length() == 12;
    }

    public String registerUser(String username, String password, String cellNumber) {
        this.username = username;
        this.password = password;
        this.cellNumber = cellNumber;

        if (!checkUserName(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (!checkCellPhoneNumber(cellNumber)) {
            return "Cell number is incorrectly formatted or does not contain an international code, please correct the number and try again.";
        }

        return "User registered successfully.";
    }

    public boolean loginUser(String inputUsername, String inputPassword) {
        return inputUsername.equals(this.username) && inputPassword.equals(this.password);
    }

    public String returnLoginStatus(boolean loginSuccess) {
        return loginSuccess ? "Welcome " + username + ", it is great to see you again."
                            : "Username or password incorrect, please try again.";
    }
}