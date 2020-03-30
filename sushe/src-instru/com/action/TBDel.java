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
public class TBDel extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private String TB_ID ;

	public String getTB_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 0 10368195"); 
		return TB_ID;
	}

	public void setTB_ID(String tBID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 1 10368195"); 
		TB_ID = tBID;
	}
	private String Building_ID ;
	public String getBuilding_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 2 10368195"); 
		return Building_ID;
	}

	public void setBuilding_ID(String buildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 3 10368195"); 
		Building_ID = buildingID;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 4 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","TBDel","10368195");
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 52 5 10368195")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 52 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 52 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 52 6 10368195");{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 52 8 10368195");
		
		
		//删除
		new TBDao().Delete("TB_ID="+TB_ID);
		out.print("<script language='javascript'>window.location='TBManager.action?Building_ID="+Building_ID+"';</script>");
		out.flush();out.close();return null;
		
		
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 9 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 10 10368195"); 
		System.out.println();
	}
	
}
