package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class MyTcp extends JFrame{

	private BufferedReader reader;
	private PrintWriter writer;
	private ServerSocket server;
	private Socket socket;
	private JTextArea ta = new JTextArea();
	Container cc;
	private JTextField tf = new JTextField();
	JFrame frame = null;

	JTextPane textPane = null;

	File file = null;

	Icon image = null;

	void getserver(){
		try{
			server = new ServerSocket(8998);
			System.out.print("套接字");
			while (true){
				socket = server.accept();

				writer = new PrintWriter(socket.getOutputStream(),true);
				gui();
				getClientMessage();
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void insert(BufferedReader bufferedReader, AttributeSet attrSet) {
		Document doc = textPane.getDocument();
		StringBuffer str = null;
		str.append(bufferedReader);
		String s = str.toString();
		s = "\n" + s;
		try {
		doc.insertString(doc.getLength(), s, attrSet);
		}
		catch (BadLocationException e) {
		System.out.println("BadLocationException: " + e);
		}
		}
	public void setDocs(BufferedReader bufferedReader, Color col, boolean bold, int fontSize) {
		SimpleAttributeSet attrSet = new SimpleAttributeSet();
		StyleConstants.setForeground(attrSet, col);
		// 颜色
		if (bold == true) {
		StyleConstants.setBold(attrSet, true);
		}// 字体类型
		StyleConstants.setFontSize(attrSet, fontSize);
		// 字体大小
		// StyleConstants.setFontFamily(attrSet, "黑体");
		// 设置字体
		insert(bufferedReader, attrSet);
		}
	public void gui() {
		textPane.insertIcon(image);

		frame.getContentPane().add(textPane, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 300);
		frame.setVisible(true);
		while (true){
		try {
			setDocs(reader = new BufferedReader(new InputStreamReader(socket.getInputStream())), Color.red, false, 20);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

		}
	public MyTcp() {
		
		frame = new JFrame("JTextPane");
		textPane = new JTextPane();
		file = new File("./classes/test/icon.gif");
		image = new ImageIcon(file.getAbsoluteFile().toString());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
		getContentPane().add(scrollPane,BorderLayout.CENTER);
		
		scrollPane.setViewportView(textPane);
		cc = this.getContentPane();
		cc.add(tf,"South");
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				writer.println(tf.getText());
				ta.append("服务器："+tf.getText()+'\n');
				ta.setSelectionEnd(ta.getText().length());
				tf.setText("");
			}
		});
		
	}
	
	private void getClientMessage(){
		try{
			while(true){	
				ta.append("客户机："+reader.readLine()+'\n');
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
	
	public static void main(String[] args){
		MyTcp tcp = new MyTcp();
		tcp.setSize(200,200);
		tcp.setVisible(true);
		tcp.getserver();
	}
}
