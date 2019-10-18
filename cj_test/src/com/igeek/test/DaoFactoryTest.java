package com.igeek.test;

import com.igeek.service.impl.MusicServiceImpl;

public class DaoFactoryTest {
	
	public static void main(String[] args) {
		MusicServiceImpl musicService = new MusicServiceImpl();
		musicService.findAll().forEach(System.out::println);
		System.out.println("分---------------------隔--------------------------线");
		musicService.findBySinger("李荣浩").forEach(System.out::println);
	}
	
	
}
