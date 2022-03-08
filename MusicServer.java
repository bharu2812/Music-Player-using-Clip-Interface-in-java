import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;


public class MusicServer
{
	static Socket socket;
	ServerSocket serverSocket;
	static DataOutputStream dos;
	static DataInputStream dis;
	static OutputStream outputStream;
	InputStream inputStream;


	MusicServer() throws Exception
	{
		serverSocket = new ServerSocket(13085);
		System.out.println("Sever socket bound!");
		socket = serverSocket.accept();
		System.out.println("Connection Established !");
		outputStream = socket.getOutputStream();
		inputStream = socket.getInputStream();
		dis=new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(outputStream);
	    String selected = dis.readUTF();
		System.out.println(selected+" is selected !");
		if(selected.equals("Pop Music"))
		{
			String psong1 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Pop songs\\Chellamma.wav";
			String psong2 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Pop songs\\Rowdy Baby.wav";
			String psong3 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Pop songs\\Let Me Love You.wav";
			String psong4 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Pop songs\\We Don't Talk Anymore.wav";
			String psong5 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Pop songs\\Ramuloo Ramulaa.wav";
			String psong6 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Pop songs\\Samajavaragamana.wav";
			dos.writeUTF(psong1);
			dos.writeUTF(psong2);
			dos.writeUTF(psong3);
			dos.writeUTF(psong4);
			dos.writeUTF(psong5);
			dos.writeUTF(psong6);
			System.out.println(dis.readUTF());
			String direc = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Pop songs";
			File directory = new File(direc);
			int fileCount = directory.list().length;
			System.out.println("File Count:"+fileCount);
			dos.writeUTF(Integer.toString(fileCount));
			dos.writeUTF("\n\nList of Files Received :\n"); 
			File[] files = new File(direc).listFiles();
			for (File filename : files) 
			{
				String Mfilename = filename.getName();
				dos.writeUTF(Mfilename);
				System.out.println(Mfilename+" sending...");
				String fullpath = direc+ "\\" + Mfilename;
				try 
				{
					File Mfilepath = new File(fullpath);
					AudioInputStream in;
					AudioInputStream ain=null;
					in = AudioSystem.getAudioInputStream(Mfilepath);
					System.out.println("Before :: " + in.available());
					AudioFormat baseFormat = in.getFormat();
					AudioFormat decodedFormat = new AudioFormat(AudioFormat.Encoding.PCM_UNSIGNED, baseFormat.getSampleRate(),8, baseFormat.getChannels(), baseFormat.getChannels(),baseFormat.getSampleRate(), false);
					ain = AudioSystem.getAudioInputStream(decodedFormat, in);
					System.out.println("After :: " + ain.available());
					if (ain != null) 
					{ 
						AudioSystem.write(ain, AudioFileFormat.Type.WAVE, outputStream);
					}
				} 
				catch (Exception e) 
				{
					System.out.println(e);
				}
			}
		}
		else if(selected.equals("Melody"))
		{
			String msong1 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Melody songs\\Visiri.wav";
			String msong2 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Melody songs\\Kadhaippoma.wav";
			String msong3 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Melody songs\\Stay.wav";
			String msong4 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Melody songs\\Closer.wav";
			String msong5 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Melody songs\\So So Ga.wav";
			String msong6 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Melody songs\\Inkem Inkem.wav";
			dos.writeUTF(msong1);
			dos.writeUTF(msong2);
			dos.writeUTF(msong3);
			dos.writeUTF(msong4);
			dos.writeUTF(msong5);
			dos.writeUTF(msong6);
			System.out.println(dis.readUTF());
			String direc = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Melody songs";
			File directory = new File(direc);
			int fileCount = directory.list().length;
			System.out.println("File Count:"+fileCount);
			dos.writeUTF(Integer.toString(fileCount));
			dos.writeUTF("\n\nList of Files Received :\n"); 
			File[] files = new File(direc).listFiles();
			for (File filename : files) 
			{
				String Mfilename = filename.getName();
				dos.writeUTF(Mfilename);
				System.out.println(Mfilename+" sending...");
				String fullpath = direc+ "\\" + Mfilename;
				try 
				{
					File Mfilepath = new File(fullpath);
					AudioInputStream in;
					AudioInputStream ain=null;
					in = AudioSystem.getAudioInputStream(Mfilepath);
					System.out.println("Before :: " + in.available());
					AudioFormat baseFormat = in.getFormat();
					AudioFormat decodedFormat = new AudioFormat(AudioFormat.Encoding.PCM_UNSIGNED, baseFormat.getSampleRate(),8, baseFormat.getChannels(), baseFormat.getChannels(),baseFormat.getSampleRate(), false);
					ain = AudioSystem.getAudioInputStream(decodedFormat, in);
					System.out.println("After :: " + ain.available());
					if (ain != null) 
					{ 
						AudioSystem.write(ain, AudioFileFormat.Type.WAVE, outputStream);
					}
				} 
				catch (Exception e) 
				{
					System.out.println(e);
				}
			}
		}		
		else if(selected.equals("Folk Music"))
		{
			String fsong1 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Folk songs\\High and Lonesome.wav";
			String fsong2 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Folk songs\\Right on Time.wav";
			String fsong3 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Folk songs\\Danga Maari Oodhari.wav";
			String fsong4 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Folk songs\\Otha Sollala.wav";
			String fsong5 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Folk songs\\saranga dariya.wav";
			String fsong6 = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Folk songs\\Silaka Silaka.wav";
			dos.writeUTF(fsong1);
			dos.writeUTF(fsong2);
			dos.writeUTF(fsong3);
			dos.writeUTF(fsong4);
			dos.writeUTF(fsong5);
			dos.writeUTF(fsong6);
			System.out.println(dis.readUTF());
			String direc = "C:\\Users\\Welcome\\Desktop\\Project\\Server\\Folk songs";
			File directory = new File(direc);
			int fileCount = directory.list().length;
			System.out.println("File Count:"+fileCount);
			dos.writeUTF(Integer.toString(fileCount));
			dos.writeUTF("\n\nList of Files Received :\n"); 
			File[] files = new File(direc).listFiles();
			for (File filename : files) 
			{
				String Mfilename = filename.getName();
				dos.writeUTF(Mfilename);
				System.out.println(Mfilename+" sending...");
				String fullpath = direc+ "\\" + Mfilename;
				try 
				{
					File Mfilepath = new File(fullpath);
					AudioInputStream in;
					AudioInputStream ain=null;
					in = AudioSystem.getAudioInputStream(Mfilepath);
					System.out.println("Before :: " + in.available());
					AudioFormat baseFormat = in.getFormat();
					AudioFormat decodedFormat = new AudioFormat(AudioFormat.Encoding.PCM_UNSIGNED, baseFormat.getSampleRate(),8, baseFormat.getChannels(), baseFormat.getChannels(),baseFormat.getSampleRate(), false);
					ain = AudioSystem.getAudioInputStream(decodedFormat, in);
					System.out.println("After :: " + ain.available());
					if (ain != null) 
					{ 
						AudioSystem.write(ain, AudioFileFormat.Type.WAVE, outputStream);
					}
				} 
				catch (Exception e) 
				{
					System.out.println(e);
				}
			}
		}
		socket.close();
		serverSocket.close();
	}
	public static void main(String args[])
	{
		try
		{
			new MusicServer();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
};

