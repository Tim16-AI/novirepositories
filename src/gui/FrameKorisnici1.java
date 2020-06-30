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
import javax.swing.table.*;

import gui.Frame.ImagePanel;

import java.util.HashMap;
import java.util.LinkedList;

public class FrameKorisnici1 extends JPanel {
	
	KorisniciTabela tblKorisnici;
	FrameKorisnici2 dodajKorisnikaPanel;
	
	LinkedList<Korisnik> korisnici;
	
    public FrameKorisnici1 (LinkedList<Korisnik> listaKorisnika)  {
		
    	korisnici = listaKorisnika;
    	
    	dodajKorisnikaPanel = new FrameKorisnici2(this);
    	
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
    	
		JPanel dugmici= new JPanel();
		this.add(dugmici, BorderLayout.NORTH);
		
		JButton btnPrikaz= new JButton("Prikaz");
		dugmici.add(btnPrikaz);
		btnPrikaz.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnPrikaz.setForeground(Color.WHITE);
		
		btnPrikaz.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	PrikazKorisnika();
		    } 
		});
		
		
		JButton btnDodavanje= new JButton("Dodaj korisnika");
		dugmici.add(btnDodavanje);
		btnDodavanje.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnDodavanje.setForeground(Color.WHITE);
		
		btnDodavanje.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	DodajKorisnikaPrikaz();
		    } 
		});
		
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
		
		dugmici.add(menuSort);
		
		tblKorisnici= new KorisniciTabela();
		
		
		this.add(tblKorisnici, BorderLayout.CENTER);
		
	    
	}
	
	
    public void DodajKorisnika(Korisnik korisnik) {
    	korisnici.add(korisnik);
    	
    	//osveziti data tabele za prikaz
    	tblKorisnici.PopuniPodatke();
    	
    	PrikazKorisnika();
    }
    
    public void PrikazKorisnika() {
    	this.remove(dodajKorisnikaPanel);
    	this.add(tblKorisnici, BorderLayout.CENTER);
    	
    	this.revalidate();
    	this.repaint();
    }
    
    private void DodajKorisnikaPrikaz() {
    	this.remove(tblKorisnici);
    	this.add(dodajKorisnikaPanel, BorderLayout.CENTER);
    	
    	this.revalidate();
    	this.repaint();
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
	
	
	class KorisniciTabela extends JPanel {
		
		public JTable tblKorisnici;
		public DefaultTableModel dtm;
		
		public KorisniciTabela() {
			
			tblKorisnici = new JTable();
			dtm = new DefaultTableModel(0, 0);
			
			PopuniPodatke();

			add(tblKorisnici.getTableHeader(), BorderLayout.PAGE_START);
			add(tblKorisnici);

			//setLocationRelativeTo(null);
		}
		
		public void PopuniPodatke() {
			dtm = new DefaultTableModel(0, 0);
			Object[] header = new Object[] { "Korisnicko ime", "Lozinka", "Ime", "Prezime", " Tip Korisnika"};
			dtm.setColumnIdentifiers(header);
			
			for (Korisnik korisnik : korisnici) {
		        dtm.addRow(new Object[] { korisnik.KorisnickoIme, korisnik.Lozinka, korisnik.Ime, 
		        		korisnik.Prezime, korisnik.Tip });
			}
			
			tblKorisnici.setModel(dtm);
		}
		
	}
}

