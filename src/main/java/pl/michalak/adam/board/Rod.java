package pl.michalak.adam.board;

import java.util.ArrayList;
import java.util.List;

class Rod {
    private final char rodName;
    private final List<Disk> diskList;

    Rod(char name) {
        this(name, 0);
    }

    Rod(char rodName, int numberOfDisks){
        this.rodName = rodName;
        this.diskList = new ArrayList<>();
        //usually that's bad practice (can't test a new or a for in a ctor)
        for(int i = 0; i < numberOfDisks; i++){
            diskList.add(new Disk(numberOfDisks-i));
        }
    }

    void addDisk(Disk disk){
        diskList.add(disk);
    }

    Disk removeTopMostDisk(){
        return diskList.remove(diskList.size()-1);
    }

    public char getRodName() {
        return rodName;
    }

    @Override
    public String toString() {
    // FIXME: reduce complexity by relying on normal ArrayList printout
        String out = "";
        out += "rod "+rodName +" has "+diskList.size();
        if(diskList.size() == 0)
            out += " disks.";
        if(diskList.size() == 1)
            out += " disk: ";
        else if(diskList.size() > 1)
            out += " disks: ";
        for(int i = 0; i < diskList.size(); i++){
            out += "\n\t" + diskList.get(i).toString();
        }
        return out;
    }
}
