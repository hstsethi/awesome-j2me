// This is just a sample code to register this repository as a Java repository for SEO and curating purposes. The main content is all in readme.

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

public class HelloMIDlet extends MIDlet {
	private Display display;
	private Form helloFrm;

	public HelloMIDlet() {
		helloFrm = new Form("Welcome To Awesome J2ME!");
	}

	protected void startApp() {
		display = Display.getDisplay(this);
		display.setCurrent(helloFrm);
	}

	protected void pauseApp() {
	}

	protected void destroyApp(boolean unconditional) {
	}
}
