package com.igeek.service;

import java.util.List;

import com.igeek.pojo.Special;

/**
 * 	专辑的业务层接口
 * @author 黄培锋
 *
 */
public interface ISpecialService {
	
	/**
	 * 查询所有专辑
	 * @return
	 */
	List<Special> findAll();
	
	/**
	 * 	根据专辑编号查询
	 * @param specialId
	 * @return
	 */
	Special findById(int specialId);
	
	/**
	 *	根据专辑名称查询
	 * @param specialName
	 * @return
	 */
	List<Special> findByName(String specialName);
	
}
