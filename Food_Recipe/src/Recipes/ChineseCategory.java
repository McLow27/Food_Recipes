package Recipes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ShowFoodRecipe.BeefLoMein;
import ShowFoodRecipe.FriedRice;
import ShowFoodRecipe.KungPaoChicken;
import ShowFoodRecipe.MongolianBeef;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChineseCategory extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public ChineseCategory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 474);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	    setTitle("Chinese");
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(600,410);
	    setResizable(false);
	    ImageIcon image = new ImageIcon("Images/HinaLogo.png");
	    setIconImage(image.getImage());
		setBackground(new Color(255, 255, 255));
		getContentPane().setBackground(new Color(210, 180, 140));
		setBounds(100, 100, 600, 511);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Fried Rice");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
				FriedRice fr = new FriedRice();
				
			}
			
		});
		btnNewButton.setBounds(88, 63, 162, 92);
		contentPane.add(btnNewButton);

		
		JButton btnNewButton_1 = new JButton("Mongolian Beef");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
				MongolianBeef MB = new MongolianBeef();
				
			}
			
		});
		btnNewButton_1.setBounds(326, 63, 162, 92);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Kung Pao Chicken");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			KungPaoChicken KPC = new KungPaoChicken();
				
			}
			
		});
		btnNewButton_2.setBounds(88, 207, 162, 92);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Beef Lo Mein");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			BeefLoMein KPC = new BeefLoMein();
				
			}
			
		});
		btnNewButton_3.setBounds(326, 207, 162, 92);
		contentPane.add(btnNewButton_3);
		
	}
}
