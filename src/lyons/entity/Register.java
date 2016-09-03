package lyons.entity;

import java.io.Serializable;

public class Register implements Serializable {

	/**
	 * �û�ʵ��ע����
	 * @author lizewu
	 * 
	 */
	private static final long serialVersionUID = -723444928986453015L;
	private String username;
	private String userpass;
	private String phone;
	private String address;
	private String realname;
	private String backNews="��ע��";
	
	public Register(){
		super();
	}
	
	public String getUserName()
	{
		return username;
	}
	
	public void setUserName(String username)
	{
		this.username=username;
	}
	
	public String getUserpass()
	{
		return userpass;
	}
	
	public void setUserpass(String userpass)
	{
		this.userpass=userpass;
	}
	
	public String setPhone()
	{
		return phone;
	}
	
	public void getPhone(String phoone)
	{
		this.phone=phone;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public String getRealName()
	{
		return realname;
	}
	
	public void setRealName(String realname)
	{
		this.realname=realname;
	}
	
	public String getBackNews()
	{
		return backNews;
	}
	
	public void setBackNews(String backNews)
	{
		this.backNews=backNews;
	}
}
