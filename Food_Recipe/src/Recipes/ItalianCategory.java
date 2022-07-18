package Recipes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class ItalianCategory extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ItalianCategory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	    setTitle("Italian");
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
		
		JButton btnNewButton = new JButton("Vodka Pasta");
		btnNewButton.setBounds(76, 84, 182, 82);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Chicken Parmesan");
		btnNewButton_1.setBounds(320, 84, 182, 82);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Alredo Sauce");
		btnNewButton_2.setBounds(194, 220, 182, 82);
		contentPane.add(btnNewButton_2);
	}

}
