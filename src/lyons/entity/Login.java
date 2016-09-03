package lyons.entity;

import java.io.Serializable;
import java.util.LinkedList;

public class Login implements Serializable{

/**
 * 用户登录实体类
 * @author lizewu
	 * 
	 */
	
	private static final long serialVersionUID = 3805217178605143918L;

	private String userName="";
	private String backNews="未登录";
	
	private LinkedList<String> car=null;//购物车，订单
	
	public Login(){
		car=new LinkedList<String>();
	}
	
	public LinkedList<String> getCar()
	{
		return car;
	}
	
	public void setCar(LinkedList<String> car)
	{
		this.car=car;
	}
	
	public String getUserName(){
		if(userName.trim()=="")
		{
			return "userNull";
		}
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName=userName;
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
