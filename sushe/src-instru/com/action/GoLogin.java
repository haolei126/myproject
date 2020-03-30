// ZOA_CREATED! DO NOT EDIT IT! -- 
package com.action;

import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.dao.*;
import com.bean.*;

import com.opensymphony.xwork2.ActionSupport;

import com.process.ZoaExp;
import com.process.ZoaThreadLocal;
public class GoLogin extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private String Type;
	private String Username;
	private String Password;
	private String Msg;
	public String getType() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 0 10368195"); 
		return Type;
	}
	public void setType(String type) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 1 10368195"); 
		Type = type;
	}
	public String getUsername() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 2 10368195"); 
		return Username;
	}
	public void setUsername(String username) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 3 10368195"); 
		Username = username;
	}
	public String getPassword() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 4 10368195"); 
		return Password;
	}
	public void setPassword(String password) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 5 10368195"); 
		Password = password;
	}
	public String getMsg() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 6 10368195"); 
		return Msg;
	}
	public void setMsg(String msg) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 7 10368195"); 
		Msg = msg;
	}
	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 8 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","GoLogin","10368195");
		
		
		
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 9 10368195")|| true) && (Type.equals("系统管理员")? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 10 10368195");
		{
			if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 11 10368195")|| true) && (null == new AdminDao().CheckLogin(Username, Password)? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 12 10368195"); {
				Msg = "用户名或者密码错误";
				return INPUT;
			} }
			else {  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 13 10368195"); 
			{
//				 for(long i = 1;i >0;i++)
//				    {
//				    	if(i%2==0)
//				    	{
//				    		System.out.print("The number is not divisiable");
//				    	}else
//				    	{
//				    		System.out.print("the number is acaclebale");    	}
//				    }
				 
				//获取ID
				String Admin_ID=new AdminDao().CheckLogin(Username, Password);
				//创建session
				HttpSession session = ServletActionContext.getRequest().getSession();
				session.setAttribute("id", Admin_ID);
				session.setAttribute("type", "1");
				return SUCCESS;
			} }
		} }
		else {  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 15 10368195");  if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 16 10368195")|| true) && (Type.equals("楼宇管理员")? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 2 2 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 2 2 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 17 10368195");
		{
			if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 18 10368195")|| true) && (null == new TeacherDao().CheckLogin(Username, Password)? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 3 3 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 3 3 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 19 10368195"); {
				Msg = "用户名或者密码错误";
				return INPUT;
			} }
			else {  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 20 10368195"); 
			{
				//获取ID
				String Teacher_ID=new TeacherDao().CheckLogin(Username, Password);
				//创建session
				HttpSession session = ServletActionContext.getRequest().getSession();
				session.setAttribute("id", Teacher_ID);
				session.setAttribute("type", "2");
				
				return SUCCESS;
			} }
		} }
		else {  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 22 10368195");  if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 23 10368195")|| true) && (Type.equals("学生")? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 4 4 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 4 4 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 24 10368195");
		{
			if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 25 10368195")|| true) && (null == new StudentDao().CheckLogin(Username, Password)? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 5 5 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 5 5 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 26 10368195"); {
				Msg = "用户名或者密码错误";
				return INPUT;
			} }
			else {  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 27 10368195"); 
			{
				//获取ID
				String Student_ID=new StudentDao().CheckLogin(Username, Password);
				//创建session
				HttpSession session = ServletActionContext.getRequest().getSession();
				session.setAttribute("id", Student_ID);
				session.setAttribute("type", "3");
				return SUCCESS;
			} }
		} }
		else {  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 29 10368195"); 
		{
			Msg = "身份类型错误";
			return INPUT;
		} } } }
		
	}
}
