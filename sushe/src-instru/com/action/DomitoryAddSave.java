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
public class DomitoryAddSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private String Domitory_BuildingID ;
    private String Domitory_Name ;
    private String Domitory_Type ;
    private String Domitory_Number ;
    private String Domitory_Tel ;


	public String getDomitory_BuildingID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 0 10368195"); 
		return Domitory_BuildingID;
	}

	public void setDomitory_BuildingID(String domitoryBuildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 1 10368195"); 
		Domitory_BuildingID = domitoryBuildingID;
	}

	public String getDomitory_Name() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 2 10368195"); 
		return Domitory_Name;
	}

	public void setDomitory_Name(String domitoryName) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 3 10368195"); 
		Domitory_Name = domitoryName;
	}

	public String getDomitory_Type() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 4 10368195"); 
		return Domitory_Type;
	}

	public void setDomitory_Type(String domitoryType) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 5 10368195"); 
		Domitory_Type = domitoryType;
	}

	public String getDomitory_Number() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 6 10368195"); 
		return Domitory_Number;
	}

	public void setDomitory_Number(String domitoryNumber) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 7 10368195"); 
		Domitory_Number = domitoryNumber;
	}

	public String getDomitory_Tel() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 8 10368195"); 
		return Domitory_Tel;
	}

	public void setDomitory_Tel(String domitoryTel) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 9 10368195"); 
		Domitory_Tel = domitoryTel;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 10 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","DomitoryAddSave","10368195");
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 11 10368195")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 23 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 23 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 12 10368195");{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 14 10368195");
		
		//查询是否存在
		List<DomitoryBean> list=new DomitoryDao().GetList("Domitory_Name='"+Domitory_Name+"' and Domitory_BuildingID="+Domitory_BuildingID, "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 15 10368195")|| true) && (list.size()>0? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 23 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 23 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 16 10368195");
		{
			out.print("<script language='javascript'>alert('该楼宇中已经存在该寝室号！');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 18 10368195");
		//添加
		DomitoryBean cnbean=new DomitoryBean();
		cnbean.setDomitory_BuildingID(Integer.parseInt(Domitory_BuildingID));
		cnbean.setDomitory_Name(Domitory_Name);
		cnbean.setDomitory_Type(Domitory_Type);
		cnbean.setDomitory_Number(Domitory_Number);
		cnbean.setDomitory_Tel(Domitory_Tel);
		new DomitoryDao().Add(cnbean);
		    
		//跳转
		out.print("<script language='javascript'>alert('添加成功！');window.location='DomitoryManager.action';</script>");
		out.flush();out.close();return null;
		
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 19 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 20 10368195"); 
		System.out.println();
	}
	
}
