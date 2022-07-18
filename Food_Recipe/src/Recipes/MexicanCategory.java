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

public class MexicanCategory extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MexicanCategory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	    setTitle("Mexican");
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
		
		JButton btnNewButton = new JButton("Avocado Crema");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(68, 144, 160, 87);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Corn Filling");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(288, 144, 160, 87);
		contentPane.add(btnNewButton_1);
		
	}

}
