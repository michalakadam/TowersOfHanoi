package pl.michalak.adam.algorithm;

public class AlgorithmAPI {
    Recursion recursion;
    StopWatch stopWatch;

    public AlgorithmAPI(boolean shouldInfoBePrinted){
        this.recursion = new Recursion(shouldInfoBePrinted);
        this.stopWatch = new StopWatch();
    }


    public void makeUseOfTheRecursion(int numberOfDisks)
    {
        stopWatch.startMeasuringTime();
        recursion.useRecursion(numberOfDisks);
        stopWatch.stopMeasuringTime();
    }

    public double getTimeOfRecursion(){
        return stopWatch.getWholeTime();
    }
}
