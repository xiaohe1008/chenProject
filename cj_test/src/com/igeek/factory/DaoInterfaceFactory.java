package com.igeek.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.ibatis.session.SqlSession;

import com.igeek.util.SessionUtil;

/**
 * 动态代理类，获取可以直接使用的到对象
 * @author 黄培锋
 *
 * @param <T> 
 */
public class DaoInterfaceFactory<T> {
	
	private Class<T> clazz = null;
	
	/**
	 * 	获取DaoInterfaceFactory实例
	 * @param clazz	需要代理接口的字节码
	 */
	public DaoInterfaceFactory(Class<T> clazz) {
		this.clazz = clazz;
	}
	
	/**
	 * 	获取完整实现的dao
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T getProxyDao() {
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
