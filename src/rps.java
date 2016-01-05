import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class gom13 extends JFrame implements ActionListener
{
JButton b1,b2,b3;
JLabel l1,l2,l3,l4,l5;
int uscore=0,cscore=0;
int u,c=-1;
gom13()
{
setLayout(null);
l1=new JLabel("Rock,Paper,Scissors");
l1.setBounds(568,0,200,20);
l2=new JLabel("Click To Play");
l2.setBounds(280,80,500,20);
l3=new JLabel("Click To Play");
l3.setBounds(900,80,466,20);
add(l1);
add(l2);
add(l3);
b1=new JButton("Rock");
b1.setBounds(150,140,100,30);
add(b1);
b2=new JButton("Paper");
b2.setBounds(260,140,100,30);
add(b2);
b3=new JButton("Scissors");
b3.setBounds(370,140,100,30);
add(b3);
l4=new JLabel("USER SCORE: ");
l4.setBounds(20,350,200,30);
add(l4);
l5=new JLabel("CPU SCORE: ");
l5.setBounds(1200,350,166,30);
add(l5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent evt)
{
if(evt.getSource()==b1)
{
u=1;
c=go();
}
if(evt.getSource()==b2)
{
u=2;
c=go();
}
if(evt.getSource()==b3)
{
u=3;
c=go();
}
if(u==1 && (c==0||c==3||c==6))
{
l2.setText("USER: ROCK");
l3.setText("CPU: ROCK");
String str=String.valueOf(uscore);
l4.setText("USER SCORE: " +str);
str=String.valueOf(cscore);
l5.setText("CPU SCORE: " +str);
}
if(u==1 && (c==1||c==4||c==7))
{
l2.setText("USER: ROCK");
l3.setText("CPU: PAPER");
cscore++;
String str=String.valueOf(uscore);
l4.setText("USER SCORE: " +str);
str=String.valueOf(cscore);
l5.setText("CPU SCORE: " +str);
}
if(u==1 && (c==2||c==5||c==8))
{
l2.setText("USER: ROCK");
l3.setText("CPU: SCISSOR");
uscore++;
String str=String.valueOf(uscore);
l4.setText("USER SCORE: " +str);
str=String.valueOf(cscore);
l5.setText("CPU SCORE: " +str);
}
if(u==2 && (c==0||c==3||c==6))
{
l2.setText("USER: PAPER");
l3.setText("CPU: ROCK");
uscore++;
String str=String.valueOf(uscore);
l4.setText("USER SCORE: " +str);
str=String.valueOf(cscore);
l5.setText("CPU SCORE: " +str);
}
if(u==2 && (c==1||c==4||c==7))
{
l2.setText("USER: PAPER");
l3.setText("CPU: PAPER");
//uscore++;
String str=String.valueOf(uscore);
l4.setText("USER SCORE: " +str);
str=String.valueOf(cscore);
l5.setText("CPU SCORE: " +str);
}
if(u==2 && (c==2||c==5||c==8))
{
l2.setText("USER: PAPER");
l3.setText("CPU: SCISSORS");
cscore++;
String str=String.valueOf(uscore);
l4.setText("USER SCORE: " +str);
str=String.valueOf(cscore);
l5.setText("CPU SCORE: " +str);
}
if(u==3 && (c==0||c==3||c==6))
{
l2.setText("USER: SCISSORS");
l3.setText("CPU: ROCK");
cscore++;
String str=String.valueOf(uscore);
l4.setText("USER SCORE: " +str);
str=String.valueOf(cscore);
l5.setText("CPU SCORE: " +str);
}
if(u==3 && (c==1||c==4||c==7))
{
l2.setText("USER: SCISSORS");
l3.setText("CPU: PAPER");
uscore++;
String str=String.valueOf(uscore);
l4.setText("USER SCORE: " +str);
str=String.valueOf(cscore);
l5.setText("CPU SCORE: " +str);
}
if(u==3 && (c==2||c==5||c==8))
{
l2.setText("USER: SCISSORS");
l3.setText("CPU: SCISSORS");
//uscore++;
String str=String.valueOf(uscore);
l4.setText("USER SCORE: " +str);
str=String.valueOf(cscore);
l5.setText("CPU SCORE: " +str);
}
}
public int go()
{
Random rand=new Random();
int p=rand.nextInt(9);
return p;
}
public static void main(String args[])
{
gom13 br=new gom13();
br.setTitle("ROCK,PAPER,SCISSOR");
br.setVisible(true);
br.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
br.setSize(1366,768);
}
}