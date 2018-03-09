<<<<<<< HEAD
package game.gui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JLabel;

public class ButtonLabel extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean selected = false;
	
	public ButtonLabel(Icon icon) {
		setIcon(icon);
		
        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                if(selected == false){
                	setBorder(BorderFactory.createLineBorder(Color.ORANGE, 3));
                	System.out.println("Vous avez sélectionné");
                	selected = true;
                }
                else {
                	setBorder(null);
                	System.out.println("Vous avez dessélectionné");
                	selected = false;
                }
            }
        });
	}

=======
package game.gui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JLabel;

public class ButtonLabel extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean selected = false;
	
	public ButtonLabel(Icon icon) {
		setIcon(icon);
		
        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                if(selected == false){
                	setBorder(BorderFactory.createLineBorder(Color.ORANGE, 3));
                	System.out.println("Vous avez sÃ©lectionnÃ©");
                	selected = true;
                }
                else {
                	setBorder(null);
                	System.out.println("Vous avez dessÃ©lectionnÃ©");
                	selected = false;
                }
            }
        });
	}

>>>>>>> branch 'master' of https://github.com/mvoisin78/GLP-Cartes.git
}