package com.igeek.test;

import com.igeek.dao.IMusicDao;
import com.igeek.factory.DaoFactory;

public class InterfaceFactoryTest {

	public static void main(String[] args) {
		IMusicDao musicDao = DaoFactory.getProxyDao(IMusicDao.class);
		musicDao.findAll().forEach(System.out::println);
		System.out.println("分---------------------隔--------------------------线");
		musicDao.findBySinger("李荣浩").forEach(System.out::println);
	}

}
