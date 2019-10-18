package com.igeek.service;

import java.util.List;

import com.igeek.pojo.MusicList;

public interface IMusicListService {
	/**
	 * 查询所有歌单
	 * @return
	 */
	List<MusicList> findAll();
	/**
	 * 	根据歌单编号查询
	 * @param musicListId
	 * @return
	 */
	MusicList findById(int musicListId);
	
	/**
	 * 	根据歌单名称查询
	 * @param musicListName
	 * @return
	 */
	List<MusicList> findByName(String musicListName);
	
	/**
	 * 	根据歌单的创建者查询
	 * @param creator
	 * @return
	 */
	List<MusicList> findByCreator(String creator);
	
	/**
	 * 	查询前5的歌单
	 * @return
	 */
	List<MusicList> findMusicListTop5();
}