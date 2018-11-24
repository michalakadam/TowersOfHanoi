package pl.michalak.adam.algorithm;

class StepCounter{
    private static int steps = 0;

    void addOneStep() {
        steps++;
    }

    int getSteps() {
        return steps;
    }
}
