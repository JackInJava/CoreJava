package sizedFrame;

import java.awt.*;
import javax.swing.*;

/**
* @version 1.32 2007-04-14
* @author Cay Horstmann
*/
public class SizedFrameTest
{

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				JFrame frame = new SizedFrame();
				frame.setTitle("SizedFrame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}