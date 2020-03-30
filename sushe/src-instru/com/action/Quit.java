// ZOA_CREATED! DO NOT EDIT IT! -- 
package com.action;

import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;


import com.process.ZoaExp;
import com.process.ZoaThreadLocal;
public class Quit extends ActionSupport {


	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 18 0 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","Quit","10368195");
		
		//清除session
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.removeAttribute("id");
		
		return SUCCESS;
		
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 18 1 10368195"); 
		System.out.println();
	}
	
}
