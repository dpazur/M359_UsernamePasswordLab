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



        // Part 2
        // Ask the user to enter a password and pass this value to the validatePassword method.
        // The validatePassword method will check if the password meets the criteria:
        System.out.println("Enter A Passcode.");
        String passcode = input.nextLine();
        Boolean isValidCode = validatePassword(passcode);


        // Part 3
        // If the user entered a valid password in step 2, then ask the user to enter their
        // credit card number and pass this value to the maskCreditCard method.
//        if(isValidCode == true)
//        {
//            System.out.println("Enter Your Credit Card Number.");
//            String givenCCNumber = input.nextLine();
//            String ccNumber = maskCreditCard(givenCCNumber);
//        }

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
//        if(password.length() >= 8 && password.contains())
//        {
//
//        }
        return true;
    }
    public static String maskCreditCard(String creditCardNumber) {
        // Fill in this method and if the credit card is valid, return a masked CC
        return "";
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
