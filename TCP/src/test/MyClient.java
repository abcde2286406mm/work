package test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class MyClient extends JFrame{

	private PrintWriter writer;
	private BufferedReader reader;
	Socket socket;
	private JTextArea ta = new JTextArea();
	private JTextField tf = new JTextField();
	Container cc;
	public MyClient(String title){
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cc = this.getContentPane();
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
		getContentPane().add(scrollPane,BorderLayout.CENTER);
		scrollPane.setViewportView(ta);
		cc.add(tf,"South");
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				writer.println(tf.getText());
				ta.append("客户机："+tf.getText()+'\n');
				ta.setSelectionEnd(ta.getText().length());
				tf.setText("");
			}
		});
	}
	private void connect(){
		ta.append("链接");
		try{
			socket = new Socket("127.0.0.1",8998);
			writer = new PrintWriter(socket.getOutputStream(),true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			ta.append("完成");
			getClientMessage();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	private void getClientMessage(){
		try{
			while(true){	
				ta.append("服务器："+reader.readLine()+'\n');
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			if(reader!= null){
				reader.close();
			}
			if(socket!= null){
				socket.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void main (String[] args){
		MyClient clien = new MyClient("向服务器发送数据");
		clien.setSize(200,200);
		clien.setVisible(true);
		clien.connect();

	}
}
