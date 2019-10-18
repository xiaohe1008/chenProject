package com.igeek.service.impl;

import java.util.List;

import com.igeek.dao.ISpecialDao;
import com.igeek.factory.DaoFactory;
import com.igeek.pojo.Special;
import com.igeek.service.ISpecialService;

/**
 * 专辑的业务层实现类
 * @author Administrator
 *
 */
public class SpecialServiceImpl implements ISpecialService {

	private ISpecialDao specialDao = DaoFactory.getProxyDao(ISpecialDao.class);
	
	@Override
	public List<Special> findAll() {
		return specialDao.findAll();
	}

	@Override
	public Special findById(int specialId) {
		return specialDao.findById(specialId);
	}

	@Override
	public List<Special> findByName(String specialName) {
		return specialDao.findByName(specialName);
	}

}
