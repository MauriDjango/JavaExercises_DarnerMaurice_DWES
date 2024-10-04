package taller.ui;

import taller.exceptions.InvalidInputException;
import java.util.Scanner;

public class ioConsole extends IO {

    public void write(String message) {
        System.out.println(message);
    }

    public String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();  // Read user input
    }

    public Boolean getYN() throws InvalidInputException {
        String input = read();
        boolean result = false;
        if (Validation.validateYN(input)) {
            if (input.equalsIgnoreCase("y")) {
                result = true;
            }
        } else {
            write("""
                    The option you entered was incorrect.
                    Please type y for yes or n for no""");
            result = getYN();
        }
        return result;
    }

    public int getInt() {
        int number = 0;
        String input = read();
        try {
            if (Validation.isInt(input)) {
                number = Integer.parseInt(input);
            }
        } catch (NumberFormatException e) {
            write("""
                        The number you entered was not a number.
                        Please enter a number.""");
            number = getInt();
        }
        return number;
    }

    public int toInt(String string) throws NumberFormatException {
        int number;
        try {
            number = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            write("""
                    The number you entered was not a number.
                    Please enter a number.""");
            number = getInt();
        }
        return number;
    }
}

