public class Person
{
	String name;
	//int age;
	String address;
	//int sex;
	String phoneNumber;
	//private int balance;
	public Person()
	{
		name = "";
		//age = 0;
		//sex = 0;
		address = "";
		phoneNumber = "";
		//balance = 0;
	}
	Person(String n, String adr, String p)
	{
		name = n;
		//age = a;
		//sex = s;
		address = adr;
		phoneNumber = p;
		//balance = b;
	}
	/*void addBalance(int a)
	{
		balance += a;
	}*/
	public void information()
	{
		System.out.println("����:"+name);
		System.out.println("��ַ:"+address);
		System.out.println("��ϵ��ʽ:"+phoneNumber);
	}
}


