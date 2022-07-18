package Recipes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DesiCategory extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public DesiCategory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	    setTitle("Desi");
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
		
		JButton btnNewButton = new JButton("Butter Chicken");
		btnNewButton.setBounds(89, 126, 160, 61);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Naan");
		btnNewButton_1.setBounds(325, 126, 160, 61);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Nihari");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(209, 251, 160, 61);
		contentPane.add(btnNewButton_2);
	}

}
