package com.igeek.dao;

import java.util.List;

import com.igeek.pojo.Music;

/**
 * 	music的持久层接口
 * @author 黄培锋
 *
 */
public interface IMusicDao {
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
	 * 查询前几首歌
	 * @param amount 查询的数量
	 * @return
	 */
	List<Music> findByTop(int amount);
	
}
