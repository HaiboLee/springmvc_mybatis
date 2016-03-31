package com.lee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest {
	public static void main(String[] args) {
		//数据库连接
		Connection conn=null;
		//预编译的statement
		PreparedStatement pst=null;
		//结果集
		ResultSet rs=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mybatis?characterEncoding=utf-8", "root", "p@ssw0rd");
			String sql="select * from user where username= ? ";

			pst=conn.prepareStatement(sql);

			pst.setString(1, "王五");

			rs=pst.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("id")+"\t"+rs.getString("username"));
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}if(pst!=null){
				try {
					pst.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}if (conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}


	}
}
