import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SweetRecipe.CakeRecipe;
import Recipes.ChineseCategory;
import Recipes.DesiCategory;
import Recipes.ItalianCategory;
import Recipes.MexicanCategory;
import Recipes.AmericanCategory;
import Recipes.ArabicCategory;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class SavoryRecipeList extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public SavoryRecipeList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Chinese");
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(57, 64, 178, 71);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = getLocation().x;
				int y = getLocation().y;
				dispose();
				ChineseCategory frame = new ChineseCategory();
				frame.setLocation(x, y);
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("American");
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(256, 64, 168, 71);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = getLocation().x;
				int y = getLocation().y;
				dispose();
				AmericanCategory frame = new AmericanCategory();
				frame.setLocation(x, y);
			}
		});
		
		JButton btnNewButton_2 = new JButton("Italian");
		btnNewButton_2.setBackground(new Color(0, 255, 255));
		btnNewButton_2.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2.setBounds(446, 64, 172, 71);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int x = getLocation().x;
					int y = getLocation().y;
					dispose();
					ItalianCategory frame = new ItalianCategory();
					frame.setLocation(x, y);
				}
			});
		
		JButton btnNewButton_3 = new JButton("Desi");
		btnNewButton_3.setBackground(new Color(0, 255, 255));
		btnNewButton_3.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_3.setBounds(57, 250, 172, 71);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = getLocation().x;
				int y = getLocation().y;
				dispose();
				DesiCategory frame = new DesiCategory();
				frame.setLocation(x, y);
			}
		});
		
		
		
		JButton btnNewButton_4 = new JButton("Arabic");
		btnNewButton_4.setBackground(new Color(0, 255, 255));
		btnNewButton_4.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = getLocation().x;
				int y = getLocation().y;
				dispose();
				ArabicCategory frame = new ArabicCategory();
				frame.setLocation(x, y);
			}
		});
		btnNewButton_4.setBounds(250, 250, 174, 71);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Mexican");
		btnNewButton_5.setBackground(new Color(0, 255, 255));
		btnNewButton_5.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_5.setBounds(446, 250, 172, 71);
		contentPane.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = getLocation().x;
				int y = getLocation().y;
				dispose();
				MexicanCategory frame = new MexicanCategory();
				frame.setLocation(x, y);
			}
		});
		
		JButton btnNewButton_6 = new JButton("Back");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = getLocation().x;
				int y = getLocation().y;
				dispose();
				Frame frame = new Frame();
				frame.frame.setLocation(x, y);
			}
		});
		btnNewButton_6.setBounds(10, 11, 74, 23);
		contentPane.add(btnNewButton_6);
		
	}
}
