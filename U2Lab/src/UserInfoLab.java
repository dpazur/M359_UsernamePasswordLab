import java.util.Scanner;

public class UserInfoLab {
    public static void main(String[] args) {
        // Part 1
        // Create a Scanner for keyboard input

        //call upon the inputted scanner
        Scanner input = new Scanner(System.in);

        // Ask the user to enter their first and last name and pass these
        // values to the generateUsername method and save the returned result.
        System.out.println("Enter Your First Name, Then Your Last Name.");
        String fName = input.nextLine();
        String lName = input.nextLine();
        String userName = generateUsername(fName, lName);
        System.out.println(userName);


        // Part 2
        // Ask the user to enter a password and pass this value to the validatePassword method.
        // The validatePassword method will check if the password meets the criteria:
        System.out.println("Enter A Passcode.");
        String passcode = input.nextLine();
        Boolean isValidCode = validatePassword(passcode);
        System.out.println(isValidCode);

        // Part 3
        // If the user entered a valid password in step 2, then ask the user to enter their
        // credit card number and pass this value to the maskCreditCard method.
        String ccNumber ="";
        if(isValidCode == true)
        {
            System.out.println("Enter Your Credit Card Number.");
            String givenCCNumber = input.nextLine();
            ccNumber = maskCreditCard(givenCCNumber);
        }
        System.out.println(ccNumber);

        // Part 4
        // If the user entered a valid password AND valid credit card number, display the output
        // as shown in the demo video
        // https://drive.google.com/file/d/1sMOw5wkOgSfuUcvQhFyZ5flnv_d9qQd3/view?usp=sharing

    }

    public static String generateUsername(String firstName, String lastName) {
        String first3 = "";
        String last3 = "";
        if(firstName.length() <=3)
        {
            first3 = firstName.toLowerCase();
        }
        else
        {
            first3 = firstName.substring(0,3).toLowerCase();
        }
        if(lastName.length() <=3)
        {
            last3 = lastName.toLowerCase();
        }
        else
        {
            last3 = lastName.substring(0,3).toLowerCase();
        }
        return first3 + last3;
    }

    public static boolean validatePassword(String password) {
        Boolean isValid = true;
        if(password.length() < 8)
        {
            System.out.println("Not 8 digits long");
            isValid = false;
        }
        if(containsDigit(password) == false)
        {
            System.out.println("Doesn't contain a digit");
            isValid = false;
        }
        if(password.equals(password.toLowerCase()) == true)
        {
            System.out.println("Doesn't contain an uppercase digit");
            isValid = false;
        }

        if(isValid == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static String maskCreditCard(String creditCardNumber) {
        String output = "N/A";
        if(creditCardNumber.length() == 16 && allDigits(creditCardNumber) == true)
        {
            output = "**** **** **** " + creditCardNumber.substring(13,16);
            return output;
        }
        else
        {
            return output;
        }
    }

    /**
     This method verifies that the string contains at least one numeric digit
     @param str The string to check
     @return true or false if a digit is present
     */
    public static boolean containsDigit(String str) {
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if (Character.isDigit(c))
                return true;
        }
        return false;
    }

    /**
     * Checks if the entire String is all numerical
     * @param str The string to check
     * @return true or false if the string is ALL digits
     */
    public static boolean allDigits(String str) {
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

}
