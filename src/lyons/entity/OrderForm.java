package lyons.entity;

import java.util.Date;

/*
 * 订单实体类
 * @author lizewu
 * @version [版本号 2016 9 5]
 * @since [应用/版本]
 */
public class OrderForm {
	
	private int id=0;
	private String username;
	private Date orderDate=null;
	private String commondity_name="";
	private double commondity_price=0.00;
	private int sum=0;
	
	public OrderForm(){}
	
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String usename)
	{
		this.username=username;
	}
	
	public Date getOrderDate()
	{
		return orderDate;
	}
	
	public void setOrderDate(Date orderDate)
	{
		this.orderDate=orderDate;
	}
	
	public String getCommondity_name()
	{
		return commondity_name;
	}
	
	public void setCommondity_name(String commondity_name)
	{
		this.commondity_name=commondity_name;
	}
	
	public double getCommondity_price()
	{
		return commondity_price;
	}
	
	public void setCommondity_price(double commondity_price)
	{
		this.commondity_price=commondity_price;
	}
	
	public int getSum()
	{
		return sum;
	}
	
	public void setSum(int num)
	{
		this.sum=sum;
	}
}
