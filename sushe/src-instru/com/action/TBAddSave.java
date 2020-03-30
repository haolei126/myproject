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
public class TBAddSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private String TB_TeacherID ;
    private String TB_BuildingID ;
	public String getTB_TeacherID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 0 10368195"); 
		return TB_TeacherID;
	}

	public void setTB_TeacherID(String tBTeacherID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 1 10368195"); 
		TB_TeacherID = tBTeacherID;
	}

	public String getTB_BuildingID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 2 10368195"); 
		return TB_BuildingID;
	}

	public void setTB_BuildingID(String tBBuildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 3 10368195"); 
		TB_BuildingID = tBBuildingID;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 4 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","TBAddSave","10368195");
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 6 5 10368195")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 6 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 6 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 6 6 10368195");{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 6 8 10368195");
		
		//查询是否存在
		List<TBBean> list=new TBDao().GetList("TB_TeacherID='"+TB_TeacherID+"' and TB_BuildingID="+TB_BuildingID, "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 6 9 10368195")|| true) && (list.size()>0? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 6 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 6 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 6 10 10368195");
		{
			out.print("<script language='javascript'>alert('该管理员已经在管理本楼宇了，不要重复添加！');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 6 12 10368195");
		
		//添加
		TBBean cnbean=new TBBean();
		cnbean.setTB_TeacherID(Integer.parseInt(TB_TeacherID));
		cnbean.setTB_BuildingID(Integer.parseInt(TB_BuildingID));

		new TBDao().Add(cnbean);
		    
		//跳转
		out.print("<script language='javascript'>alert('添加成功！');window.location='TBManager.action?Building_ID="+TB_BuildingID+"';</script>");
		out.flush();out.close();return null;
		
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 13 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 14 10368195"); 
		System.out.println();
	}
	
}
