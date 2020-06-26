package gui;

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
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;

import gui.Frame.ImagePanel;

public class FrameIzvestaj1 extends JFrame {
	
 
    public FrameIzvestaj1 ()  {
		
		Toolkit kit = Toolkit.getDefaultToolkit();
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
		glavniProzor.add(centralni, BorderLayout.CENTER);
		
		JPanel dugmici= new JPanel();
		centralni.add(dugmici, BorderLayout.NORTH);
		
		JButton btnPrikaz= new JButton("Ukupna prodaja svih lekova");
		dugmici.add(btnPrikaz);
		btnPrikaz.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnPrikaz.setForeground(Color.WHITE);
		
		
		JButton btnDodavanje= new JButton("Ukupna prodaja svih lekova odabranog prozivodjaca");
		dugmici.add(btnDodavanje);
		btnDodavanje.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnDodavanje.setForeground(Color.WHITE);
		
		///////////////////////////////////////////////////////////////////////////////////
		//ne radi padajuci meni
		
		JMenu menuSort= new JMenu("Ukupna prodaja svih lekova koje je odredjeni apotekar prodao");
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
		
		KorisniciTabela tblKorisnici= new KorisniciTabela();
		
		
		centralni.add(tblKorisnici, BorderLayout.CENTER);
		
	    
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
		
		public KorisniciTabela() {

			initTable();

			add(tblKorisnici.getTableHeader(), BorderLayout.PAGE_START);
			add(tblKorisnici);

			//setLocationRelativeTo(null);
	}
		
		public void initTable() {
			// Zaglavlja kolona
			Object[] columns = new Object[] { "Naziv lekara", "Proizvodjac", "Apotekar"};

			Object[][] data = {   };
					
				 

		   tblKorisnici = new JTable(data, columns);
		}
	}
		
		
	

	}
