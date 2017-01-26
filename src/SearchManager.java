import java.awt.print.Printable;

import javax.sound.midi.MidiChannel;


public class SearchManager {

	
	public int binarySearch(int[] array,int numberToSearch){
		
        int min=0, max=array.length-1,numberOfChecks=0;
		
		
		while(max>=min){
			
			int medium=min+(max-min)/2;
			numberOfChecks++;
			
			if(array[medium] == numberToSearch){
				System.out.println("Founded the number at index " + medium + " in " + numberOfChecks + " tries. ");
				return medium;
			}else if(array[medium]>numberToSearch){
				max = medium-1; 	
			}else if(array[medium]<numberToSearch){
				min = medium+1; 	

			}
									
		}
		
		
		System.out.println("Not Found in " + numberOfChecks + " tries.");
		return -1;
	}

	
	public int recursiveBinarySearch(int[] array,int initialIndex,int finalIndex,int valueToSearch){
		
		/*if(array.length == 0){
			return -1;
		}*/
		
		int returnIndex=-1;

		if(array.length == 0){
			return -1;
		}
		
				
		int mid= initialIndex + (finalIndex-initialIndex)/2;
		
		if(array[mid] == valueToSearch){
			System.out.println("Found the searched value " + valueToSearch + " at position " + mid );
			returnIndex=mid;
		}else if(array[mid] > valueToSearch){
			 returnIndex = recursiveBinarySearch(array, initialIndex, mid -1 , valueToSearch);
		}else if(array[mid] < valueToSearch){
			 returnIndex = recursiveBinarySearch(array, mid + 1 , finalIndex, valueToSearch);
		}
		
						
		return returnIndex;
	}
	
	
}
