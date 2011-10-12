package com.pilecki;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {


	    public static void main(String[] args){
	       
	        List<Ksiazka> ksiazki = new ArrayList<Ksiazka>();
	        ksiazki.add(new Ksiazka("Java", "Mark Stanford"));
	        ksiazki.add(new Ksiazka("C++","Carl Wachowski"));
	        ksiazki.add(new Ksiazka("PHP","John Cormac"));
	       
	        wypozyczajacy o = new wypozyczajacy("Rafal", "Pilecki", ksiazki);
	       
	        o.printKsiazka();
	       
	       
	       
	    
	    }
	
}
