package pl.michalak.adam.algorithm;

class Recursion {
    private final boolean shouldInfoBePrinted;
    final static char fromRod = 'A';
    final static char toRod = 'B';
    final static char tempRod = 'C';
    StepCounter stepCounter;

    Recursion(boolean shouldInfoBePrinted){
        this.shouldInfoBePrinted = shouldInfoBePrinted;
        this.stepCounter = new StepCounter();
    }
    void useRecursion(int numberOfDisks)
    {
        swapDisks(numberOfDisks, fromRod, toRod, tempRod);
    }
    private void swapDisks(int numberOfDisks, char fromRod, char toRod, char tempRod)
    {
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
