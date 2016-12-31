
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

@SuppressWarnings("serial")
public class denglu extends JFrame{

	denglu() {
	Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	this.setBounds(((int)dimension.getWidth() - 200) / 2, ((int)dimension.getHeight() - 300) / 2, 250, 200);
	this.setResizable(false);
	this.setLayout(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel label1 = new JLabel("用户名/手机号:");
	label1.setBounds(10, 60, 100, 30);
	this.add(label1);
	JLabel label2 = new JLabel("密码:");
	label2.setBounds(10, 90, 100, 30);
	this.add(label2);
	JLabel label3 = new JLabel("欢迎来到快递收发系统");
	label3.setBounds(60, 0, 260, 30);
	this.add(label3);
	final JTextField Id = new JTextField();
	Id.setBounds(90, 65, 140, 25);
	this.add(Id);
	final JPasswordField mm = new JPasswordField();
	mm.setBounds(90, 95, 140, 25);
	this.add(mm);

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
			  || ( Data.SenderList.get(i).phoneNumber.equals(Id.getText())  &&  Data.SenderList.get(i).phoneNumber.equals(Id.getText())&&Data.SenderList.get(i).getPasscode().equals(mm.getText()) ) )
			 {
				 s=Data.SenderList.get(i);
				 break;
			 }
			 if(i<n)
			 {
				JOptionPane.showMessageDialog(null, "登陆成功", "提示", JOptionPane.INFORMATION_MESSAGE);
				setVisible(false);
				  new Jiemian(s); 
			 } 
			else
			{JOptionPane.showMessageDialog(null, "账号或密码错误", "提示", JOptionPane.ERROR_MESSAGE);
			Id.setText("");
			mm.setText("");}}});
	this.add(button1);
	JButton register = new JButton("注册");
	register.setBounds(50, 125, 60, 30);
	register.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) 
		{
			 chuangkou.zhuce();
		}
	});
	this.add(register);
	JButton quickCheck = new JButton("手机快捷查询");
	quickCheck.setBounds(70, 30, 100, 30);
	quickCheck.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{ 
			chuangkou.QuickCheck();
		}
	});
	add(quickCheck);
	ImagePanel ip=new ImagePanel();
	ip.setBounds(0,0,250,200);
    this.getContentPane().add(ip);
	setVisible(true);
	}
	protected void processWindowEvent(WindowEvent e) {  
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {  
			int index = JOptionPane.showConfirmDialog(this, "您好，您确定要关闭吗？",     "确认对话框", JOptionPane.YES_NO_OPTION,     JOptionPane.QUESTION_MESSAGE);   
			if (index == 0) {    
				database.daochu();
				//database.release();
				System.exit(0);  

			} 
		else {         			
		}  
		}
	}
}


