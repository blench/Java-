package lyons.entity;

import com.sun.rowset.CachedRowSetImpl;

/*
 * 商品实体类
 * @author lizewu
 * 
 */

public class Goods {
	CachedRowSetImpl rowSet=null;//表中所有的行集对象
	
	private int pageSize=5;//每页显示有多少条记录（默认5条）
	private int currentPage=1;//当前页面
	private int totalRecord=1;//当前记录总数
	private int totalPage=1;//总页数
	
	public Goods(){}
	
	public Goods(CachedRowSetImpl rowSet,int pageSize,int currentPage,
			int totalRecord,int totalPage)
	{
		this.rowSet=rowSet;
		this.pageSize=pageSize;
		this.currentPage=currentPage;
		this.totalRecord=totalRecord;
		this.totalPage=totalPage;
	}
	
	public CachedRowSetImpl getRowSet()
	{
		return rowSet;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
}
