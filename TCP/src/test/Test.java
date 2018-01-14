package test;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.*;
import java.io.*;

public class Test  extends JFrame{
JFrame frame = null;
private BufferedReader reader;
private PrintWriter writer;
JTextPane textPane = null;

File file = null;

Icon image = null;
Container cc;
private JTextField tf = new JTextField();

public Test() {
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
		try {
			((Appendable) textPane).append("服务器："+tf.getText()+'\n');
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		textPane.setSelectionEnd(textPane.getText().length());
		tf.setText("");
	}
});
}//显示方框

public void insert(String str, AttributeSet attrSet) {
Document doc = textPane.getDocument();
str = "\n" + str;
try {
doc.insertString(doc.getLength(), str, attrSet);
}
catch (BadLocationException e) {
System.out.println("BadLocationException: " + e);
}
}

public void setDocs(String str, Color col, boolean bold, int fontSize) {
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
insert(str, attrSet);
}

public void gui() {
textPane.insertIcon(image);

frame.getContentPane().add(textPane, BorderLayout.CENTER);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(200, 300);
frame.setVisible(true);
setDocs("第一行的文字", Color.red, false, 20);
setDocs("第二行的文字", Color.BLACK, true, 25);
setDocs("第三行的文字", Color.BLUE, false, 20);
}

public static void main(String[] args) {
Test test = new Test();
test.gui();
}
}
