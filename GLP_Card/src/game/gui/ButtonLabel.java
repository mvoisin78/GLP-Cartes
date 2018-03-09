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
                	System.out.println("Vous avez s�lectionn�");
                	selected = true;
                }
                else {
                	setBorder(null);
                	System.out.println("Vous avez dess�lectionn�");
                	selected = false;
                }
            }
        });
	}

}