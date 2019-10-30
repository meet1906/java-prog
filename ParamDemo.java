// Use Parameters
import java.awt.*;
import java.applet.*;
/*
<applet code="ParamDemo" width=300 height=80>
<param name=fontName value=Courier>
<param name=fontSize value=14>

</applet>
*/
public class ParamDemo extends Applet
{
	String fontName;
	int fontSize;
	

	// Initialize the string to be displayed.
	
	public void start() 
	{
	String param;
	fontName = getParameter("fontName");
	
	if(fontName == null)
	fontName = "Not Found";

	param = getParameter("fontSize");
	try {
			if(param != null) // if not found
				fontSize = Integer.parseInt(param);
			else
				fontSize = 0;
		} 
		catch(NumberFormatException e) 
		{
			fontSize = -1;
		}
		
	}//end of 5
		// Display parameters.
		public void paint(Graphics g) 
		{
			g.drawString("Font name: " + fontName, 0, 10);
			g.drawString("Font size: " + fontSize, 0, 26);
			
		}
}
