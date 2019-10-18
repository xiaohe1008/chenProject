package com.igeek.pojo;

import java.io.Serializable;

/**
 * 	专辑的实体类
 * @author Administrator
 *
 */
public class Special implements Serializable{
	//专辑编号
	private int specialId;
	
	//专辑名称
	private String specialName;
	
	//专辑图片
	private String img;
	
	
	
	public Special(int specialId, String specialName, String img) {
		super();
		this.specialId = specialId;
		this.specialName = specialName;
		this.img = img;
	}
	
	public Special(){
		
	}
	
	public int getSpecialId() {
		return specialId;
	}
	public void setSpecialId(int specialId) {
		this.specialId = specialId;
	}
	public String getSpecialName() {
		return specialName;
	}
	public void setSpecialName(String specialName) {
		this.specialName = specialName;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Special [specialId=" + specialId + ", specialName=" + specialName + ", img=" + img + "]";
	}
	
	
}
