import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

import Recipes.ArabicCategory;

import javax.swing.ImageIcon;
            
public class Frame {

	public JFrame frame;
	public static JFrame mainframe;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Frame() {
		initialize();
	}
    
	private void initialize() {
		frame = new JFrame();
		mainframe = frame;
	    frame.setTitle("Hina's Food Recipes");
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(650,550);
	    frame.setResizable(false);
	    ImageIcon image = new ImageIcon("Images/HinaLogo.png");
	    frame.setIconImage(image.getImage());
		frame.setBackground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(210, 180, 140));
		frame.setBounds(100, 100, 600, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Sweet = new JButton("Sweet");
		Sweet.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 18));
		Sweet.setForeground(new Color(184, 134, 11));
		Sweet.setBackground(new Color(255, 182, 193));
		Sweet.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				openSweets(frame);
				
			}
		});
		Sweet.setBounds(196, 244, 134, 76);
		frame.getContentPane().add(Sweet);
		
		JButton Savory = new JButton("Savory");
		Savory.setForeground(new Color(184, 134, 11));
		Savory.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 16));
		Savory.setBackground(new Color(255, 182, 193));
		Savory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openSavory(frame);
			}
		});
		Savory.setBounds(196, 151, 134, 76);
		frame.getContentPane().add(Savory);
		
		JLabel ChooseLabel = new JLabel("Choose Savory or Sweet");
		ChooseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ChooseLabel.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		ChooseLabel.setBackground(new Color(0, 0, 0));
		ChooseLabel.setBounds(133, 66, 254, 69);
		frame.getContentPane().add(ChooseLabel);
		

	}
	
	public void openSweets(JFrame frame) {
		SweetsRecipeList frame2 = new SweetsRecipeList();
	    ImageIcon image = new ImageIcon("src/HinaLogo.png");
	    frame2.setIconImage(image.getImage());
		frame2.setLocation(frame.getLocation().x,frame.getLocation().y);
		frame2.setTitle("Sweet Recipes");
		frame.dispose();
	    frame2.setVisible(true);
	    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame2.setResizable(false);
	}
	
	public void openSavory(JFrame frame) {
		SavoryRecipeList frame3 = new SavoryRecipeList();
	    ImageIcon image = new ImageIcon("src/HinaLogo.png");
	    frame3.setIconImage(image.getImage());
		frame3.setLocation(frame.getLocation().x,frame.getLocation().y);
		frame3.setTitle("Savory Recipes");
		frame.dispose();
	    frame3.setVisible(true);
	    frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame3.setResizable(false);
	}
}
