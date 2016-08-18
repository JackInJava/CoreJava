package sizedFrame;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

class SizedFrame extends JFrame
{
	public SizedFrame()
	{
		// Sprawdzenie wymiar�w ekranu.
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		

		// Ustawienie szeroko�ci i wysoko�ci ramki oraz polecenie systemowi, aby ustali� jej po�o�enie.
		setSize(screenWidth / 2, screenHeight / 2);
		setLocationByPlatform(true);
		

		// Ustawienie ikony i tytu�u.
		Image img = new ImageIcon("img/Icon.png").getImage();
		setIconImage(img);
	}
}