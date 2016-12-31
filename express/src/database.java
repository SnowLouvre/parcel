import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;


public class database {
	static Connection con=null;
	static Statement stmt=null;
	static ResultSet rs = null;
	static String strTemp = "";
	static int sn=0;
	static int rn=0;
	static int pn=0;
	static void connectDB()
	{
		//加载驱动程序  
		try{
		    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		}
		catch(ClassNotFoundException e){}
		
		//建立数据库连接
		try{
			     con=DriverManager.getConnection("jdbc:odbc:express","","");
			     stmt=con.createStatement();
		}catch(SQLException ee){}
	}
	static void daoru()
	{
		strTemp = "select * from Sender";		
		try {
			rs = stmt.executeQuery(strTemp);
			while(rs.next())
			{
				String id=rs.getString("id");
				String mm=rs.getString("password");
				String name=rs.getString("name");
				String address=rs.getString("address");
				String phone=rs.getString("phone");
				Sender s=new Sender(id,mm,name,address,phone);
				Data.SenderList.add(s);
			}
			sn=Data.SenderList.size();
		} 
		catch (SQLException e){
			e.printStackTrace();
		}
		
		strTemp = "select * from Receiver";		
		try {
			rs = stmt.executeQuery(strTemp);
			while(rs.next())
			{
				String name=rs.getString("name");
				String address=rs.getString("address");
				String phone=rs.getString("phone");
				Receiver r=new Receiver(name,address,phone);
				Data.ReceiverList.add(r);
			}
			rn=Data.ReceiverList.size();
		} 
		catch (SQLException e){
			e.printStackTrace();
		}
		
		strTemp = "select * from Parcel";		
		try {
			rs = stmt.executeQuery(strTemp);
			while(rs.next())
			{
				int pid = rs.getInt("pid");
				String sphone=rs.getString("sphone");
				String rphone=rs.getString("rphone");
				double weight=rs.getDouble("weight");
				double distance=rs.getDouble("distance");
				String log = rs.getString("log");
				Date time = rs.getDate("shijian");
				boolean arrived = rs.getBoolean("arrived");
				Parcel p = new Parcel(pid,sphone,rphone,weight,distance,log,time,arrived);
				Data.ParcelList.add(p);
			}
			pn=Data.ParcelList.size();
		} 
		catch (SQLException e){
			e.printStackTrace();
		}
		Parcel.code=Data.ParcelList.size();
	}
	
	static void daochu()
	{
		
		try {
			int n=Data.SenderList.size();
			for(int i=sn;i<n;i++)
			{
				String id = Data.SenderList.get(i).Id;
				String mm = Data.SenderList.get(i).getPasscode();
				String name = Data.SenderList.get(i).name;
				String address = Data.SenderList.get(i).address;
				String phone = Data.SenderList.get(i).phoneNumber;
				stmt.execute("insert into Sender values('"+id+"','"+mm+"','"+name+"','"+address+"','"+phone+"')");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			int n=Data.ReceiverList.size();
			for(int i=rn;i<n;i++)
			{
				String name = Data.ReceiverList.get(i).name;
				String address = Data.ReceiverList.get(i).address;
				String phone = Data.ReceiverList.get(i).phoneNumber;
				stmt.execute("insert into Receiver values('"+name+"','"+address+"','"+phone+"')");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			int n=Data.ParcelList.size();
			for(int i=pn;i<n;i++)
			{
				int pid = Data.ParcelList.get(i).pid;
				String sphone = Data.ParcelList.get(i).sender.phoneNumber;
				String rphone = Data.ParcelList.get(i).receiver.phoneNumber;
				double weight = Data.ParcelList.get(i).weight;
				double distance = Data.ParcelList.get(i).dis;
				String log = Data.ParcelList.get(i).log;
				Date time = Data.ParcelList.get(i).birthTime;
				int arrived = (Data.ParcelList.get(i).arrived)?-1:0;
				SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			    String d = f.format(time);
				stmt.execute("insert into Parcel values('"+pid+"','"+sphone+"','"+rphone+"','"+weight+"','"+distance+"','"+log+"','"+d+"','"+arrived+"')");
				//stmt.execute("delete * from Parcel where pid = '"+(pid+1)+"'");
				//stmt.execute("delete * from Parcel where pid = '"+(pid+1)+"'");
				stmt.execute("delete * from Parcel where pid = '-9'");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void release()
	{
        try {
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

