package com.aurora.util;



import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 封装了mybatis核心类sqlSession的打开与关闭操作
 * sqlSessionFactory
 * sqlSession：封装了PreparedStatement,用于执行sql + 一级缓存
 */
public class MyBatisUtil {
	private static SqlSessionFactory sessionFactory;
	private static SqlSession session = null;
	
	static{//类加载的时候执行
		InputStream is =null;
		try {

			is = Resources.getResourceAsStream("mybatis-config.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		 sessionFactory = new SqlSessionFactoryBuilder().build(is);
	}
	
	/**
	 * 获得SqlSession对象
	 * @return
	 */
	public static SqlSession getSession(){
		session = sessionFactory.openSession();//创建一个新的SqlSession对象
		return session;
	}
	 
	/**
	 * 关闭SqlSession
	 */
	public static void closeSession(){
		if(session !=null)
			session.close();
	}


	public static void main(String[] args) {
		try {
			//创建连接
		Connection connection =  MyBatisUtil.getSession().getConfiguration().getEnvironment().getDataSource().getConnection();
		System.out.println(connection);
		Connection connection2 =  MyBatisUtil.getSession().getConfiguration().getEnvironment().getDataSource().getConnection();
			System.out.println(connection2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
