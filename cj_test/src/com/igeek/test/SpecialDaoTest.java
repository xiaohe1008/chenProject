package com.igeek.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.igeek.dao.ISpecialDao;

public class SpecialDaoTest {
	private ISpecialDao specialDao;
	private SqlSession session;
	@Before
	public void setUp() throws Exception {
		try {
			
			//创建SessionFactoryBuilde
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			
			//获得mybaits配置文件的数据流
			Reader reader = Resources.getResourceAsReader("config.xml");
			
			//启动mybaits框架，创建SqlSessionFactory
			SqlSessionFactory factory = builder.build(reader);
			
			//创建SqlSession对象，该对象用于数据连接，并封装了数据访问
			session = factory.openSession();
			
			//获取DAO的实例对象
			specialDao = session.getMapper(ISpecialDao.class);	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void tearDown() throws Exception {
		//关闭session
		session.close();
	}

	@Test
	public void testFindAll() {
		specialDao.findAll().forEach(System.out::println);
	}

	@Test
	public void testFindById() {
		System.out.println(specialDao.findById(1));
	}

	@Test
	public void testFindByName() {
		specialDao.findByName("空空如也").forEach(System.out::println);
	}

}
