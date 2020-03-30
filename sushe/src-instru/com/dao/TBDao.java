// ZOA_CREATED! DO NOT EDIT IT! -- 
package com.dao;

import com.db.DBHelper;
import com.bean.TBBean;

import java.util.*;
import java.sql.*;

import com.process.ZoaExp;
import com.process.ZoaThreadLocal;
public class TBDao {
	
	//获取列表
	public List<TBBean> GetList(String strwhere,String strorder){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 49 0 10368195"); 
		String sql="select * from TB,Teacher,Building where TB_TeacherID=Teacher_ID and TB_BuildingID=Building_ID";
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 1 10368195")|| true) && (!(isInvalid(strwhere))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 2 10368195");
		{
			sql+=" and "+strwhere;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 4 10368195");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 5 10368195")|| true) && (!(isInvalid(strorder))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 6 10368195");
		{
			sql+=" order by "+strorder;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 8 10368195");
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		List<TBBean> list=new ArrayList<TBBean>();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 9 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 10 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 2 2 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 2 2 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 11 10368195"); {
				TBBean cnbean=new TBBean();
				cnbean.setTB_ID(rs.getInt("TB_ID"));
				cnbean.setTB_TeacherID(rs.getInt("TB_TeacherID"));
				cnbean.setTB_BuildingID(rs.getInt("TB_BuildingID"));
				cnbean.setTeacher_Name(rs.getString("Teacher_Name"));
				cnbean.setTeacher_Sex(rs.getString("Teacher_Sex"));
				cnbean.setTeacher_Tel(rs.getString("Teacher_Tel"));
				cnbean.setTeacher_Username(rs.getString("Teacher_Username"));
				cnbean.setBuilding_Name(rs.getString("Building_Name"));
				list.add(cnbean);
			}}
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 15 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 16 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 17 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 18 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 3 3 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 3 3 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 19 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 21 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 22 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 4 4 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 4 4 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 23 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 25 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 26 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 5 5 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 5 5 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 27 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 30 10368195"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 32 10368195");
		return list;
	}
	
	//获取指定ID的实体Bean
	public TBBean GetBean(int id){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 49 33 10368195"); 
		String sql="select * from TB where TB_ID="+id;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		TBBean cnbean=new TBBean();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 34 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 35 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 6 6 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 6 6 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 36 10368195"); {
				cnbean.setTB_ID(rs.getInt("TB_ID"));
				cnbean.setTB_TeacherID(rs.getInt("TB_TeacherID"));
				cnbean.setTB_BuildingID(rs.getInt("TB_BuildingID"));
				
			}}
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 40 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 41 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 42 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 43 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 7 7 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 7 7 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 44 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 46 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 47 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 8 8 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 8 8 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 48 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 50 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 51 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 9 9 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 9 9 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 52 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 55 10368195"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 57 10368195");
		return cnbean;
	}
	
	//添加
	public void Add(TBBean cnbean){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 49 58 10368195"); 
		String sql="insert into TB (";
		sql+="TB_TeacherID,TB_BuildingID";
		sql+=") values(";
		sql+="'"+cnbean.getTB_TeacherID()+"','"+cnbean.getTB_BuildingID()+"'";
		sql+=")";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 59 10368195"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 60 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 61 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 62 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 63 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 10 10 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 10 10 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 64 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 66 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 67 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 11 11 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 11 11 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 68 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 70 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 71 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 12 12 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 12 12 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 72 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 75 10368195"); 
				e.printStackTrace();
			}
		}
	}
	//修改
	public void Update(TBBean cnbean){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 49 78 10368195"); 
		String sql="update TB set ";
		sql+="TB_TeacherID='"+cnbean.getTB_TeacherID()+"',";
		sql+="TB_BuildingID='"+cnbean.getTB_BuildingID()+"'";
		
		sql+=" where TB_ID='"+cnbean.getTB_ID()+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 79 10368195"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 80 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 81 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 82 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 83 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 13 13 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 13 13 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 84 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 86 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 87 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 14 14 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 14 14 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 88 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 90 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 91 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 15 15 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 15 15 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 92 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 95 10368195"); 
				e.printStackTrace();
			}
		}
	}
	//删除
	public void Delete(String strwhere){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 49 98 10368195"); 
		String sql="delete TB where ";
		sql+=strwhere;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 99 10368195"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 100 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 101 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 102 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 103 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 16 16 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 16 16 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 104 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 106 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 107 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 17 17 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 17 17 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 108 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 110 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 111 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 18 18 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 49 18 18 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 112 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 49 115 10368195"); 
				e.printStackTrace();
			}
		}
	}

	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 49 118 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 49 119 10368195"); 
		System.out.println("");
	}
	
}

