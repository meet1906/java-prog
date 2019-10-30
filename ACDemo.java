/* Using an applet context, getCodeBase(),
and showDocument() to display an HTML file.
*/
import java.awt.*;
import java.applet.*;
import java.net.*;
/*
<applet code="ACDemo" width=300 height=50>
</applet>
*/
public class ACDemo extends Applet{
public void start() {
AppletContext ac = getAppletContext();
URL url = getCodeBase(); // get url of this applet
try {
ac.showDocument(new URL(url+"Test.html"));
} catch(MalformedURLException e) {
showStatus("URL not found");
}
}
}
/*a MalformedURLException is thrown either when “no legal protocol could be found in a specification string,
” or when “the string could not be parsed.” In practice, modern Java versions have particularly robust string 
parsing capabilities, so the vast majority of MalformedURLException occurrences will be due to the former problem: 
an invalid or unrecognized protocol. The parlance used in Java (and elsewhere) for terms like 
protocol can be a little confusing, so we’ll briefly refresh ourselves on what this means in the realm of URLs.*/