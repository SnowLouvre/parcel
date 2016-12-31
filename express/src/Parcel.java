import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Timer;


import javax.swing.*;
public class Parcel {
	Sender sender;
	Receiver receiver;
	double weight;
	Date time;
	Date birthTime;
	double distance;
	double dis;
	Timer timer;
	String log;
	boolean arrived;
	String arr;
	int pid;
	boolean signed = false;
	static int code =0;
	Parcel()
	{
		pid=0;
		sender = null;
		receiver = null;
		weight = 0;
		time = null;
		distance=0;
		arrived=false;
	}
	Parcel(Sender s,Receiver r,double w,double d)
	{
		pid=code++;
		sender = s;
		receiver = r; 
		weight = w;
		distance=d;
		dis=d;
		arrived=false;
		timer = new Timer();
		log="";
		birthTime = new Date();
		timer.schedule(new runTask(this), 0,  2000);
	}
	Parcel(int id,String sphone,String rphone,double w,double d,String l,Date t,boolean arr)
	{
		pid=id;
		weight = w;
		distance=d;
		dis=d;
		birthTime=t;
		log=l;
		arrived=arr;
		timer = new Timer();
		timer.schedule(new runTask(this), 0,  2000);
		sender = Data.senderFindByPhone(sphone);
		receiver = Data.receiverFindByPhone(rphone);
	}
	public void information()
	{
		System.out.println("发件人信息：");
		sender.information();
		System.out.println("收件人信息：");
		receiver.information();
	}
	

	public void wuliu() 
	{
		Date time = new Date();
		final JFrame jFrame = new JFrame("物流界面");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setBounds(((int)dimension.getWidth() - 200) / 2, ((int)dimension.getHeight() - 300) / 2, 400, 600);
		jFrame.setResizable(false);
		jFrame.setLayout(null);
		//jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel shijian = new JLabel("时间:"+time);
		shijian.setBounds(10, 60, 250, 30);
		JLabel name = new JLabel("发件人姓名："+sender.name+"   收件人姓名："+receiver.name+"   快递编号："+this.pid);
		name.setBounds(10, 30, 250, 30);
		jFrame.add(shijian);
		jFrame.add(name);
		//System.out.println(time);
				//System.out.println(this.log);
		if(this.arrived==true)
		{
			arr="货物已到达！";
			
			//System.out.println("货物已到达！");
		}
		else
		{
			arr="货物还未到达，请耐心等待";
			//System.out.println("货物还未到达，请耐心等待");
		}
		JTextArea wuliu = new JTextArea("物流信息：\n"+log+"\n"+arr);
		wuliu.setBounds(40, 90, 250, 400);
		
		wuliu.setEditable(false);
		JScrollPane Wuliu=new JScrollPane();
		Wuliu.setBounds(40, 90, 250, 400);
		Wuliu.add(wuliu);
		Wuliu.setViewportView(wuliu);
		jFrame.getContentPane().add(Wuliu);

		//jFrame.add(wuliu);
		JButton button1 = new JButton("退出");
		button1.setBounds(155, 500, 60, 30);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
					jFrame.setVisible(false);
					 }});
		
		jFrame.add(button1);
		jFrame.setVisible(true);
		
	}	


	class runTask extends TimerTask
	{
		Parcel par;
		runTask(Parcel p)
		{
			par=p;
		}
		
		@Override
		public void run() {
			if(par.distance>0)
			{
				par.log += "离目的地还有"+par.distance+"公里\n";
				par.distance-=2;
			}
			else
			{ if(par.arrived==false)
				{
				par.distance=0;
				par.log += "离目的地还有"+par.distance+"公里\n";
				//sender.par.remove(par);
				//sender.par.remove(par);
				par.arrived=true;
				}
			}
		}
	}
}
