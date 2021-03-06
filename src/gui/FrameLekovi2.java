package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
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
import javax.swing.JTextField;

import gui.Frame.ImagePanel;

public class FrameLekovi2 extends JPanel{
	
	public FrameLekovi2 (FrameLekovi1 frame) {
		
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
		btnIzmena.setForeground(Color.WHITE);*/
		
		///////////////////////////////////////////////////////////////////////////////////
		//ne radi padajuci meni
		
		
		//dugmici.add(menuSort);
		
		
		JPanel panPretraga= new JPanel();
		this.add(panPretraga ,BorderLayout.CENTER);
		
		
		JLabel lblTip= new JLabel("Tip");
		panPretraga.add(lblTip);
	    
	    JTextField txtTip= new JTextField("Unsi tip pretrage...");
	    panPretraga.add(txtTip);
		
	    JLabel lblVrednost= new JLabel("Vrednost");
		panPretraga.add(lblVrednost);
	    
	    JTextField txtVrednost= new JTextField("Unesi vrednost pretrage...");
	    panPretraga.add(txtVrednost); 
	    
		 JButton btnOk= new JButton("OK");
		 panPretraga.add(btnOk, BorderLayout.CENTER);
		 
		 btnOk.addActionListener(new ActionListener() { 
			    public void actionPerformed(ActionEvent e) { 
			    	String tip = txtTip.getText();
			    	String vrednost = txtVrednost.getText();
			    	
			    	frame.PretragaLekova(tip, vrednost);
			    } 
			});
		 
		  JPanel dolePrazno= new JPanel();
		  this.add(dolePrazno, BorderLayout.SOUTH);
		   
		    
		   int centralniSirina= this.getWidth();
		   //int centralniVisina= centralni.getHeight();
		  
		   dolePrazno.setPreferredSize(new Dimension(centralniSirina, 180));
		   dolePrazno.setMinimumSize(new Dimension(centralniSirina, 20));
		   dolePrazno.setMaximumSize(new Dimension(centralniSirina, 500));
		
		
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
