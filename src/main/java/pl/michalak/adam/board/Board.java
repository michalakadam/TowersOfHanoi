package pl.michalak.adam.board;

import pl.michalak.adam.output.Display;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<Rod> listOfRods;
    int numberOfDisks;

    Board(int numberOfDisks){
        // JDK9 has API for that, List.of
        listOfRods = new ArrayList<>();
        listOfRods.add(new Rod('A', numberOfDisks));
        listOfRods.add(new Rod('B', 0));
        listOfRods.add(new Rod('C', 0));
    }

    //TODO: very wasteful, instead of mapping chars to Rods and getting the Rods each time, pass the Rods here! 
    void moveDisk(char fromRod, char toRod) {
        Rod fromThisRod = null;
        Rod toThisRod = null;
        for(int i = 0; i < listOfRods.size(); i++){
            if(listOfRods.get(i).getRodName() == fromRod)
                fromThisRod = listOfRods.get(i);
            else if((listOfRods.get(i).getRodName() == toRod))
                toThisRod = listOfRods.get(i);
        }
        try {
            toThisRod.addDisk(fromThisRod.removeTopMostDisk());
        }
        catch(NullPointerException rodIsNull){
            Display.displayWithNextLine("Rod you are trying to reach is null!");
        }
    }

    @Override
    public String toString(){
        String out = "";
        for(int i = 0; i < listOfRods.size(); i++){
            out += listOfRods.get(i).toString();
            out += "\n";
        }
        out += "\n";
        return out;
    }
}
