package ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest extends WindowAdapter{ // 윈도우에 이벤트처리
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
		f.addWindowListener(new MyWindow());//프레임에 윈도우이벤트가 발생하면 ()가 처리한다.
		b.addActionListener(new ActionListener() {
			//어나니머스 클래스
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
