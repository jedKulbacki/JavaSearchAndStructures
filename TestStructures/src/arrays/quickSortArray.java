package arrays;

public class quickSortArray {

	public static int[] sortIntArray(int[] unsorted)
	{
		//System.out.println("Starting unsorted array ");
		if(unsorted.length < 2)
		{
			return unsorted;
		}
		else
		{
			int[] sorted = new int[unsorted.length];
			int pivot = unsorted[unsorted.length -1];
			//System.out.println("pivot " + pivot);
			int pivotIndex = unsorted.length - 1;
			int currentIndex = 0;
			
			boolean swapping = true;
			while(swapping)
			{
				if(unsorted[currentIndex] > pivot)
				{
					pivotIndex--;
					//Testing
					if((pivotIndex) > 0)
					{
						//Swap current index with pivot Index -1
						int swapValue = unsorted[currentIndex];
						//System.out.println("swap value " + swapValue);
						unsorted[currentIndex] = unsorted[pivotIndex];
						unsorted[pivotIndex] = swapValue;
					}
					
					//Swap pivot with value left of it.
					unsorted[pivotIndex + 1] = unsorted[pivotIndex];
					unsorted[pivotIndex] = pivot;
					
				}
				else
				{
					currentIndex++;
				}
				
				if(currentIndex >= pivotIndex)
				{
					swapping = false;
				}
			}
			if(unsorted.length < 3)
			{
				return unsorted;
			}
			if(pivotIndex > 0)
			{
				//Sort left and sort right
				int[] sortLeft = new int[pivotIndex];
				for(int i = 0; i < pivotIndex; i++)
				{
					sortLeft[i] = unsorted[i];
				}
				int[] sortedLeft = sortIntArray(sortLeft);
				for(int i = 0; i < pivotIndex; i++)
				{
					sorted[i] = sortedLeft[i];
				}
			}
			
			if(pivotIndex < (unsorted.length - 1))
			{
			
				int[] sortRight = new int[unsorted.length - pivotIndex];
				for(int j = 0; j < sortRight.length; j++)
				{
					sortRight[j] = unsorted[j + pivotIndex];
				}
				
				int[] sortedRight = sortIntArray(sortRight);
				
				
				for(int j = 0; j < sortRight.length; j++)
				{
					sorted[j + pivotIndex] = sortedRight[j];
				}
			}
			sorted[pivotIndex] = pivot;
			return sorted;	
		}
		
	}
	
}
