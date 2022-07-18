package ShowFoodRecipe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class KungPaoChicken extends JFrame {

	private JPanel contentPane;
	public KungPaoChicken() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	    setTitle("KungPaoChicken");
	    setVisible(true);
	    setSize(650,550);
	    setResizable(false);
	    ImageIcon image = new ImageIcon("Images/HinaLogo.png");
	    setIconImage(image.getImage());
		setBackground(new Color(255, 255, 255));
		getContentPane().setBackground(new Color(210, 180, 140));
		setBounds(100, 100, 600, 511);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("Images/FriedRice.png"));
		lblNewLabel_1.setBounds(10, 10, 550, 384);
		contentPane.add(lblNewLabel_1);
	}
}
