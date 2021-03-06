package pl.michalak.adam.board;

import pl.michalak.adam.output.Display;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles and prints disks and rods. 
 * @author Adam_Michalak
 */

public class BoardAPI {
    Board board;

    public BoardAPI(int numberOfDisks){
        board = new Board(numberOfDisks);
    }


    public void moveDiskFromOneRodToTheOther(char fromRod, char toRod) {
        board.moveDisk(fromRod, toRod);
    }


    public String printBoard(){
        return board.toString();
    }
}
