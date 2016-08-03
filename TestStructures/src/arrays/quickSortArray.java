package arrays;

public class quickSortArray {

	public static int[] sortIntArray(int[] unsorted)
	{
		int[] sorted = new int[unsorted.length];
		if(unsorted.length < 2)
		{
			return unsorted;
		}
		else
		{
			int pivot = unsorted[unsorted.length -1];
			int pivotIndex = unsorted.length - 1;
			int currentIndex = 0;
			boolean swapping = true;
			while(swapping)
			{
				if(unsorted[currentIndex] >= pivot)
				{
					//double swap.
				}
				else
				{
					currentIndex++;
				}
			}
			
		}
		return sorted;
	}
}
