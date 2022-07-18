package ShowFoodRecipe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class FriedRice extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public FriedRice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	    setTitle("FriedRice");
	    setVisible(true);
	    setSize(600,532);
	    setResizable(false);
	    ImageIcon image = new ImageIcon("Images/HinaLogo.png");
	    setIconImage(image.getImage());
		setBackground(new Color(255, 255, 255));
		getContentPane().setBackground(new Color(210, 180, 140));
		setBounds(100, 100, 600, 511);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("Images/FriedRice.png"));
		lblNewLabel_1.setBounds(10, 0, 557, 460);
		contentPane.add(lblNewLabel_1);
	}
}
