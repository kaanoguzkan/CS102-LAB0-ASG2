//This is a class which includes a method which creates a randomly filled array
public class createArray {
    public static int[] createArray(int number){

        int[] theArray = new int [number];
        for(int i = 0; i < number; i++){
            theArray[i] = (int)(100 * Math.random());
        }
        return theArray;
    }
}

