import java.util.HashSet;
import java.util.Set;


public class RecursiveManager {
	
	 Set<Integer> setInt= new HashSet<Integer>();


	public Set<Integer> findAllSubsetsOfSet(Set<Integer> restOfElements){
		 
		if(restOfElements.isEmpty()){
		   setInt.add(999);			
		   return setInt;
		}
		//go to the next element
		int nextElem=restOfElements.iterator().next();
		
		//add item to the set
		setInt.add(nextElem);
		
		//remove the element I added from the restOfElements subset
		restOfElements.remove(nextElem);
		
		
		return findAllSubsetsOfSet(restOfElements);
		
		
	}
}
