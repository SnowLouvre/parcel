import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Sender extends Member
{
	//int postage;
	Receiver rec;
	ArrayList<Parcel> par;
	ArrayList<Parcel> signedPar;
	Sender()
	{
		super();
		rec = null;
		//postage = 0;
	}
	Sender(String id,String mm,String n, String adr, String p)
	{
		super(id,mm,n,adr,p);
		rec = null;
		par = new ArrayList<Parcel>();
		signedPar = new ArrayList<Parcel>();
		//ReceiverName = re;
		//postage = post;
	}

	void CheakMyParcel()
	{
		if(par==null)
			JOptionPane.showMessageDialog(null, "您没有任何正在运送的快递！", "提示", JOptionPane.ERROR_MESSAGE);
		else
			selectParcel();//par.wuliu();
	}
	void selectParcel()
	{
		final JComboBox<Integer> comboBox=new JComboBox<Integer>();
		//comboBox.setEditable(true);
		comboBox.setMaximumRowCount(6);
		comboBox.setBounds(150, 30, 100, 30);
		boolean flg=true;		int n=par.size();
		for(int i=0;i<n;i++)
		{
			comboBox.insertItemAt(par.get(i).pid, 0);
			flg=false;
		}
		if(flg)
		{
			JOptionPane.showMessageDialog(null, "您没有任何正在运送的包裹！", "提示", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			final JFrame jFrame = new JFrame("请选择您的快递");
			Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
			jFrame.setBounds(((int)dimension.getWidth() - 200) / 2, ((int)dimension.getHeight() - 300) / 2, 300, 200);
			jFrame.setResizable(false);
			jFrame.setLayout(null);

			JLabel bianhao=new JLabel("编号：");
			bianhao.setBounds(10, 30, 100, 30);
			jFrame.add(comboBox);
			jFrame.add(bianhao);
			JButton check = new  JButton("查询");
			check.setBounds(100, 125, 60, 30);
			jFrame.add(check);
			jFrame.setVisible(true);
			check.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
	
						int choice = (Integer) comboBox.getSelectedItem();
						Parcel p;
						p=Data.ParcelList.get(choice);
						p.wuliu();
	
				}
			});
		}
	}
	void lookUpMyHisParcel()
	{
		final JComboBox<Integer> comboBox=new JComboBox<Integer>();
		//comboBox.setEditable(true);
		comboBox.setMaximumRowCount(6);
		comboBox.setBounds(150, 30, 100, 30);
		boolean flg=true;		int n=signedPar.size();
		for(int i=0;i<n;i++)
		{
			comboBox.insertItemAt(signedPar.get(i).pid, 0);
			flg=false;
		}
		if(flg)
		{
			JOptionPane.showMessageDialog(null, "您没有任何正在运送的包裹！", "提示", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			final JFrame jFrame = new JFrame("请选择您的快递");
			Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
			jFrame.setBounds(((int)dimension.getWidth() - 200) / 2, ((int)dimension.getHeight() - 300) / 2, 300, 200);
			jFrame.setResizable(false);
			jFrame.setLayout(null);

			JLabel bianhao=new JLabel("编号：");
			bianhao.setBounds(10, 30, 100, 30);
			jFrame.add(comboBox);
			jFrame.add(bianhao);
			JButton check = new  JButton("查询");
			check.setBounds(100, 125, 60, 30);
			jFrame.add(check);
			jFrame.setVisible(true);
			check.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
	
						int choice = (Integer) comboBox.getSelectedItem();
						Parcel p;
						p=Data.ParcelList.get(choice);
						p.wuliu();
	
				}
			});
		}
	}
	
	
}