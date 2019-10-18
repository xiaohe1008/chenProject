package com.igeek.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 	歌单的实体类
 * @author Administrator
 *
 */
public class MusicList implements Serializable{
	
	//歌单编号
	private int musicListId;
	
	//图片
	private String img;
	
	//播放量
	private long count;
	
	//名称
	private String musicListName;
	
	//创建人
	private String creator;
	
	//创建时间
	private Date modifyTime;
	
	//简介
	private String summy;
	
	public MusicList(int musicListId, String img, long count,
			String musicListName, String creator, Date modifyTime, String summy) {
		super();
		this.musicListId = musicListId;
		this.img = img;
		this.count = count;
		this.musicListName = musicListName;
		this.creator = creator;
		this.modifyTime = modifyTime;
		this.summy = summy;
	}
	
	public MusicList(){
		
	}
	
	public int getMusicListId() {
		return musicListId;
	}
	public void setMusicListId(int musicListId) {
		this.musicListId = musicListId;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public String getMusicListName() {
		return musicListName;
	}
	public void setMusicListName(String musicListName) {
		this.musicListName = musicListName;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getSummy() {
		return summy;
	}
	public void setSummy(String summy) {
		this.summy = summy;
	}

	@Override
	public String toString() {
		return "MusicList [musicListId=" + musicListId + ", img=" + img + ", count=" + count + ", musicListName="
				+ musicListName + ", creator=" + creator + ", modifyTime=" + modifyTime + ", summy=" + summy + "]";
	}
	
	
}
