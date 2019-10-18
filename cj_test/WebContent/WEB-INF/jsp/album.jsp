<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link href="${pageContext.request.contextPath}/css/top.css" rel="stylesheet" type="text/css" media="all">
    <link href="${pageContext.request.contextPath}/css/album.css" rel="stylesheet" type="text/css" media="all">
<title>Insert title here</title>
</head>
<body>
	<div class="header">
    <!--logo-->
    <div class="logo"></div>
    <!--
        搜索框
    -->
    <div class="search_wrapper">
        <div class="search_input">
            <div class="search_icon">
                <div></div>
            </div>
        </div>
    </div>
    <div class="topNav clear">
        <ul>
            <li>客服中心</li>
            <li>招贤纳士</li>
            <li>会员中心</li>
        </ul>
        <div class="login_but">登录</div>
    </div>
</div>
<!--
    作者：offline
    时间：2019-10-12
    描述：导航栏
-->
<div class="nav">
    <ul class="homeNav">
        <li><a >首页</a></li>
        <li><a>榜单</a></li>
        <li><a>下载客户端</a></li>
        <li>
            <a>更多</a>
            <ul class="secondNav">
                <li><a>电台</a></li>
                <li><a>MV</a></li>
                <li><a>歌单</a></li>
                <li><a>歌手</a></li>
            </ul>
        </li>

    </ul>

    <ul class="rightNav">

        <li ><a class="icon_nav1">音乐直播</a></li>
        <li><a class="icon_nav2 ">酷狗Live</a></li><li>
        <a class="icon_nav3 ">音乐人</a></li>
        <li><a class="icon_nav4 ">成为主播</a></li>
        <li><a class="icon_nav5 ">商城</a></li>
    </ul>
</div>
</div>
<div class="contain" >
    <div class="nav_title clear">
        <span><span class="wdwz">我的位置 > </span><span><span><a href="" class="music_a">首页</a></span><span> > </span></span><span><a href="" class="music_a">专辑</a></span><span> > </span><span>专辑名称</span></span>
    </div>
    <br>
    <div class="column con1">
        <div class="fm">
        </div>

        <input class="fx"  type="submit"  value="全部播放" >

        <div class="xx">
            <p><span style="color:grey">专辑名：</span>${musicList.musicListName }</p>
            <p><span style="color:grey">歌手：</span>sssss</p>
            <p><span style="color:grey">唱片公司：</span>ssss</p>
            <p><span style="color:grey">发行时间：</span>2019-08-08</p>
            <p class="box"><span style="color:grey">简介：</span>专辑有论文专辑、音乐专辑等。论文专辑是指期刊的某一期专门对某一个大家关注的领域、问题、事件进行集中报道、讨论。专辑关注的也是当前的研究热点，会有较大的反响。在英文中，专辑通常被称为“Special Issue”，有时也被称为“Special Theme Issues”，一个专辑一般会有一个或几个特邀编辑。
                全球销量最高的专辑是迈克尔·杰克逊于1982年发行的《Thriller（颤栗）》在传统的燃油车不仅烧油不环保而且挂牌和出行等问题都很受限制，不能很方便的解决出行的问题，所以新能源汽车的市场就应运而生，但是纯电动的汽车续航里程并不是太理想，所以相对来说较为环保而且续航能力比较</p>
        </div>
    </div>

    <div class="column con2 ">
        <div class="nav_form">
            <ul>
                <li class="form"><span ><${musicList.musicListName }>-歌曲列表</span></li>
                <li class="form2"><input type="checkbox" class="kk"><span style="font-size: 13px" class="qx">全选</span> <input class="bf"  type="submit"  value="播放" ><input class="qbbf"  type="submit"  value="全部播放" ></li>
            </ul>
        </div>
        <div class="nav_table">
            <ul>
            <c:forEach items="${musics }" var="music" varStatus="status">
                <li class="hang clear"><input type="checkbox" class="fk"><span class="num1">${status.index+1 }</span><span class="gm"><a class="music_a" href="music.do?musicId=${music.musicId }">${music.singer}-${music.musicName }</a></span><span title="播放"  class="erji"></span><span class="zf" title="分享"></span></li>
            </c:forEach>
            </ul>
        </div>

        <div class="nav_2">
            <p class="other_zj">其他专辑</p>
            <div class="zjfm2">
                <a href="" class="a_zj">
                <img src="images/zj_fm2.jpg" alt="Smiley face" width="100px" height="100px">
                <br>
                <span>毛先生与猫小姐</span>
                    </a>
            </div>

            <div class="zjfm2">
                <a href="" class="a_zj">
                <img src="images/zj_fm3.jpg" alt="Smiley face" width="100px" height="100px">
                <br>
                <span>灰尘</span>
                    </a>
            </div>

            <div class="zjfm2">
                <a href="" class="a_zj">
                <img src="images/zj_fm4.jpg" alt="Smiley face" width="100px" height="100px">
                <br>
                <span>广州味道</span>
                    </a>
            </div>

            <div class="zjfm2">
                <a href="" class="a_zj">
                <img src="images/zj_fm4.jpg" alt="Smiley face" width="100px" height="100px">
                <br>
                <span>广州味道</span>
                    </a>
            </div>

            <div class="zjfm2">
                <a href="" class="a_zj">
                <img src="images/zj_fm4.jpg" alt="Smiley face" width="100px" height="100px">
                <br>
                <span>广州味道</span>
                    </a>
            </div>

            <div class="zjfm2">
                <a href="" class="a_zj">
                <img src="images/zj_fm4.jpg" alt="Smiley face" width="100px" height="100px">
                <br>
                <span>广州味道</span>
                    </a>
            </div>

        </div>

    </div>

</div>


<div class="footer clear">
    <div class="links">
        <a hidefocus="true" href="http://www.kugou.com/about/aboutus.html" target="_blank">关于酷狗</a>| <a hidefocus="true" href="javascript:void(0);" id="report">监督举报</a> | <a hidefocus="true" href="http://www.kugou.com/about/adservice.html" target="_blank">广告服务</a> | <a hidefocus="true" target="_blank" href="http://www.kugou.com/about/copyRightGuide.html">版权指引</a>|<a target="_blank" href="http://www.kugou.com/about/privacy.html ">隐私政策</a>| <a hidefocus="true" target="_blank" href="http://www.kugou.com/about/protocol.html">用户服务协议</a> | <a hidefocus="true" target="_blank" href="http://www.kugou.com/company/partners.html">推广合作</a> | <a hidefocus="true" target="_blank" href="http://www.kugou.com/imusic/">酷狗音乐人</a> |<a hidefocus="true" target="_blank" href="http://tui.kugou.com/">酷狗音乐推</a> |<a hidefocus="true" href="http://www.kugou.com/hr/html/index.html" target="_blank">招聘信息</a> | <a hidefocus="true" href="https://www.kugou.com/shop/help/serviceCenter" target="_blank">客服中心</a> | <a hidefocus="true" href="http://survey.kugou.com/default/index/i=40CD7B8437008E65E67D82D9044C15C99C2E699859F51338" target="_blank">用户体验提升计划</a>
    </div>

</div>
</body>
</html>