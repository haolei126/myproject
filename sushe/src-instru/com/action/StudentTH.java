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
public class StudentTH extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private List<BuildingBean> buildinglist;
	private List<DomitoryBean> domitorylist;

	public List<BuildingBean> getBuildinglist() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 47 0 10368195"); 
		return buildinglist;
	}

	public void setBuildinglist(List<BuildingBean> buildinglist) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 47 1 10368195"); 
		this.buildinglist = buildinglist;
	}

	public List<DomitoryBean> getDomitorylist() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 47 2 10368195"); 
		return domitorylist;
	}

	public void setDomitorylist(List<DomitoryBean> domitorylist) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 47 3 10368195"); 
		this.domitorylist = domitorylist;
	}

	private String BuildingID;
	private String DomitoryID;
	public String getBuildingID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 47 4 10368195"); 
		return BuildingID;
	}

	public void setBuildingID(String buildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 47 5 10368195"); 
		BuildingID = buildingID;
	}

	public String getDomitoryID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 47 6 10368195"); 
		return DomitoryID;
	}

	public void setDomitoryID(String domitoryID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 47 7 10368195"); 
		DomitoryID = domitoryID;
	}

	private String Student_Username;
	
	public String getStudent_Username() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 47 8 10368195"); 
		return Student_Username;
	}

	public void setStudent_Username(String studentUsername) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 47 9 10368195"); 
		Student_Username = studentUsername;
	}
	private StudentBean cnbean;
	public StudentBean getCnbean() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 47 10 10368195"); 
		return cnbean;
	}

	public void setCnbean(StudentBean cnbean) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 47 11 10368195"); 
		this.cnbean = cnbean;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 47 12 10368195"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","StudentTH","10368195");
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 47 13 10368195")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 47 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 47 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 47 14 10368195");{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 47 16 10368195");
		
		//查询是否存在
		List<StudentBean> list=new StudentDao().GetList("Student_Username='"+Student_Username+"'", "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 47 17 10368195")|| true) && (list.size()<1? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 47 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 47 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 47 18 10368195");
		{
			out.print("<script language='javascript'>alert('学号不存在，或学生未处于入住状态！');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 47 20 10368195");
		
		
		//查询楼宇
		buildinglist=new BuildingDao().GetList("","Building_Name");
//		System.out.println(BuildingID);
		//查询条件
		String strWhere="1=1 ";
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 47 21 10368195")|| true) && (!(isInvalid(BuildingID))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 47 2 2 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 47 2 2 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 47 22 10368195");
		{
			strWhere+=" and Domitory_BuildingID='"+BuildingID+"'";
		} }
		else {  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 47 23 10368195"); {
			strWhere+=" and 1=2";
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 47 24 10368195");
		//查询寝室
		domitorylist=new DomitoryDao().GetList(strWhere,"Domitory_Name");
		
		//查询学生信息
		cnbean=new StudentDao().GetFirstBean("Student_Username='"+Student_Username+"'");
		
		return SUCCESS;
		
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 47 25 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 47 26 10368195"); 
		System.out.println();
	}
	
}
