package powerset;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        PowerArrayListImpl<Integer> p = new PowerArrayListImpl<Integer>(l);
        //Iterator<ArrayList<Integer>> it = p.iterator();

        System.out.println("Program - Zbior potegowy");
        System.out.println("Wypisywanie podzbiorow zbioru l (lacznie ze zbiorem pustym)");
        for(ArrayList<Integer> podzbior : p.pow){
        	System.out.print("{ ");
        	for(Integer element : podzbior){
        		System.out.print(element + " ");
        	}
        	System.out.println("}");
        }
    }
}