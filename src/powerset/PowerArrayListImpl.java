package powerset;

import java.util.*;

public class PowerArrayListImpl<A> /*implements PowerArrayList<A>*/{
	ArrayList<ArrayList<A>> pow = new ArrayList<ArrayList<A>>(); // zbior potegowy
	
	/*public Iterator<ArrayList<A>> iterator(){
		return null;
	}*/
	
	public PowerArrayListImpl(ArrayList<A> l){
		pow.add(new ArrayList<A>()); // dodajemy zbiór pusty do zbioru potegowego
		for(A elem: l){
			ArrayList<ArrayList<A>> toAdd = new ArrayList<ArrayList<A>>(); // tworzymy nowy zbior zbiorow np. {{3}, {1,3}, {2,3}, {1,2,3}} 
			for(ArrayList<A> set : pow){
				ArrayList<A> addElem = new ArrayList<A>();
				addElem.addAll(set);
				addElem.add(elem); // do kazdego starego podzbioru dodajemy nowy element
				toAdd.add(addElem);
			}
			pow.addAll(toAdd);	// dodajemy nowy zbior zbiorow do zbioru potegowego
		}		
	}
}
