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
public class PasswordUpdateSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private String Password;
	private String Password2;
	private String Msg;
	public String getPassword() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 2 0 10368195"); 
		return Password;
	}

	public void setPassword(String password) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 2 1 10368195"); 
		Password = password;
	}

	public String getPassword2() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 2 2 10368195"); 
		return Password2;
	}

	public void setPassword2(String password2) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 2 3 10368195"); 
		Password2 = password2;
	}

	public String getMsg() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 2 4 10368195"); 
		return Msg;
	}

	public void setMsg(String msg) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 2 5 10368195"); 
		Msg = msg;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 2 6 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","PasswordUpdateSave","10368195");
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 7 10368195")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 2 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 2 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 8 10368195");{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 10 10368195");
		String type=session.getAttribute("type").toString();
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 11 10368195")|| true) && (type.equals("1")? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 2 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 2 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 12 10368195");//校园管理员身份
		{
			//查询原密码是否正确
			if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 13 10368195")|| true) && (new AdminDao().CheckPassword(session.getAttribute("id").toString(), Password)? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 2 2 2 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 2 2 2 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 14 10368195"); {
				//修改密码
				AdminBean cnbean=new AdminBean();
				cnbean=new AdminDao().GetBean(Integer.parseInt(session.getAttribute("id").toString()));
				cnbean.setAdmin_Password(Password2);
				new AdminDao().Update(cnbean);
				out.print("<script language='javascript'>alert('修改成功！');window.location='PasswordUpdate.jsp';</script>");
				out.flush();out.close();return null;
			} }
			else {  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 15 10368195"); 
			{
				Msg = "用户名或者密码错误";
				return INPUT;
			} }
		} }
		else {  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 17 10368195");  if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 18 10368195")|| true) && (type.equals("2")? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 2 3 3 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 2 3 3 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 19 10368195");//楼宇管理员身份
		{
			//查询原密码是否正确
			if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 20 10368195")|| true) && (new TeacherDao().CheckPassword(session.getAttribute("id").toString(), Password)? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 2 4 4 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 2 4 4 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 21 10368195"); {
				//修改密码
				TeacherBean cnbean=new TeacherBean();
				cnbean=new TeacherDao().GetBean(Integer.parseInt(session.getAttribute("id").toString()));
				cnbean.setTeacher_Password(Password2);
				new TeacherDao().Update(cnbean);
				out.print("<script language='javascript'>alert('修改成功！');window.location='PasswordUpdate.jsp';</script>");
				out.flush();out.close();return null;
			} }
			else {  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 22 10368195"); 
			{
				Msg = "用户名或者密码错误";
				return INPUT;
			} }
		} }
		else {  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 24 10368195");  if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 25 10368195")|| true) && (type.equals("3")? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 2 5 5 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 2 5 5 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 26 10368195");//学生身份
		{
			//查询原密码是否正确
			if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 27 10368195")|| true) && (new StudentDao().CheckPassword(session.getAttribute("id").toString(), Password)? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 2 6 6 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 2 6 6 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 28 10368195"); {
				//修改密码
				StudentBean cnbean=new StudentBean();
				cnbean=new StudentDao().GetBean(Integer.parseInt(session.getAttribute("id").toString()));
				cnbean.setStudent_Password(Password2);
				new StudentDao().Update(cnbean);
				out.print("<script language='javascript'>alert('修改成功！');window.location='PasswordUpdate.jsp';</script>");
				out.flush();out.close();return null;
			} }
			else {  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 29 10368195"); 
			{
				Msg = "用户名或者密码错误";
				return INPUT;
			} }
		} }
		else {  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 2 31 10368195"); 
		{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} } } }
		

	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 2 35 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 2 36 10368195"); 
		System.out.println();
	}
	
}
