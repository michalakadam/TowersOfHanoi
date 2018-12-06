package pl.michalak.adam.algorithm;
// import net.jcip.annotations;
//TODO: import
//@Immutable
class StepCounter {
    final static int steps;

    private StepCounter(int nextStep) {
        steps = nextStep;
    }

    StepCounter increase() {
        return new StepCounter(steps++);
    }

    /**
     * Factory method - StepCounter always counts from 0.
     **/
    static StepCounter initialize() {
        return new StepCounter(0);
    }
}
