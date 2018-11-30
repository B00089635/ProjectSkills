package projectSkills;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Gui extends JFrame {

	Gui()
  	{//opening frame

  		Container c = getContentPane();//creating content pane
		JPanel p = new JPanel();//creating panel

  		JLabel l = new JLabel("Project Skills");//creating label
		c.add(l, BorderLayout.NORTH);//displaying label at the top of frame and adding to content pane
		l.setFont(new Font("Calibri", Font.BOLD, 24));//sets font to calibri, bold and size 24
		l.setForeground(new Color(155, 89, 182));//setting font colour


		//making changes to button 1
		JButton b1 = new JButton("Add");//creating button
		p.add(b1, BorderLayout.LINE_START);//adding to panel and setting layout
		b1.setBackground(new Color(190, 144, 212));//changing button color
		b1.setFont(new Font("Calibri", Font.BOLD, 18));//sets font to calibri, bold and size 24
		b1.setForeground(new Color(247, 202, 24));//setting font colour

		//making changes to button 2
		JTextField t1;  
		t1=new JTextField("");  
		t1.setBounds(50,100, 200,30);		
		p.add(t1, BorderLayout.LINE_END);
		t1.setBackground(new Color(190, 144, 212));
		t1.setFont(new Font("Calibri", Font.BOLD, 18));//sets font to calibri, bold and size 24
		t1.setForeground(new Color(247, 202, 24));//setting font colour

		//making changes to button 3
		JButton b3 = new JButton("Remove");
		p.add(b3, BorderLayout.LINE_START);
		b3.setBackground(new Color(190, 144, 212));
		b3.setFont(new Font("Calibri", Font.BOLD, 18));//sets font to calibri, bold and size 24
		b3.setForeground(new Color(247, 202, 24));//setting font colour

		//making changes to button 4
		JTextField t2;  
		t2=new JTextField("");  
		t2.setBounds(50,100, 200,30);
		p.add(t2, BorderLayout.LINE_END);
		t2.setBackground(new Color(190, 144, 212));
		t2.setFont(new Font("Calibri", Font.BOLD, 18));//sets font to calibri, bold and size 24
		t2.setForeground(new Color(247, 202, 24));//setting font colour

		//making changes to button 5
		JButton b5 = new JButton("Search");
		p.add(b5, BorderLayout.LINE_START);
		b5.setBackground(new Color(190, 144, 212));
		b5.setFont(new Font("Calibri", Font.BOLD, 18));//sets font to calibri, bold and size 24
		b5.setForeground(new Color(247, 202, 24));//setting font colour

		//making changes to button 6
		JTextField t3;  
		t3=new JTextField("");  
		t3.setBounds(50,100, 200,30);
		p.add(t3, BorderLayout.LINE_END);
		t3.setBackground(new Color(190, 144, 212));
		t3.setFont(new Font("Calibri", Font.BOLD, 18));//sets font to calibri, bold and size 24
		t3.setForeground(new Color(247, 202, 24));//setting font colour

		//making changes to button 7
		JTextArea area=new JTextArea("Welcome to javatpoint");  
        area.setBounds(10,70, 200,200);  
        p.add(area); 
		p.add(area, BorderLayout.LINE_START);
		area.setBackground(new Color(190, 144, 212));
		area.setFont(new Font("Calibri", Font.BOLD, 18));//sets font to calibri, bold and size 24
		area.setForeground(new Color(247, 202, 24));//setting font colour

		p.setLayout(new GridLayout(0, 2, 150, 20));//setting layout of grid

		c.add(p);//adding panel
		c.setBackground(new Color(245, 215, 110));//changing content pane colour
		p.setBackground(new Color(155, 89, 182));//changing panel colour

		setSize(700, 475);//setting size
		setVisible(true);//setting visable
		setLocation(350, 175);//setting location to best centre

	}

	public void actionPerformed(ActionEvent e) {

	}


	public static void main(String[] args)//opening main to run programme
	{
		Gui test = new Gui();


	}
}
