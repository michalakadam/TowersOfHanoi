package pl.michalak.adam.algorithm;

class StopWatch {
    private long startTime;
    private long endTime;
    private double wholeTime;

    StopWatch(){
        this.startTime = 0;
        this.endTime = 0;
        this.wholeTime = 0;
    }


    void startMeasuringTime() {
        this.startTime = System.nanoTime();
    }

    void stopMeasuringTime() {
        this.endTime = System.nanoTime();
        convertTheTimeToSeconds();
    }

    private void convertTheTimeToSeconds() {
        this.wholeTime = (double)(this.endTime-this.startTime)*10E-9;
    }

    double getWholeTime() {
        return wholeTime;
    }
}
