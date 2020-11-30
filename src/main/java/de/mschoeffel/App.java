package de.mschoeffel;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type the number of the day you want to execute: (0 to execute all)");
        int number = -1;
        try {
            number = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("Invalid Format/Input!");
        }
        if (number > 0) {
            switch (number) {
                case 1:
                    //TODO
                    break;
                default:
                    System.out.println("Invalid number or day not solved yet.");
            }
        }

    }

}
