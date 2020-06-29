package gui;

import java.util.HashMap;

public class Recept {
	public int Sifra;
	public String IdLeka;
	public String JMBGPacijenta;
	public HashMap<Lek, String> Lekovi;
	public float UkupnaCena;
	
	public Recept() {
		Lekovi = new HashMap<Lek, String>();
	}
}
