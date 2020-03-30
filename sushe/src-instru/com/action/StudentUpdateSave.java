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
public class StudentUpdateSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private String Student_ID ;
    private String Student_Username ;
    private String Student_Password ;
    private String Student_Name ;
    private String Student_Sex ;
    private String Student_Class ;
	public String getStudent_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 44 0 10368195"); 
		return Student_ID;
	}

	public void setStudent_ID(String studentID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 44 1 10368195"); 
		Student_ID = studentID;
	}

	public String getStudent_Username() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 44 2 10368195"); 
		return Student_Username;
	}

	public void setStudent_Username(String studentUsername) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 44 3 10368195"); 
		Student_Username = studentUsername;
	}

	public String getStudent_Password() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 44 4 10368195"); 
		return Student_Password;
	}

	public void setStudent_Password(String studentPassword) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 44 5 10368195"); 
		Student_Password = studentPassword;
	}

	public String getStudent_Name() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 44 6 10368195"); 
		return Student_Name;
	}

	public void setStudent_Name(String studentName) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 44 7 10368195"); 
		Student_Name = studentName;
	}

	public String getStudent_Sex() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 44 8 10368195"); 
		return Student_Sex;
	}

	public void setStudent_Sex(String studentSex) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 44 9 10368195"); 
		Student_Sex = studentSex;
	}

	public String getStudent_Class() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 44 10 10368195"); 
		return Student_Class;
	}

	public void setStudent_Class(String studentClass) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 44 11 10368195"); 
		Student_Class = studentClass;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 44 12 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","StudentUpdateSave","10368195");
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 44 13 10368195")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 44 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 44 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 44 14 10368195");{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 44 16 10368195");
		
		//查询用户名是否存在
		List<StudentBean> list=new StudentDao().GetList("Student_Username='"+Student_Username+"' and Student_ID!="+Student_ID, "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 44 17 10368195")|| true) && (list.size()>0? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 44 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 44 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 44 18 10368195");
		{
			out.print("<script language='javascript'>alert('用户名已经存在！');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 44 20 10368195");
		//修改
		
		StudentBean cnbean=new StudentBean();
		cnbean=new StudentDao().GetAllBean(Integer.parseInt(Student_ID));
		cnbean.setStudent_Username(Student_Username);
		cnbean.setStudent_Name(Student_Name);
		cnbean.setStudent_Sex(Student_Sex);
		cnbean.setStudent_Class(Student_Class);
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 44 21 10368195")|| true) && (!(isInvalid(Student_Password))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 44 2 2 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 44 2 2 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 44 22 10368195");
		{
			cnbean.setStudent_Password(Student_Password);
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 44 24 10368195");
		new StudentDao().Update(cnbean);
		    
		//跳转
		out.print("<script language='javascript'>alert('修改成功！');window.location='StudentManager.action';</script>");
		out.flush();out.close();return null;
		
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 44 25 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 44 26 10368195"); 
		System.out.println();
	}
	
}
