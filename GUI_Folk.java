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

public class GUI_Folk 
{
	public void FolkGUI() 
	{ }
	public void initialize(String so1,String so2,String so3,String so4,String so5,String so6) throws Exception
	{
		JFrame frmFolkMusic;
		frmFolkMusic = new JFrame();
		frmFolkMusic.getContentPane().setBackground(Color.PINK);
		frmFolkMusic.setForeground(Color.YELLOW);
		frmFolkMusic.setBackground(Color.PINK);
		frmFolkMusic.setTitle("Folk Music");
		frmFolkMusic.setMinimumSize(new Dimension(650, 550));
		frmFolkMusic.setSize(new Dimension(665, 543));
		frmFolkMusic.setSize(631,430);
		frmFolkMusic.setBounds(100, 100, 450, 300);
		frmFolkMusic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFolkMusic.getContentPane().setLayout(null);
		frmFolkMusic.setVisible(true);

		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		panel.setMinimumSize(new Dimension(100, 100));
		panel.setBounds(10, 20, 616, 493);
		frmFolkMusic.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FOLK MUSIC! ");
		lblNewLabel.setBackground(new Color(253, 245, 230));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(243, 0, 128, 43);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Popular Tamil Folk Songs");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 32, 206, 17);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Popular English Folk Songs");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 168, 276, 32);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Popular Telugu Folk songs");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 305, 206, 17);
		panel.add(lblNewLabel_3);
		
		JButton img1 = new JButton("");
		img1.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\danga mari.jpeg"));
		img1.setBounds(21, 59, 45, 52);
		panel.add(img1);
		
		JButton img2 = new JButton("");
		img2.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\otha solala.jpeg"));
		img2.setBounds(21, 121, 45, 52);
		panel.add(img2);
		
		JButton img3 = new JButton("");
		img3.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\high and lonesome.jpeg"));
		img3.setBounds(21, 202, 45, 46);
		panel.add(img3);
		
		JButton img4 = new JButton("");
		img4.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\right on time.jpeg"));
		img4.setBounds(21, 258, 45, 45);
		panel.add(img4);
		
		JButton img5 = new JButton("");
		img5.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\saranga dariya.jpeg"));
		img5.setBounds(21, 329, 45, 48);
		panel.add(img5);
		
		JButton img6 = new JButton("");
		img6.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\silaka silaka.jpeg"));
		img6.setBounds(21, 387, 45, 56);
		panel.add(img6);
		
		JLabel s1 = new JLabel("Danga Maari Oodhari (From \"Anegan\")");
		s1.setForeground(Color.BLACK);
		s1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		s1.setBounds(76, 68, 265, 43);
		panel.add(s1);
		
		JLabel s2 = new JLabel("Ottha Sollala (From \"Area Boys\")");
		s2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		s2.setBounds(76, 124, 221, 43);
		panel.add(s2);
		
		JLabel s4 = new JLabel("Right on Time ( From \"In These Silent Days\")");
		s4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		s4.setBounds(76, 263, 315, 32);
		panel.add(s4);
		
		JLabel s3 = new JLabel("High and Lonesome ( From \" Raise the Roof\")");
		s3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		s3.setBounds(76, 210, 330, 32);
		panel.add(s3);
		
		JLabel s5 = new JLabel("Saranga Dariya (From \"Love Story\")");
		s5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		s5.setBounds(76, 329, 265, 48);
		panel.add(s5);
		
		JLabel s6 = new JLabel("Silaka Silaka (From \"Uppena\")");
		s6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		s6.setBounds(76, 396, 233, 34);
		panel.add(s6);
		
		songplay p = new songplay();

		
		JButton play1 = new JButton("");
		play1.addActionListener(new ActionListener() 
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
					p.play(so4);
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
					p.play(so1);
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
					p.play(so2);
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

