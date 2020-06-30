package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.LinkedList;

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

public class FrameRecepti1 extends JPanel {
	
	LinkedList<Recept> recepti;
	
	ReceptiTabela tblRecepti;
	FrameRecepti2 pretragaPanel;
	FrameRecepti3 dodajPanel;
	
    public FrameRecepti1 ()  {
		
    	recepti = new LinkedList<Recept>();
    	
    	Recept recept = new Recept();
    	
    	recept.JMBGPacijenta = "12354436";
    	recept.IdLeka = "32424";
    	recept.UkupnaCena = (float) 200;
    	recept.Datum = "10-10-2020";
    	recept.Sifra = 123; 
    	
    	recepti.add(recept);
    	
    	pretragaPanel = new FrameRecepti2(this);
    	dodajPanel = new FrameRecepti3(this);
    	
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
		
		glavniProzor.add(centralni, BorderLayout.CENTER); */
		
    	this.setLayout(new BorderLayout(20, 20));
    	
		JPanel dugmici= new JPanel();
		this.add(dugmici, BorderLayout.NORTH);
		
		JButton btnPrikaz= new JButton("Postojeci recepti");
		dugmici.add(btnPrikaz);
		btnPrikaz.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnPrikaz.setForeground(Color.WHITE);
		
		btnPrikaz.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	PrikazRecepata();
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
		
		JButton btnDodavanje= new JButton("Dodaj recept");
		dugmici.add(btnDodavanje);
		btnDodavanje.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnDodavanje.setForeground(Color.WHITE);
		
		btnDodavanje.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	PrikazDodavanja();
		    } 
		});
		
        ///////////////////////////////////////////////////////////////////////////////////
        //ne radi padajuci meni

        /*JMenu menuSort= new JMenu("Sortiraj po:");
        menuSort.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
        menuSort.setForeground(Color.WHITE);

        JMenuItem itSifra= new JMenuItem("Sifri");
        JMenuItem itLekar= new JMenuItem("Lekaru");
        JMenuItem itDatum= new JMenuItem("Datumu");

        menuSort.add(itSifra);
        menuSort.addSeparator();
        menuSort.add(itLekar);
        menuSort.addSeparator();
        menuSort.add(itDatum);
        menuSort.addSeparator();

        dugmici.add(menuSort);*/
		
		tblRecepti= new ReceptiTabela();
		
		
		this.add(tblRecepti, BorderLayout.CENTER);
		
	    
	}
	
 public void PretragaRecepata(String tip, String vrednost) {
    	
    	LinkedList<Recept> PretrazeniRecepti = new LinkedList<Recept>();
    	
    	switch(tip) {
    	case "Sifra":
    		int sifra = Integer.parseInt(vrednost);
    		for(Recept recept : recepti) {
    			if(recept.Sifra == sifra)
    				PretrazeniRecepti.add(recept);
    		}
    		break;
    		
    	case "Lekar":
    		for(Recept recept : recepti) {
    			if(recept.IdLeka.contains(vrednost))
    				PretrazeniRecepti.add(recept);
    		}
    		break;
    	case "Pacijent":
    		for(Recept recept : recepti) {
    			if(recept.JMBGPacijenta.contains(vrednost))
    				PretrazeniRecepti.add(recept);
    		}
    		break;	
    	}
    
    	
    	this.remove(pretragaPanel);
    	this.remove(dodajPanel);
    	
    	tblRecepti.PopuniPodatke(PretrazeniRecepti);
    	
    	this.add(tblRecepti, BorderLayout.CENTER);
    	
    	this.revalidate();
    	this.repaint();
    }
    
    
    public void DodajRecept(Recept recept) {
    	recepti.add(recept);
    	
    	//osvezi data taele za prikaz lekova
    	
    	tblRecepti.PopuniPodatke(recepti);
    	
    	PrikazRecepata();
    }
    
    private void PrikazPretrage() {
    	this.remove(tblRecepti);
    	this.remove(dodajPanel);
    	
    	this.add(pretragaPanel, BorderLayout.CENTER);
    	
    	this.revalidate();
    	this.repaint();
    }
    
    private void PrikazDodavanja() {
    	this.remove(tblRecepti);
    	this.remove(pretragaPanel);
    	
    	this.add(dodajPanel, BorderLayout.CENTER);
    	
    	this.revalidate();
    	this.repaint();
    }
    
    private void PrikazRecepata() {
    	this.remove(pretragaPanel);
    	this.remove(dodajPanel);
    	
    	tblRecepti.PopuniPodatke(recepti);
    	
    	this.add(tblRecepti, BorderLayout.CENTER);
    	
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
	
	
	class ReceptiTabela extends JPanel {
		
		public JTable tblRecepti;
		public DefaultTableModel dtm;
		
		public ReceptiTabela() {
			tblRecepti = new JTable();
			dtm = new DefaultTableModel(0, 0);
			
			PopuniPodatke(recepti);

			add(tblRecepti.getTableHeader(), BorderLayout.PAGE_START);
			add(tblRecepti);

			//setLocationRelativeTo(null);
		}
		
		
		public void PopuniPodatke(LinkedList<Recept> receptiZaPrikaz) {
			dtm = new DefaultTableModel(0, 0);
			Object[] header = new Object[] { "Sifra", "Identifikator lekara", "JMBG pacijenta",
                    "Datum i vreme", "Ukupna cena u dinarima"};
			dtm.setColumnIdentifiers(header);
			
			for (Recept recept : receptiZaPrikaz) {
		        dtm.addRow(new Object[] { recept.Sifra, recept.IdLeka, recept.JMBGPacijenta, 
		        		recept.Datum, recept.UkupnaCena });
			}
			
			tblRecepti.setModel(dtm);
		}
	}
		
		
	

	}

