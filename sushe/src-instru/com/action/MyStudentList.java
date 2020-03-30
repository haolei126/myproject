// ZOA_CREATED! DO NOT EDIT IT! -- 
package com.action;

import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import com.bean.*;
import com.dao.*;


import com.process.ZoaExp;
import com.process.ZoaThreadLocal;
public class MyStudentList extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private List<StudentBean> list;
	public List<StudentBean> getList() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 0 10368195"); 
		return list;
	}
	public void setList(List<StudentBean> list) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 1 10368195"); 
		this.list = list;
	}
	private String Building_ID;
	public String getBuilding_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 2 10368195"); 
		return Building_ID;
	}
	public void setBuilding_ID(String buildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 3 10368195"); 
		Building_ID = buildingID;
	}
	private List<DomitoryBean> domitorylist;
	public List<DomitoryBean> getDomitorylist() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 4 10368195"); 
		return domitorylist;
	}
	public void setDomitorylist(List<DomitoryBean> domitorylist) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 5 10368195"); 
		this.domitorylist = domitorylist;
	}
	
	private String SearchRow;
	private String SearchKey;
	public String getSearchRow() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 6 10368195"); 
		return SearchRow;
	}
	public void setSearchRow(String searchRow) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 7 10368195"); 
		SearchRow = searchRow;
	}
	public String getSearchKey() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 8 10368195"); 
		return SearchKey;
	}
	public void setSearchKey(String searchKey) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 9 10368195"); 
		SearchKey = searchKey;
	}
	private String Domitory_ID;
	
	public String getDomitory_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 10 10368195"); 
		return Domitory_ID;
	}
	public void setDomitory_ID(String domitoryID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 11 10368195"); 
		Domitory_ID = domitoryID;
	}
	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 12 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","MyStudentList","10368195");
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 13 10368195")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 33 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 33 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 14 10368195");{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 16 10368195");

		//查询条件
		String strWhere="Student_State='入住' and Building_ID="+Building_ID;
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 17 10368195")|| true) && (!(isInvalid(SearchKey))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 33 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 33 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 18 10368195");
		{
			strWhere+=" and "+SearchRow+"='"+SearchKey+"'";
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 20 10368195");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 21 10368195")|| true) && (!(isInvalid(Domitory_ID))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 33 2 2 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 33 2 2 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 22 10368195");
		{
			strWhere+=" and Domitory_ID='"+Domitory_ID+"'";
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 24 10368195");
		//查询所有
		list=new StudentDao().GetList(strWhere,"Domitory_Name");
		
		//查询所有寝室
		domitorylist=new DomitoryDao().GetList("Domitory_BuildingID="+Building_ID,"Domitory_Name");
	
		return SUCCESS;
		
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 25 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 26 10368195"); 
		System.out.println();
	}
	
}
