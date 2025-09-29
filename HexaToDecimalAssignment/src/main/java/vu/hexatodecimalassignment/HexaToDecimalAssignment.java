
package vu.hexatodecimalassignment;
import java.util.Scanner;
public class HexaToDecimalAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hexadecimal digit (0-9 or A-F): ");
        String hex = input.nextLine();

        if (hex.length() != 1) {
            System.out.println("Invalid input. Enter a single character.");
            return;
        }

        char ch = hex.charAt(0);
        int decimal;

        if (ch >= '0' && ch <= '9') {
            decimal = ch - '0';
        } else if (ch >= 'A' && ch <= 'F') {
            decimal = 10 + (ch - 'A');
        } else if (ch >= 'a' && ch <= 'f') {
            decimal = 10 + (ch - 'a');
        } else {
            System.out.println("Invalid hexadecimal digit.");
            return;
        }

        System.out.println("Decimal value: " + decimal);
    }
}

