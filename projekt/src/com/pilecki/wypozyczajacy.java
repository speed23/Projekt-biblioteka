package com.pilecki;

import java.util.ArrayList;
import java.util.List;

public  class wypozyczajacy {


	    public String imie;
	    public String nazwisko;
	    
	   
	    public wypozyczajacy(String imie, String nazwisko)
	    {
	       
	        this.imie=imie;
	        this.nazwisko=nazwisko;
	    }
	   
	    public wypozyczajacy(String imie, String nazwisko, List<Ksiazka>  ksiazki)
	    {
	       
	        this.imie=imie;
	        this.nazwisko=nazwisko;
	        this.ksiazki=ksiazki;
	       
	    }
	   
	    public List<Ksiazka> ksiazki= new ArrayList<Ksiazka>();
	   
	    public void printKsiazka()
	    {
	        for(Ksiazka c : this.ksiazki)
	        {
	           
	            c.printKsiazka();
	           
	        }
	       
	   
	    }
	}
	

