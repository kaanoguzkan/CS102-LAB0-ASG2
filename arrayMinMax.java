public class arrayMinMax 
{
    public static int findMax(int[] array)
    {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] >= max)
            {
                max = array[i];
            }
            else
            {
            }
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
            else
            {
            }
        }
        return min;
    }
}
