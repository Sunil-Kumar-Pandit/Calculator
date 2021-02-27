import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Calculator extends Applet implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
public void init()
{
setLayout(null);
setForeground(Color.red);
l1=new Label("Enter value");
l2=new Label("Enter value");
l3=new Label("Result");
t1=new TextField();
t2=new TextField();
t3=new TextField();
b1=new Button("Add(+)");
b2=new Button("Subtrect(-)");
b3=new Button("Multiply(*)");
b4=new Button("Divide(/)");
b5=new Button("Modulus(%)");
b6=new Button("Area(Rectangle/Square)");
b7=new Button("Area(Circle)");
b8=new Button("Area(Right Triangle)");
b9=new Button("Percent");
setBackground(new Color(0,0,0));
//set location
l1.setBounds(50,50,80,30);
l2.setBounds(50,100,80,30);
l3.setBounds(50,400,50,30);
t1.setBounds(150,50,150,30);
t2.setBounds(150,100,150,30);
t3.setBounds(150,400,150,30);
b1.setBounds(100,200,80,30);
b2.setBounds(200,200,80,30);
b3.setBounds(300,200,80,30);
b4.setBounds(400,200,80,30);
b5.setBounds(500,200,80,30);
b6.setBounds(150,250,150,30);
b7.setBounds(400,250,80,30);
b8.setBounds(200,300,120,30);
b9.setBounds(350,300,80,30);

//add label,textfield&button
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(l3);
add(t3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);

}
public void actionPerformed(ActionEvent e)
{
float a=Float.parseFloat(t1.getText());
float b=Float.parseFloat(t2.getText());
double c=0;
if(e.getSource()==b1)
c=a+b;
if(e.getSource()==b2)
c=a-b;
if(e.getSource()==b3)
c=a*b;
if(e.getSource()==b4)
c=a/b;
if(e.getSource()==b5)
c=a%b;
if(e.getSource()==b6)
c=a*b;
if(e.getSource()==b7)
c=3.14*(a*b);
if(e.getSource()==b8)
c=0.5*(a*b);
if(e.getSource()==b9)
c=(a/b)*100;
t3.setText(String.valueOf(c));
}
}
