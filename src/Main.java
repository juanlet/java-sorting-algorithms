import java.awt.print.Printable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
	
	
		
	public static void main (String [ ] args) {
		 
		 int[] array= {6,5,4,3,2,7};
        
		 
		 SortManager sortManager=new SortManager();
		 SearchManager searchManager=new SearchManager();
		 RecursiveManager recursiveManager=new RecursiveManager();
		 
		 
		 //array=sortManager.selectionSort(array);
		 //array=sortManager.bubbleSort(array);
		 //array=sortManager.insertionSort(array);
	 
		 
	    // sortManager.mergeSort(array);
	    //sortManager.quickSort(array, 0, array.length-1);
	    // sortManager.shellSort(array);
	   
		// int[] array2={1,2,3,4,5,6,7,8,9,11,45,83,92};
		 
		 //searchManager.binarySearch(array2, 1);
		//searchManager.recursiveBinarySearch(array2, 0, array2.length-1, 11);
		
		 Set<Integer> setInt= new HashSet<Integer>();
		 Set<Integer> setRest= new HashSet<Integer>();
		 
		 
		 setRest.add(3);
		 setRest.add(4);
		 setRest.add(5);
		 
		 setInt=recursiveManager.findAllSubsetsOfSet(setRest);
		 
		 System.out.println();
		 
		 

		   
		         
		         
	
}

}
