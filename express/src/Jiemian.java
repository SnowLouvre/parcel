
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
  ManaSystem=new JMenu("ϵͳ����(S)"); 
  ManaSystem.setMnemonic('S'); 
  parcelIn=new JMenu("����շ�(B)"); 
  parcelIn.setMnemonic('B'); 
  Queryparcel=new JMenu("��ݲ�ѯ(L)"); 
  Queryparcel.setMnemonic('L'); 
  Deleteparcel=new JMenu("��ݹ���(M)"); 
  Deleteparcel.setMnemonic('M'); 
        gaiMima=new JMenu("�û�����(U)"); 
        gaiMima.setMnemonic('U'); 
        GetHelp=new JMenu("����(H)"); 
        GetHelp.setMnemonic('H'); 
        backcolor=new JMenu("��������(C)"); 
        backcolor.setMnemonic('C'); 
        background=new JMenuItem("��������"); 
        zhuomian1=new JMenuItem("�����ذ�"); 
        zhuomian2=new JMenuItem("ˮī���"); 
        zhuomian3=new JMenuItem("������"); 
        zhuomian4=new JMenuItem("��ɫ����"); 
        background.add(backcolor); 
        backcolor.add(zhuomian1); 
        backcolor.add(zhuomian2); 
        backcolor.add(zhuomian3); 
        backcolor.add(zhuomian4); 
        backcolor.setMnemonic('C'); 
        outsystem=new JMenuItem("�˳�ϵͳ(O)"); 
        outsystem.setMnemonic('O'); 
        lookupmyparcel=new JMenuItem("��ѯ�������(L)"); 
        lookupmyparcel.setMnemonic('L'); 
        lookUpRecParcel=new JMenuItem("��ѯ���տ��(X)"); 
        lookUpRecParcel.setMnemonic('X'); 
        lookUpMyHisParcel=new JMenuItem("��ѯ������ǩ�տ��(F)");
        lookUpMyHisParcel.setMnemonic('F'); 
        lookUpRecHisParcel=new JMenuItem("��ѯ������ǩ�տ��(Y)");
        lookUpRecHisParcel.setMnemonic('Y'); 
        addparcel=new JMenuItem("��ȡ���(N)"); 
        addparcel.setMnemonic('N'); 
        addparcel2=new JMenuItem("���Ϳ��(M)"); 
        addparcel2.setMnemonic('M'); 
        dropparcel=new JMenuItem("��Ź���(D)"); 
        dropparcel.setMnemonic('D'); 
        lentparcel=new JMenuItem("��������"); 
        changemima=new JMenuItem("�޸�����(C)"); 
        changemima.setMnemonic('C'); 
        userlook=new JMenuItem("�û���ѯ"); 
        Calendar=new JMenuItem("������־");         
        zuoZheItem=new JMenuItem("��������"); 
        aboutsystem=new JMenuItem("����ϵͳ"); 
        usehelp=new JMenuItem("ʹ��ָ��"); 
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
        JLabel  JL=new JLabel("<html><font color=#4F4F4F size='14'><i>Ϊ������<br><hr>" +"�������������������Ҹ�<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + 
        "</i></font>",SwingConstants.CENTER); 
     jp.add(JL); 
  JLabel label2 = new JLabel("<html><i>Java��ʮ����<i>"); 
  jp.add(label2,"South"); 
  JScrollPane scrollpane=new JScrollPane(jp); 
  ImagePanel2 ip=new ImagePanel2();
	ip.setBounds(700,0,400,650);
  this.getContentPane().add(ip);
 cp.add(scrollpane); 
  setTitle("��ӭ��½����շ���׷��ϵͳ"); 
  jp.setBackground(Color.lightGray); 
   setSize(1100,600);     
  setVisible(true); 
  //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 } 

	static void post(final Sender s){ 
		final JFrame sFrame = new JFrame("���Ϳ��");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		sFrame.setBounds(((int)dimension.getWidth() - 200) / 2, ((int)dimension.getHeight() - 300) / 2, 320, 600);
		sFrame.setResizable(false);
		sFrame.setLayout(null);
		//sFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label1 = new JLabel("�������ռ��˵ĸ�����Ϣ��");
		label1.setBounds(10, 10, 200, 30);
		sFrame.add(label1);
		JLabel label2 = new JLabel("�������ռ���������");
		label2.setBounds(10, 90, 200, 30);
		sFrame.add(label2);
		JLabel label3 = new JLabel("�������ռ��˵�ַ��");
		label3.setBounds(10, 170, 200, 30);
		sFrame.add(label3);
		JLabel label4 = new JLabel("�������ռ����ֻ��ţ�");
		label4.setBounds(10, 250, 200, 30);
		sFrame.add(label4);
		JLabel label5 = new JLabel("���������������");
		label5.setBounds(10, 330, 200, 30);
		sFrame.add(label5);
		JLabel label6 = new JLabel("������������룺");
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
		JButton post = new JButton("����");
		post.setBounds(120, 500, 100, 30);
		post.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) 
			{ 
				 String Name=name.getText();
				 String Address= adr.getText();
				 String Phone = phone.getText();
				 if( Name.isEmpty() || Address.isEmpty() || !Data.isDigit(Phone)  || !Data.isDouble(weight.getText()) || !Data.isDouble(dis.getText()) )
				 { 
					 JOptionPane.showMessageDialog(null, "�����Ϣ��д��ȷ������д������", "��ʾ", JOptionPane.ERROR_MESSAGE);
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
					 JOptionPane.showMessageDialog(null, "���ͳɹ���", "��ʾ", JOptionPane.ERROR_MESSAGE);
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
   JOptionPane.showMessageDialog(this,"  ��������   Java��ʮ����\n"); 
  } 
  if (e.getSource()==aboutsystem) 
  { 
   JOptionPane.showMessageDialog(this,"�汾��ϢV1.0\n"); 
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
		  JOptionPane.showMessageDialog(null, "��û���κ��������͵İ�����", "��ʾ", JOptionPane.ERROR_MESSAGE);
	  }
	  else
		  r.CheakMyParcel();
  } 
  if (e.getSource() == addparcel)
  {
	  Receiver r=Data.receiverFindByPhone(sender.phoneNumber); 
	  if(r==null)
		  JOptionPane.showMessageDialog(null, "��û���κ��Ѿ������İ�����", "��ʾ", JOptionPane.ERROR_MESSAGE);
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
		  JOptionPane.showMessageDialog(null, "��û���κ��Ѿ������İ�����", "��ʾ", JOptionPane.ERROR_MESSAGE);
	  else
		  r.lookUpMyHisParcel();
  }
  if (e.getSource()==changemima) 
  { 
	  Data.xiugaiMM(sender);
  } 
  if (e.getSource()==usehelp) 
  { 
   JOptionPane.showMessageDialog(this,"��ϵͳ����Ϊ��ˮī���硱\n" + 
     "���������Ի����:\n1.����˿�ݷ�ʽ������˲���Ч�ʡ�\n2.�����4��" + "���䱳�����û���ƾ��ϲ��ѡȡ\nʵ����ǿ���������ֺ��Ļ����Ĺ��ܣ���Ӧ�ٶȿ졣" +  "\n����"); 
  } 
 } 
	
 public static void main(String[]args) 
 { 
  new Jiemian(null);  
 }  
	protected void processWindowEvent(WindowEvent e) {  
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {  
			int index = JOptionPane.showConfirmDialog(this, "���ã���ȷ��Ҫ�رմ�����",     "ȷ�϶Ի���", JOptionPane.YES_NO_OPTION,     JOptionPane.QUESTION_MESSAGE);   
			if (index == 0) {   
				database.daochu();
				//database.release();
				System.exit(0);   
				
			} else {         
					
				}  
			} 
		}
}
