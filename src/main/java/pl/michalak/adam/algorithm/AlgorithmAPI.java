package pl.michalak.adam.algorithm;

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
