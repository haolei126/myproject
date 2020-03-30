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
public class StudentRZSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private String Building_ID ;
    private String Domitory_ID ;
    private String Student_Username ;
	public String getBuilding_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 0 10368195"); 
		return Building_ID;
	}

	public void setBuilding_ID(String buildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 1 10368195"); 
		Building_ID = buildingID;
	}

	public String getDomitory_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 2 10368195"); 
		return Domitory_ID;
	}

	public void setDomitory_ID(String domitoryID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 3 10368195"); 
		Domitory_ID = domitoryID;
	}

	public String getStudent_Username() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 4 10368195"); 
		return Student_Username;
	}

	public void setStudent_Username(String studentUsername) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 5 10368195"); 
		Student_Username = studentUsername;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 6 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","StudentRZSave","10368195");
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 36 7 10368195")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 36 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 36 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 36 8 10368195");{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 36 10 10368195");
		
		StudentBean sbean=new StudentBean();
		//查询用户名是否存在
		List<StudentBean> list=new StudentDao().GetAllList("Student_Username='"+Student_Username+"'", "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 36 11 10368195")|| true) && (list.size()<1? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 36 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 36 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 36 12 10368195");
		{
			out.print("<script language='javascript'>alert('学号不存在！');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
		else {  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 36 13 10368195"); 
		{
			sbean=new StudentDao().GetAllFirstBean("Student_Username='"+Student_Username+"'");
			if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 36 14 10368195")|| true) && (!(sbean.getStudent_State().equals("未入住"))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 36 2 2 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 36 2 2 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 36 15 10368195");
			{
				out.print("<script language='javascript'>alert('该学生处于"+sbean.getStudent_State()+"状态，禁止入住操作！');history.back(-1);</script>");
				out.flush();out.close();return null;
			} }
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 36 18 10368195");
		//修改
		StudentBean cnbean=new StudentBean();
		cnbean=new StudentDao().GetAllBean(sbean.getStudent_ID());
		cnbean.setStudent_DomitoryID(Integer.parseInt(Domitory_ID));
		cnbean.setStudent_State("入住");
		new StudentDao().Update(cnbean);
		    
		//跳转
		out.print("<script language='javascript'>alert('入住操作成功！');window.location='StudentRZ.action';</script>");
		out.flush();out.close();return null;
		
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 19 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 20 10368195"); 
		System.out.println();
	}
	
}
