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
        swapDisks(setNumberOfDisks(keyboard), fromRod, toRod, tempRod);
        System.out.printf("\nDONE!");
    }

    private static void swapDisks(int numberOfDisks, char fromRod, char toRod, char tempRod)
    {
        if(numberOfDisks == 1) {
            System.out.printf("\nMove disk %d from rod %c to rod %c", numberOfDisks, fromRod, toRod);
            return;
        }
        swapDisks(numberOfDisks-1, fromRod, tempRod, toRod);
        System.out.printf("\nMove disk %d from rod %c to rod %c" , numberOfDisks, fromRod, toRod);
        swapDisks(numberOfDisks-1, tempRod, toRod, fromRod);
    }
    private static int setNumberOfDisks(Scanner keyboard){
        System.out.println("Enter number of disks: ");
        return keyboard.nextInt();
    }
}