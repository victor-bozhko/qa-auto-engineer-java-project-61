package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetUser;
import static hexlet.code.games.Calc.startCalcGame;
import static hexlet.code.games.Even.startEvenGame;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Greet\n2 - Even\n3 - Calc\n0 - Exit\nYour choice: ");
        int action = scanner.nextInt();

        switch (action) {
            case 0:
                break;
            case 1:
                greetUser();
                break;
            case 2:
                startEvenGame();
                break;
            case 3:
                startCalcGame();
                break;
            default:
                System.out.println("The selected value " + action + " is missing from the list");
                break;
        }
    }
}
