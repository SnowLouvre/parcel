import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class chuangkou {


	public static void zhuce(){
		final JFrame sFrame = new JFrame("注册界面");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		sFrame.setBounds(((int)dimension.getWidth() - 200) / 2, ((int)dimension.getHeight() - 300) / 2, 250, 300);
		sFrame.setResizable(false);
		sFrame.setLayout(null);
		//sFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label1 = new JLabel("用户名");
		label1.setBounds(10, 10, 100, 30);
		sFrame.add(label1);
		JLabel label2 = new JLabel("姓名");
		label2.setBounds(10, 50, 100, 30);
		sFrame.add(label2);
		JLabel label3 = new JLabel("地址");
		label3.setBounds(10, 90, 100, 30);
		sFrame.add(label3);
		JLabel label4 = new JLabel("手机号");
		label4.setBounds(10, 130, 100, 30);
		sFrame.add(label4);
		JLabel label5 = new JLabel("密码");
		label5.setBounds(10, 170, 100, 30);
		sFrame.add(label5);
		final JTextField Id = new JTextField();
		Id.setBounds(50, 15, 170, 25);
		sFrame.add(Id);
		final JTextField text2 = new JTextField();
		text2.setBounds(50, 55, 170, 25);
		sFrame.add(text2);
		final JTextField text3 = new JTextField();
		text3.setBounds(50, 95, 170, 25);
		sFrame.add(text3);
		final JTextField text4 = new JTextField();
		text4.setBounds(50, 135, 170, 25);
		sFrame.add(text4);
		final JPasswordField text5 = new JPasswordField();
		text5.setBounds(50, 175, 170, 25);
		sFrame.add(text5);
		JButton button2 = new JButton("完成注册");
		button2.setBounds(60, 220, 120, 30);
		button2.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) 
			{ 
				 String id,name,adress,phone,passcode;
				 id=Id.getText();
				 name=text2.getText();
				 adress=text3.getText();
				 phone=text4.getText();
				 passcode=text5.getText();
				 if(id.isEmpty() || name.isEmpty() || adress.isEmpty() || !Data.isDigit(phone) || passcode.isEmpty())
				 {
					 JOptionPane.showMessageDialog(null, "请把信息填写正确或者填写完整！", "提示", JOptionPane.ERROR_MESSAGE);
					 id=name=adress=phone=passcode="";
				 }
				 else
				 {
					 if(Data.hasId(id))
						 JOptionPane.showMessageDialog(null, "该用户名已注册！", "提示", JOptionPane.ERROR_MESSAGE);
					 else if(Data.hasPhone(phone))
						 JOptionPane.showMessageDialog(null, "该手机号已被使用！", "提示", JOptionPane.ERROR_MESSAGE);
					 else
					 {
						 Sender s = new Sender(id,passcode,name,adress,phone);
						 Data.SenderList.add(s);
						 sFrame.setVisible(false);
					 }
				 }
			}});
		sFrame.add(button2);
        
	    sFrame.setVisible(true);
			
		}	


	/*static void denglu(){
	final JFrame jFrame = new JFrame("登陆界面");
	Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	jFrame.setBounds(((int)dimension.getWidth() - 200) / 2, ((int)dimension.getHeight() - 300) / 2, 250, 200);
	jFrame.setResizable(false);
	jFrame.setLayout(null);
	jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel label1 = new JLabel("用户名/手机号:");
	label1.setBounds(10, 60, 100, 30);
	jFrame.add(label1);
	JLabel label2 = new JLabel("密码:");
	label2.setBounds(10, 90, 100, 30);
	jFrame.add(label2);
	JLabel label3 = new JLabel("欢迎来到快递收发系统");
	label3.setBounds(60, 0, 260, 30);
	jFrame.add(label3);
	final JTextField Id = new JTextField();
	Id.setBounds(90, 65, 140, 25);
	jFrame.add(Id);
	final JPasswordField mm = new JPasswordField();
	mm.setBounds(90, 95, 140, 25);
	jFrame.add(mm);
	JButton button1 = new JButton("登录");
	button1.setBounds(155, 125, 60, 30);
	button1.addActionListener(new ActionListener() 
	{
		@SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent e) 
		{
			 Sender s = null;
			 int i=0,n=Data.SenderList.size();
			 for(i=0;i<n;i++)
			 if( ( Data.SenderList.get(i).Id.equals(Id.getText()) && Data.SenderList.get(i).getPasscode().equals(mm.getText()) )
			  || ( Data.SenderList.get(i).phoneNumber.equals(Id.getText())  &&  Data.SenderList.get(i).phoneNumber.equals(Id.getText()) ) )
			 {
				 s=Data.SenderList.get(i);
				 break;
			 }
			 if(i<n)
			 {
				JOptionPane.showMessageDialog(null, "登陆成功", "提示", JOptionPane.INFORMATION_MESSAGE);
				jFrame.setVisible(false);
				  new Jiemian(s); 
			 } 
			else
			{JOptionPane.showMessageDialog(null, "账号或密码错误", "提示", JOptionPane.ERROR_MESSAGE);
			Id.setText("");
			mm.setText("");}}});
	jFrame.add(button1);
	JButton register = new JButton("注册");
	register.setBounds(50, 125, 60, 30);
	register.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) 
		{
			 zhuce();
		}
	});
	jFrame.add(register);
	JButton quickCheck = new JButton("手机快捷查询");
	quickCheck.setBounds(70, 30, 100, 30);
	quickCheck.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{ 
			QuickCheck();
		}
	});
	jFrame.add(quickCheck);
	jFrame.setVisible(true);
	}
	*/
	
	
	public static void QuickCheck()
	{
		final JFrame jFrame = new JFrame("手机快速查询界面");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setBounds(((int)dimension.getWidth() - 200) / 2, ((int)dimension.getHeight() - 300) / 2, 300, 200);
		jFrame.setResizable(false);
		jFrame.setLayout(null);
		//jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label1 = new JLabel("手机号:");
		label1.setBounds(10, 30, 100, 30);
		jFrame.add(label1);
		JLabel label2 = new JLabel("验证码:");
		label2.setBounds(10, 60, 100, 30);
		jFrame.add(label2);
		JButton check = new JButton("查询");
		check.setBounds(100, 125, 60, 30);
		jFrame.add(check);
		final JTextField Id = new JTextField();
		Id.setBounds(70, 35, 140, 25);
		jFrame.add(Id);
		final JTextField mm = new JTextField();
		mm.setBounds(70, 65, 140, 25);
		jFrame.add(mm);
		final JLabel yanzheng = new JLabel(Data.randomString());
		yanzheng.setBounds(220, 65, 60, 25);
		jFrame.add(yanzheng);
		check.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				String phone = Id.getText();
				String yanz = mm.getText();
				String YanZ = yanzheng.getText();
				if(yanz.equals(YanZ))
				{
					if(Data.isDigit(phone))
					{
						Receiver r = Data.receiverFindByPhone(phone);
						r.CheakMyParcel();
					}
					else
						JOptionPane.showMessageDialog(null, "情正确输入手机号！", "提示", JOptionPane.INFORMATION_MESSAGE);
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
	
	
   public static void main(String[] args)throws IOException {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (Exception e_myUIManager) {
			e_myUIManager.printStackTrace();
			}
		//database.connectDB();
		//database.daoru();
		//Data.attachParcel();
		new denglu();
	
}




}