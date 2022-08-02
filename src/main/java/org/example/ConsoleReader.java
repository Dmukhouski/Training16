package org.example;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class ConsoleReader {
    private Scanner scanner;

    public ConsoleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String read(){
        return scanner.nextLine().trim();
    }

}
