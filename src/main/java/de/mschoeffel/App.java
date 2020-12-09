package de.mschoeffel;

import de.mschoeffel.Day01.Day01App;
import de.mschoeffel.Day02.Day02App;
import de.mschoeffel.Day03.Day03App;
import de.mschoeffel.Day04.Day04App;
import de.mschoeffel.Day05.Day05App;
import de.mschoeffel.Day06.Day06App;
import de.mschoeffel.Day07.Day07App;
import de.mschoeffel.Day08.Day08App;
import de.mschoeffel.Day09.Day09App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type the number of the day you want to execute: (0 to execute all)");
        int number = -1;
        try {
            number = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("Invalid Format/Input!");
        }
        if (number >= 0) {
            System.out.println();
            switch (number) {
                case 0:
                    Day01App.main(args);
                    System.out.println();
                    Day02App.main(args);
                    System.out.println();
                    Day03App.main(args);
                    System.out.println();
                    Day04App.main(args);
                    System.out.println();
                    Day05App.main(args);
                    System.out.println();
                    Day06App.main(args);
                    System.out.println();
                    Day07App.main(args);
                    System.out.println();
                    Day08App.main(args);
                    System.out.println();
                    Day09App.main(args);
                    break;
                case 1:
                    Day01App.main(args);
                    break;
                case 2:
                    Day02App.main(args);
                    break;
                case 3:
                    Day03App.main(args);
                    break;
                case 4:
                    Day04App.main(args);
                    break;
                case 5:
                    Day05App.main(args);
                    break;
                case 6:
                    Day06App.main(args);
                    break;
                case 7:
                    Day07App.main(args);
                    break;
                case 8:
                    Day08App.main(args);
                    break;
                case 9:
                    Day09App.main(args);
                    break;
                default:
                    System.out.println("Invalid number or day not solved yet.");
            }
        }

    }

}
