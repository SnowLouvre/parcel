public class Member extends Person
{
	public String Id;
	 String passcode;
	public Member()
	{
		Id="";
		passcode="";
		//balance = 0;
	}
	Member(String id,String mm,String n, String adr, String p)
	{
		super(n,adr,p);	
		Id=id;
		passcode=mm;
	}
	/*void addBalance(int a)
	{
		balance += a;
	}*/
	public boolean checkPasscode(String mm)
	{
		if(passcode.equals(mm))
			return true;
		return false;
	}
	public String getPasscode()
	{
		return passcode;
	}
	void xiugaimm(String mm)
	{
		passcode = mm;
	}
	public void information()
	{
		System.out.println("����:"+name);
		System.out.println("��ַ:"+address);
		System.out.println("��ϵ��ʽ:"+phoneNumber);
	}
}


