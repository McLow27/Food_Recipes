import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SweetRecipe.BrownieRecipe;
import SweetRecipe.CakeRecipe;
import SweetRecipe.CookieRecipe;
import SweetRecipe.MousseRecipe;
import SweetRecipe.PapparotiRecipe;
import SweetRecipe.PiesRecipe;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class SweetsRecipeList extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public SweetsRecipeList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cakes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = getLocation().x;
				int y = getLocation().y;
				dispose();
				CakeRecipe frame = new CakeRecipe();
				frame.setLocation(x, y);
			}
		});
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(74, 64, 172, 71);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pies");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = getLocation().x;
				int y = getLocation().y;
				dispose();
				PiesRecipe frame = new PiesRecipe();
				frame.setLocation(x, y);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 182, 193));
		btnNewButton_1.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(256, 64, 172, 71);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mousse");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = getLocation().x;
				int y = getLocation().y;
				dispose();
				MousseRecipe frame = new MousseRecipe();
				frame.setLocation(x, y);
			}
		});
		btnNewButton_2.setBackground(new Color(255, 182, 193));
		btnNewButton_2.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2.setBounds(256, 252, 172, 71);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Brownies");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = getLocation().x;
				int y = getLocation().y;
				dispose();
				BrownieRecipe frame = new BrownieRecipe();
				frame.setLocation(x, y);
			}
		});
		btnNewButton_3.setBackground(new Color(255, 182, 193));
		btnNewButton_3.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_3.setBounds(438, 64, 148, 71);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Cookies");
		btnNewButton_4.setBackground(new Color(255, 182, 193));
		btnNewButton_4.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = getLocation().x;
				int y = getLocation().y;
				dispose();
				CookieRecipe frame = new CookieRecipe();
				frame.setLocation(x, y);
			}
		});
		btnNewButton_4.setBounds(74, 252, 172, 71);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Papparoti");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = getLocation().x;
				int y = getLocation().y;
				dispose();
				PapparotiRecipe frame = new PapparotiRecipe();
				frame.setLocation(x, y);
			}
		});
		btnNewButton_5.setBackground(new Color(255, 182, 193));
		btnNewButton_5.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_5.setBounds(438, 252, 148, 71);
		contentPane.add(btnNewButton_5);
		
			
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
