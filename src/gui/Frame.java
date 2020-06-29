package gui;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;

public class Frame extends JFrame {
	
	int LoginBrojac;
	
	LinkedList<Korisnik> korisnici;
	
	FrameLogin1 loginPanel;
	FrameLekovi1 prikazLekovaPanel;
	FrameKorisnici1 prikazKorisnikaPanel;
	FrameRecepti1 prikazRecepataPanel;
	//FrameIzvestaj1 prikazIzvestaja;
	FrameKupovina1 prikazKupovinaPanel;
	
	JPanel glavniProzor;
	
	Korisnik ulogovanKorisnik;
	
	public Frame () {
		
		korisnici = new LinkedList<Korisnik>();
		DodajKorisnike();
		
		LoginBrojac = 0;
		
		loginPanel= new FrameLogin1(korisnici, this);
		prikazLekovaPanel = new FrameLekovi1(this);
		prikazKorisnikaPanel = new FrameKorisnici1(korisnici);
		prikazRecepataPanel = new FrameRecepti1();
		//prikazIzvestaja = new FrameIzvestaj1();
		prikazKupovinaPanel= new FrameKupovina1();
		
		
		
		ulogovanKorisnik = null;
		
		Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
       
        setSize(screenWidth / 2, screenHeight / 2);
        
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sistem apoteka");
		
		glavniProzor= new JPanel();
		this.add(glavniProzor);
		
		glavniProzor.setLayout(new BorderLayout());
		glavniProzor.setBackground(new Color(77,77,77));
		
		
		ToolBar tb= new ToolBar (this);
		tb.setBackground(new Color(77,77,77));
		glavniProzor.add(tb, BorderLayout.WEST);
		
		
		JPanel naslov= new JPanel();
		naslov.setBackground(new Color(77,77,77));
		naslov.setPreferredSize(new Dimension(100, 100));
		naslov.setLayout(new BoxLayout(naslov, BoxLayout.X_AXIS));
		
		
		glavniProzor.add(naslov, BorderLayout.NORTH);
		
		ImagePanel imLogo= new ImagePanel(new ImageIcon("slike/logo.png").getImage());
		imLogo.setPreferredSize(new Dimension(90, 90));
		naslov.add(imLogo);
		
		//lblNaslov velicina teksta i boja??????
		
		JLabel lblNaslov=new JLabel("Informacioni sistem apoteke");
		lblNaslov.setPreferredSize(new Dimension(500, 90));
		naslov.add(lblNaslov);
		
		
		glavniProzor.add(loginPanel, BorderLayout.CENTER);
	}
	
	
	public void LogIn(String kime, String loz) {
		
		boolean prijava = false;
		
		for(Korisnik kor : korisnici){
    		
    		String korIme = kor.KorisnickoIme;
    		String lozinka = kor.Lozinka;
    		
    		if(korIme.equals(kime) && lozinka.equals(loz)) {
    			if(kor.Tip.equals("Lekar")) {
    				//menjanje panela 
    			}
    			
    			if(kor.Tip.equals("Apotekar")) {
    				//menjanje panela
	    		}
    			
    			if(kor.Tip.equals("Administrator")) {
    				//menjanje panela
    				glavniProzor.remove(loginPanel);
    				glavniProzor.add(prikazKorisnikaPanel);
    				
    				glavniProzor.revalidate();
    				glavniProzor.repaint();
		    	}
    			
    			ulogovanKorisnik = kor;
    			prijava = true;
    		}
    	}
		
		if(!prijava) {
			LoginBrojac = LoginBrojac + 1;
			
			if(LoginBrojac == 3) {
				System.exit(0);
			}
		}
		else {
			LoginBrojac = 0;
		}
	}
	
	
	
	public void PrikazLekovaPanel() {
		if(ulogovanKorisnik == null)
			return;
		
		//uvek brisati sve ostale panele, dodati koji hocemo da vidimo
		glavniProzor.remove(loginPanel);
		glavniProzor.remove(prikazKorisnikaPanel);
		glavniProzor.remove(prikazKupovinaPanel);
		glavniProzor.remove(prikazRecepataPanel);
		//glavniProzor.remove(prikazIzvestaja);
		
		
		glavniProzor.add(prikazLekovaPanel);
		
		glavniProzor.revalidate();
		glavniProzor.repaint();
	}
	
