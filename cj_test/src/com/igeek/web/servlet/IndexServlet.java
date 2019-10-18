package com.igeek.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeek.pojo.Music;
import com.igeek.pojo.MusicList;
import com.igeek.service.IMusicListService;
import com.igeek.service.IMusicService;
import com.igeek.service.impl.MusicListServiceImpl;
import com.igeek.service.impl.MusicServiceImpl;

/**
 * 	主页的servlet
 * @author Administrator
 *
 */
@WebServlet("/index.do")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IMusicListService musicListService = new MusicListServiceImpl();
	private IMusicService musicService = new MusicServiceImpl();
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取歌单列表
		List<MusicList> musicLists = musicListService.findMusicListTop5();
		request.setAttribute("musicLists", musicLists);
		//获取歌曲列表
		List<Music> musics = musicService.findByTop(8);
		request.setAttribute("musics", musics);
		request.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(request, response);
	}

}
