package com.igeek.service;

import java.util.List;

import com.igeek.pojo.Music;

/**
 * 歌曲的业务层接口
 * @author Administrator
 *
 */
public interface IMusicService {
	
	/**
	 * 查询所有歌曲
	 * @return
	 */
	List<Music> findAll();
	
	/**
	 * 根据歌曲编号查询歌曲
	 * @param musicId
	 * @return
	 */
	Music findById(int musicId);
	
	/**
	 * 	根据歌曲名称查询歌曲
	 * @param musicName
	 * @return
	 */
	List<Music> findByName(String musicName);
	
	/**
	 * 	根据歌手查询歌曲
	 * @param singer
	 * @return
	 */
	List<Music> findBySinger(String singer);
	
	/**
	 * 	根据专辑编号查询歌曲
	 * @param specialId
	 * @return
	 */
	List<Music> findBySpecialId(int specialId);
	
	/**
	 * 	根据歌单编号查询歌曲
	 * @param specialId
	 * @return
	 */
	List<Music> findByMusicListId(int musicListId);
	
	/**
	 * 	查询前几首歌
	 * @param amount 数量
	 * @return
	 */
	List<Music> findByTop(int amount);
	
}

