package pl.michalak.adam.board;

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
