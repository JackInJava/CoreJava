package notHelloWorld;

import javax.swing.*;
import java.awt.*;

/**
* @version 1.32 2007-06-12
* @author Cay Horstmann
*/
public class NotHelloWorld
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				JFrame frame = new NotHelloWorldFrame();
				frame.setTitle("NotHelloWorld");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}