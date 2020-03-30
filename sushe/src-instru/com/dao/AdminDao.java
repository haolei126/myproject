// ZOA_CREATED! DO NOT EDIT IT! -- 
package com.dao;

import com.db.DBHelper;
import com.bean.AdminBean;

import java.util.*;
import java.sql.*;

import com.process.ZoaExp;
import com.process.ZoaThreadLocal;
public class AdminDao {
	
	//验证登录
	public String CheckLogin(String username, String password){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 55 0 10368195"); 
		String id = null;
		String sql="select * from Admin where Admin_Username='"+username+"' and Admin_Password='"+password+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 1 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 2 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 0 0 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 3 10368195");  {
				id = rs.getString("Admin_ID");
			}}
		}
		catch(SQLException ex){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 7 10368195"); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 8 10368195");
		System.out.print("The number is not divisiable");
		return id;
	}
	//验证密码
	public boolean CheckPassword(String id, String password){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 55 9 10368195"); 
		boolean ps = false;
		String sql="select * from Admin where Admin_ID='"+id+"' and Admin_Password='"+password+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 10 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 11 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 1 1 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 12 10368195");  {
				ps=true;
			}}
		}
		catch(SQLException ex){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 16 10368195"); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 17 10368195");
		return ps;
	}
	//获取列表
	public List<AdminBean> GetList(String strwhere,String strorder){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 55 18 10368195"); 
		String sql="select * from Admin";
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 19 10368195")|| true) && (!(isInvalid(strwhere))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 2 2 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 2 2 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 20 10368195");
		{
			sql+=" where "+strwhere;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 22 10368195");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 23 10368195")|| true) && (!(isInvalid(strorder))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 3 3 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 3 3 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 24 10368195");
		{
			sql+=" order by "+strorder;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 26 10368195");
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		List<AdminBean> list=new ArrayList<AdminBean>();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 27 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 28 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 4 4 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 4 4 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 29 10368195"); {
				AdminBean cnbean=new AdminBean();
				cnbean.setAdmin_ID(rs.getInt("Admin_ID"));
				cnbean.setAdmin_Username(rs.getString("Admin_Username"));
				cnbean.setAdmin_Password(rs.getString("Admin_Password"));
				cnbean.setAdmin_Name(rs.getString("Admin_Name"));
				cnbean.setAdmin_Sex(rs.getString("Admin_Sex"));
				cnbean.setAdmin_Tel(rs.getString("Admin_Tel"));
				list.add(cnbean);
			}}
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 33 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 34 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 35 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 36 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 5 5 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 5 5 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 37 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 39 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 40 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 6 6 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 6 6 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 41 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 43 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 44 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 7 7 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 7 7 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 45 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 48 10368195"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 50 10368195");
		return list;
	}
	
	//获取指定ID的实体Bean
	public AdminBean GetBean(int id){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 55 51 10368195"); 
		String sql="select * from Admin where Admin_ID="+id;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		AdminBean cnbean=new AdminBean();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 52 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 53 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 8 8 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 8 8 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 54 10368195"); {
				cnbean.setAdmin_ID(rs.getInt("Admin_ID"));
				cnbean.setAdmin_Username(rs.getString("Admin_Username"));
				cnbean.setAdmin_Password(rs.getString("Admin_Password"));
				cnbean.setAdmin_Name(rs.getString("Admin_Name"));
				cnbean.setAdmin_Sex(rs.getString("Admin_Sex"));
				cnbean.setAdmin_Tel(rs.getString("Admin_Tel"));
				
			}}
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 58 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 59 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 60 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 61 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 9 9 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 9 9 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 62 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 64 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 65 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 10 10 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 10 10 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 66 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 68 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 69 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 11 11 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 11 11 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 70 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 73 10368195"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 75 10368195");
		return cnbean;
	}
	
	//添加
	public void Add(AdminBean cnbean){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 55 76 10368195"); 
		String sql="insert into Admin (";
		sql+="Admin_Username,Admin_Password,Admin_Name,Admin_Sex,Admin_Tel";
		sql+=") values(";
		sql+="'"+cnbean.getAdmin_Username()+"','"+cnbean.getAdmin_Password()+"','"+cnbean.getAdmin_Name()+"','"+cnbean.getAdmin_Sex()+"','"+cnbean.getAdmin_Tel()+"'";
		sql+=")";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 77 10368195"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 78 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 79 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 80 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 81 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 12 12 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 12 12 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 82 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 84 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 85 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 13 13 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 13 13 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 86 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 88 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 89 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 14 14 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 14 14 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 90 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 93 10368195"); 
				e.printStackTrace();
			}
		}
	}
	//修改
	public void Update(AdminBean cnbean){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 55 96 10368195"); 
		String sql="update Admin set ";
		sql+="Admin_Username='"+cnbean.getAdmin_Username()+"',";
		sql+="Admin_Password='"+cnbean.getAdmin_Password()+"',";
		sql+="Admin_Name='"+cnbean.getAdmin_Name()+"',";
		sql+="Admin_Sex='"+cnbean.getAdmin_Sex()+"',";
		sql+="Admin_Tel='"+cnbean.getAdmin_Tel()+"'";
		
		sql+=" where Admin_ID='"+cnbean.getAdmin_ID()+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 97 10368195"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 98 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 99 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 100 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 101 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 15 15 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 15 15 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 102 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 104 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 105 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 16 16 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 16 16 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 106 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 108 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 109 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 17 17 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 17 17 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 110 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 113 10368195"); 
				e.printStackTrace();
			}
		}
	}
	//删除
	public void Delete(String strwhere){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 55 116 10368195"); 
		String sql="delete Admin where ";
		sql+=strwhere;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 117 10368195"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 118 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 119 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 120 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 121 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 18 18 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 18 18 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 122 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 124 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 125 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 19 19 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 19 19 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 126 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 128 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 129 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 20 20 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 55 20 20 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 130 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 55 133 10368195"); 
				e.printStackTrace();
			}
		}
	}

	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 55 136 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 55 137 10368195"); 
		System.out.println("");
	}
	
}

