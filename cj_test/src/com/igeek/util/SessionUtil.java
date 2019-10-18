package com.igeek.util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionUtil {
	private static SqlSessionFactory sqlSessionFactory = null;
	static {
		try {
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			Reader reader = Resources.getResourceAsReader("config.xml");
			sqlSessionFactory = builder.build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSession openSession() {
		return sqlSessionFactory.openSession();
	}

	public static <T> T createDao(Class<T> clazz, SqlSession sqlSession) {
		return sqlSession.getMapper(clazz);
	}
}
