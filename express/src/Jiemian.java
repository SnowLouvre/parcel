
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class Jiemian extends JFrame implements ActionListener  
{ 

	Sender sender=null;
	private static final long serialVersionUID = 5715508795295392827L;
JMenuBar mb = new JMenuBar(); 
 JMenu     ManaSystem,Queryparcel,parcelIn,Deleteparcel,Scaneparcel,gaiMima,GetHelp; 
 JMenuItem outsystem,lookupmyparcel,lookUpRecParcel,lookUpMyHisParcel,lookUpRecHisParcel,addparcel,addparcel2,dropparcel,glareparcel,changemima, 
 		   zuoZheItem,aboutsystem,lentparcel,usehelp,userlook,background,
 		   zhuomian1, zhuomian2,zhuomian3,zhuomian4,Calendar; 
 JMenu     backcolor;  
 JPanel jp=new JPanel(); 
 Container cp=getContentPane(); 
    String username; 
Jiemian (){} 
    Jiemian(Sender s) 
 {  
    	sender=s;
  cp.add(mb,"North"); 
  ManaSystem=new JMenu("系统管理(S)"); 
  ManaSystem.setMnemonic('S'); 
  parcelIn=new JMenu("快递收发(B)"); 
  parcelIn.setMnemonic('B'); 
  Queryparcel=new JMenu("快递查询(L)"); 
  Queryparcel.setMnemonic('L'); 
  Deleteparcel=new JMenu("快递管理(M)"); 
  Deleteparcel.setMnemonic('M'); 
        gaiMima=new JMenu("用户管理(U)"); 
        gaiMima.setMnemonic('U'); 
        GetHelp=new JMenu("帮助(H)"); 
        GetHelp.setMnemonic('H'); 
        backcolor=new JMenu("更改主题(C)"); 
        backcolor.setMnemonic('C'); 
        background=new JMenuItem("更改主题"); 
        zhuomian1=new JMenuItem("经典素白"); 
        zhuomian2=new JMenuItem("水墨轻灰"); 
        zhuomian3=new JMenuItem("睿智深灰"); 
        zhuomian4=new JMenuItem("黑色宇宙"); 
        background.add(backcolor); 
        backcolor.add(zhuomian1); 
        backcolor.add(zhuomian2); 
        backcolor.add(zhuomian3); 
        backcolor.add(zhuomian4); 
        backcolor.setMnemonic('C'); 
        outsystem=new JMenuItem("退出系统(O)"); 
        outsystem.setMnemonic('O'); 
        lookupmyparcel=new JMenuItem("查询发出快递(L)"); 
        lookupmyparcel.setMnemonic('L'); 
        lookUpRecParcel=new JMenuItem("查询接收快递(X)"); 
        lookUpRecParcel.setMnemonic('X'); 
        lookUpMyHisParcel=new JMenuItem("查询发出已签收快递(F)");
        lookUpMyHisParcel.setMnemonic('F'); 
        lookUpRecHisParcel=new JMenuItem("查询接收已签收快递(Y)");
        lookUpRecHisParcel.setMnemonic('Y'); 
        addparcel=new JMenuItem("收取快递(N)"); 
        addparcel.setMnemonic('N'); 
        addparcel2=new JMenuItem("发送快递(M)"); 
        addparcel2.setMnemonic('M'); 
        dropparcel=new JMenuItem("编号管理(D)"); 
        dropparcel.setMnemonic('D'); 
        lentparcel=new JMenuItem("物流管理"); 
        changemima=new JMenuItem("修改密码(C)"); 
        changemima.setMnemonic('C'); 
        userlook=new JMenuItem("用户查询"); 
        Calendar=new JMenuItem("管理日志");         
        zuoZheItem=new JMenuItem("关于作者"); 
        aboutsystem=new JMenuItem("关于系统"); 
        usehelp=new JMenuItem("使用指南"); 
        ManaSystem.add(backcolor); 
        ManaSystem.add(outsystem); 
        Queryparcel.add(lookupmyparcel); 
        Queryparcel.add(lookUpRecParcel); 
        Queryparcel.add(lookUpMyHisParcel);
        Queryparcel.add(lookUpRecHisParcel);
        parcelIn.add(addparcel); 
        parcelIn.add(addparcel2); 
        Deleteparcel.add(dropparcel); 
        Deleteparcel.add(lentparcel); 
        gaiMima.add(changemima); 
        gaiMima.add(userlook); 
        gaiMima.add(Calendar); 
        GetHelp.add(zuoZheItem); 
        GetHelp.add(aboutsystem); 
        GetHelp.add(usehelp); 
        //backcolor.addActionListener(this); 
        zhuomian1.addActionListener(this); 
        zhuomian2.addActionListener(this); 
        zhuomian3.addActionListener(this); 
        zhuomian4.addActionListener(this); 
        outsystem.addActionListener(this); 
        lookupmyparcel.addActionListener(this); 
        lookUpRecParcel.addActionListener(this); 
        lookUpMyHisParcel.addActionListener(this);
        lookUpRecHisParcel.addActionListener(this);
        addparcel.addActionListener(this); 
        dropparcel.addActionListener(this); 
        changemima.addActionListener(this); 
        Calendar.addActionListener(this); 
        userlook.addActionListener(this); 
        zuoZheItem.addActionListener(this); 
        aboutsystem.addActionListener(this);
        addparcel2.addActionListener(this);
        usehelp.addActionListener(this); 
        mb.add(ManaSystem); 
  mb.add(parcelIn); 
  mb.add(Queryparcel); 
  mb.add(Deleteparcel); 
  mb.add(gaiMima); 
  mb.add(GetHelp); 
  jp.setLayout(new BorderLayout()); 
        JLabel label1 = new JLabel(); 
  jp.add(label1); 
        JLabel  JL=new JLabel("<html><font color=#4F4F4F size='14'><i>为您服务<br><hr>" +"您的满意是我们最大的幸福<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + 
        "</i></font>",SwingConstants.CENTER); 
     jp.add(JL); 
  JLabel label2 = new JLabel("<html><i>Java第十八组<i>"); 
  jp.add(label2,"South"); 
  JScrollPane scrollpane=new JScrollPane(jp); 
  ImagePanel2 ip=new ImagePanel2();
	ip.setBounds(700,0,400,650);
  this.getContentPane().add(ip);
 cp.add(scrollpane); 
  setTitle("欢迎登陆快递收发与追踪系统"); 
  jp.setBackground(Color.lightGray); 
   setSize(1100,600);     
  setVisible(true); 
  //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 } 

	static void post(final Sender s){ 
		final JFrame sFrame = new JFrame("发送快递");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		sFrame.setBounds(((int)dimension.getWidth() - 200) / 2, ((int)dimension.getHeight() - 300) / 2, 320, 600);
		sFrame.setResizable(false);
		sFrame.setLayout(null);
		//sFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label1 = new JLabel("请输入收件人的各项信息：");
		label1.setBounds(10, 10, 200, 30);
		sFrame.add(label1);
		JLabel label2 = new JLabel("请输入收件人姓名：");
		label2.setBounds(10, 90, 200, 30);
		sFrame.add(label2);
		JLabel label3 = new JLabel("请输入收件人地址：");
		label3.setBounds(10, 170, 200, 30);
		sFrame.add(label3);
		JLabel label4 = new JLabel("请输入收件人手机号：");
		label4.setBounds(10, 250, 200, 30);
		sFrame.add(label4);
		JLabel label5 = new JLabel("请输入包裹重量：");
		label5.setBounds(10, 330, 200, 30);
		sFrame.add(label5);
		JLabel label6 = new JLabel("请输入运输距离：");
		label6.setBounds(10, 410, 200, 30);
		sFrame.add(label6);
		//final JTextField Id = new JTextField();
		//Id.setBounds(10, 55, 270, 25);
		//sFrame.add(Id);
		final JTextField name = new JTextField();
		name.setBounds(10, 135, 270, 25);
		sFrame.add(name);
		final JTextField adr = new JTextField();
		adr.setBounds(10, 215, 270, 25);
		sFrame.add(adr);
		final JTextField phone = new JTextField();
		phone.setBounds(10, 295, 270, 25);
		sFrame.add(phone);
		final JTextField weight = new JTextField();
		weight.setBounds(10, 375, 270, 25);
		sFrame.add(weight);
		final JTextField dis = new JTextField();
		dis.setBounds(10, 455, 270, 25);
		sFrame.add(dis);
		JButton post = new JButton("发送");
		post.setBounds(120, 500, 100, 30);
		post.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) 
			{ 
				 String Name=name.getText();
				 String Address= adr.getText();
				 String Phone = phone.getText();
				 if( Name.isEmpty() || Address.isEmpty() || !Data.isDigit(Phone)  || !Data.isDouble(weight.getText()) || !Data.isDouble(dis.getText()) )
				 { 
					 JOptionPane.showMessageDialog(null, "请把信息填写正确或者填写完整！", "提示", JOptionPane.ERROR_MESSAGE);
				 }
				 else
				 {
					 double Weight=0;
					 Weight=Double.parseDouble(weight.getText());				
					 double distance=0;
					 distance=Double.parseDouble(dis.getText());
					 Receiver r = Data.receiverFindByPhone(Phone);
					 if(r==null)
					 {
						 r = new Receiver(Name,Address,Phone);
						 Data.ReceiverList.add(r);
					 }
					 Parcel p = new Parcel(s,r,Weight,distance);
					 s.par.add(p);r.par.add(p);
					 Data.ParcelList.add(p);
					 JOptionPane.showMessageDialog(null, "发送成功！", "提示", JOptionPane.ERROR_MESSAGE);
					 sFrame.setVisible(false);
				 }
			}});
		sFrame.add(post);
        
	    sFrame.setVisible(true);
			
		}	

    
   public void actionPerformed(ActionEvent e) 
 { 
  if (e.getSource()==zhuomian4) 
  { 
   jp.setBackground(Color.BLACK); 
  } 
  if (e.getSource()==zhuomian3) 
  { 
   jp.setBackground(Color.darkGray); 
  } 
  if (e.getSource()==zhuomian2) 
  { 
   jp.setBackground(Color.lightGray); 
  } 
  if (e.getSource()==zhuomian1) 
  { 
   jp.setBackground(Color.white); 
  } 
  if (e.getSource()==outsystem) 
  { 
	  this.setVisible(false);
	new denglu();
  } 
   if (e.getSource()==zuoZheItem) 
  { 
   JOptionPane.showMessageDialog(this,"  关于作者   Java第十八组\n"); 
  } 
  if (e.getSource()==aboutsystem) 
  { 
   JOptionPane.showMessageDialog(this,"版本信息V1.0\n"); 
  } 
  if (e.getSource()==addparcel2) 
  { 
	  post(sender);
  } 
  if (e.getSource()==lookupmyparcel) 
  { 
	  sender.CheakMyParcel();
  } 
  if (e.getSource()==lookUpRecParcel) 
  { 
	  Receiver r=Data.receiverFindByPhone(sender.phoneNumber); 
	  if(r==null)
	  {
		  JOptionPane.showMessageDialog(null, "您没有任何正在运送的包裹！", "提示", JOptionPane.ERROR_MESSAGE);
	  }
	  else
		  r.CheakMyParcel();
  } 
  if (e.getSource() == addparcel)
  {
	  Receiver r=Data.receiverFindByPhone(sender.phoneNumber); 
	  if(r==null)
		  JOptionPane.showMessageDialog(null, "您没有任何已经到货的包裹！", "提示", JOptionPane.ERROR_MESSAGE);
	  else
		  r.CheakDaoHuoParcel();
  }
  if (e.getSource() == lookUpMyHisParcel)
  {
	  sender.lookUpMyHisParcel();
  }
  if (e.getSource() == lookUpRecHisParcel)
  {
	  Receiver r=Data.receiverFindByPhone(sender.phoneNumber); 
	  if(r==null)
		  JOptionPane.showMessageDialog(null, "您没有任何已经到货的包裹！", "提示", JOptionPane.ERROR_MESSAGE);
	  else
		  r.lookUpMyHisParcel();
  }
  if (e.getSource()==changemima) 
  { 
	  Data.xiugaiMM(sender);
  } 
  if (e.getSource()==usehelp) 
  { 
   JOptionPane.showMessageDialog(this,"本系统主题为“水墨书乡”\n" + 
     "操作上人性化设计:\n1.添加了快捷方式提高了操作效率。\n2.添加了4款" + "经典背景用户可凭借喜好选取\n实用性强，包含各种核心基础的功能，反应速度快。" +  "\n"); 
  } 
 } 
	
 public static void main(String[]args) 
 { 
  new Jiemian(null);  
 }  
	protected void processWindowEvent(WindowEvent e) {  
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {  
			int index = JOptionPane.showConfirmDialog(this, "您好，您确定要关闭窗体吗？",     "确认对话框", JOptionPane.YES_NO_OPTION,     JOptionPane.QUESTION_MESSAGE);   
			if (index == 0) {   
				database.daochu();
				//database.release();
				System.exit(0);   
				
			} else {         
					
				}  
			} 
		}
}
