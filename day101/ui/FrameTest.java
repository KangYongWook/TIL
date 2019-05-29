package ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest extends WindowAdapter{ // �����쿡 �̺�Ʈó��
	Frame f;
	Button b;
	public FrameTest() {
		makeUi();
	}
	public void makeUi() {
		f = new Frame();
		b = new Button("Click");
		f.add(b);
		f.setSize(300,300);
		f.setVisible(true);
		f.addWindowListener(new MyWindow());//�����ӿ� �������̺�Ʈ�� �߻��ϸ� ()�� ó���Ѵ�.
		b.addActionListener(new ActionListener() {
			//��ϸӽ� Ŭ����
			@Override
			public void actionPerformed(ActionEvent e) {
				b.setBackground(Color.red); 
				
			}
		});
	}
	class MyWindow extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent arg0) {
			super.windowClosing(arg0);
			f.setVisible(false);
			System.exit(0);
			
		}
		
	}
	public static void main(String[] args) {
		new FrameTest();
	}
	
	

}
