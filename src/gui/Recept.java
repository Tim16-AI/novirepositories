package gui;

import java.util.HashMap;
import java.time.LocalDate;

public class Recept {
	public int Sifra;
	public String IdLeka;
	public String JMBGPacijenta;
	public String Datum;
	public HashMap<Lek, String> Lekovi;
	public float UkupnaCena;
	
	public Recept() {
		Lekovi = new HashMap<Lek, String>();
	}
}
