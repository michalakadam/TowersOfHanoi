package pl.michalak.adam.algorithm;

class Recursion {
    private final boolean shouldInfoBePrinted;
    private final static char fromRod = 'A';
    private final static char toRod = 'B';
    private final static char tempRod = 'C';
    private final StepCounter stepCounter;

    Recursion(boolean shouldInfoBePrinted){
        this.shouldInfoBePrinted = shouldInfoBePrinted;
        this.stepCounter = new StepCounter();
    }


    void useRecursion(int numberOfDisks) {
        swapDisks(numberOfDisks, fromRod, toRod, tempRod);
    }

    private void swapDisks(int numberOfDisks, char fromRod, char toRod, char tempRod) {
        if(numberOfDisks == 1)
        {
            stepCounter.addOneStep();
            if(this.shouldInfoBePrinted) {
                System.out.printf("\nMove disk %d from rod %c to rod %c", numberOfDisks, fromRod, toRod);
            }
                return;
        }
        swapDisks(numberOfDisks-1, fromRod, tempRod, toRod);
        stepCounter.addOneStep();
        if(this.shouldInfoBePrinted) {
            System.out.printf("\nMove disk %d from rod %c to rod %c", numberOfDisks, fromRod, toRod);
        }
        swapDisks(numberOfDisks-1, tempRod, toRod, fromRod);
    }
}
