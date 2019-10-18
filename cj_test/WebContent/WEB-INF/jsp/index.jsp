4<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="${pageContext.request.contextPath}/css/music.css" rel="stylesheet" type="text/css" media="all">
	<link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet" type="text/css" media="all">
	<title>Insert title here</title>
</head>
<body>
<div class="title clear">
       <div class = "titleImg"><img src="${pageContext.request.contextPath}/image/logo.png"></div>
	       <div class = "titleSeacher">
		       	<input type="text" name="" style="height: 39px;width:342px;border: none;">
		       	<div class="titleSeacher_btn"></div>
	       </div>
	   		    <a href="#">客服中心</a>
		       	<a href="#">招贤纳士</a>
		       	<a href="#">会员中心</a>
		       	<button class="Logo" >登录</button>
	</div>
	<header>
		<nav>
			<div class="nav clear">
				<div class="nav1 clear">
					<div class="nav11">首页</div>
					<div class="nav11">榜单</div>
					<div class="nav11">下载客户端</div>
				</div>
				<div class="menu">
					<div class="nav11">更多</div>
					<ul>
						<li>电台</li>
						<li>MV</li>
						<li>歌单</li>
						<li>歌手</li>
					</ul>
				</div>
				<div class="menu2 clear">
					<div class="nav2 nav21">
	                   <div class="nav221"></div>
	                   <div>音乐直播</div>
					</div>
					<div class="nav2 nav22">
					   <div></div>
	                   <div>酷狗LIVE</div>
					</div>
					<div class="nav2 nav23">
					   <div></div>
	                   <div>音乐人</div>
					</div>
					<div class="nav2 nav24">
					   <div></div>
	                   <div>成为直播</div>
					</div>
					<div class="nav2 nav25">
					   <div></div>
	                   <div>商城</div>
					</div>
				</div>
			</div>
		</nav>
		<div class="bg">
			<div></div>
		</div>
	</header>
	<!-- 主体内容 -->
	<div class="main">
		<!-- 精选歌单和热门歌曲开始 -->
		<div class="d1 clear">
			<!-- 精选歌单开始 -->
			<div class="musiclist">
				<!-- 标题 -->
				<nav class="music-title clear">
					<div>精选歌单</div>
					<div><a href="">更多</a></div>
				</nav>
				<!-- 歌单内容 -->

				<div class="listContent clear">
				<c:forEach items="${musicLists }" var="musicList">
					<a href="musicList.do?musicListId=${musicList.musicListId }">
					<div class="listDiv" id="listDiv1" style="background-image: url(image/${musicList.img})">
						<div class="SongView">${musicList.count }</div>
						<div id="SongName1" class="SongName">${musicList.musicListName }</div>
					</div>
				    </a>
				</c:forEach>
				</div>
			</div>
			<!-- 精选歌单结束 -->
			<!-- 热门榜单开始 -->
			<div class="hot ">
				<nav class="music-title  clear">
					<div>热门榜单</div>
					<div><a href="">更多</a></div>
				</nav>
				<div class="hotMusic hotMusic1 clear">
                   <div class="hotMusicImg1 hotMusicImg"></div>
                   <div class="hotMusicSort"><b>网络红歌榜</b></div>
                   <div class="hotSong">1.宝石Gem、陈伟霆-野子</div>
				   <div class="hotSong">2.新月-绝口不提我爱你</div>
				</div>
				<div class="hotMusic">
				   <div class="hotMusicImg2 hotMusicImg clear"></div>
				   <div class="hotMusicSort"><b>Top500</b></div>
				   <div class="hotSong">1.en-嚣张</div>
				   <div class="hotSong">2.海来阿木-别知己</div>
				</div>
				<div class="hotMusic">
					<div class="hotMusicImg3 hotMusicImg clear"></div>
					<div class="hotMusicSort"><b>酷狗飙升榜</b></div>
			       <div class="hotSong">1.杭桥-听心</div>
				   <div class="hotSong">2.虎二-你一定要幸福</div>
				</div>
			</div>
			<!-- 热门榜单结束 -->
		</div>
		<!-- 精选歌单、热门歌曲结束 -->
		<!-- 新歌首发 -->
		<div class="d2">
		<c:forEach var="music" items="${musics }">
			<div>
				<span>${music.singer } - ${music.musicName }</span><img src="image/first.png"><span>04:03</span>
			</div>
		</c:forEach>
		</div>
		<!-- 推荐MV -->
		<div class="pushMusic">
            <div>推荐MV</div>
            <div class="pushImg1"><img style="width: 140px;height: 100px;" src="image/20160120000217220127.jpg"/></div>
            <div class="pushImg2"><img style="width: 170px;height: 180px;" src="image/20160812171114792368.jpg"/></div>
            <div class="pushImg1"><img style="width: 140px;height: 100px; margin-top: 10px;" src="image/20171116200837180623.jpg"/></div>
		</div>
		<!-- 推荐MV结束 -->
		<div class="nav3"></div>

		<!-- 热门电台 -->
		<div class="hotRadio clear">
			<div>热门电台</div>
			<div class="hotRadioImg hotRadioImg1"></div>
			<div class="hotRadioImg hotRadioImg2"></div>
			<div class="hotRadioImg hotRadioImg3"></div>
			<div class="hotRadioImg hotRadioImg4"></div>
			<div class="hotRadioImg hotRadioImg5"></div>
			<div class="hotRadioImg hotRadioImg6"></div>
			<div class="hotRadioImg hotRadioImg7"></div>
			<div class="hotRadioImg hotRadioImg8"></div>
			<div class="hotRadioImg hotRadioImg9"></div>
			<div class="hotRadioImg hotRadioImg10"></div>
		</div>
		<div class="hotSonger">
            <div>热门歌手</div>
            <div class="pushImg1"><img style="width: 140px;height: 100px;" src="image/20171116211616612248.jpg"/></div>
            <div class="pushImg2"><img style="width: 170px;height: 180px;" src="image/20170527180146229856.jpg"/></div>
            <div class="pushImg1"><img style="width: 140px;height: 100px; margin-top: 10px;" src="image/20171117105816217428.jpg"/></div>
		</div>
	    <div class="nav4"></div>
		<!-- 热门电台结束 -->

		<div class="Link">
          <div class="dearLink"><img style="width: 100px;height: 30px;" src="image/20191017103842.jpg"></div>
          <a class="LinkQ1" id="zi" href="#">爱美网</a>
          <a class="LinkQ" id="zi" href="#">汽车论坛</a>
          <a class="LinkQ" id="zi" href="#">IT之家</a>
          <a class="LinkQ" id="zi" href="#">Iphone游戏</a>
          <a class="LinkQ" id="zi" href="#">旅游攻略</a>          
          <a class="LinkQ" id="zi" href="#">悦声无限</a>
          <a class="LinkQ" id="zi" href="#">华为商城</a>
          <a class="LinkQ" id="zi" href="#">365音乐网</a>
          <a class="LinkQ3" id="zi" href="#">软件下载</a>
          <a class="LinkQ2" id="zi" href="#">慢慢看漫画</a>
          <a class="LinkQ2" id="zi" href="#">手机游戏</a>
          <a class="LinkQ2" id="zi" href="#">5sing原创音乐</a>
          <a class="LinkQ2" id="zi" href="#">腾讯音乐人</a>
          <a class="LinkQ2" id="zi" href="#">豌豆荚</a>
          <a class="LinkQ2" id="zi" href="#">5sing众筹</a>
		</div>
	</div>
	<div class="footer clear">
    <div class="links">
        <a hidefocus="true" href="http://www.kugou.com/about/aboutus.html" target="_blank">关于酷狗</a>| <a hidefocus="true" href="javascript:void(0);" id="report">监督举报</a> | <a hidefocus="true" href="http://www.kugou.com/about/adservice.html" target="_blank">广告服务</a> | <a hidefocus="true" target="_blank" href="http://www.kugou.com/about/copyRightGuide.html">版权指引</a>|<a target="_blank" href="http://www.kugou.com/about/privacy.html ">隐私政策</a>| <a hidefocus="true" target="_blank" href="http://www.kugou.com/about/protocol.html">用户服务协议</a> | <a hidefocus="true" target="_blank" href="http://www.kugou.com/company/partners.html">推广合作</a> | <a hidefocus="true" target="_blank" href="http://www.kugou.com/imusic/">酷狗音乐人</a> |<a hidefocus="true" target="_blank" href="http://tui.kugou.com/">酷狗音乐推</a> |<a hidefocus="true" href="http://www.kugou.com/hr/html/index.html" target="_blank">招聘信息</a> | <a hidefocus="true" href="https://www.kugou.com/shop/help/serviceCenter" target="_blank">客服中心</a> | <a hidefocus="true" href="http://survey.kugou.com/default/index/i=40CD7B8437008E65E67D82D9044C15C99C2E699859F51338" target="_blank">用户体验提升计划</a>
    </div>
	<!-- 主体内容结束 -->
	<footer></footer>
</body>
</html>