package Recipes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class ArabicCategory extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public ArabicCategory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	    setTitle("Arabic");
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(650,550);
	    setResizable(false);
	    ImageIcon image = new ImageIcon("Images/HinaLogo.png");
	    setIconImage(image.getImage());
		setBackground(new Color(255, 255, 255));
		getContentPane().setBackground(new Color(210, 180, 140));
		setBounds(100, 100, 600, 511);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Tabbouli");
		btnNewButton.setBounds(101, 104, 155, 93);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Meat Pies");
		btnNewButton_1.setBounds(284, 104, 155, 93);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Fatteh");
		btnNewButton_2.setBounds(177, 251, 182, 93);
		contentPane.add(btnNewButton_2);
		
		JButton ArabicBackButton = new JButton("Back");
		ArabicBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = getLocation().x;
				int y = getLocation().y;
				dispose();
				ArabicCategory frame = new ArabicCategory();
				frame.setLocation(x, y);
			}
		});
		ArabicBackButton.setBounds(10, 11, 74, 23);
		contentPane.add(ArabicBackButton);
		
		
	}

}
