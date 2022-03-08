import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.net.Socket;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MusicClient implements ActionListener
{
	JFrame frmMusicPlayer;
	final ButtonGroup buttonGroup = new ButtonGroup();
	JLabel lblNewLabel;
	JButton melody,folkmusic,popmusic;
	JPanel panel;
	Socket socket;
	DataOutputStream dos;
	DataInputStream dis;
	OutputStream outputStream;
	BufferedInputStream inputStream;
	public MusicClient() throws Exception 
	{
		socket = new Socket("localhost",13085);
		outputStream = socket.getOutputStream();
		inputStream = new BufferedInputStream(socket.getInputStream());
		dos = new DataOutputStream(outputStream);
		dis = new DataInputStream(socket.getInputStream());
		frmMusicPlayer = new JFrame();
		frmMusicPlayer.setBackground(new Color(255, 255, 255));
		frmMusicPlayer.setTitle("Music Player");
		frmMusicPlayer.setBounds(100, 100, 378, 385);
		frmMusicPlayer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMusicPlayer.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(165, 42, 42));
		panel.setBounds(0, 0, 351, 358);
		frmMusicPlayer.getContentPane().add(panel);
		panel.setLayout(null);
			
		lblNewLabel = new JLabel("The Unexpected Paradise !!!");
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 239, 213));
		lblNewLabel.setBackground(new Color(255, 239, 213));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel.setBounds(-24, 10, 421, 62);
			
		folkmusic = new JButton(" FOLK MUSIC");
		folkmusic.setHorizontalAlignment(SwingConstants.LEADING);
		folkmusic.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\folk.jpg"));
		folkmusic.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		folkmusic.setBounds(54, 67, 222, 62);
		panel.add(folkmusic);
		folkmusic.addActionListener(this);

		popmusic = new JButton(" POP MUSIC");
		popmusic.setHorizontalAlignment(SwingConstants.LEADING);
		popmusic.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\popmusic.jpg"));
		popmusic.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		popmusic.setBounds(54, 139, 222, 62);
		panel.add(popmusic);
		popmusic.addActionListener(this);
			
		melody = new JButton(" MELODY");
		melody.setHorizontalAlignment(SwingConstants.LEADING);
		melody.setIcon(new ImageIcon("C:\\Users\\Welcome\\Downloads\\Images music player\\melody.jPEG"));
		melody.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		melody.setBounds(54, 213, 222, 62);
		panel.add(melody);
		melody.addActionListener(this);

		frmMusicPlayer.setVisible(true);
    }
	public void actionPerformed(ActionEvent e)
	{
        try
		{
			if (e.getSource() == popmusic)
			{
				String selected = "Pop Music";
				dos.writeUTF(selected);
				String psong1 = dis.readUTF();
				String psong2 = dis.readUTF();
				String psong3 = dis.readUTF();
				String psong4 = dis.readUTF();
				String psong5 = dis.readUTF();
				String psong6 = dis.readUTF();
				dos.writeUTF("Songs are being sent ! ");
				String filecount = dis.readUTF();
				int fcount = Integer.parseInt(filecount);
				System.out.println(dis.readUTF());
				for (int i=1; i<=fcount;i++)
				{
					String songname = dis.readUTF();
					System.out.println(songname);
					try 
					{
						AudioInputStream ais = AudioSystem.getAudioInputStream(inputStream);
						File fout = new File("C:\\Users\\Welcome\\Desktop\\Project\\Client\\Downloaded_Music\\"+songname);
						AudioSystem.write(ais, AudioFileFormat.Type.WAVE,fout);
		            }
		            catch(Exception e1) 
					{
						System.out.println(e1);
		            } 
				}
				frmMusicPlayer.setVisible(false);
				GUI_Pop p = new GUI_Pop();
				p.initialize(psong1,psong2,psong3,psong4,psong5,psong6);
			}
			else if(e.getSource() == melody)
			{
				String selected = "Melody";
				dos.writeUTF(selected);
				String msong1 = dis.readUTF();
				String msong2 = dis.readUTF();
				String msong3 = dis.readUTF();
				String msong4 = dis.readUTF();
				String msong5 = dis.readUTF();
				String msong6 = dis.readUTF();
				dos.writeUTF("Songs are being sent ! ");
				String filecount = dis.readUTF();
				int fcount = Integer.parseInt(filecount);
				System.out.println(dis.readUTF());
				for (int i=1; i<=fcount;i++)
				{
					String songname = dis.readUTF();
					System.out.println(songname);
					try 
					{
						AudioInputStream ais = AudioSystem.getAudioInputStream(inputStream);
						File fout = new File("C:\\Users\\Welcome\\Desktop\\Project\\Client\\Downloaded_Music\\"+songname);
						AudioSystem.write(ais, AudioFileFormat.Type.WAVE,fout);
		            }
		            catch(Exception e1) 
					{
						System.out.println(e1);
		            } 
				}
				frmMusicPlayer.setVisible(false);
				GUI_Melody m = new GUI_Melody();
				m.initialize(msong1,msong2,msong3,msong4,msong5,msong6);
			}
			else if(e.getSource() == folkmusic)
			{
				String selected = "Folk Music";
				dos.writeUTF(selected);
				String fsong1 = dis.readUTF();
				String fsong2 = dis.readUTF();
				String fsong3 = dis.readUTF();
				String fsong4 = dis.readUTF();
				String fsong5 = dis.readUTF();
				String fsong6 = dis.readUTF();
				dos.writeUTF("Songs are being sent ! ");
				String filecount = dis.readUTF();
				int fcount = Integer.parseInt(filecount);
				System.out.println(dis.readUTF());
				for (int i=1; i<=fcount;i++)
				{
					String songname = dis.readUTF();
					System.out.println(songname);
					try 
					{
						AudioInputStream ais = AudioSystem.getAudioInputStream(inputStream);
						File fout = new File("C:\\Users\\Welcome\\Desktop\\Project\\Client\\Downloaded_Music\\"+songname);
						AudioSystem.write(ais, AudioFileFormat.Type.WAVE,fout);
		            }
		            catch(Exception e1) 
					{
						System.out.println(e1);
		            } 
				}
				frmMusicPlayer.setVisible(false);
				GUI_Folk f = new GUI_Folk();
				f.initialize(fsong1,fsong2,fsong3,fsong4,fsong5,fsong6);
			}
			socket.close();
		}
	   catch(Exception ae)
	    {
	    	System.out.println(ae);
		}
	}
    public static void main(String args[])
	{
		try
		{
			@SuppressWarnings("unused")
			MusicClient c = new MusicClient();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
};

