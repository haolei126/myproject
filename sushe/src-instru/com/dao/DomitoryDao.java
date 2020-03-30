// ZOA_CREATED! DO NOT EDIT IT! -- 
package com.dao;

import com.db.DBHelper;
import com.bean.DomitoryBean;

import java.util.*;
import java.sql.*;

import com.process.ZoaExp;
import com.process.ZoaThreadLocal;
public class DomitoryDao {
	
	//获取列表
	public List<DomitoryBean> GetList(String strwhere,String strorder){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 31 0 10368195"); 
		String sql="select * from Domitory,Building where Domitory_BuildingID=Building_ID";
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 1 10368195")|| true) && (!(isInvalid(strwhere))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 2 10368195");
		{
			sql+=" and "+strwhere;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 4 10368195");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 5 10368195")|| true) && (!(isInvalid(strorder))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 6 10368195");
		{
			sql+=" order by "+strorder;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 8 10368195");
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		List<DomitoryBean> list=new ArrayList<DomitoryBean>();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 9 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 10 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 2 2 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 2 2 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 11 10368195"); {
				DomitoryBean cnbean=new DomitoryBean();
				cnbean.setDomitory_ID(rs.getInt("Domitory_ID"));
				cnbean.setDomitory_BuildingID(rs.getInt("Domitory_BuildingID"));
				cnbean.setDomitory_Name(rs.getString("Domitory_Name"));
				cnbean.setDomitory_Type(rs.getString("Domitory_Type"));
				cnbean.setDomitory_Number(rs.getString("Domitory_Number"));
				cnbean.setDomitory_Tel(rs.getString("Domitory_Tel"));
				cnbean.setBuilding_Name(rs.getString("Building_Name"));
				list.add(cnbean);
			}}
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 15 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 16 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 17 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 18 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 3 3 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 3 3 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 19 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 21 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 22 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 4 4 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 4 4 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 23 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 25 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 26 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 5 5 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 5 5 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 27 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 30 10368195"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 32 10368195");
		return list;
	}
	
	//获取指定ID的实体Bean
	public DomitoryBean GetBean(int id){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 31 33 10368195"); 
		String sql="select * from Domitory,Building where Domitory_BuildingID=Building_ID and Domitory_ID="+id;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		DomitoryBean cnbean=new DomitoryBean();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 34 10368195"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 35 10368195")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 6 6 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 6 6 0 0 ","10368195",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 36 10368195"); {
				cnbean.setDomitory_ID(rs.getInt("Domitory_ID"));
				cnbean.setDomitory_BuildingID(rs.getInt("Domitory_BuildingID"));
				cnbean.setDomitory_Name(rs.getString("Domitory_Name"));
				cnbean.setDomitory_Type(rs.getString("Domitory_Type"));
				cnbean.setDomitory_Number(rs.getString("Domitory_Number"));
				cnbean.setDomitory_Tel(rs.getString("Domitory_Tel"));
				cnbean.setBuilding_Name(rs.getString("Building_Name"));
			}}
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 40 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 41 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 42 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 43 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 7 7 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 7 7 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 44 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 46 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 47 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 8 8 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 8 8 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 48 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 50 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 51 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 9 9 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 9 9 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 52 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 55 10368195"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 57 10368195");
		return cnbean;
	}
	
	//添加
	public void Add(DomitoryBean cnbean){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 31 58 10368195"); 
		String sql="insert into Domitory (";
		sql+="Domitory_BuildingID,Domitory_Name,Domitory_Type,Domitory_Number,Domitory_Tel";
		sql+=") values(";
		sql+="'"+cnbean.getDomitory_BuildingID()+"','"+cnbean.getDomitory_Name()+"','"+cnbean.getDomitory_Type()+"','"+cnbean.getDomitory_Number()+"','"+cnbean.getDomitory_Tel()+"'";
		sql+=")";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 59 10368195"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 60 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 61 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 62 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 63 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 10 10 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 10 10 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 64 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 66 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 67 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 11 11 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 11 11 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 68 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 70 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 71 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 12 12 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 12 12 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 72 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 75 10368195"); 
				e.printStackTrace();
			}
		}
	}
	//修改
	public void Update(DomitoryBean cnbean){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 31 78 10368195"); 
		String sql="update Domitory set ";
		sql+="Domitory_BuildingID='"+cnbean.getDomitory_BuildingID()+"',";
		sql+="Domitory_Name='"+cnbean.getDomitory_Name()+"',";
		sql+="Domitory_Type='"+cnbean.getDomitory_Type()+"',";
		sql+="Domitory_Number='"+cnbean.getDomitory_Number()+"',";
		sql+="Domitory_Tel='"+cnbean.getDomitory_Tel()+"'";
		
		sql+=" where Domitory_ID='"+cnbean.getDomitory_ID()+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 79 10368195"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 80 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 81 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 82 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 83 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 13 13 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 13 13 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 84 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 86 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 87 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 14 14 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 14 14 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 88 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 90 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 91 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 15 15 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 15 15 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 92 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 95 10368195"); 
				e.printStackTrace();
			}
		}
	}
	//删除
	public void Delete(String strwhere){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 31 98 10368195"); 
		String sql="delete Domitory where ";
		sql+=strwhere;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 99 10368195"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 100 10368195"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 101 10368195"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 102 10368195"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 103 10368195")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 16 16 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 16 16 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 104 10368195");
					conn.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 106 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 107 10368195")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 17 17 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 17 17 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 108 10368195");
					stat.close(); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 110 10368195");
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 111 10368195")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 18 18 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 31 18 18 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 112 10368195");
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 31 115 10368195"); 
				e.printStackTrace();
			}
		}
	}

	
	//判断是否空值
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 31 118 10368195"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 31 119 10368195"); 
		System.out.println("");
	}
	
}

