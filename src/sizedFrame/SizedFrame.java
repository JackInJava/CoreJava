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
		// Sprawdzenie wymiarów ekranu.
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		

		// Ustawienie szerokoœci i wysokoœci ramki oraz polecenie systemowi, aby ustali³ jej po³o¿enie.
		setSize(screenWidth / 2, screenHeight / 2);
		setLocationByPlatform(true);
		

		// Ustawienie ikony i tytu³u.
		Image img = new ImageIcon("img/Icon.png").getImage();
		setIconImage(img);
	}
}