package prison;

import java.util.ArrayList;
import java.util.List;

public class PrisonBreak {
    int numberOfDoors = 100;
    List<Boolean> doors = new ArrayList<>(numberOfDoors);
    List<Integer> openDoors = new ArrayList<>();

    public void closeTheDoors(){
        for(int i = 0; i<numberOfDoors;i++){
            doors.set(i, false);
        }
    }
    public void openTheDoors(){
        for(int i = 1; i<numberOfDoors;i++){
            if(i*i<numberOfDoors) {
                openDoors.add(i * i);
            }
        }
//        return openDoors;
    }


    public static void main(String[] args) {
        PrisonBreak prisonBreak = new PrisonBreak();
//        prisonBreak.closeTheDoors();
        prisonBreak.openTheDoors();
        System.out.println(prisonBreak.openDoors);


    }
}
