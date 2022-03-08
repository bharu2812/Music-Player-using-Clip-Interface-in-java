import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GUI_Melody 
{
	JFrame frmFolkMusic;
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					GUI_Melody window = new GUI_Melody();
					window.frmFolkMusic.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	public GUI_Melody() 
	{ }

	public void initialize(String so1,String so2,String so3,String so4,String so5,String so6) throws Exception
	{
		JFrame frmMelody;
		frmMelody = new JFrame();
		frmMelody.getContentPane().setBackground(new Color(255, 218, 185));
		frmMelody.setForeground(Color.YELLOW);
		frmMelody.setBackground(new Color(255, 218, 185));
		frmMelody.setTitle("Melody ");
		frmMelody.setMinimumSize(new Dimension(650, 550));
		frmMelody.setSize(new Dimension(665, 543));
		frmMelody.setSize(631,430);
		frmMelody.setBounds(100, 100, 450, 300);
		frmMelody.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMelody.getContentPane().setLayout(null);
		frmMelody.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 218, 185));
		panel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		panel.setMinimumSize(new Dimension(100, 100));
		panel.setBounds(10, 20, 616, 493);
		frmMelody.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MELODY !! ");
		lblNewLabel.setBackground(new Color(253, 245, 230));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(243, 0, 163, 49);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Popular Tamil Melody Songs");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 32, 206, 17);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Popular English Melody Songs");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 168, 276, 32);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Popular Telugu Melody songs");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 305, 254, 17);
		panel.add(lblNewLabel_3);
		
		JButton img1 = new JButton("");
		img1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		img1.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\visiri.jpg"));
		img1.setBounds(20, 59, 45, 45);
		panel.add(img1);
		
		JButton img2 = new JButton("");
		img2.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\kadhaipoma.jpeg"));
		img2.setBounds(21, 121, 45, 45);
		panel.add(img2);
		
		JButton img3 = new JButton("");
		img3.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\stay.jpeg"));
		img3.setBounds(21, 202, 45, 46);
		panel.add(img3);
		
		JButton img4 = new JButton("");
		img4.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\closer.jpeg"));
		img4.setBounds(21, 258, 45, 45);
		panel.add(img4);
		
		JButton img5 = new JButton("");
		img5.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\so-so-ga.jpeg"));
		img5.setBounds(21, 329, 45, 48);
		panel.add(img5);
		
		JButton img6 = new JButton("");
		img6.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\inkem-inkem.jpeg"));
		img6.setBounds(21, 387, 45, 56);
		panel.add(img6);
		
		
		
		JLabel s1 = new JLabel("Visiri (From \"Enai Noki Paayum Thota\")");
		s1.setForeground(Color.BLACK);
		s1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		s1.setBounds(76, 68, 265, 43);
		panel.add(s1);
		
		JLabel s2 = new JLabel("Kadhaippoma (From \"Oh My Kadavule\")");
		s2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		s2.setBounds(76, 124, 299, 43);
		panel.add(s2);
		
		JLabel s4 = new JLabel("Closer(From \"Collage\")");
		s4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		s4.setBounds(70, 263, 353, 32);
		panel.add(s4);
		
		JLabel s3 = new JLabel("Stay ( By \"Justin Bieber\")");
		s3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		s3.setBounds(76, 210, 330, 32);
		panel.add(s3);
		
		JLabel s5 = new JLabel("So So Ga (From \"Manchi Rojulochaie\")");
		s5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		s5.setBounds(76, 329, 315, 48);
		panel.add(s5);
		
		JLabel s6 = new JLabel("Inkem Inkem (From \" Geetha Govindam\")");
		s6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		s6.setBounds(76, 396, 315, 34);
		panel.add(s6);
		
		songplay p = new songplay();

		JButton play1 = new JButton("");
		play1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					p.play(so1);
				}
				catch(Exception da)
				{
					System.out.println(da);
				}
				
			}
		});
		play1.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\PLAYBLACK.png"));
		play1.setBounds(401, 68, 45, 45);
		panel.add(play1);
		
		JButton play2 = new JButton("");
		play2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					p.play(so2);
				}
				catch(Exception da)
				{
					System.out.println(da);
				}				
			}
		});
		play2.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\PLAYBLACK.png"));
		play2.setBounds(401, 128, 45, 45);
		panel.add(play2);
		
		JButton play3 = new JButton("");
		play3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					p.play(so3);
				}
				catch(Exception da)
				{
					System.out.println(da);
				}
			}
		});
		play3.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\PLAYBLACK.png"));
		play3.setBounds(401, 206, 45, 45);
		panel.add(play3);
		
		JButton play4 = new JButton("");
		play4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					p.play(so4);
				}
				catch(Exception da)
				{
					System.out.println(da);
				}
			}
		});
		play4.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\PLAYBLACK.png"));
		play4.setBounds(401, 261, 45, 45);
		panel.add(play4);
		
		JButton play5 = new JButton("");
		play5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					p.play(so5);
				}
				catch(Exception da)
				{
					System.out.println(da);
				}
			}
		});
		play5.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\PLAYBLACK.png"));
		play5.setBounds(401, 334, 45, 45);
		panel.add(play5);
		
		JButton play6 = new JButton("");
		play6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					p.play(so6);
				}
				catch(Exception da)
				{
					System.out.println(da);
				}
			}
		});
		play6.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\PLAYBLACK.png"));
		play6.setBounds(401, 387, 45, 45);
		panel.add(play6);
		
		JButton stop1 = new JButton("");
		stop1.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\outline_stop_black_24dp.png"));
		stop1.setBounds(456, 68, 45, 45);
		panel.add(stop1);
		stop1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					p.stop();
				}
				catch(Exception da)
				{
					System.out.println(da);
				}
				
			}
		});
		
		JButton stop2 = new JButton("");
		stop2.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\outline_stop_black_24dp.png"));
		stop2.setBounds(456, 128, 45, 45);
		panel.add(stop2);
		stop2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					p.stop();
				}
				catch(Exception da)
				{
					System.out.println(da);
				}
				
			}
		});
		
		JButton stop3 = new JButton("");
		stop3.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\outline_stop_black_24dp.png"));
		stop3.setBounds(456, 206, 45, 45);
		panel.add(stop3);
		stop3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					p.stop();
				}
				catch(Exception da)
				{
					System.out.println(da);
				}
				
			}
		});
		
		JButton stop4 = new JButton("");
		stop4.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\outline_stop_black_24dp.png"));
		stop4.setBounds(456, 261, 45, 45);
		panel.add(stop4);
		stop4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					p.stop();
				}
				catch(Exception da)
				{
					System.out.println(da);
				}
				
			}
		});
		
		JButton stop5 = new JButton("");
		stop5.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\outline_stop_black_24dp.png"));
		stop5.setBounds(456, 334, 45, 45);
		panel.add(stop5);
		stop5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					p.stop();
				}
				catch(Exception da)
				{
					System.out.println(da);
				}
				
			}
		});
		
		JButton stop6 = new JButton("");
		stop6.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\outline_stop_black_24dp.png"));
		stop6.setBounds(456, 387, 45, 45);
		panel.add(stop6);
		stop6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					p.stop();
				}
				catch(Exception da)
				{
					System.out.println(da);
				}
				
			}
		});
	}
}

