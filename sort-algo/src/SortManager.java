import javax.swing.tree.VariableHeightLayoutCache;

public class SortManager {
     //helpers
      private void swap(int[] array,int indexA, int indexB){

    	  int temp=array[indexA];
    	  array[indexA]=array[indexB];
    	  array[indexB]=temp;


      }

      public void print(int[] array){

		 for(int i=0;i<array.length;i++){

			 System.out.print(array[i]+",");

		 }

		 System.out.println("");

      }

      
        
      
      //algorithms
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

	 public int[] insertionSort(int[] array){

         print(array);
       
	       for(int i=1;i<array.length;i++){
	    	   	//bubble sort to position the element on the right spot of the sorted sublist
			     for(int j=i;j>0;j--){
			    	 
			    	 if(array[j]<array[j-1]){
			    		 swap(array,j-1,j);
			  	         print(array);
			    	 }else{
			    		//si no fue menor a j-1 no va a ser menor a j-2 porque ese subset ya está ordenado 
			    		break; 
			    	 }
									
				 }
	
			}
				 
			 return array;

	  }
	
	 //uses an increment that reduces to half everytime the inner foor loop doesn't produce a swap
	 public void shellSort(int array[]){
  	   int jump, i;
  	   boolean swaped;
  	   for(jump=array.length/2; jump!=0; jump/=2){
  	           swaped=true;
  	           while(swaped){ // While there are at least one swap
  	                       swaped=false;
  	                       for(i=jump; i< array.length; i++) // loop the array using the jump
  	                               if(array[i-jump]>array[i]){ // if they are not sorted using jump
  	                                     swap(array, i-jump, i);
  	                                     swaped=true; //the loop continues
  	                               }
  	                        }
  	   }
  	   print(array);
  }
	 
	 public void mergeSort(int[] array){
		 
		 if(array.length <= 1){
			 return;
		 }
		 
		 int mid=array.length/2 + array.length % 2;
		 //declare first and second half arrays to store halfs of the array variable
		 int[] firstHalf= new int[mid];
		 int[] secondHalf=new int[array.length-mid];
		 
		 //call split to fill the halfs
		 split(array, firstHalf, secondHalf);
		 //call merge sort recursively to each half
		 mergeSort(firstHalf);
		 mergeSort(secondHalf);
		 
		 //merge everything
		 merge(array,firstHalf,secondHalf);
		 
   	     print(array);

		 
	 }
	 
	  //merge sort split
     public void split(int[] listToSort,int[] firstHalf,int[] secondHalf){
   	  
   	  int index=0;
   	  int secondHalfIndex=firstHalf.length;
   	  
   	  for(int element:listToSort){
   		  
   		  if(index<secondHalfIndex){
   			  firstHalf[index]=listToSort[index];
   		  }else{
   			  secondHalf[index-secondHalfIndex]=listToSort[index];
   		  }
   		  
   		  index++;
   		  
   	  }
   	  
   	  
     }
     
     //merge sort merge
     public void merge(int[] array, int[] firstHalf, int[] secondHalf){
   	  
   	  int mergeIndex=0;
   	  int firstHalfIndex=0;
   	  int secondHalfIndex=0;
   	  
   	  while(firstHalfIndex<firstHalf.length && secondHalfIndex<secondHalf.length){
   		  
   		  if(firstHalf[firstHalfIndex]<=secondHalf[secondHalfIndex]){
   			 array[mergeIndex]=firstHalf[firstHalfIndex];
   			  firstHalfIndex++;
   			  
   		  }else if(secondHalf[firstHalfIndex]< firstHalf[secondHalfIndex]){
   			  array[mergeIndex]=secondHalf[secondHalfIndex]; 
   			  secondHalfIndex++;
   		  }
   		  
   		  mergeIndex++;
   		  
   	  }
   	  
   	  if(firstHalfIndex<firstHalf.length){
   		
   		  while(mergeIndex<array.length){
	    		  array[mergeIndex]=firstHalf[firstHalfIndex];
	    		  
	    		  mergeIndex++;
	    		  firstHalfIndex++;
   		  }
   	  }
   	  
   	  if(secondHalfIndex<secondHalf.length){
   		  while(mergeIndex < array.length){
	    		  array[mergeIndex]=secondHalf[secondHalfIndex];
	    		  mergeIndex++;
	    		  secondHalfIndex++;
   		  }	  
   	  }
   	      	  
     }
     
     public void quickSort(int[] listToSort, int low, int high){
    	 
    	 if(low >= high){
    		 return;
    	 }
    	 
    	 int pivotIndex = partition(listToSort, low, high);
    	 quickSort(listToSort, low, pivotIndex - 1);
    	 quickSort(listToSort, pivotIndex + 1, high);
    
    	 
     }
     
     
     //quick sort partition
     public int partition(int[] listToSort, int low, int high){
    	 int pivot = listToSort[low];
    	 int l = low;
    	 int h =high;
    	 while(l < h){
    		 while(listToSort[l] <= pivot && l < h){
    			 l++;
    		 }
    		 while(listToSort[h] > pivot){
    			 h--;
    		 }
    		 if(l < h){
    			 swap(listToSort, l, h);
    		 }
    	 }
    	 swap(listToSort, low, h);
    	 
    	 System.out.println("Pivot: " + pivot);
    	 print(listToSort);
    	 return h;
    	 
     }
     
     
    
         


}
