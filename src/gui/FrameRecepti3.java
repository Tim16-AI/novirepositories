package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gui.Frame.ImagePanel;

public class FrameRecepti3 extends JFrame{
	
	public FrameRecepti3 () {
		
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
		
		JButton btnPrikaz= new JButton("Postojeci recepti");
		dugmici.add(btnPrikaz);
		btnPrikaz.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnPrikaz.setForeground(Color.WHITE);
		
		JButton btnPretraga= new JButton("Pretraga");
		dugmici.add(btnPretraga);
		btnPretraga.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnPretraga.setForeground(Color.WHITE);
		
		JButton btnDodavanje= new JButton("Dodaj recept");
		dugmici.add(btnDodavanje);
		btnDodavanje.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnDodavanje.setForeground(Color.WHITE);
		
		
		///////////////////////////////////////////////////////////////////////////////////
		//ne radi padajuci meni
		
		JMenu menuSort= new JMenu("Sortiraj po:");
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

        dugmici.add(menuSort);
		
        JPanel dodavanje= new JPanel();
		dodavanje.setLayout(new BoxLayout(dodavanje, BoxLayout.Y_AXIS));
		centralni.add(dodavanje, BorderLayout.CENTER);
		
		JLabel lblId= new JLabel("Idebtifikator leka");
	    dodavanje.add(lblId);
	    
	    JTextField txtId= new JTextField();
	    dodavanje.add(txtId);
		
		JLabel lblJmbg= new JLabel("JMBG pacijenta");
	    dodavanje.add(lblJmbg);
	    
	    JTextField txtJmbg= new JTextField();
	    dodavanje.add(txtJmbg);
	    
	    JLabel lblVreme= new JLabel("Datum i vreme kreiranja");
	    dodavanje.add(lblVreme);
	    
	    JTextField txtVreme= new JTextField();
	    dodavanje.add(txtVreme);
	    
	    JLabel lblLekovi= new JLabel("Spisak i kolicina lekova");
	    dodavanje.add(lblLekovi);
	    
	    JTextField txtLekovi= new JTextField();
	    dodavanje.add(txtLekovi);
	    
	    JLabel lblSifra= new JLabel("Sifra recepta");
	    dodavanje.add(lblSifra);
	    
	    JTextField txtSifra= new JTextField();
	    dodavanje.add(txtSifra);
	    
	    JLabel lblSifra1= new JLabel("Sifra lekara");
	    dodavanje.add(lblSifra1);
	    
	    JTextField txtSifra1= new JTextField();
	    dodavanje.add(txtSifra1);
	    
	    JPanel dugmad= new JPanel();
	    dodavanje.add(dugmad);
	   // dugmad.setLayout);
	    
	    JButton btnPotvrda= new JButton("Potvrda");
	    dugmad.add(btnPotvrda);
	    
	    JButton btnOtkazi= new JButton("Otkazi");
	    dugmad.add(btnOtkazi);
	    
	    JPanel dolePrazno= new JPanel();
	    centralni.add(dolePrazno, BorderLayout.SOUTH);
	    
	    
	   int centralniSirina= centralni.getWidth();
	   int centralniVisina= centralni.getHeight();
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

}
