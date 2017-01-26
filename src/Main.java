public class Main {
	

		
	public static void main (String [ ] args) {
		 
		 int[] array= {6,5,4,3,2,7};

		 SortManager sortManager=new SortManager();
		 SearchManager searchManager=new SearchManager();
		 
		 
		 //array=sortManager.selectionSort(array);
		 //array=sortManager.bubbleSort(array);
		 //array=sortManager.insertionSort(array);
	 
		 
	    // sortManager.mergeSort(array);
	    sortManager.quickSort(array, 0, array.length-1);
	     
		 //searchManager.binarySearch(array2, 1);
		 
}

}
