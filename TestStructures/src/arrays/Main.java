package arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StandardArray smallArray =  new StandardArray(10);
		System.out.println("Small array unsorted.");
		smallArray.printArray(smallArray.randomArray, 0, 0);
		StandardArray mediumArray = new StandardArray(100);
		StandardArray largeArray = new StandardArray(500);
		
		smallArray.startTime = System.currentTimeMillis();
		smallArray.randomArray = quickSortArray.sortIntArray(smallArray.randomArray);
		smallArray.endTime = System.currentTimeMillis();
		System.out.println("Small array sorted");
		smallArray.printArray(smallArray.randomArray, smallArray.startTime, smallArray.endTime);
		
		mediumArray.printArray(mediumArray.randomArray, 0, 0);
		mediumArray.startTime = System.currentTimeMillis();
		mediumArray.randomArray = quickSortArray.sortIntArray(mediumArray.randomArray);
		mediumArray.endTime = System.currentTimeMillis();
		mediumArray.printArray(mediumArray.randomArray, mediumArray.startTime, mediumArray.endTime);
		
		largeArray.printArray(largeArray.randomArray, 0, 0);
		largeArray.startTime = System.currentTimeMillis();
		largeArray.randomArray = quickSortArray.sortIntArray(largeArray.randomArray);
		largeArray.endTime = System.currentTimeMillis();
		largeArray.printArray(largeArray.randomArray, largeArray.startTime, largeArray.endTime);
		
	}

}
