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
import javax.swing.JTextField;

import gui.Frame.ImagePanel;

public class FrameKupovina1 extends JPanel {
	
 
    public FrameKupovina1 ()  {
		
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
		
		///////////////////////////////////////////////////////////////////////////////
		
		JPanel centralni= new JPanel();
		
		glavniProzor.add(centralni, BorderLayout.CENTER);*/
    	
    	this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel stavka1= new JPanel();
		this.add(stavka1);
		
			
	    JLabel lblSifra1= new JLabel("Sifra leka");
		stavka1.add(lblSifra1);
		    
		JTextField txtSifra1= new JTextField("                              ");
		stavka1.add(txtSifra1);
		
		
		JPanel stavka2= new JPanel();
		this.add(stavka2);
			
	    JLabel lblSifra2= new JLabel("Sifra recepta");
		stavka1.add(lblSifra2);
		    
		JTextField txtSifra2= new JTextField("                              ");
		stavka1.add(txtSifra2);
		
		JPanel dugmici= new JPanel();
		this.add(dugmici);
		
		JButton btnDodaj= new JButton("+");
		dugmici.add(btnDodaj);
		
		JButton btnObrisi= new JButton("-");
		dugmici.add(btnObrisi);
		
		
		Korpa tblKorpa= new Korpa();
		
		this.add(tblKorpa);
		
		JPanel racun= new JPanel();
		this.add(racun);
		
		JLabel lblRacun= new JLabel("Racun");
		racun.add(lblRacun);
		    
		JTextField txtRacun= new JTextField("                              ");
		racun.add(txtRacun);
		
	    
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
	
	
	class Korpa extends JPanel {
		
		public JTable tblKorpa;
		
		public Korpa() {

			initTable();

			add(tblKorpa.getTableHeader(), BorderLayout.PAGE_START);
			add(tblKorpa);

			//setLocationRelativeTo(null);
	}
		
		public void initTable() {
			// Zaglavlja kolona
			Object[] columns = new Object[] { "Ime leka", "Proizvodjac", "Sifra", "Recept", "Cena u dinarima"};

			Object[][] data = { { "Brufen", "Famar SA", "835294", "Ne", "100" },
					{ "Kafetin", "Ð�Ð›ÐšÐ�Ð›ÐžÐ˜Ð” Ð�Ð”-Ð¡ÐºÐ¾Ð¿Ñ˜Ðµ", "645789", "Ne", "130" },
				 };

			tblKorpa = new JTable(data, columns);
		}
	}
		
		
	

	}

