// ZOA_CREATED! DO NOT EDIT IT! -- 
package com.dao;

import com.db.DBHelper;
import com.bean.OutBean;

import java.util.*;
import java.sql.*;

import com.process.ZoaExp;
import com.process.ZoaThreadLocal;
public class OutDao {
	
	//获取列表
	public List<OutBean> GetList(String strwhere,String strorder){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 0 10368195"); 
		String sql="select * from Out1 o,Student s where o.Out_StudentID=s.Student_ID";
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 1 10368195")|| true) && (!(isInvalid(strwhere))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 2 10368195");
		{
			sql+=" and  "+strwhere;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 4 10368195");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 5 10368195")|| true) && (!(isInvalid(strorder))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 6 10368195");
		{
			sql+=" order by "+strorder;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 8 10368195");
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		List<OutBean> list=new ArrayList<OutBean>();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 9 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 10 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 2 2 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 2 2 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 11 10368195"); {
				OutBean cnbean=new OutBean();
				cnbean.setOut_ID(rs.getInt("Out_ID"));
				cnbean.setOut_StudentID(rs.getInt("Out_StudentID"));
				cnbean.setOut_Date(rs.getString("Out_Date"));
				cnbean.setOut_Remark(rs.getString("Out_Remark"));
				cnbean.setStudent_Username(rs.getString("Student_Username"));
				cnbean.setStudent_Name(rs.getString("Student_Name"));
				cnbean.setStudent_Sex(rs.getString("Student_Sex"));
				cnbean.setStudent_Class(rs.getString("Student_Class"));
				list.add(cnbean);
			}}
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 15 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 16 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 17 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 18 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 3 3 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 3 3 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 19 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 21 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 22 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 4 4 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 4 4 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 23 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 25 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 26 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 5 5 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 5 5 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 27 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 30 10368195"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 32 10368195");
		return list;
	}
	
	//获取指定ID的实体Bean
	public OutBean GetBean(int id){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 33 10368195"); 
		String sql="select * from Out where Out_ID="+id;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		OutBean cnbean=new OutBean();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 34 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 35 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 6 6 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 6 6 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 36 10368195"); {
				cnbean.setOut_ID(rs.getInt("Out_ID"));
				cnbean.setOut_StudentID(rs.getInt("Out_StudentID"));
				cnbean.setOut_Date(rs.getString("Out_Date"));
				cnbean.setOut_Remark(rs.getString("Out_Remark"));
				
			}}
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 40 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 41 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 42 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 43 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 7 7 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 7 7 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 44 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 46 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 47 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 8 8 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 8 8 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 48 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 50 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 51 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 9 9 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 9 9 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 52 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 55 10368195"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 57 10368195");
		return cnbean;
	}
	
	//添加
	public void Add(OutBean cnbean){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 58 10368195"); 
		String sql="insert into Out1 (";
		sql+="Out_StudentID,Out_Date,Out_Remark";
		sql+=") values(";
		sql+="'"+cnbean.getOut_StudentID()+"','"+cnbean.getOut_Date()+"','"+cnbean.getOut_Remark()+"'";
		sql+=")";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 59 10368195"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 60 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 61 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 62 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 63 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 10 10 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 10 10 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 64 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 66 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 67 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 11 11 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 11 11 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 68 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 70 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 71 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 12 12 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 12 12 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 72 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 75 10368195"); 
				e.printStackTrace();
			}
		}
	}
	//修改
	public void Update(OutBean cnbean){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 78 10368195"); 
		String sql="update Out set ";
		sql+="Out_StudentID='"+cnbean.getOut_StudentID()+"',";
		sql+="Out_Date='"+cnbean.getOut_Date()+"',";
		sql+="Out_Remark='"+cnbean.getOut_Remark()+"'";
		
		sql+=" where Out_ID='"+cnbean.getOut_ID()+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 79 10368195"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 80 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 81 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 82 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 83 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 13 13 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 13 13 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 84 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 86 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 87 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 14 14 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 14 14 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 88 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 90 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 91 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 15 15 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 15 15 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 92 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 95 10368195"); 
				e.printStackTrace();
			}
		}
	}
	//删除
	public void Delete(String strwhere){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 98 10368195"); 
		String sql="delete Out where ";
		sql+=strwhere;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 99 10368195"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 100 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 101 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 102 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 103 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 16 16 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 16 16 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 104 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 106 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 107 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 17 17 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 17 17 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 108 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 110 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 111 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 18 18 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 18 18 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 112 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 115 10368195"); 
				e.printStackTrace();
			}
		}
	}

	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 118 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 119 10368195"); 
		System.out.println("");
	}
	
}

