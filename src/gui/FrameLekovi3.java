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

public class FrameLekovi3 extends JPanel {
	

    public FrameLekovi3 (FrameLekovi1 frame)  {
		
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
		
		glavniProzor.add(centralni, BorderLayout.CENTER);*/
		
    	this.setLayout(new BorderLayout(20, 20));
    	
		/*JPanel dugmici= new JPanel();
		this.add(dugmici, BorderLayout.NORTH);
		
		JButton btnPrikaz= new JButton("Prikaz");
		dugmici.add(btnPrikaz);
		btnPrikaz.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnPrikaz.setForeground(Color.WHITE);
		
		JButton btnPretraga= new JButton("Pretraga");
		dugmici.add(btnPretraga);
		btnPretraga.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnPretraga.setForeground(Color.WHITE);
		
		JButton btnDodavanje= new JButton("Dodaj lek");
		dugmici.add(btnDodavanje);
		btnDodavanje.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnDodavanje.setForeground(Color.WHITE);
		
		JButton btnIzmena= new JButton("Izmeni lek");
		dugmici.add(btnIzmena);
		btnIzmena.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnIzmena.setForeground(Color.WHITE);
		
		///////////////////////////////////////////////////////////////////////////////////
		//ne radi padajuci meni
		
		JMenu menuSort= new JMenu("Sortiraj po:");
		menuSort.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		menuSort.setForeground(Color.WHITE);
		
		JMenuItem itIme= new JMenuItem("Imenu");
		JMenuItem itSifra= new JMenuItem("Sifri");
		JMenuItem itCena= new JMenuItem("Ceni");
		
		menuSort.add(itIme);
		menuSort.addSeparator();
		menuSort.add(itSifra);
		menuSort.addSeparator();
		menuSort.add(itCena);
		menuSort.addSeparator();
		
		dugmici.add(menuSort);*/
		
		JPanel dodavanje= new JPanel();
		dodavanje.setLayout(new BoxLayout(dodavanje, BoxLayout.Y_AXIS));
		this.add(dodavanje, BorderLayout.CENTER);
		
		JLabel lblNaziv= new JLabel("Naziv leka");
	    dodavanje.add(lblNaziv);
	    
	    JTextField txtNaziv= new JTextField();
	    dodavanje.add(txtNaziv);
	    
	    JLabel lblProizvodjac= new JLabel("Proizvodjac");
	    dodavanje.add(lblProizvodjac);
	    
	    JTextField txtProizvodjac= new JTextField();
	    dodavanje.add(txtProizvodjac);
	    
	    JLabel lblSifra= new JLabel("Sifra");
	    dodavanje.add(lblSifra);
	    
	    JTextField txtSifra= new JTextField();
	    dodavanje.add(txtSifra);
	    
	    JLabel lblRecept= new JLabel("Recept");
	    dodavanje.add(lblRecept);
	    
	    JTextField txtRecept= new JTextField();
	    dodavanje.add(txtRecept);
	    
	    JLabel lblCena= new JLabel("Cena");
	    dodavanje.add(lblCena);
	    
	    JTextField txtCena= new JTextField();
	    dodavanje.add(txtCena);
	    
	    JPanel dugmad= new JPanel();
	    dodavanje.add(dugmad);
	   // dugmad.setLayout);
	    
	    JButton btnPotvrda= new JButton("Potvrda");
	    dugmad.add(btnPotvrda);
	    
	    btnPotvrda.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	String naziv = txtNaziv.getText();
		    	String proizvodjac = txtProizvodjac.getText();
		    	String sifra = txtSifra.getText();
		    	String recept = txtRecept.getText();
		    	String cena = txtCena.getText();
		    	
		    	Lek lek = new Lek();
		    	
		    	lek.Ime = naziv;
		    	lek.Proizvodjac = proizvodjac;
		    	lek.Sifra = sifra;
		    	lek.NaRecept = Boolean.valueOf(recept);
		    	lek.Cena = Float.valueOf(cena);
		    	
		    	frame.DodajLek(lek);
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

