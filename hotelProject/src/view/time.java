/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
 
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
/**
 * 
 * @author wlw
 *
 */
public class time extends JFrame {
	/**
	 * ���л�
	 */
	private static final long serialVersionUID = 4408196785766662795L;
	// ��ʼ��ʾ
	private static final String INITIAL_LABEL_TEXT = "00:00:00 000";
	// �����߳� �ڲ���
	private CountingThread thread = new CountingThread();
	// ��ʱ����ʼʱ��
	private long progranStart = System.currentTimeMillis();
	// ��ʱ����ʼ״̬����ͣ��
	private long pauseStart = progranStart;
	// ��ʱ����ͣʱ��ʱ��
	private long pauseCount = 0;
	static JLabel lable2 = new JLabel(INITIAL_LABEL_TEXT);
	static JButton startPanuseButton = new JButton("��ʼ");
	static JButton resetButtone = new JButton("����");
	/**
	 * ��ͣ���߼����ļ�����
	 * 
	 */
	private ActionListener startPauseButtonListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (thread.stopped) {
				// ��ͣ��ʱ��=��ʼ��ʱ��-��ͣʱ����ʱ��+��ͣ��ʱ��
				pauseCount += (System.currentTimeMillis() - pauseStart);
				thread.stopped = false; // ֹͣ�����߳�����
				startPanuseButton.setText("��ͣ");// ����ʼ��ť�����ͣ��ť
			} else {
				pauseStart = System.currentTimeMillis();
				thread.stopped = true;
				startPanuseButton.setText("����");
			}
 
		}
	};
	// ����һ�����������������ʱ����
	private ActionListener resetButtonList = new ActionListener() {
 
		@Override
		public void actionPerformed(ActionEvent e) {
			pauseStart = progranStart; // ��ʼ��ʱ
			pauseCount = 0; // ��ͣ��ʱ������
			thread.stopped = true;// ������ʱ�߳�
			lable2.setText(INITIAL_LABEL_TEXT);// 00:00:00
			startPanuseButton.setText("��ʼ");
		}
	};
 
	/**
	 * �����һ�ڲ���:�����߳�,�����ܵ�ʱ��
	 * 
	 * @author soft01
	 *
	 */
	// ��ʱ���߳�
	class CountingThread extends Thread {
		/**
		 * ����һ��״̬���ж��Ƿ���(��ͣ������)��ʱ
		 */
		public boolean stopped = true;
 
		private CountingThread() {
			/**
			 * �����ػ��߳�(���߳̽���ʱ���ػ��߳�����)
			 */
			setDaemon(true);
		}
 
		@Override
		public void run() {
			while (true) {
				if (!stopped) {
					// ��ȥ��ʼ��ʱ���ȥ��ͣ��ʱ��
					long elapsed = System.currentTimeMillis() - progranStart - pauseCount;
					lable2.setText(Format(elapsed));
				}
				try {
					sleep(1);// ÿһ�����ˢ��һ��
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					// System.exit(0);�����˳�����������ִ�н����˳�
					// ����������˳�������˵���۳�������ִ����񣬶��˳�
					System.exit(1);
				}
			}
		}
         //ʱ��ת���ķ���? ?��ÿ��ˢ�µ�ֵ������ʱ����,�룬����
		private String Format(long elapsed) {
			int hour, minute, second, milli;// ����ʱ���֣������
			milli = (int) (elapsed % 1000);
			elapsed = elapsed / 1000;
 
			second = (int) (elapsed % 60);
			elapsed = elapsed / 60;
 
			minute = (int) (elapsed % 60);
			elapsed = elapsed / 60;
 
			hour = (int) (elapsed % 60);
			// %02d:%02d:%02d:%03d 00:00:00:000
			return String.format("%02d:%02d:%02d:%03d", hour, minute, second, milli);
		}
	}
 
	// ���췽��
	public time(String title) {
		super(title);
		// �Կ�ʼ����ͣ��ť��������
		startPanuseButton.addActionListener(startPauseButtonListener);
		// �����㰴ť��������
		resetButtone.addActionListener(resetButtonList);
		// ���������߳�
		thread.start();
	}
 
	public static void main(String[] args) throws InterruptedException {
		time frame = new time("ʱ��");
		JPanel panel = new JPanel();
		Font font = new Font("����", Font.BOLD, 30);
		/**
		 * ����ʱ���࣬�����ǰʱ��
		 */
		Timerto timer = new Timerto();
		/**
		 * ϵͳʱ���߳�
		 */
		Thread th = new Thread(timer);
		th.start();
		JLabel lable = new JLabel();
 
		// try {
		// UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		// } catch (Exception e) {
		// // TODO: handle exception
		// }
 
		panel.setLayout(null);// ��������Ĭ�ϲ��֣�ֻ��������ǩ�����ƶ�
		panel.setBackground(Color.red);
		lable.setBackground(Color.yellow);
		lable.setFont(font);
		lable.setOpaque(true);// ���Ʊ�ǩ��Ĭ�ϲ���
		lable.setBounds(200, 60, 330, 60); // ���ñ�ǩ��λ��
		lable2.setBackground(Color.yellow);
		lable2.setFont(font);
		lable2.setOpaque(true);// ���Ʊ�ǩ��Ĭ�ϲ���
		lable2.setBounds(200, 180, 330, 60);
		startPanuseButton.setBounds(200, 280, 90, 60);
		resetButtone.setBounds(400, 280, 90, 60);
		panel.add(startPanuseButton);
		panel.add(resetButtone);
		panel.add(lable); // �ѱ�ǩ���������
		panel.add(lable2);
		frame.add(panel); // �������뵽������ȥ
		frame.setSize(800, 400); // ���ô��ڵĿ��
		frame.setLocationRelativeTo(null);// ���ô���Ĭ���м�
		frame.setAlwaysOnTop(true);// ���ô�����Զ��ʾ����ǰ��
		frame.setResizable(false);// ���ô��ڲ��ܱ��޸�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		// frame.pack();
		/**
		 * ����ˢ�µ�ǰʱ��
		 */
		while (true) {
			lable.setText(timer.getCurrentTime());
		}
	}
 
}
 
/**
 * ����һ��Timerto��,�̳�Runnable ������ڵ�ʱ��
 * 
 * @author wlw
 *
 */
class Timerto implements Runnable {
	private String currentTime;
 
	// ��ȡ��ǰʱ��
	public String getCurrentTime() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  //yyyy-MM-dd hh:mm:ss
		currentTime = sdf.format(d);
		return currentTime;
                
	}
 
	/**
	 * ÿ��ˢ��һ��
	 */
	public void run() {
		try {
			Thread.sleep(1000);
			getCurrentTime();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}