package array;

import java.util.Arrays;

public class ArrayOfArray {

    private int numb = 5;
    private int[][] array = new int[numb][numb];
    private int serialNumber;

    public void calculate(){
        serialNumber =0;
        for(int i = 0; i<numb;i++){
            for(int j = 0; j< numb;j++){
                serialNumber++;
                array[i][j] = serialNumber;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void calculateWithZero(){
        serialNumber = 0;
        for(int i = 0; i<numb;i++){
            for(int j = 0; j< numb;j++){
                serialNumber++;
                if(j<i){
                    array[i][j] = 0;
                }
                else{
                    array[i][j] = serialNumber;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isItZero(){
        for(int i = 1; i < array.length;i++){
            for(int j = 0; j < i; j++){
                if(array[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayOfArray arrayOfArray = new ArrayOfArray();
        arrayOfArray.calculate();
        System.out.println();
        System.out.println(arrayOfArray.isItZero());
        System.out.println();
        arrayOfArray.calculateWithZero();
        System.out.println();
        System.out.println(arrayOfArray.isItZero());
        System.out.println();
        arrayOfArray.array[3][0] = 2;
        System.out.println(Arrays.deepToString(arrayOfArray.array));
        System.out.println();
        System.out.println(arrayOfArray.isItZero());
    }
}
