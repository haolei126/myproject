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
public class BuildingUpdateSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private String Building_ID ;
    private String Building_Name ;
    private String Building_Introduction ;
	public String getBuilding_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 54 0 10368195"); 
		return Building_ID;
	}

	public void setBuilding_ID(String buildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 54 1 10368195"); 
		Building_ID = buildingID;
	}

	public String getBuilding_Name() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 54 2 10368195"); 
		return Building_Name;
	}

	public void setBuilding_Name(String buildingName) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 54 3 10368195"); 
		Building_Name = buildingName;
	}

	public String getBuilding_Introduction() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 54 4 10368195"); 
		return Building_Introduction;
	}

	public void setBuilding_Introduction(String buildingIntroduction) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 54 5 10368195"); 
		Building_Introduction = buildingIntroduction;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 54 6 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","BuildingUpdateSave","10368195");
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 54 7 10368195")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 54 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 54 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 54 8 10368195");{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 54 10 10368195");
		
		//查询名称是否存在
		List<BuildingBean> list=new BuildingDao().GetList("Building_Name='"+Building_Name+"' and Building_ID!="+Building_ID, "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 54 11 10368195")|| true) && (list.size()>0? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 54 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 54 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 54 12 10368195");
		{
			out.print("<script language='javascript'>alert('名称已经存在！');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 54 14 10368195");
		//修改
		BuildingBean cnbean=new BuildingBean();
		cnbean=new BuildingDao().GetBean(Integer.parseInt(Building_ID));
		cnbean.setBuilding_Name(Building_Name);
		cnbean.setBuilding_Introduction(Building_Introduction);
		new BuildingDao().Update(cnbean); 
		//跳转
		out.print("<script language='javascript'>alert('修改成功！');window.location='BuildingManager.action';</script>");
		out.flush();out.close();return null;
		
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 54 15 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 54 16 10368195"); 
		System.out.println();
	}
	
}
