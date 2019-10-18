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
 * Servlet implementation class MusicListServlet
 */
@WebServlet("/musicList.do")
public class MusicListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private IMusicService musicService = new MusicServiceImpl();
	private IMusicListService musicListService = new MusicListServiceImpl();
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int musicListId = Integer.parseInt(request.getParameter("musicListId"));
		
		MusicList musicList = musicListService.findById(musicListId);
		request.setAttribute("musicList", musicList);
		
		List<Music> musics = musicService.findByMusicListId(musicListId);
		request.setAttribute("musics", musics);
		
		
		request.getRequestDispatcher("WEB-INF/jsp/music.jsp").forward(request, response);
	}

}
