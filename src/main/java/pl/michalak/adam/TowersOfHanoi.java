package pl.michalak.adam;

import java.util.Scanner;

/**
 * Główna klasa programu
 *
 * @author Adam Michalak
 */
class TowersOfHanoi {
    final static char fromRod = 'A';
    final static char toRod = 'B';
    final static char tempRod = 'C';

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        swapDisks(setNumberOfDisks(keyboard), decideIfStepsShouldBePrinted(keyboard), fromRod, toRod, tempRod);
        System.out.println("\nDONE!");
    }

    private static void swapDisks(int numberOfDisks, boolean printSteps, char fromRod, char toRod, char tempRod)
    {
        if(numberOfDisks == 1) {
            if(printSteps) {
                System.out.printf("\nMove disk %d from rod %c to rod %c", numberOfDisks, fromRod, toRod);
            }
            return;
        }
        swapDisks(numberOfDisks-1, printSteps, fromRod, tempRod, toRod);
        if(printSteps) {
            System.out.printf("\nMove disk %d from rod %c to rod %c", numberOfDisks, fromRod, toRod);
        }
        swapDisks(numberOfDisks-1, printSteps, tempRod, toRod, fromRod);
    }
    private static int setNumberOfDisks(Scanner keyboard)
    {
        System.out.println("Enter number of disks: ");
        return keyboard.nextInt();
    }
    private static boolean decideIfStepsShouldBePrinted(Scanner keyboard)
    {
        System.out.println("Do you want to see steps needed to move the tower from one rod to the other? (Y/N) ");
        String response = keyboard.next();
        return (response.equals("Y") || response.equals("y"));
    }
}