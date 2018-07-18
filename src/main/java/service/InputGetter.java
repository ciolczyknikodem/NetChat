package service;

import java.util.Scanner;

public class InputGetter {

    private Scanner scanner;

    public String userInput() {
        String input;
        initializeScanner();

        while(scanner.hasNext()) {
            input = scanner.nextLine();

            if(input != null) {
                return input;
            }
        }
        throw new IllegalArgumentException();
    }

    private void initializeScanner() {
        scanner = new Scanner(System.in);
    }
}
