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
import javax.swing.table.DefaultTableModel;

import gui.Frame.ImagePanel;

import java.util.LinkedList;

public class FrameLekovi1 extends JPanel {
	
	LekoviTabela tblLekovi;
	FrameLekovi3 dodajLek;
	FrameLekovi2 pretragaPanel;
	FrameLekovi4 izmenaPanel;
	
	LinkedList<Lek> lekovi;
	
    public FrameLekovi1 (Frame mainFrame)  {
		
    	lekovi = new LinkedList<Lek>();
    	
    	Lek lek = new Lek();
    	
    	lek.Ime = "brufen";
    	lek.Cena = (float) 100;
    	lek.Proizvodjac = "Galenika";
    	lek.NaRecept = true;
    	lek.Sifra = "skj123jks";
    	
    	lekovi.add(lek);
    	
    	dodajLek = new FrameLekovi3(this);
    	tblLekovi= new LekoviTabela();
    	pretragaPanel = new FrameLekovi2(this);
    	izmenaPanel = new FrameLekovi4(lek, this);
    	
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
		    	PrikazLekova();
		    } 
		});
		
		JButton btnPretraga= new JButton("Pretraga");
		dugmici.add(btnPretraga);
		btnPretraga.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnPretraga.setForeground(Color.WHITE);
		
		btnPretraga.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	PrikazPretrage();
		    } 
		});
		
		JButton btnDodavanje= new JButton("Dodaj lek");
		dugmici.add(btnDodavanje);
		btnDodavanje.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnDodavanje.setForeground(Color.WHITE);
		
		
		btnDodavanje.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	PrikazDodavanja();
		    } 
		});
		
		JButton btnIzmena= new JButton("Izmeni lek");
		dugmici.add(btnIzmena);
		btnIzmena.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnIzmena.setForeground(Color.WHITE);
		
		btnIzmena.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	PrikazIzmene();
		    } 
		});
		
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
		
		dugmici.add(menuSort);
		
		
		this.add(tblLekovi, BorderLayout.CENTER);
		
	    
	}
	
    public void DodajLek(Lek lek) {
    	lekovi.add(lek);
    	
    	//osvezi data taele za prikaz lekova
    	
    	tblLekovi.PopuniPodatke(lekovi);
    	
    	PrikazLekova();
    }
    
    
    public void PretragaLekova(String tip, String vrednost) {
    	
    	LinkedList<Lek> pretrazeniLekovi = new LinkedList<Lek>();
    	
    	switch(tip) {
    	case "Ime":
    		for(Lek lek : lekovi) {
    			if(lek.Ime.contains(vrednost))
    				pretrazeniLekovi.add(lek);
    		}
    		break;
    		
    	case "Sifra":
    		for(Lek lek : lekovi) {
    			if(lek.Sifra.contains(vrednost))
    				pretrazeniLekovi.add(lek);
    		}
    		break;
    	case "Proizvodjac":
    		for(Lek lek : lekovi) {
    			if(lek.Proizvodjac.contains(vrednost))
    				pretrazeniLekovi.add(lek);
    		}
    		break;	
    	case "Cena":
    		
    		String[] tokens= vrednost.split("-");
    		
    		for(Lek lek : lekovi) {
    			if(lek.Cena >= Float.parseFloat(tokens[0]) && lek.Cena <= Float.parseFloat(tokens[0]))
    				pretrazeniLekovi.add(lek);
    		}
    		
    		break;
    	}
    
    	
    	this.remove(dodajLek);
    	this.remove(pretragaPanel);
    	this.remove(izmenaPanel);
    	
    	tblLekovi.PopuniPodatke(pretrazeniLekovi);
    	
    	this.add(tblLekovi, BorderLayout.CENTER);
    	
    	this.revalidate();
    	this.repaint();
    }
    
    public void PrikazLekova() {
    	this.remove(dodajLek);
    	this.remove(pretragaPanel);
    	this.remove(izmenaPanel);
    	
    	tblLekovi.PopuniPodatke(lekovi);
    	
    	this.add(tblLekovi, BorderLayout.CENTER);
    	
    	this.revalidate();
    	this.repaint();
    }
    
	private void PrikazDodavanja() {
		this.remove(tblLekovi);
		this.remove(pretragaPanel);
		this.remove(izmenaPanel);
    	this.add(dodajLek, BorderLayout.CENTER);
    	
    	this.revalidate();
    	this.repaint();
	}
	
	private void PrikazIzmene() {
		int row = tblLekovi.tblLekovi.getSelectedRow();
		
		if(row == -1)
			return;
		
		Lek a = new Lek();
		
		a.Ime = (String)tblLekovi.tblLekovi.getValueAt(row, 0);
		a.Proizvodjac = (String)tblLekovi.tblLekovi.getValueAt(row, 1);
		a.Sifra = (String)tblLekovi.tblLekovi.getValueAt(row, 2);
		a.NaRecept = (boolean)tblLekovi.tblLekovi.getValueAt(row, 3);
		a.Cena = (float)tblLekovi.tblLekovi.getValueAt(row, 4);
		
		izmenaPanel = new FrameLekovi4(a, this);
		
		this.remove(tblLekovi);
		this.remove(pretragaPanel);
		this.remove(dodajLek);
		
    	this.add(izmenaPanel, BorderLayout.CENTER);
    	
    	this.revalidate();
    	this.repaint();
	}
	
	public void IzmeniLek(Lek lek){
		for(Lek lkeIzListe : lekovi) {
			if(lkeIzListe.Sifra.equals(lek.Sifra)) {
				lekovi.remove(lkeIzListe);
			}
		}
		
		lekovi.add(lek);
		
		PrikazLekova();
	}
	
	 private void PrikazPretrage() {
	    	this.remove(dodajLek);
	    	this.remove(tblLekovi);
	    	this.remove(izmenaPanel);
	    	this.add(pretragaPanel, BorderLayout.CENTER);
	    	
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
	
	
	class LekoviTabela extends JPanel {
		
		public JTable tblLekovi;
		public DefaultTableModel dtm;
		
		
		public LekoviTabela() {
			

			tblLekovi = new JTable();
			dtm = new DefaultTableModel(0, 0);
			
			PopuniPodatke(lekovi);

			add(tblLekovi.getTableHeader(), BorderLayout.PAGE_START);
			add(tblLekovi);

			//setLocationRelativeTo(null);
		}
		
		public void PopuniPodatke(LinkedList<Lek> lekoviZaPrikaz) {
			dtm = new DefaultTableModel(0, 0);
			Object[] header = new Object[] { "Ime leka", "Proizvodjac", "Sifra", "Recept", "Cena u dinarima"};
			dtm.setColumnIdentifiers(header);
			
			for (Lek lek : lekoviZaPrikaz) {
		        dtm.addRow(new Object[] { lek.Ime, lek.Proizvodjac, lek.Sifra, 
		        		lek.NaRecept, lek.Cena });
			}
			
			tblLekovi.setModel(dtm);
		}
	}
	

}

