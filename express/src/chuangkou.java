import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class chuangkou {


	public static void zhuce(){
		final JFrame sFrame = new JFrame("ע�����");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		sFrame.setBounds(((int)dimension.getWidth() - 200) / 2, ((int)dimension.getHeight() - 300) / 2, 250, 300);
		sFrame.setResizable(false);
		sFrame.setLayout(null);
		//sFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label1 = new JLabel("�û���");
		label1.setBounds(10, 10, 100, 30);
		sFrame.add(label1);
		JLabel label2 = new JLabel("����");
		label2.setBounds(10, 50, 100, 30);
		sFrame.add(label2);
		JLabel label3 = new JLabel("��ַ");
		label3.setBounds(10, 90, 100, 30);
		sFrame.add(label3);
		JLabel label4 = new JLabel("�ֻ���");
		label4.setBounds(10, 130, 100, 30);
		sFrame.add(label4);
		JLabel label5 = new JLabel("����");
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
		JButton button2 = new JButton("���ע��");
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
					 JOptionPane.showMessageDialog(null, "�����Ϣ��д��ȷ������д������", "��ʾ", JOptionPane.ERROR_MESSAGE);
					 id=name=adress=phone=passcode="";
				 }
				 else
				 {
					 if(Data.hasId(id))
						 JOptionPane.showMessageDialog(null, "���û�����ע�ᣡ", "��ʾ", JOptionPane.ERROR_MESSAGE);
					 else if(Data.hasPhone(phone))
						 JOptionPane.showMessageDialog(null, "���ֻ����ѱ�ʹ�ã�", "��ʾ", JOptionPane.ERROR_MESSAGE);
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
	final JFrame jFrame = new JFrame("��½����");
	Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	jFrame.setBounds(((int)dimension.getWidth() - 200) / 2, ((int)dimension.getHeight() - 300) / 2, 250, 200);
	jFrame.setResizable(false);
	jFrame.setLayout(null);
	jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel label1 = new JLabel("�û���/�ֻ���:");
	label1.setBounds(10, 60, 100, 30);
	jFrame.add(label1);
	JLabel label2 = new JLabel("����:");
	label2.setBounds(10, 90, 100, 30);
	jFrame.add(label2);
	JLabel label3 = new JLabel("��ӭ��������շ�ϵͳ");
	label3.setBounds(60, 0, 260, 30);
	jFrame.add(label3);
	final JTextField Id = new JTextField();
	Id.setBounds(90, 65, 140, 25);
	jFrame.add(Id);
	final JPasswordField mm = new JPasswordField();
	mm.setBounds(90, 95, 140, 25);
	jFrame.add(mm);
	JButton button1 = new JButton("��¼");
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
				JOptionPane.showMessageDialog(null, "��½�ɹ�", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
				jFrame.setVisible(false);
				  new Jiemian(s); 
			 } 
			else
			{JOptionPane.showMessageDialog(null, "�˺Ż��������", "��ʾ", JOptionPane.ERROR_MESSAGE);
			Id.setText("");
			mm.setText("");}}});
	jFrame.add(button1);
	JButton register = new JButton("ע��");
	register.setBounds(50, 125, 60, 30);
	register.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) 
		{
			 zhuce();
		}
	});
	jFrame.add(register);
	JButton quickCheck = new JButton("�ֻ���ݲ�ѯ");
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
		final JFrame jFrame = new JFrame("�ֻ����ٲ�ѯ����");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setBounds(((int)dimension.getWidth() - 200) / 2, ((int)dimension.getHeight() - 300) / 2, 300, 200);
		jFrame.setResizable(false);
		jFrame.setLayout(null);
		//jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label1 = new JLabel("�ֻ���:");
		label1.setBounds(10, 30, 100, 30);
		jFrame.add(label1);
		JLabel label2 = new JLabel("��֤��:");
		label2.setBounds(10, 60, 100, 30);
		jFrame.add(label2);
		JButton check = new JButton("��ѯ");
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
						JOptionPane.showMessageDialog(null, "����ȷ�����ֻ��ţ�", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "��֤�벻��ȷ��", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
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