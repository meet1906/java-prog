import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Frame extends JFrame implements ActionListener{
   
    private JButton jb;
    
    Frame()
    {
        setTitle("JFrame.DO_NOTHING_ON_CLOSE");
        setLayout(new FlowLayout());
        setButton();
        setAction();
        setSize(700, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    private void setButton()
    {
        jb = new JButton("Close Frame");
        add(jb);
    }
    
    private void setAction()
    {
        jb.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent eve)
    {
        dispose();
    }
}

public class Javaapp {
   
    public static void main(String[] args) {
        
       Frame fr = new Frame();
    }
}