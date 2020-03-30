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
public class TeacherManager extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private List<TeacherBean> list;
	public List<TeacherBean> getList() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 0 10368195"); 
		return list;
	}
	public void setList(List<TeacherBean> list) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 1 10368195"); 
		this.list = list;
	}
	private String SearchRow;
	private String SearchKey;
	public String getSearchRow() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 2 10368195"); 
		return SearchRow;
	}
	public void setSearchRow(String searchRow) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 3 10368195"); 
		SearchRow = searchRow;
	}
	public String getSearchKey() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 4 10368195"); 
		return SearchKey;
	}
	public void setSearchKey(String searchKey) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 5 10368195"); 
		SearchKey = searchKey;
	}
	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 6 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","TeacherManager","10368195");
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 7 10368195")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 8 10368195");{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 10 10368195");
		//查询条件
		String strWhere="1=1";
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 11 10368195")|| true) && (!(isInvalid(SearchKey))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 12 10368195");
		{
			strWhere+=" and "+SearchRow+"='"+SearchKey+"'";
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 14 10368195");
		//查询所有
		list=new TeacherDao().GetList(strWhere,"Teacher_Name");
	
		return SUCCESS;
		
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 15 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 16 10368195"); 
		System.out.println();
	}
	
}
