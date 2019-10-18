package com.igeek.service.impl;

import java.util.List;

import com.igeek.dao.IMusicDao;
import com.igeek.factory.DaoFactory;
import com.igeek.pojo.Music;
import com.igeek.service.IMusicService;

/**
 * 歌曲的业务层实现类
 * @author Administrator
 *
 */
public class MusicServiceImpl implements IMusicService {

	IMusicDao musicDao = DaoFactory.getProxyDao(IMusicDao.class);
	
	@Override
	public List<Music> findAll() {
		return musicDao.findAll();
	}

	@Override
	public Music findById(int musicId) {
		return musicDao.findById(musicId);
	}

	@Override
	public List<Music> findByName(String musicName) {
		return musicDao.findByName(musicName);
	}

	@Override
	public List<Music> findBySinger(String singer) {
		return musicDao.findBySinger(singer);
	}

	@Override
	public List<Music> findBySpecialId(int specialId) {
		return musicDao.findBySpecialId(specialId);
	}

	@Override
	public List<Music> findByMusicListId(int musicListId) {
		return musicDao.findByMusicListId(musicListId);
	}

	@Override
	public List<Music> findByTop(int amount) {
		return musicDao.findByTop(amount);
	}

}
