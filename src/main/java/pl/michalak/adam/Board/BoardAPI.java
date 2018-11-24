package pl.michalak.adam.Board;

import java.util.ArrayList;
import java.util.List;

/**
 * This component is responsible for disks and rods handling and printing.
 * @author Adam_Michalak
 */

public class BoardAPI {
    private final List<Rod> listOfRods;

    public BoardAPI(int numberOfDisks){
        listOfRods = new ArrayList<>();
        listOfRods.add(new Rod('A', numberOfDisks));
        listOfRods.add(new Rod('B', 0));
        listOfRods.add(new Rod('C', 0));
    }


    public void moveDiskFromOneRodToTheOther(char fromRod, char toRod) {
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
            System.out.println("Rod you are trying to reach is null!");
        }
    }

    @Override
    public String toString(){
        String out = "";
        for(int i = 0; i < listOfRods.size(); i++){
            out += listOfRods.get(i).toString();
            out += "\n";
        }
        return out;
    }
}
