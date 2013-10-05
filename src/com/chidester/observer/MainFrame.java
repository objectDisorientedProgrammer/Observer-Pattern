package com.chidester.observer;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainFrame extends JFrame
{
	private static String frameTitle = "Observable";
	private static int frameWidth = 300;
	private static int frameHeight = 200;
	
	// GUI components
	JButton updateBtn;
	JTextField messageTF;
	
	public MainFrame()
	{
		super();
		setLocationRelativeTo(null);
		setTitle(frameTitle);
		setSize(frameWidth, frameHeight);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		messageTF = new JTextField(10);
		getContentPane().add(messageTF);
		
		updateBtn = new JButton("Update");
		getContentPane().add(updateBtn);
		
		setVisible(true);
	}
}
