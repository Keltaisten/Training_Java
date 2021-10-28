package prison;

import java.util.ArrayList;
import java.util.List;

public class PrisonBreak {
    int numberOfDoors = 100;
    List<Integer> openDoors = new ArrayList<>();

    public void openTheDoors(){
        for(int i = 1; i<=numberOfDoors;i++){
            if(i*i<=numberOfDoors) {
                openDoors.add(i * i);
            }
            else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        PrisonBreak prisonBreak = new PrisonBreak();
        prisonBreak.openTheDoors();
        System.out.println(prisonBreak.openDoors);
    }
}