	public void PrikazKorisnikaPanel() {
		if(ulogovanKorisnik == null)
			return;
		
		//uvek brisati sve ostale panele, dodati koji hocemo da vidimo
		glavniProzor.remove(loginPanel);
		glavniProzor.remove(prikazLekovaPanel);
		glavniProzor.remove(prikazKupovinaPanel);
		glavniProzor.remove(prikazRecepataPanel);
		//glavniProzor.remove(prikazIzvestaja);
		
		glavniProzor.add(prikazKorisnikaPanel);
		
		glavniProzor.revalidate();
		glavniProzor.repaint();
	}
	
	public void PrikazRecepataPanel() {
		if(ulogovanKorisnik == null)
			return;
		
		//uvek brisati sve ostale panele, dodati koji hocemo da vidimo
		glavniProzor.remove(loginPanel);
		glavniProzor.remove(prikazKorisnikaPanel);
		glavniProzor.remove(prikazKupovinaPanel);
		glavniProzor.remove(prikazLekovaPanel);
		//glavniProzor.remove(prikazIzvestaja);
		
		glavniProzor.add(prikazRecepataPanel);
		
		glavniProzor.revalidate();
		glavniProzor.repaint();
	}
	
	public void PrikazKupovinePanel() {
		if(ulogovanKorisnik == null)
			return;
		
		//uvek brisati sve ostale panele, dodati koji hocemo da vidimo
		glavniProzor.remove(loginPanel);
		glavniProzor.remove(prikazKorisnikaPanel);
		glavniProzor.remove(prikazLekovaPanel);
		glavniProzor.remove(prikazRecepataPanel);
		//glavniProzor.remove(prikazIzvestaja);
		
		glavniProzor.add(prikazKupovinaPanel);
		
		glavniProzor.revalidate();
		glavniProzor.repaint();
	}
	
	public void PrikazIzvestajaPanel() {
		if(ulogovanKorisnik == null)
			return;
		
		//uvek brisati sve ostale panele, dodati koji hocemo da vidimo
		glavniProzor.remove(loginPanel);
		glavniProzor.remove(prikazKorisnikaPanel);
		glavniProzor.remove(prikazKupovinaPanel);
		glavniProzor.remove(prikazRecepataPanel);
		glavniProzor.remove(prikazLekovaPanel);
		
		//glavniProzor.add(prikazIzvestajaPanel);
		
		glavniProzor.revalidate();
		glavniProzor.repaint();
	}
	
	private void DodajKorisnike() 
	{
		Korisnik k = new Korisnik();
		k.Ime = "David";
		k.Prezime = "Antunovic";
		k.KorisnickoIme = "Dave";
		k.Lozinka = "123";
		k.Tip = "Administrator";
		
		korisnici.add(k);
		
		Korisnik k1 = new Korisnik();
		k1.Ime = "Teodora";
		k1.Prezime = "Petkovic";
		k1.KorisnickoIme = "Tea";
		k1.Lozinka = "123";
		k1.Tip = "Lekar";
		
		korisnici.add(k1);
		
		Korisnik k2 = new Korisnik();
		k2.Ime = "Olga";
		k2.Prezime = "Petkovic";
		k2.KorisnickoIme = "Olga";
		k2.Lozinka = "123";
		k2.Tip = "Apotekar";
		
		korisnici.add(k2);
	}
	
	class ImagePanel extends JPanel {

		  private Image img;
		 
		  public ImagePanel(String img) {
		    this( new ImageIcon(img).getImage());
		  }

		  public ImagePanel(Image img) {
		    this.img = img;
		  }

		  public void paintComponent(Graphics g) {
		    g.drawImage(img, (int)(this.getSize().getWidth()-img.getWidth(null))/2,
		    				 (int)(this.getSize().getHeight()-img.getHeight(null))/2, null);
		  }
	}

}
