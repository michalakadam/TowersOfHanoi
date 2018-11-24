package pl.michalak.adam.algorithm;

import pl.michalak.adam.Board.BoardAPI;

/**
 * This component is responsible for solving Towers of Hanoi problem recursively
 * and measuring its efficiency.
 * @author Adam_Michalak
 */

public class AlgorithmAPI {
    private final Recursion recursion;
    private final StopWatch stopWatch;
    private final StepCounter stepCounter;

    public AlgorithmAPI(boolean shouldInfoBePrinted){
        this.recursion = new Recursion(shouldInfoBePrinted);
        this.stopWatch = new StopWatch();
        this.stepCounter = new StepCounter();
    }


    public void makeUseOfTheRecursion(int numberOfDisks) {
        stopWatch.startMeasuringTime();
        recursion.useRecursion(numberOfDisks);
        stopWatch.stopMeasuringTime();
    }

    public double getTimeOfRecursion() {
        return stopWatch.getWholeTime();
    }

    public int getNumberOfSteps() {
        return stepCounter.getSteps();
    }
}
