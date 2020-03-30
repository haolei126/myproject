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
public class TeacherUpdateSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private String Teacher_ID ;
    private String Teacher_Username ;
    private String Teacher_Password ;
    private String Teacher_Name ;
    private String Teacher_Sex ;
    private String Teacher_Tel ;
	public String getTeacher_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 29 0 10368195"); 
		return Teacher_ID;
	}

	public void setTeacher_ID(String cookID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 29 1 10368195"); 
		Teacher_ID = cookID;
	}

	public String getTeacher_Username() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 29 2 10368195"); 
		return Teacher_Username;
	}

	public void setTeacher_Username(String cookUsername) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 29 3 10368195"); 
		Teacher_Username = cookUsername;
	}

	public String getTeacher_Password() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 29 4 10368195"); 
		return Teacher_Password;
	}

	public void setTeacher_Password(String cookPassword) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 29 5 10368195"); 
		Teacher_Password = cookPassword;
	}

	public String getTeacher_Name() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 29 6 10368195"); 
		return Teacher_Name;
	}

	public void setTeacher_Name(String cookName) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 29 7 10368195"); 
		Teacher_Name = cookName;
	}

	public String getTeacher_Sex() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 29 8 10368195"); 
		return Teacher_Sex;
	}

	public void setTeacher_Sex(String cookSex) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 29 9 10368195"); 
		Teacher_Sex = cookSex;
	}

	public String getTeacher_Tel() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 29 10 10368195"); 
		return Teacher_Tel;
	}

	public void setTeacher_Tel(String cookTel) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 29 11 10368195"); 
		Teacher_Tel = cookTel;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 29 12 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","TeacherUpdateSave","10368195");
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 29 13 10368195")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 29 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 29 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 29 14 10368195");{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 29 16 10368195");
		
		//查询用户名是否存在
		List<TeacherBean> list=new TeacherDao().GetList("Teacher_Username='"+Teacher_Username+"' and Teacher_ID!="+Teacher_ID, "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 29 17 10368195")|| true) && (list.size()>0? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 29 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 29 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 29 18 10368195");
		{
			out.print("<script language='javascript'>alert('用户名已经存在！');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 29 20 10368195");
		//修改
		
		TeacherBean cnbean=new TeacherBean();
		cnbean=new TeacherDao().GetBean(Integer.parseInt(Teacher_ID));
		cnbean.setTeacher_Username(Teacher_Username);
		cnbean.setTeacher_Name(Teacher_Name);
		cnbean.setTeacher_Sex(Teacher_Sex);
		cnbean.setTeacher_Tel(Teacher_Tel);
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 29 21 10368195")|| true) && (!(isInvalid(Teacher_Password))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 29 2 2 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 29 2 2 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 29 22 10368195");
		{
			cnbean.setTeacher_Password(Teacher_Password);
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 29 24 10368195");
		new TeacherDao().Update(cnbean);
		    
		//跳转
		out.print("<script language='javascript'>alert('修改成功！');window.location='TeacherManager.action';</script>");
		out.flush();out.close();return null;
		
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 29 25 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 29 26 10368195"); 
		System.out.println();
	}
	
}
