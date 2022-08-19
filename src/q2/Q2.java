
package q2;
import java.util.Scanner;
public class Q2 {
    
    public static final int PASSWORD_LENGTH = 8;

// The Main method to implement the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s ;
        
        do {
        System.out.println(
                "1. A password must have at least eight characters.\n"
                + "2. A password consists of only letters and digits.\n"
                + "3. A password must contain at least two digits and at least two letters. \n"
                + "Input a password : ");
         s = input.nextLine();
         if ( is_Valid_Password(s) == false) {
                System.out.println("Invalid Password !!!");
            }
        }
        while (!is_Valid_Password(s));
        System.out.println("This is a valid password.");
        input.close();
    }
// A method to check whether a password is valid.
    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) {
            return false;
        }

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);
            
            if (is_Numeric(ch)) {
                numCount++;
            } else if (is_Letter(ch)) {
                charCount++;
            } else {
                return false;
            }
        }

        return (charCount >= 2 && numCount >= 2);
    }
    
//A method to check whether a password consists of only letters.
    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    
//A method to check whether a password consists of only digits.
    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
}
