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
public class LogAddSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private String Log_Date ;
    private String Log_Remark ;

	public String getLog_Date() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 28 0 10368195"); 
		return Log_Date;
	}

	public void setLog_Date(String logDate) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 28 1 10368195"); 
		Log_Date = logDate;
	}

	public String getLog_Remark() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 28 2 10368195"); 
		return Log_Remark;
	}

	public void setLog_Remark(String logRemark) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 28 3 10368195"); 
		Log_Remark = logRemark;
	}

	private String Log_StudentID;
	public String getLog_StudentID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 28 4 10368195"); 
		return Log_StudentID;
	}

	public void setLog_StudentID(String logStudentID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 28 5 10368195"); 
		Log_StudentID = logStudentID;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 28 6 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","LogAddSave","10368195");
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 28 7 10368195")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 28 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 28 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 28 8 10368195");{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 28 10 10368195");
		
		//添加
		LogBean cnbean=new LogBean();
		cnbean.setLog_StudentID(Integer.parseInt(Log_StudentID));
		cnbean.setLog_TeacherID(Integer.parseInt(session.getAttribute("id").toString()));
		cnbean.setLog_Date(Log_Date);
		cnbean.setLog_Remark(Log_Remark);

		new LogDao().Add(cnbean);
		    
		//跳转
		out.print("<script language='javascript'>alert('缺寝登记成功！');window.location='Index.jsp';</script>");
		out.flush();out.close();return null;
		
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 28 11 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 28 12 10368195"); 
		System.out.println();
	}
	
}
