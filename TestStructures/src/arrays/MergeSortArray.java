package arrays;
/**
 * 
 * @author JedLappy
 * Use merge sort to sort array elements.
 */
public class MergeSortArray {

	public static int[] mergeSortIntArray(int[] unsorted)
	{
		int[] sorted = new int[0];
		
		if(unsorted.length > 1)
		{
			//Find size of a splitting the array in two.  Add one to left if odd.
			int leftSize = unsorted.length / 2;
			int rightSize = leftSize;
			if((unsorted.length % 2) == 1)
			{
				leftSize++;
			}
			
			int[] unsortedLeft = new int[leftSize];
			int[] unsortedRight = new int[rightSize];
			//Copy values into left and right array.
			for(int i = 0; i < leftSize; i++)
			{
				unsortedLeft[i] = unsorted[i];
			}
			
			for(int j = 0; j < rightSize; j ++)
			{
				unsortedRight[j] = unsorted[j + leftSize - 1];
			}
			
			int[] sortedLeft = mergeSortIntArray(unsortedLeft);
			int[] sortedRight = mergeSortIntArray(unsortedRight);
			
			//Insert sortedRight array into sortedLeft array.
			boolean sorting = true;
			int sortIndex = 0;
			int sortLeftIndex = 0;
			int sortRightIndex = 0;
			while(sorting)
			{
				if(((sortLeftIndex < sortedLeft.length) && (sortRightIndex >= sortedRight.length)) ||
					((sortLeftIndex < sortedLeft.length) && (sortRightIndex < sortedRight.length)
						&& (sortedLeft[sortLeftIndex] <= sortedRight[sortRightIndex])))
				{
					sorted[sortIndex] = sortedLeft[sortLeftIndex];
					sortIndex++;
					sortLeftIndex++;
				}
				else
				{
					sorted[sortIndex] = sortedLeft[sortRightIndex];
					sortIndex++;
					sortRightIndex++;
				}
				if(sortIndex >= unsorted.length)
				{
					sorting = false;
				}
			}
		}
		else
		{
			return unsorted;
		}
		
		return sorted;
	}
	
}
