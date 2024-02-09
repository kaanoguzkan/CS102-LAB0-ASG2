public class arrayOddMinSum 
{
    public static int oddSum(int[] array)
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
    public static int evenSum(int[] array)
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
