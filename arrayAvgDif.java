public class arrayAvgDif 
{
    public static int[] createAvgArrayDif(int[] array)
    {
        int sum = 0;
        int[] arraydif = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        int arrayAve = sum / array.length;
        for (int i = 0; i < array.length; i++)
        {
            arraydif[i] = array[i] - arrayAve;
        }
        return arraydif;
    }
    
}
