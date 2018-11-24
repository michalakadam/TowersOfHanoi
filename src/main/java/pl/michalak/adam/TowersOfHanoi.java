package pl.michalak.adam;
/**
 * Główna klasa programu
 *
 * @author Adam Michalak
 */
class TowersOfHanoi {
public static void main(String[] args) {
        char fromRod = 'A';
        char toRod = 'B';
        char tempRod = 'C';
        int numberOfDisks = 3;
        swapDisks(numberOfDisks, fromRod, toRod, tempRod);
        System.out.printf("DONE!");
    }

    private static void swapDisks(int numberOfDisks, char fromRod, char toRod, char tempRod) {
        if(numberOfDisks == 1) {
            System.out.printf("\nMove disk %d from rod %c to rod %c", numberOfDisks, fromRod, toRod);
            return;
        }
        swapDisks(numberOfDisks-1, fromRod, tempRod, toRod);
        System.out.printf("\nMove disk %d from rod %c to rod %c" , numberOfDisks, fromRod, toRod);
        swapDisks(numberOfDisks-1, tempRod, toRod, fromRod);

    }
}
