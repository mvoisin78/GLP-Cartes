package game.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOptions extends JFrame implements ActionListener {
	private JPanel container = new JPanel();
	private JComboBox list;
	private	JButton enterButton = new JButton("Enter");
	private JLabel playersLabel = new JLabel("Total players");
	private JLabel labelText = new JLabel();
	private JLabel IALabel = new JLabel("Human players");
	
	public GameOptions() {
		this.setTitle("Game Options");
		this.setSize(350, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		container.setLayout(null);
		this.add(container);

	    
		Object[] elements = new Object[] {"2 joueurs", "3 joueurs", "4 joueurs", "5 joueurs"};
		list = new JComboBox(elements);
		
		list.setBounds(140, 0, 100, 30);
		playersLabel.setBounds(60, 0, 100, 30);
		labelText.setBounds(60, 50, 200, 30);
		IALabel.setBounds(60, 100, 100, 30);
	    container.add(playersLabel);
		container.add(list);
		container.add(IALabel);
		container.add(labelText);
		
		

	    enterButton.setBounds(120, 250, 100, 30);
	    container.add(enterButton);
	    
	    list.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				JComboBox box = (JComboBox)e.getSource();
				String msg = (String)box.getSelectedItem();
				switch (msg) { //Cases
				case "2 joueurs": labelText.setText("You can select up to 3 players.");
					break;
				case "3 joueurs": labelText.setText("You can select up to 2 players.");
					break;
				case "4 joueurs": labelText.setText("You can select up to 1 player.");
					break;
				case "5 joueurs": labelText.setText("You can't select more player.");
					break;
				default: labelText.setText("Whoops, we seem to have an error.");
				}
			}
	    });
	    
		this.setVisible(true);
	}

}

