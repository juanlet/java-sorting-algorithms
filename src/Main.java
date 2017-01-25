public class Main {
	

		
	public static void main (String [ ] args) {
		 
		 int[] array= {6,5,4,3,2,1};
		 int[] array2={1,2,3,4,5,6};

		 SortManager sortManager=new SortManager();
		 SearchManager searchManager=new SearchManager();
		 
		 
		 //array=sortManager.selectionSort(array);
		 //array=sortManager.bubbleSort(array);
		 //array=sortManager.insertionSort(array);
	
		 searchManager.binarySearch(array2, 1);
		 
}

}
