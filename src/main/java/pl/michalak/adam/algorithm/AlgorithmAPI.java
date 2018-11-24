package pl.michalak.adam.algorithm;

public class AlgorithmAPI {
    Recursion recursion;

    public AlgorithmAPI(boolean shouldInfoBePrinted){
        this.recursion = new Recursion(shouldInfoBePrinted);
    }

    public void makeUseOfTheRecursion(int numberOfDisks)
    {
        recursion.useRecursion(numberOfDisks);
    }
}
