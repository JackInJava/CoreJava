package notHelloWorld;

import javax.swing.JFrame;

/**
* Ramka zawierająca panel z komunikatem.
*/
class NotHelloWorldFrame extends JFrame
{
	public NotHelloWorldFrame()
	{
		add(new NotHelloWorldComponent());
		pack();
	}
}