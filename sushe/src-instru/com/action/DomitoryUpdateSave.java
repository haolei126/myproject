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
public class DomitoryUpdateSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private String Domitory_ID ;
	private String Domitory_BuildingID ;
    private String Domitory_Name ;
    private String Domitory_Type ;
    private String Domitory_Number ;
    private String Domitory_Tel ;

	public String getDomitory_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 0 10368195"); 
		return Domitory_ID;
	}

	public void setDomitory_ID(String domitoryID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 1 10368195"); 
		Domitory_ID = domitoryID;
	}


	public String getDomitory_BuildingID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 2 10368195"); 
		return Domitory_BuildingID;
	}

	public void setDomitory_BuildingID(String domitoryBuildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 3 10368195"); 
		Domitory_BuildingID = domitoryBuildingID;
	}

	public String getDomitory_Name() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 4 10368195"); 
		return Domitory_Name;
	}

	public void setDomitory_Name(String domitoryName) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 5 10368195"); 
		Domitory_Name = domitoryName;
	}

	public String getDomitory_Type() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 6 10368195"); 
		return Domitory_Type;
	}

	public void setDomitory_Type(String domitoryType) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 7 10368195"); 
		Domitory_Type = domitoryType;
	}

	public String getDomitory_Number() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 8 10368195"); 
		return Domitory_Number;
	}

	public void setDomitory_Number(String domitoryNumber) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 9 10368195"); 
		Domitory_Number = domitoryNumber;
	}

	public String getDomitory_Tel() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 10 10368195"); 
		return Domitory_Tel;
	}

	public void setDomitory_Tel(String domitoryTel) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 11 10368195"); 
		Domitory_Tel = domitoryTel;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 12 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","DomitoryUpdateSave","10368195");
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 40 13 10368195")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 40 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 40 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 40 14 10368195");{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 40 16 10368195");
		
		//查询用户名是否存在
		List<DomitoryBean> list=new DomitoryDao().GetList("Domitory_Name='"+Domitory_Name+"' and Domitory_BuildingID="+Domitory_BuildingID+" and Domitory_ID!="+Domitory_ID, "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 40 17 10368195")|| true) && (list.size()>0? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 40 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 40 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 40 18 10368195");
		{
			out.print("<script language='javascript'>alert('该楼宇中已经存在该寝室号！');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 40 20 10368195");
		//修改
		
		DomitoryBean cnbean=new DomitoryBean();
		cnbean=new DomitoryDao().GetBean(Integer.parseInt(Domitory_ID));
		cnbean.setDomitory_BuildingID(Integer.parseInt(Domitory_BuildingID));
		cnbean.setDomitory_Name(Domitory_Name);
		cnbean.setDomitory_Type(Domitory_Type);
		cnbean.setDomitory_Number(Domitory_Number);
		cnbean.setDomitory_Tel(Domitory_Tel);
		new DomitoryDao().Update(cnbean);
		    
		//跳转
		out.print("<script language='javascript'>alert('修改成功！');window.location='DomitoryManager.action';</script>");
		out.flush();out.close();return null;
		
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 21 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 22 10368195"); 
		System.out.println();
	}
	
}
