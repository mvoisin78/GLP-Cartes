package game.gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class test extends JPanel{

	private static final long serialVersionUID = 1L;
	private JFrame frame;

	/**
	 * Create the application.
	 */
	public test() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1100, 700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		
		JPanel bottom = new JPanel();
		bottom.setBackground(Color.white);
		bottom.setBounds(0, 580, 900, 200);
		frame.add(bottom);
		
		JButton jouer = new JButton("jouer");
		bottom.add(jouer);
		
		JPanel aside = new JPanel();
		aside.setBackground(Color.white);
		aside.setBounds(900, 0, 120, 700);
		frame.add(aside);
		
		Icon handCard = new ImageIcon("../resources/images/clubs0.gif");
		JLabel hand = new JLabel(handCard);
		hand.setBounds(100, 55, 100, 150);
		frame.getContentPane().add(hand);
		
        Icon handCard2 = new ImageIcon("../resources/images/hearts0.gif");
        ButtonLabel label = new ButtonLabel(handCard2);
        label.setBounds(440, 55, 103, 150);
		frame.getContentPane().add(label);
		
        Icon handCard3 = new ImageIcon("../resources/images/spades0.gif");
        ButtonLabel label2 = new ButtonLabel(handCard3);
        label2.setBounds(780, 55, 100, 150);
		frame.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("");
		label3.setBounds(440, 395, 100, 150);
        Icon handCard4 = new ImageIcon("../resources/images/diamonds0.gif");
        label3.setIcon(handCard4);
		frame.getContentPane().add(label3);
		
		JLabel deck = new JLabel("");
		deck.setBounds(780, 395, 100, 150);
        Icon cover = new ImageIcon("../resources/images/cover.gif");
        deck.setIcon(cover);
		frame.getContentPane().add(deck);
		
		
	}
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
    		public void run() {
    			try {
    				test window = new test();
    				window.frame.setVisible(true);
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
    		}
    	});
    }
    
}