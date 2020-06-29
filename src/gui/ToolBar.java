package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;

public class ToolBar extends JToolBar{
	
	public ToolBar (Frame mainFrame) {
		
		super(SwingConstants.VERTICAL);
        
        Dimension minSize = new Dimension (50, 25);
        Dimension maxSize = new Dimension (300, 150);
		Dimension prefferedSize = new Dimension (200, 100);
		
		
		JButton btnKorisnici = new JButton("Korisnici");
		btnKorisnici.setIcon(new ImageIcon("slike/korisnici.png"));
		add(btnKorisnici);
		btnKorisnici.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnKorisnici.setForeground(Color.GREEN);
		btnKorisnici.setPreferredSize(prefferedSize);
		btnKorisnici.setMinimumSize(minSize);
		btnKorisnici.setMaximumSize(maxSize);
		
		btnKorisnici.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	mainFrame.PrikazKorisnikaPanel();
		    } 
		});
		
		
		JButton btnLekovi = new JButton("Lekovi");
		btnLekovi.setIcon(new ImageIcon("slike/lekovi.png"));
		add(btnLekovi);
		btnLekovi.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnLekovi.setForeground(Color.GREEN);
		btnLekovi.setPreferredSize(prefferedSize);
		btnLekovi.setMinimumSize(minSize);
		btnLekovi.setMaximumSize(maxSize);
		
		btnLekovi.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	mainFrame.PrikazLekovaPanel();
		    } 
		});
		
		JButton btnRecepti = new JButton("Recepti");
		btnRecepti.setIcon(new ImageIcon("slike/recepti.png"));
		add(btnRecepti);
		btnRecepti.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnRecepti.setForeground(Color.GREEN);
		btnRecepti.setPreferredSize(prefferedSize);
		btnRecepti.setMinimumSize(minSize);
		btnRecepti.setMaximumSize(maxSize);
		
		btnRecepti.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	mainFrame.PrikazRecepataPanel();
		    } 
		});
		
		JButton btnKupovina = new JButton("Kupovina");
		btnKupovina.setIcon(new ImageIcon("slike/kupovina.png"));
		add(btnKupovina);
		btnKupovina.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnKupovina.setForeground(Color.GREEN);
		btnKupovina.setPreferredSize(prefferedSize);
		btnKupovina.setMinimumSize(minSize);
		btnKupovina.setMaximumSize(maxSize);
		
		btnKupovina.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	mainFrame.PrikazKupovinePanel();
		    } 
		});
		
		JButton btnIzvestaj = new JButton("Izvestaj");
		btnIzvestaj.setIcon(new ImageIcon("slike/izvestaj.png"));
		add(btnIzvestaj);
		btnIzvestaj.setBackground(new Color(77,77,77));	//promenjena pozadina dugmeta
		btnIzvestaj.setForeground(Color.GREEN);
		btnIzvestaj.setPreferredSize(prefferedSize);
		btnIzvestaj.setMinimumSize(minSize);
		btnIzvestaj.setMaximumSize(maxSize);
		
		btnIzvestaj.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	mainFrame.PrikazIzvestajaPanel();
		    } 
		});
	}
}
