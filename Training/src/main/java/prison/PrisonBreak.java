package prison;

import java.util.ArrayList;
import java.util.List;

public class PrisonBreak {
    int numberOfDoors = 100;
    List<Integer> openedDoors = new ArrayList<>();

    public List<Integer> openTheDoors(){
        for(int i = 1; i<numberOfDoors;i++){
            if(i*i<=numberOfDoors) {
                openedDoors.add(i * i);
            }
            else{
                return openedDoors;
            }
        }
        return openedDoors;
    }

    public static void main(String[] args) {
        PrisonBreak prisonBreak = new PrisonBreak();
        System.out.println(prisonBreak.openTheDoors());
    }
}
