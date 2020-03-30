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
public class DomitoryUpdate extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private String Domitory_ID;
	private DomitoryBean cnbean;
	public String getDomitory_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 42 0 10368195"); 
		return Domitory_ID;
	}

	public void setDomitory_ID(String studentID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 42 1 10368195"); 
		Domitory_ID = studentID;
	}

	public DomitoryBean getCnbean() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 42 2 10368195"); 
		return cnbean;
	}

	public void setCnbean(DomitoryBean cnbean) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 42 3 10368195"); 
		this.cnbean = cnbean;
	}

	private List<BuildingBean> list;
	public List<BuildingBean> getList() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 42 4 10368195"); 
		return list;
	}
	public void setList(List<BuildingBean> list) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 42 5 10368195"); 
		this.list = list;
	}
	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 42 6 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","DomitoryUpdate","10368195");
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 42 7 10368195")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 42 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 42 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 42 8 10368195");{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 42 10 10368195");
		
		//查询所有楼宇
		list=new BuildingDao().GetList("","Building_Name");
		//查询
		cnbean=new DomitoryDao().GetBean(Integer.parseInt(Domitory_ID));
		return SUCCESS;
		
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 42 11 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 42 12 10368195"); 
		System.out.println();
	}
	
}
