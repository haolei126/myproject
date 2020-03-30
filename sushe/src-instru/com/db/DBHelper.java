// ZOA_CREATED! DO NOT EDIT IT! -- 
package com.db;

import java.sql.*;

import com.process.ZoaExp;
import com.process.ZoaThreadLocal;
public class DBHelper {	
	private String dbUrl="jdbc:mysql://localhost:3306/sushe";
	private String dbUser="root";
	private String dbPassword="root";
	private String jdbcName="com.mysql.jdbc.Driver";
	
	//连接数据库
	public Connection getConn(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 22 0 10368195"); 
		Connection conn = null;
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 22 1 10368195"); 
			Class.forName(jdbcName);
		}
		catch(Exception e){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 22 2 10368195"); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 22 3 10368195");
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 22 4 10368195"); 
			conn=DriverManager.getConnection(dbUrl,dbUser,dbPassword);
		}
		catch(SQLException ex){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 22 5 10368195"); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 22 6 10368195");
		return conn;		
	}
	
//    测试
	public static void main(String[] args)
	{
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 22 7 10368195"); 
		System.out.println(new DBHelper().getConn());
		
	}
	
}
