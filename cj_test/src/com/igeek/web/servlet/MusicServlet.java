package com.igeek.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeek.pojo.Music;
import com.igeek.pojo.Special;
import com.igeek.service.IMusicService;
import com.igeek.service.ISpecialService;
import com.igeek.service.impl.MusicServiceImpl;
import com.igeek.service.impl.SpecialServiceImpl;

/**
 * Servlet implementation class MusicServlet
 */
@WebServlet("/music.do")
public class MusicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IMusicService musicServlet = new MusicServiceImpl();
	private ISpecialService specialService = new SpecialServiceImpl();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int musicId = Integer.parseInt(request.getParameter("musicId"));
		
		Music music = musicServlet.findById(musicId);
		Special special = specialService.findById(music.getSpecialId());
		
		request.setAttribute("music", music);
		request.setAttribute("special", special);
		
		request.getRequestDispatcher("WEB-INF/jsp/play.jsp").forward(request, response);
	}
}
