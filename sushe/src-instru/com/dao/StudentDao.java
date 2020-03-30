// ZOA_CREATED! DO NOT EDIT IT! -- 
package com.dao;

import com.db.DBHelper;
import com.bean.StudentBean;

import java.util.*;
import java.sql.*;

import com.process.ZoaExp;
import com.process.ZoaThreadLocal;
public class StudentDao {
	
	//验证登录
	public String CheckLogin(String username, String password){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 0 10368195"); 
		String id = null;
		String sql="select * from Student where Student_Username='"+username+"' and Student_Password='"+password+"' and Student_State='入住'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 1 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 2 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 0 0 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 3 10368195");  {
				id = rs.getString("Student_ID");
			}}
		}
		catch(SQLException ex){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 7 10368195"); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 8 10368195");
		return id;
	}
	//验证密码
	public boolean CheckPassword(String id, String password){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 9 10368195"); 
		boolean ps = false;
		String sql="select * from Student where Student_ID='"+id+"' and Student_Password='"+password+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 10 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 11 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 1 1 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 12 10368195");  {
				ps=true;
			}}
		}
		catch(SQLException ex){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 16 10368195"); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 17 10368195");
		return ps;
	}
	//获取所有列表
	public List<StudentBean> GetAllList(String strwhere,String strorder){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 18 10368195"); 
		String sql="select * from Student";
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 19 10368195")|| true) && (!(isInvalid(strwhere))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 2 2 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 2 2 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 20 10368195");
		{
			sql+=" where "+strwhere;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 22 10368195");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 23 10368195")|| true) && (!(isInvalid(strorder))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 3 3 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 3 3 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 24 10368195");
		{
			sql+=" order by "+strorder;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 26 10368195");
//		System.out.println(sql);
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		List<StudentBean> list=new ArrayList<StudentBean>();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 27 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 28 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 4 4 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 4 4 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 29 10368195"); {
				StudentBean cnbean=new StudentBean();
				cnbean.setStudent_ID(rs.getInt("Student_ID"));
				cnbean.setStudent_DomitoryID(rs.getInt("Student_DomitoryID"));
				cnbean.setStudent_Username(rs.getString("Student_Username"));
				cnbean.setStudent_Password(rs.getString("Student_Password"));
				cnbean.setStudent_Name(rs.getString("Student_Name"));
				cnbean.setStudent_Sex(rs.getString("Student_Sex"));
				cnbean.setStudent_Class(rs.getString("Student_Class"));
				cnbean.setStudent_State(rs.getString("Student_State"));
				list.add(cnbean);
			}}
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 33 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 34 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 35 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 36 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 5 5 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 5 5 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 37 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 39 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 40 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 6 6 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 6 6 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 41 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 43 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 44 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 7 7 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 7 7 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 45 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 48 10368195"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 50 10368195");
		return list;
	}
	//获取列表
	public List<StudentBean> GetList(String strwhere,String strorder){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 51 10368195"); 
		String sql="select * from Student,Domitory,Building where Student_DomitoryID=Domitory_ID and Domitory_BuildingID=Building_ID";
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 52 10368195")|| true) && (!(isInvalid(strwhere))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 8 8 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 8 8 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 53 10368195");
		{
			sql+=" and "+strwhere;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 55 10368195");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 56 10368195")|| true) && (!(isInvalid(strorder))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 9 9 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 9 9 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 57 10368195");
		{
			sql+=" order by "+strorder;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 59 10368195");
//		System.out.println(sql);
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		List<StudentBean> list=new ArrayList<StudentBean>();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 60 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 61 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 10 10 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 10 10 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 62 10368195"); {
				StudentBean cnbean=new StudentBean();
				cnbean.setStudent_ID(rs.getInt("Student_ID"));
				cnbean.setStudent_DomitoryID(rs.getInt("Student_DomitoryID"));
				cnbean.setStudent_Username(rs.getString("Student_Username"));
				cnbean.setStudent_Password(rs.getString("Student_Password"));
				cnbean.setStudent_Name(rs.getString("Student_Name"));
				cnbean.setStudent_Sex(rs.getString("Student_Sex"));
				cnbean.setStudent_Class(rs.getString("Student_Class"));
				cnbean.setStudent_State(rs.getString("Student_State"));
				cnbean.setDomitory_Name(rs.getString("Domitory_Name"));
				cnbean.setBuilding_Name(rs.getString("Building_Name"));
				cnbean.setDomitory_Type(rs.getString("Domitory_Type"));
				cnbean.setDomitory_Number(rs.getString("Domitory_Number"));
				cnbean.setDomitory_Tel(rs.getString("Domitory_Tel"));
				list.add(cnbean);
			}}
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 66 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 67 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 68 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 69 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 11 11 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 11 11 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 70 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 72 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 73 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 12 12 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 12 12 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 74 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 76 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 77 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 13 13 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 13 13 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 78 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 81 10368195"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 83 10368195");
		return list;
	}
	//获取指定ID的实体Bean
	public StudentBean GetAllFirstBean(String strwhere){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 84 10368195"); 
		String sql="select * from Student where "+strwhere;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		StudentBean cnbean=new StudentBean();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 85 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 86 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 14 14 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 14 14 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 87 10368195");{
				cnbean.setStudent_ID(rs.getInt("Student_ID"));
				cnbean.setStudent_DomitoryID(rs.getInt("Student_DomitoryID"));
				cnbean.setStudent_Username(rs.getString("Student_Username"));
				cnbean.setStudent_Password(rs.getString("Student_Password"));
				cnbean.setStudent_Name(rs.getString("Student_Name"));
				cnbean.setStudent_Sex(rs.getString("Student_Sex"));
				cnbean.setStudent_Class(rs.getString("Student_Class"));
				cnbean.setStudent_State(rs.getString("Student_State"));	
			} }
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 90 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 91 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 92 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 93 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 15 15 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 15 15 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 94 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 96 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 97 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 16 16 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 16 16 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 98 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 100 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 101 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 17 17 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 17 17 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 102 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 105 10368195"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 107 10368195");
		return cnbean;
	}
	//获取指定ID的实体Bean
	public StudentBean GetFirstBean(String strwhere){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 108 10368195"); 
		String sql="select * from Student,Domitory,Building where Student_DomitoryID=Domitory_ID and Domitory_BuildingID=Building_ID and "+strwhere;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		StudentBean cnbean=new StudentBean();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 109 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 110 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 18 18 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 18 18 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 111 10368195");{
				cnbean.setStudent_ID(rs.getInt("Student_ID"));
				cnbean.setStudent_DomitoryID(rs.getInt("Student_DomitoryID"));
				cnbean.setStudent_Username(rs.getString("Student_Username"));
				cnbean.setStudent_Password(rs.getString("Student_Password"));
				cnbean.setStudent_Name(rs.getString("Student_Name"));
				cnbean.setStudent_Sex(rs.getString("Student_Sex"));
				cnbean.setStudent_Class(rs.getString("Student_Class"));
				cnbean.setStudent_State(rs.getString("Student_State"));	
				cnbean.setDomitory_Name(rs.getString("Domitory_Name"));
				cnbean.setBuilding_Name(rs.getString("Building_Name"));
			} }
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 114 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 115 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 116 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 117 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 19 19 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 19 19 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 118 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 120 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 121 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 20 20 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 20 20 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 122 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 124 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 125 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 21 21 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 21 21 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 126 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 129 10368195"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 131 10368195");
		return cnbean;
	}
	//获取指定ID的实体Bean
	public StudentBean GetAllBean(int id){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 132 10368195"); 
		String sql="select * from Student where Student_ID="+id;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		StudentBean cnbean=new StudentBean();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 133 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 134 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 22 22 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 22 22 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 135 10368195"); {
				cnbean.setStudent_ID(rs.getInt("Student_ID"));
				cnbean.setStudent_DomitoryID(rs.getInt("Student_DomitoryID"));
				cnbean.setStudent_Username(rs.getString("Student_Username"));
				cnbean.setStudent_Password(rs.getString("Student_Password"));
				cnbean.setStudent_Name(rs.getString("Student_Name"));
				cnbean.setStudent_Sex(rs.getString("Student_Sex"));
				cnbean.setStudent_Class(rs.getString("Student_Class"));
				cnbean.setStudent_State(rs.getString("Student_State"));
			}}
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 139 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 140 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 141 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 142 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 23 23 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 23 23 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 143 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 145 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 146 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 24 24 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 24 24 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 147 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 149 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 150 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 25 25 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 25 25 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 151 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 154 10368195"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 156 10368195");
		return cnbean;
	}
	//获取指定ID的实体Bean
	public StudentBean GetBean(int id){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 157 10368195"); 
		String sql="select * from Student,Domitory,Building where Student_DomitoryID=Domitory_ID and Domitory_BuildingID=Building_ID and Student_ID="+id;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		StudentBean cnbean=new StudentBean();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 158 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 159 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 26 26 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 26 26 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 160 10368195"); {
				cnbean.setStudent_ID(rs.getInt("Student_ID"));
				cnbean.setStudent_DomitoryID(rs.getInt("Student_DomitoryID"));
				cnbean.setStudent_Username(rs.getString("Student_Username"));
				cnbean.setStudent_Password(rs.getString("Student_Password"));
				cnbean.setStudent_Name(rs.getString("Student_Name"));
				cnbean.setStudent_Sex(rs.getString("Student_Sex"));
				cnbean.setStudent_Class(rs.getString("Student_Class"));
				cnbean.setStudent_State(rs.getString("Student_State"));
				cnbean.setDomitory_Name(rs.getString("Domitory_Name"));
				cnbean.setBuilding_Name(rs.getString("Building_Name"));
			}}
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 164 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 165 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 166 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 167 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 27 27 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 27 27 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 168 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 170 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 171 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 28 28 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 28 28 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 172 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 174 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 175 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 29 29 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 29 29 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 176 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 179 10368195"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 181 10368195");
		return cnbean;
	}
	
	//添加
	public void Add(StudentBean cnbean){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 182 10368195"); 
		String sql="insert into Student (";
		sql+="Student_DomitoryID,Student_Username,Student_Password,Student_Name,Student_Sex,Student_Class,Student_State";
		sql+=") values(";
		sql+="'"+cnbean.getStudent_DomitoryID()+"','"+cnbean.getStudent_Username()+"','"+cnbean.getStudent_Password()+"','"+cnbean.getStudent_Name()+"','"+cnbean.getStudent_Sex()+"','"+cnbean.getStudent_Class()+"','"+cnbean.getStudent_State()+"'";
		sql+=")";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 183 10368195"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 184 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 185 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 186 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 187 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 30 30 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 30 30 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 188 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 190 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 191 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 31 31 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 31 31 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 192 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 194 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 195 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 32 32 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 32 32 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 196 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 199 10368195"); 
				e.printStackTrace();
			}
		}
	}
	//修改
	public void Update(StudentBean cnbean){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 202 10368195"); 
		String sql="update Student set ";
		sql+="Student_DomitoryID='"+cnbean.getStudent_DomitoryID()+"',";
		sql+="Student_Username='"+cnbean.getStudent_Username()+"',";
		sql+="Student_Password='"+cnbean.getStudent_Password()+"',";
		sql+="Student_Name='"+cnbean.getStudent_Name()+"',";
		sql+="Student_Sex='"+cnbean.getStudent_Sex()+"',";
		sql+="Student_Class='"+cnbean.getStudent_Class()+"',";
		sql+="Student_State='"+cnbean.getStudent_State()+"'";
		
		sql+=" where Student_ID='"+cnbean.getStudent_ID()+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 203 10368195"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 204 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 205 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 206 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 207 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 33 33 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 33 33 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 208 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 210 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 211 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 34 34 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 34 34 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 212 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 214 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 215 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 35 35 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 35 35 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 216 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 219 10368195"); 
				e.printStackTrace();
			}
		}
	}
	//删除
	public void Delete(String strwhere){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 222 10368195"); 
		String sql="delete Student where ";
		sql+=strwhere;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 223 10368195"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 224 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 225 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 226 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 227 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 36 36 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 36 36 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 228 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 230 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 231 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 37 37 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 37 37 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 232 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 234 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 235 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 38 38 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 38 38 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 236 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 239 10368195"); 
				e.printStackTrace();
			}
		}
	}

	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 242 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 243 10368195"); 
		System.out.println("");
	}
	
}

