package com.igeek.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.ibatis.session.SqlSession;

import com.igeek.util.SessionUtil;

/**
 * 	动态代理类，获取可以直接使用的到对象
 * @author 黄培锋
 *
 * @param <T> 
 */
public class DaoFactory {
	
	/**
	 * 	获取动态代理的dao对象
	 * @param <T>	被代理接口的类型
	 * @param clazz	被代理接口对象的字节码
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getProxyDao(Class<T> clazz) {
		return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[] {clazz},new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				Object rtValue = null;
				//获取session
				SqlSession session = SessionUtil.openSession();
				//获取mapper代理实现类obj
				T obj = session.getMapper(clazz);
				//执行obj中的方法方法
				rtValue = method.invoke(obj, args);
				//关闭session
				session.close();
				//返回返回值
				return rtValue;
			}
		} );
	}
}
