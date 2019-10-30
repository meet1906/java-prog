// Using the Status Window.
import java.awt.*;
import java.applet.*;
/*
<applet code="StatusWindow" width=300 height=50>
</applet>
*/
public class StatusWindow extends Applet{
public void init() {
setBackground(Color.orange);
}
// Display msg in applet window.
public void paint(Graphics g) {
g.drawString("This is in the applet window.", 10, 20);
showStatus("This is shown in the status window.");
}
}
/*an applet can also output a message
to the status window of the browser or applet viewer on which it is running.
 To do so, call showStatus( )with the string that you want displayed.
 The status window is a good place to give the user feedback about 
 what is occurring in the applet, suggest options, or possibly
report some types of errors*/