package arrays;

public class StandardArray {
	/**
	 * Array constructor of random whole numbers.
	 * @param arrayLength	Integer length of array to be created	
	 */
	public int[] randomArray;
	public StandardArray(int arrayLength)
	{
		randomArray = new int[arrayLength];
		System.out.println("making array");
		for(int index = 0; index < arrayLength; index++)
		{
			randomArray[index] = (int)(Math.random() * 1000);
		}
	}
	
}
