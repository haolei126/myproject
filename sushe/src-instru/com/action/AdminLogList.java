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
public class AdminLogList extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private List<LogBean> list;
	public List<LogBean> getList() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 32 0 10368195"); 
		return list;
	}
	public void setList(List<LogBean> list) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 32 1 10368195"); 
		this.list = list;
	}
	
	private String Building_ID;
	private String Domitory_ID;
	private String Student_Username;
	
	public String getBuilding_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 32 2 10368195"); 
		return Building_ID;
	}
	public void setBuilding_ID(String buildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 32 3 10368195"); 
		Building_ID = buildingID;
	}
	public String getDomitory_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 32 4 10368195"); 
		return Domitory_ID;
	}
	public void setDomitory_ID(String domitoryID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 32 5 10368195"); 
		Domitory_ID = domitoryID;
	}
	public String getStudent_Username() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 32 6 10368195"); 
		return Student_Username;
	}
	public void setStudent_Username(String studentUsername) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 32 7 10368195"); 
		Student_Username = studentUsername;
	}
	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 32 8 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","AdminLogList","10368195");
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 32 9 10368195")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 32 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 32 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 32 10 10368195");{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 32 12 10368195");

		//查询条件
		String strWhere="Student_State='入住'";
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 32 13 10368195")|| true) && (!(isInvalid(Building_ID))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 32 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 32 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 32 14 10368195");
		{
			strWhere+=" and Building_ID='"+Building_ID+"'";
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 32 16 10368195");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 32 17 10368195")|| true) && (!(isInvalid(Domitory_ID))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 32 2 2 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 32 2 2 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 32 18 10368195");
		{
			strWhere+=" and Domitory_ID='"+Domitory_ID+"'";
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 32 20 10368195");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 32 21 10368195")|| true) && (!(isInvalid(Student_Username))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 32 3 3 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 32 3 3 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 32 22 10368195");
		{
			strWhere+=" and Student_Username='"+Student_Username+"'";
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 32 24 10368195");
		//查询所有
		list=new LogDao().GetList(strWhere,"Log_Date desc");
		
	
		return SUCCESS;
		
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 32 25 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 32 26 10368195"); 
		System.out.println();
	}
	
}
