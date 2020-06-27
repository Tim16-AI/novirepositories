package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.LinkedList;

import gui.FrameKupovina1.ImagePanel;

public class FrameLogin1 extends JPanel{
	
	public FrameLogin1 () {
		
		LinkedList<Korisnik> korisnici = new LinkedList<Korisnik>();
		
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
		
		
		/*Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
       
        setSize(screenWidth / 2, screenHeight / 2);
        
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sistem apoteka");
		
		JPanel glavniProzor= new JPanel();
		this.add(glavniProzor);
		
		glavniProzor.setLayout(new BorderLayout());
		glavniProzor.setBackground(new Color(77,77,77));
		
		JPanel naslov= new JPanel();
		naslov.setBackground(new Color(77,77,77));
		naslov.setPreferredSize(new Dimension(100, 100));
		naslov.setLayout(new BoxLayout(naslov, BoxLayout.X_AXIS));
		
		
		glavniProzor.add(naslov, BorderLayout.NORTH);
		 
		ImagePanel imLogo= new ImagePanel(new ImageIcon("slike/logo.png").getImage());
		imLogo.setPreferredSize(new Dimension(90, 90));
		naslov.add(imLogo);
		
		JPanel prostorDole= new JPanel();
		glavniProzor.add(prostorDole, BorderLayout.SOUTH);
		
		JPanel prostorLevo= new JPanel();
		glavniProzor.add(prostorLevo, BorderLayout.WEST);
		
		JPanel prostorDesno= new JPanel();
		glavniProzor.add(prostorDesno, BorderLayout.EAST);
		
		int centralniSirina= glavniProzor.getWidth();
		int centralniVisina= glavniProzor.getHeight();
		  
		   prostorDole.setPreferredSize(new Dimension(centralniSirina, 100));
		   prostorDole.setMinimumSize(new Dimension(centralniSirina, 20));
		   prostorDole.setMaximumSize(new Dimension(centralniSirina, 200));
		   prostorDole.setBackground(new Color(77,77,77));
		
		   prostorLevo.setPreferredSize(new Dimension(200, centralniVisina));
		   prostorLevo.setMinimumSize(new Dimension(50, centralniVisina));
		   prostorLevo.setMaximumSize(new Dimension(500, centralniVisina));
		   prostorLevo.setBackground(new Color(77,77,77));
		
		 prostorDesno.setPreferredSize(new Dimension(200, centralniVisina));
		 prostorDesno.setMinimumSize(new Dimension(50, centralniVisina));
		 prostorDesno.setMaximumSize(new Dimension(500, centralniVisina));
		 prostorDesno.setBackground(new Color(77,77,77));
		
		//lblNaslov velicina teksta i boja??????
		
		JLabel lblNaslov=new JLabel("Informacioni sistem apoteke");
		lblNaslov.setPreferredSize(new Dimension(500, 90));
		naslov.add(lblNaslov);
		
		JPanel prozor= new JPanel();
		glavniProzor.add(prozor, BorderLayout.CENTER);*/
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		
	    JLabel lblIme= new JLabel("Korisnicko ime");
	    this.add(lblIme);
		    
		JTextField txtIme= new JTextField("");
		this.add(txtIme);
		
		JLabel lblSifra= new JLabel("Lozinka");
		this.add(lblSifra);
		    
		JTextField txtSifra= new JTextField("");
		this.add(txtSifra);
		
		JLabel lblTip= new JLabel("Tip korisnika");
		this.add(lblTip);
		    
		JTextField txtTip= new JTextField("");
		this.add(txtTip);
		
		JLabel lblRazmak= new JLabel(" ");
		this.add(lblRazmak);
		
		JButton btnPrijava= new JButton("Prijava");
		btnPrijava.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	for(Korisnik kor : korisnici){
		    		String kime = txtIme.getText();
		    		String loz = txtSifra.getText();
		    		
		    		String korIme = kor.KorisnickoIme;
		    		String lozinka = kor.Lozinka;
		    		
		    		if(korIme.equals(kime) && lozinka.equals(loz)) {
		    			if(kor.Tip.equals("Lekar")) {
		    			FrameLekovi1 frameL1= new FrameLekovi1 ();
		    			frameL1.setVisible(true);
		    			}
		    			
		    			if(kor.Tip.equals("Apotekar")) {
		    			 FrameRecepti3 frameR3= new FrameRecepti3();
		    			frameR3.setVisible(true);
		    			
			    			}
		    			
		    			if(kor.Tip.equals("Administrator")) {
		    				FrameIzvestaj1 frameI1= new FrameIzvestaj1();
		    				frameI1.setVisible(true);
			    			
				    			}
		    		}
		    	}
		    } 
		});
		this.add(btnPrijava);
		
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
