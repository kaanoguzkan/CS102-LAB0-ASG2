public class arrayMethods {

    public static int[] createRandomIntArray(int number){
        int[] theArray = new int [number];
        for(int i = 0; i < number; i++){
            theArray[i] = (int)(101 * Math.random()); //Changed to 101 for better random assignment
        }
        return theArray;
    }

    //
    //
    //

    public static int findMax(int[] array)
    {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] >= max)
            {
                max = array[i];
            }
            /*
            else
            {
            }
            */
        }
        return max;
    }

    public static int findMin(int[] array)
    {
        int min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] <= min)
            {
                min = array[i];
            }
            /*
            else
            {
            }
            */
        }
        return min;
    }

    //
    //
    //

    public static int findAverage(int[] array){ //Split from arrayAvgDif (1)
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static int[] findDeviations(int[] array){ //Split from arrayAvgDif (2)
        int[] arraydif = new int[array.length];
        int arrayAve = findAverage(array);

        for (int i = 0; i < array.length; i++)
        {
            arraydif[i] = array[i] - arrayAve;
        }
        return arraydif;
    }

    public static String getDeviationString(int[] array){ //Extra method to return the deviations as a string instead
        int[] deviations = findDeviations(array);
        String returnVal = "";

        for (int i = 0; i < deviations.length - 1; i++) {
            returnVal += deviations[i] + ", ";
        }
        returnVal += deviations[deviations.length - 1];

        return returnVal;
    }

    //
    //
    //

    public static int findSumOfOdd(int[] array)
    {
        int oddSum = 0;
        for (int i = 1; i < array.length; i++)
        {
            if (i % 2 != 0)
            {
                oddSum += array[i];
            }
        }
        return oddSum;
    }

    public static int findSumOfEven(int[] array)
    {
        int evenSum = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (i % 2 == 0)
            {
                evenSum += array[i];
            }
        }
        return evenSum;
    }

}
