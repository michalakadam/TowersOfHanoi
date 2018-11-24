package pl.michalak.adam.algorithm;

class StepCounter{
    static int steps = 0;

    void addOneStep()
    {
        this.steps++;
    }

    public int getSteps()
    {
        return steps;
    }
}
