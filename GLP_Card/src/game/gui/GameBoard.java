package game.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameBoard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameBoard window = new GameBoard();
					window.frame.setTitle("Tu n'y peux rien ! ");
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		frame.setBounds(100, 100, 876, 629);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblImage = new JLabel("");
		Icon img = new ImageIcon("../resources/images/clubs6.gif");
		lblImage.setIcon(img);
		GridBagConstraints gbc_lblImage = new GridBagConstraints();
		gbc_lblImage.insets = new Insets(5, 5, 5, 5);
		gbc_lblImage.gridx = 4;
		gbc_lblImage.gridy = 3;
		frame.getContentPane().add(lblImage, gbc_lblImage);
		
		JLabel face = new JLabel("");
		Icon faceCard = new ImageIcon("../resources/images/cover.gif");
		face.setIcon(faceCard);
		GridBagConstraints gbc_face = new GridBagConstraints();
		gbc_face.insets = new Insets(5, 5, 5, 5);
		gbc_face.gridx = 6;
		gbc_face.gridy = 7;
		frame.getContentPane().add(face, gbc_face);
		
		JLabel hand = new JLabel("");
		Icon handCard = new ImageIcon("../resources/images/clubs0.gif");
		hand.setIcon(handCard);
		GridBagConstraints gbc_hand = new GridBagConstraints();
		gbc_hand.insets = new Insets(5, 5, 5, 5);
		gbc_hand.gridx = 5;
		gbc_hand.gridy = 7;
		frame.getContentPane().add(hand, gbc_hand);
		
		JLabel label = new JLabel("");
		Icon autre = new ImageIcon("../resources/images/spades2.gif");
		label.setIcon(autre);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(5, 5, 5, 5);
		gbc_label.gridx = 5;
		gbc_label.gridy = 3;
		frame.getContentPane().add(label, gbc_label);
		
		JLabel lblTest = new JLabel("");
		Icon test = new ImageIcon("../resources/images/hearts5.gif");
		lblTest.setIcon(test);
		GridBagConstraints gbc_lblTest = new GridBagConstraints();
		gbc_lblTest.insets = new Insets(5, 5, 5, 5);
		gbc_lblTest.gridx = 6;
		gbc_lblTest.gridy = 3; //
		frame.getContentPane().add(lblTest, gbc_lblTest);

	}
}