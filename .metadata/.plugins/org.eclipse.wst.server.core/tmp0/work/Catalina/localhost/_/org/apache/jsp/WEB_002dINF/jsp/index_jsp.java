/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-11-23 05:45:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("    <title>拼多商城首页</title>\r\n");
      out.write("    <link href=\"../css/index.css\" rel=\"Stylesheet\"/>\r\n");
      out.write("    <link href=\"../css/animate.css\" rel=\"Stylesheet\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/slide.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 页面顶部-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "commons/header.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- banner部分-->\r\n");
      out.write("<div class=\"ck-slide\">\r\n");
      out.write("    <ul class=\"ck-slide-wrapper\">\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"/item/toItemInfo.html?itemId=10000028\"><img src=\"../images/index/index_banner1.png\" alt=\"\"></a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li style=\"display:none\">\r\n");
      out.write("            <a href=\"/item/toItemInfo.html?itemId=10000028\"><img src=\"../images/index/index_banner2.png\" alt=\"\"></a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li style=\"display:none\">\r\n");
      out.write("            <a href=\"/item/toItemInfo.html?itemId=10000028\"><img src=\"../images/index/index_banner3.png\" alt=\"\"></a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li style=\"display:none\">\r\n");
      out.write("            <a href=\"/item/toItemInfo.html?itemId=10000028\"><img src=\"../images/index/index_banner4.png\" alt=\"\"></a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li style=\"display:none\">\r\n");
      out.write("            <a href=\"/item/toItemInfo.html?itemId=10000028\"><img src=\"../images/index/index_banner5.png\" alt=\"\"></a>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <a href=\"javascript:;\" class=\"ctrl-slide ck-prev\">上一张</a> <a href=\"javascript:;\" class=\"ctrl-slide ck-next\">下一张</a>\r\n");
      out.write("    <div class=\"ck-slidebox\">\r\n");
      out.write("        <div class=\"slideWrap\">\r\n");
      out.write("            <ul class=\"dot-wrap\">\r\n");
      out.write("                <li class=\"current\"><em>1</em></li>\r\n");
      out.write("                <li><em>2</em></li>\r\n");
      out.write("                <li><em>3</em></li>\r\n");
      out.write("                <li><em>4</em></li>\r\n");
      out.write("                <li><em>5</em></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 特推部分-->\r\n");
      out.write("<div id=\"product\">\r\n");
      out.write("    <div class=\"product_1 lf\">\r\n");
      out.write("        <div class=\"aside lf\">\r\n");
      out.write("            <img id=\"aside_image\" src=\"../images/index/index_Sbanner_img1.png\" alt=\"\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"text rt\">\r\n");
      out.write("            <p class=\"ys1\">联想小新<b class=\"ys2\">Air3</b></p>\r\n");
      out.write("            <p class=\"ys3\">设计师独享高端配置</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"product_2 lf\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"aside lf\">\r\n");
      out.write("            <img id=\"aside_image2\" src=\"../images/index/index_Sbanner_img2.png\" alt=\"\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"text rt\">\r\n");
      out.write("            <p class=\"ys1 ys4\">得力书包<b class=\"ys2 ys4\">Bag</b></p>\r\n");
      out.write("\r\n");
      out.write("            <p class=\"ys3 ys4\">给你满载而归的喜悦</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"product_3 lf\">\r\n");
      out.write("        <div class=\"aside lf\">\r\n");
      out.write("            <img id=\"aside_image3\" src=\"../images/index/index_Sbanner_img3.png\" alt=\"\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"text rt\">\r\n");
      out.write("            <p class=\"ys1\">刀鱼焖排骨</p>\r\n");
      out.write("            <p class=\"ys3\">吃饱了才有力气学习</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- welcome部分-->\r\n");
      out.write("<div id=\"welcome\">\r\n");
      out.write("    <a href=\"\">阅读更多>></a>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 学习用品-->\r\n");
      out.write("<div id=\"study\">\r\n");
      out.write("    <p>学习用品<span>爱学习 享品质工作</span></p>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"study_left lf\">\r\n");
      out.write("        <div id=\"product_parameters_main\">\r\n");
      out.write("            <p><img src=\"../images/index/wenan.png\" alt=\"\"/></p>\r\n");
      out.write("\r\n");
      out.write("            <h3 id=\"product_name_main\">联想(Lenovo) 小新Air13 pro版</h3>\r\n");
      out.write("\r\n");
      out.write("            <h3 id=\"product_preferential_main\">限时特惠<b id=\"product_price_main\">￥6688.00</b></h3>\r\n");
      out.write("\r\n");
      out.write("            <p class=\"view_details\"><a href=\"product_details.html\">查看详情</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <img id=\"study_product_main\" src=\"../images/index/index_hot_study_img1.png\" alt=\"\"/>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"study_right rt\">\r\n");
      out.write("        <div class=\"right_top\">\r\n");
      out.write("            <div id=\"product_parameters_vice1\">\r\n");
      out.write("                <h3 id=\"product_name_vice1\">联想(Lenovo) 小新Air13 不超15mm才敢叫轻薄</h3>\r\n");
      out.write("\r\n");
      out.write("                <h3 id=\"product_preferential_vice1\"><b id=\"product_price_vice1\">￥6688.00</b></h3>\r\n");
      out.write("\r\n");
      out.write("                <p class=\"view_details\"><a href=\"product_details.html\" >查看详情</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <img id=\"study_product_vice1\" src=\"../images/index/index_hot_study_img2.png\" alt=\"\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"right_bottom\">\r\n");
      out.write("            <div id=\"product_parameters_vice2\">\r\n");
      out.write("                <h3 id=\"product_name_vice2\">雅致布面年历本 张扬个性，点亮生活新时尚</h3>\r\n");
      out.write("\r\n");
      out.write("                <h3 id=\"product_preferential_vice2\"><b id=\"product_price_vice2\">￥68.00</b></h3>\r\n");
      out.write("\r\n");
      out.write("                <p class=\"view_details\"><a href=\"product_details.html\" >查看详情</a></p>\r\n");
      out.write("                <img id=\"study_product_vice2\" src=\"../images/index/index_hot_study_img3.png\" alt=\"\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 美食餐饮-->\r\n");
      out.write("<div id=\"gourmet\">\r\n");
      out.write("    <p>美食餐饮<span>爱美食 享品质生活</span></p>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"bellows lf\">\r\n");
      out.write("        <div class=\"bellows_item\">\r\n");
      out.write("            <div class=\"bellows_header\">\r\n");
      out.write("                <h3>红烧肉盖饭(吉野家)</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"\">\r\n");
      out.write("                <div class=\"bellows_content\">\r\n");
      out.write("                    <p>\r\n");
      out.write("                        红烧肉是热菜菜谱之一。以五花肉为制作主料，香甜松软。最好选用肥瘦相间的三层肉（五花肉）来做。红烧肉的烹饪技巧以砂锅为主，肥瘦相间，香甜松软，入口即化。红烧肉在我国各地流传甚广，是一道著名的大众菜肴,当然也是大家最喜欢的菜。\r\n");
      out.write("                    </p></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"bellows_item\">\r\n");
      out.write("            <div class=\"bellows_header\">\r\n");
      out.write("                <h3>春卷套餐(魏家凉皮)</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"bellows_content-wrapper\" style=\"display: block\">\r\n");
      out.write("                <div class=\"bellows_content\">\r\n");
      out.write("                    <p>魏家凉皮怎么样?目前为止，魏家餐饮团队以“和谐、高效、奋进”为准则，坚持“全心全情、和谐共赢”的团队发展理念。带领魏家餐饮管理公司迈向新的高度。</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"bellows_item\">\r\n");
      out.write("            <div class=\"bellows_header active\">\r\n");
      out.write("                <h3>营养海鲜汤(山西面食家)</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"bellows_content-wrapper\">\r\n");
      out.write("                <div class=\"bellows_content\">\r\n");
      out.write("                    <p>汤汁的香味在口里弥漫开来的新概念面条！粗粗的3mm面条中有凹凸，吃面条时也会跟着到嘴里来，使海鲜汤的味道和风味极大化。</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"food_detail rt\">\r\n");
      out.write("        <div>\r\n");
      out.write("            <div class=\"food1 lf\">\r\n");
      out.write("                <img src=\"../images/index/index_hot_food_img1.png\" alt=\"\"/>\r\n");
      out.write("\r\n");
      out.write("                <h2>红烧肉盖饭套餐<span> (吉野家) </span></h2>\r\n");
      out.write("\r\n");
      out.write("                <p>￥20.00</p>\r\n");
      out.write("                <a href=\"item_food.html\">立即订餐</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"food1 lf\">\r\n");
      out.write("                <img src=\"../images/index/index_hot_food_img2.png\" alt=\"\" id=\"food1\"/>\r\n");
      out.write("\r\n");
      out.write("                <h2>全素套餐<span> (魏家凉皮) </span></h2>\r\n");
      out.write("\r\n");
      out.write("                <p>￥16.00</p>\r\n");
      out.write("                <a href=\"item_food.html\">立即订餐</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"food1 lf\" >\r\n");
      out.write("                <img src=\"../images/index/index_hot_food_img3.png\" alt=\"\"/>\r\n");
      out.write("\r\n");
      out.write("                <h2>营养海鲜汤<span> (山西面食家) </span></h2>\r\n");
      out.write("\r\n");
      out.write("                <p>￥25.00</p>\r\n");
      out.write("                <a href=\"item_food.html\">立即订餐</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 品质保障，私人定制等-->\r\n");
      out.write("<div id=\"foot_box\">\r\n");
      out.write("    <div class=\"icon1 lf\">\r\n");
      out.write("        <img src=\"../images/footer/icon1.png\" alt=\"\"/>\r\n");
      out.write("        <h3>品质保障</h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"icon2 lf\">\r\n");
      out.write("        <img src=\"../images/footer/icon2.png\" alt=\"\"/>\r\n");
      out.write("        <h3>私人定制</h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"icon3 lf\">\r\n");
      out.write("        <img src=\"../images/footer/icon3.png\" alt=\"\"/>\r\n");
      out.write("        <h3>学员特供</h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"icon4 lf\">\r\n");
      out.write("        <img src=\"../images/footer/icon4.png\" alt=\"\"/>\r\n");
      out.write("        <h3>专属特权</h3>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 页面底部-->\r\n");
      out.write("<div class=\"foot_bj\">\r\n");
      out.write("    <div id=\"foot\">\r\n");
      out.write("        <div class=\"lf\">\r\n");
      out.write("             <p class=\"footer1\"><img src=\"../images/footer/logo.png\" alt=\"\" class=\" footLogo\"/></p>\r\n");
      out.write("             <p class=\"footer2\"><img src=\"../images/footer/footerFont.png\" alt=\"\"/></p>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"foot_left lf\" >\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"#\"><h3>买家帮助</h3></a></li>\r\n");
      out.write("                <li><a href=\"#\">新手指南</a></li>\r\n");
      out.write("                <li><a href=\"#\">服务保障</a></li>\r\n");
      out.write("                <li><a href=\"#\">常见问题</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"#\"><h3>商家帮助</h3></a></li>\r\n");
      out.write("                <li><a href=\"#\">商家入驻</a></li>\r\n");
      out.write("                <li><a href=\"#\">商家后台</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"#\"><h3>关于我们</h3></a></li>\r\n");
      out.write("                <li><a href=\"#\">关于拼多</a></li>\r\n");
      out.write("                <li><a href=\"#\">联系我们</a></li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <img src=\"../images/footer/wechat.png\" alt=\"\"/>\r\n");
      out.write("                    <img src=\"../images/footer/sinablog.png\" alt=\"\"/>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"service\">\r\n");
      out.write("            <p>拼多商城客户端</p>\r\n");
      out.write("            <img src=\"../images/footer/ios.png\" class=\"lf\">\r\n");
      out.write("            <img src=\"../images/footer/android.png\" alt=\"\" class=\"lf\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"download\">\r\n");
      out.write("            <img src=\"../images/footer/erweima.png\">\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t<!-- 页面底部-备案号 #footer -->\r\n");
      out.write("            <div class=\"record\">\r\n");
      out.write("                &copy;2017 拼多集团有限公司 版权所有 京ICP证xxxxxxxxxxx\r\n");
      out.write("            </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"../js/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("<script src=\"../js/index.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    //手风琴效果\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $(\".bellows_content-wrapper\").hide();\r\n");
      out.write("        $(\".bellows_header\").click(function (){\r\n");
      out.write("            $(this).next().slideDown()\r\n");
      out.write("            $(this).parent(\".bellows_item\").addClass(\"bellows_open\")\r\n");
      out.write("            $(\".bellows_header\").not(this).next().slideUp()\r\n");
      out.write("            $(\".bellows_header\").not(this).parent(\".bellows_item\").removeClass(\"bellows_open\")\r\n");
      out.write("        });\r\n");
      out.write("        $('.bellows_header').on('click', 'h3', function (e) {\r\n");
      out.write("            $(e.target).removeClass('active').siblings('.active').addClass('active');\r\n");
      out.write("        });\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"../js/slide.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $('.ck-slide').ckSlide({\r\n");
      out.write("        autoPlay: true,//默认为不自动播放，需要时请以此设置\r\n");
      out.write("        dir: 'x',//默认效果淡隐淡出，x为水平移动，y 为垂直滚动\r\n");
      out.write("        interval:3000//默认间隔2000毫秒\r\n");
      out.write("    });\r\n");
      out.write("    //搜索页面跳转\r\n");
      out.write("    $(\"#search\").click(function(){\r\n");
      out.write("    \twindow.location.href=\"search.html\";\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
