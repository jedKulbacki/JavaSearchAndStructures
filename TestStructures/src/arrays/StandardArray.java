package arrays;

public class StandardArray {
	/**
	 * Array constructor of random whole numbers.
	 * @param arrayLength	Integer length of array to be created	
	 */
	public int[] randomArray;
	public long startTime = 0;
	public long endTime = 0;
	public StandardArray(int arrayLength)
	{
		randomArray = new int[arrayLength];
		
		for(int index = 0; index < arrayLength; index++)
		{
			randomArray[index] = (int)(Math.random() * arrayLength);
		}
	}
	
	public static void printArray(int[] arrayToPrint, long start, long end)
	{
		System.out.println("Array Print Out. Elaspe time " + (end - start));
		for(int index = 0; index < arrayToPrint.length; index++)
		{
			System.out.print(arrayToPrint[index] + ",");
		}
		System.out.println("");
	}
	
}
