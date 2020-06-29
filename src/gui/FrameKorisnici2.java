package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import gui.Frame.ImagePanel;

public class FrameKorisnici2 extends JPanel {
	
	FrameKorisnici1 frame;
	
    public FrameKorisnici2 (FrameKorisnici1 korisniciFrame)  {
		
    	frame = korisniciFrame;
    	
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
		
		
		ToolBar tb= new ToolBar ();
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
		
		JPanel centralni= new JPanel();
		centralni.setLayout(new BorderLayout(20, 20));
		glavniProzor.add(centralni, BorderLayout.CENTER);*/
		
    	this.setLayout(new BorderLayout(20, 20));
    	
		/*JPanel dugmici= new JPanel();
		this.add(dugmici, BorderLayout.NORTH);
		
		JButton btnPrikaz= new JButton("Prikaz");
		dugmici.add(btnPrikaz);
		btnPrikaz.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnPrikaz.setForeground(Color.WHITE);
		
		
		JButton btnDodavanje= new JButton("Dodaj korisnika");
		dugmici.add(btnDodavanje);
		btnDodavanje.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnDodavanje.setForeground(Color.WHITE);
		
		///////////////////////////////////////////////////////////////////////////////////
		//ne radi padajuci meni
		
		JMenu menuSort= new JMenu("Sortiraj po:");
		menuSort.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		menuSort.setForeground(Color.WHITE);
		
		JMenuItem itIme= new JMenuItem("Imenu");
		JMenuItem itPrez= new JMenuItem("Prezimenu");
		JMenuItem itTip= new JMenuItem("Tipu korisnika");
		
		menuSort.add(itIme);
		menuSort.addSeparator();
		menuSort.add(itPrez);
		menuSort.addSeparator();
		menuSort.add(itTip);
		menuSort.addSeparator();
		
		dugmici.add(menuSort);*/
		
		JPanel dodavanje= new JPanel();
		dodavanje.setLayout(new BoxLayout(dodavanje, BoxLayout.Y_AXIS));
		this.add(dodavanje, BorderLayout.CENTER);
		
		JLabel lblKime= new JLabel("Korisnicko ime");
	    dodavanje.add(lblKime);
	    
	    JTextField txtKime= new JTextField();
	    dodavanje.add(txtKime);
	    
	    JLabel lblLozinka= new JLabel("Lozinka");
	    dodavanje.add(lblLozinka);
	    
	    JTextField txtLozinka= new JTextField();
	    dodavanje.add(txtLozinka);
	    
	    JLabel lblIme= new JLabel("Ime");
	    dodavanje.add(lblIme);
	    
	    JTextField txtIme= new JTextField();
	    dodavanje.add(txtIme);
	    
	    JLabel lblPrez= new JLabel("Prezime");
	    dodavanje.add(lblPrez);
	    
	    JTextField txtPrez= new JTextField();
	    dodavanje.add(txtPrez);
	    
	    JLabel lblTip= new JLabel("Tip korisnika");
	    dodavanje.add(lblTip);
	    
	    JTextField txtTip= new JTextField();
	    dodavanje.add(txtTip);
	    
	    JPanel dugmad= new JPanel();
	    dodavanje.add(dugmad);
	   // dugmad.setLayout);
	    
	    JButton btnDodaj= new JButton("Dodaj");
	    dugmad.add(btnDodaj);
	    
	    btnDodaj.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	String korisnickoIme = txtKime.getText();
		    	String lozinka = txtLozinka.getText();
		    	String ime = txtIme.getText();
		    	String prezime = txtPrez.getText();
		    	String tip = txtTip.getText();
		    	
		    	Korisnik korisnik = new Korisnik();
		    	
		    	korisnik.Ime = ime;
		    	korisnik.Prezime = prezime;
		    	korisnik.KorisnickoIme = korisnickoIme;
		    	korisnik.Lozinka = lozinka;
		    	korisnik.Tip = tip;
		    	
		    	frame.DodajKorisnika(korisnik);
		    } 
		});
	    
	    JButton btnOtkazi= new JButton("Otkazi");
	    dugmad.add(btnOtkazi);
	    
	    JPanel dolePrazno= new JPanel();
	    this.add(dolePrazno, BorderLayout.SOUTH);
	    
	    
	   int centralniSirina= this.getWidth();
	   int centralniVisina= this.getHeight();
	   Dimension doleP= new Dimension(centralniSirina, centralniVisina/5);
	    
	    dolePrazno.setSize(doleP);
	   
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
	
	
	class LekoviTabela extends JPanel {
		
		public JTable tblLekovi;
		
		public LekoviTabela() {

			initTable();

			add(tblLekovi.getTableHeader(), BorderLayout.PAGE_START);
			add(tblLekovi);

			//setLocationRelativeTo(null);
	}
		
		public void initTable() {
			// Zaglavlja kolona
			Object[] columns = new Object[] { "Ime leka", "Proizvodjac", "Sifra", "Recept", "Cena u dinarima"};

			Object[][] data = { { "Brufen", "Famar SA", "835294", "Ne", "100" },
					{ "Kafetin", "Ð�Ð›ÐšÐ�Ð›ÐžÐ˜Ð” Ð�Ð”-Ð¡ÐºÐ¾Ð¿Ñ˜Ðµ", "645789", "Ne", "130" },
				 };

		   tblLekovi = new JTable(data, columns);
		}
	}
		
		
	

	}

