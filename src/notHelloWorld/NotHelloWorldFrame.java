package notHelloWorld;

import javax.swing.JFrame;

/**
* Ramka zawieraj�ca panel z komunikatem.
*/
class NotHelloWorldFrame extends JFrame
{
	public NotHelloWorldFrame()
	{
		add(new NotHelloWorldComponent());
		pack();
	}
}