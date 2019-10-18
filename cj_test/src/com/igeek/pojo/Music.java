package com.igeek.pojo;

import java.io.Serializable;

/**
 * 	歌曲的实体类
 * @author Administrator
 *
 */
public class Music implements Serializable {
	
	//歌曲编号
	private int musicId;
	
	//名称
	private String musicName;
	
	//歌手
	private String singer;
	
	//专辑
	private int specialId;
	
	//歌曲路径
	private String musicPath;
	public Music(){
	}
	
	public int getMusicId() {
		return musicId;
	}
	public void setMusicId(int musicId) {
		this.musicId = musicId;
	}
	public String getMusicName() {
		return musicName;
	}
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getSpecialId() {
		return specialId;
	}
	public void setSpecialId(int specialId) {
		this.specialId = specialId;
	}

	public String getMusicPath() {
		return musicPath;
	}

	public void setMusicPath(String musicPath) {
		this.musicPath = musicPath;
	}
	
}
