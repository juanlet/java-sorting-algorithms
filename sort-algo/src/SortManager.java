
public class SortManager {
	
      private void swap(int[] array,int indexA, int indexB){
    	  
    	  int temp=array[indexA];
    	  array[indexA]=array[indexB];
    	  array[indexB]=temp;
    	  
     
      }
	
      private void print(int[] array){
      
		 for(int i=0;i<array.length;i++){
			 
			 System.out.print(array[i]+",");
			 
		 }
		 
		 System.out.println("");
		 
      }	 
	
	   public int[] selectionSort(int[] array){

		   for(int i=0;i<array.length;i++){
			
			   for(int j=i+1;j<array.length;j++){
				   
				   if(array[i]>array[j]){
					   swap(array, i, j);
					   print(array);
				   }
				   				   
			   }
			   
		   }
		   
		   return array;
	   }
	   
	   public int[] bubbleSort(int[] array){
		   

		
		  int times=0;
		   
		   for(int i=0,len=array.length;i<len;i++){
			    boolean sorted=true;
			   
			   for(int j=array.length-1;j>i;j--){
				   
				   if(array[j]<array[j-1]){
					   swap(array, j, j-1);
					   print(array);
					   sorted=false;
					   
				   }
				   times++;
				   
			   }
			   
			  
			
			   if(sorted){
				   break;
			   }
			   
		   }	
		   System.out.println(times);
		   return array;
		   
		   		   
	   }
		

}
