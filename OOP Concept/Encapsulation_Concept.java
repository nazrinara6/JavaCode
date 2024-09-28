package oop_package;
class Amazon
{
	private String un = "contact@grotectmind.com";
	private String pwd = "nazrin123";
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUn()
	{
		return un;
	}
	public void settUn(String un)
	{
		this.un =un;
	}
}
public class Encapsulation_Concept {

	public static void main(String[] args)
	{
		Amazon a1 = new Amazon();
		a1.settUn("nazrinara6@gmail.com");
		a1.setPwd("nazrin123");
		
		System.out.println(a1.getUn());
		System.out.println(a1.getPwd());
	}

}

