
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
	
	
}
