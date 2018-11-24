package pl.michalak.adam.Board;

class Disk {
    private final int number;

    Disk(int number){
        this.number = number;
    }


    @Override
    public String toString() {
        return "disk number " + number;
    }
}
