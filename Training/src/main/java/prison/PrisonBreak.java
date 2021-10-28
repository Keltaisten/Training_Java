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
    public List<Boolean> isItOpen(){
        for(int i = 0; i<numberOfDoors;i++){
            if(i*i<numberOfDoors)
                openDoors.add(i*i);
        }
        return doors;
    }


    public static void main(String[] args) {
        PrisonBreak prisonBreak = new PrisonBreak();
        prisonBreak.closeTheDoors();


    }
}
