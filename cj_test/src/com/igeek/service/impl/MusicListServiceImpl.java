package com.igeek.service.impl;

import java.util.List;

import com.igeek.dao.IMusicListDao;
import com.igeek.factory.DaoFactory;
import com.igeek.pojo.MusicList;
import com.igeek.service.IMusicListService;

/**
 *	歌单的业务层实现类
 * @author Administrator
 *
 */
public class MusicListServiceImpl implements IMusicListService {

	private IMusicListDao musicList = DaoFactory.getProxyDao(IMusicListDao.class);
	
	@Override
	public List<MusicList> findAll() {
		return musicList.findAll();
	}

	@Override
	public MusicList findById(int musicListId) {
		return musicList.findById(musicListId);
	}

	@Override
	public List<MusicList> findByName(String musicListName) {
		return musicList.findByName(musicListName);
	}

	@Override
	public List<MusicList> findByCreator(String creator) {
		return musicList.findByCreator(creator);
	}

	@Override
	public List<MusicList> findMusicListTop5() {
		return musicList.findMusicListTop5();
	}

}
