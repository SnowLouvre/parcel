
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Data {
	public static ArrayList<Sender> SenderList = new ArrayList<Sender>();
	public static ArrayList<Receiver> ReceiverList = new ArrayList<Receiver>();
	public static ArrayList<Parcel> ParcelList = new ArrayList<Parcel>();
	static boolean hasId(String s)
	{
		int n=SenderList.size();
		for(int i=0;i<n;i++)
			if(SenderList.get(i).Id.equals(s))
				return true;
		return false;
	}
	static boolean hasPhone(String s)
	{
		int n=SenderList.size();
		for(int i=0;i<n;i++)
			if(SenderList.get(i).phoneNumber.equals(s))
				return true;
		return false;
	}
	static Sender senderFindByPhone(String s)
	{
		int n=SenderList.size();
		for(int i=0;i<n;i++)
			if(SenderList.get(i).phoneNumber.equals(s))
				return SenderList.get(i);
		return null;
	}
	static Receiver receiverFindByPhone(String s)
	{
		int n=ReceiverList.size();
		for(int i=0;i<n;i++)
			if(ReceiverList.get(i).phoneNumber.equals(s))
				return ReceiverList.get(i);
		return null;
	}

	public static boolean isDouble(String str){
		if(str.isEmpty()) return false;
		boolean flg=true;
		for (int i = str.length() ; --i>=0 ; )
		{ 
			if(str.charAt ( i ) == '.')
			{
				if(flg)
					flg=false;
				else
					return false;
			}
			else if (!Character.isDigit(str.charAt ( i ))  )
			{
				return false;
			}
			
		}
		return true;
	}
	public static boolean isDigit(String str){
		if(str.isEmpty()) return false;
		for (int i = str.length() ; --i>=0 ; ){ 
		if (!Character.isDigit(str.charAt ( i ) ) )
			{
				return false;
			}
		}
		return true;
	}
	public static String randomString()
	{
		String result="";
		String chars = "abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<6;i++)
		{
			if((int)(Math.random()*2)==0)
			{
				result+=chars.charAt((int)(Math.random() * 26));
			}
			else
			{
				result=result+(int)(Math.random()*10);
			}
		}
		return result;
	}
	static void CheakMyParcel(Sender s)
	{
		s.CheakMyParcel();
	}
	static void CheakMyParcel(Receiver r)
	{
		r.CheakMyParcel();
	}
	static void attachParcel()
	{
		int n= ParcelList.size();
		for(int i=0;i<n;i++)
		{
			Parcel p = ParcelList.get(i);
			p.sender.par.add(p);
			p.receiver.par.add(p);
		}
	}
	public static void xiugaiMM(final Sender s)
	{
		final JFrame jFrame = new JFrame("修改密码");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setBounds(((int)dimension.getWidth() - 200) / 2, ((int)dimension.getHeight() - 300) / 2, 300, 200);
		jFrame.setResizable(false);
		jFrame.setLayout(null);
		//jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label0 = new JLabel("新密码:");
		label0.setBounds(10, 0, 100, 30);
		jFrame.add(label0);
		JLabel label1 = new JLabel("确认密码:");
		label1.setBounds(10, 30, 100, 30);
		jFrame.add(label1);
		JLabel label2 = new JLabel("验证码:");
		label2.setBounds(10, 60, 100, 30);
		jFrame.add(label2);
		JButton check = new JButton("修改密码");
		check.setBounds(100, 125, 60, 30);
		jFrame.add(check);
		final JPasswordField mm1 = new JPasswordField();
		mm1.setBounds(70, 05, 140, 25);
		jFrame.add(mm1);
		final JPasswordField mm2 = new JPasswordField();
		mm2.setBounds(70, 35, 140, 25);
		jFrame.add(mm2);
		final JTextField mm = new JTextField();
		mm.setBounds(70, 65, 140, 25);
		jFrame.add(mm);
		final JLabel yanzheng = new JLabel(Data.randomString());
		yanzheng.setBounds(220, 65, 60, 25);
		jFrame.add(yanzheng);
		check.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("deprecation")
				String mima1 =mm1.getText();
				@SuppressWarnings("deprecation")
				String mima2 = mm2.getText();
				String yanz = mm.getText();
				String YanZ = yanzheng.getText();
				if(yanz.equals(YanZ))
				{
					if(mima1.equals(mima2))
					{
						s.xiugaimm(mima1);
						JOptionPane.showMessageDialog(null, "密码修改成功！", "提示", JOptionPane.INFORMATION_MESSAGE);
						jFrame.setVisible(false);
					}
					else
						JOptionPane.showMessageDialog(null, "两次输入密码不一致！", "提示", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "验证码不正确！", "提示", JOptionPane.INFORMATION_MESSAGE);
					yanzheng.setText(Data.randomString());
				}
			}
			
		});
		jFrame.setVisible(true);
	}
}
