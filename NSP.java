import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NSP extends JApplet implements ActionListener {
  JTextField textField;
  JButton button;
  String s;
  public void init() { 
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());
    textField = new JTextField(20);
    contentPane.add(textField);
    button = new JButton("Click Me");
    contentPane.add(button);
    button.addActionListener(this);
  }


  public void actionPerformed(ActionEvent e) {
    s=textField.getText();
repaint();
  }
public void paint(Graphics g)
{
int i;
for(i=0;i<s.length();i++)
{
g.setFont(new Font("Arial",Font.BOLD,i+10));
g.drawString(s.substring(i,i+1),100,100+i*20);
}
}
}
