

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.event.ActionListener;


public class simpleButtonAction extends Applet implements ActionListener {

    TextField t;
    Button b;
	Button b1;
	
    Label l;
    public void init() {
        // TODO start asynchronous download of heavy resources
        t=new TextField(20);
        b=new Button("click");
		b1=new Button("reset");
		l=new Label("label data");
        
        add(t);
        add(b);
        add(l);
		
        
        //Registration of source with listener
        
        b.addActionListener(this);
		b1.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
     t.setText("welcome to java class");
     l.setText("java Event Handling");
    }
	public void actionPerformed(ActionEvent a)
    {
     t.setText("");
     l.setText("");
    }
    // TODO overwrite start(), stop() and destroy() methods
}
