/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-03 09:09:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.member.model.vo.Member;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/include/header.jsp", Long.valueOf(1570015614601L));
    _jspx_dependants.put("/views/include/footer.jsp", Long.valueOf(1569726248500L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t.outer{\r\n");
      out.write("\t\twidth:900px;\r\n");
      out.write("\t\theight:600px;\r\n");
      out.write("\t\t/*background:lightpink;*/\r\n");
      out.write("\t\tcolor:black;\r\n");
      out.write("\t\tmargin-left:auto;\r\n");
      out.write("\t\tmargin-right:auto;\r\n");
      out.write("\t\tmargin-top:50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.tableArea{\r\n");
      out.write("\t\twidth:700px;\r\n");
      out.write("\t\theight:500x;\r\n");
      out.write("\t\tmargin-left:auto;\r\n");
      out.write("\t\tmargin-right:auto;\r\n");
      out.write("\t\tborder:1px solid black;\r\n");
      out.write("\t}\r\n");
      out.write("\ttable{\r\n");
      out.write("\t\tmargin-left:auto;\r\n");
      out.write("\t\tmargin-right:auto;\r\n");
      out.write("\t}\r\n");
      out.write("\t#headArea{\r\n");
      out.write("\t\twidth:425px;\r\n");
      out.write("\t\tmargin-left:auto;\r\n");
      out.write("\t\tmargin-right:auto;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.addBtnArea>div{\r\n");
      out.write("\t\twidth:60px;\r\n");
      out.write("\t\theight:25px;\r\n");
      out.write("\t\tbackground:lightblue;\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t\tborder-radius:8px;\r\n");
      out.write("\t\tdisplay:inline-block;\r\n");
      out.write("\t}\r\n");
      out.write("\t#addBtn:hover, #cancelBtn:hover{\r\n");
      out.write("\t\tcursor:pointer;\r\n");
      out.write("\t}\r\n");
      out.write("\t#fileAddArea{\r\n");
      out.write("\t\twidth:280px;\r\n");
      out.write("\t\theight:20px;\r\n");
      out.write("\t\tborder:1px solid lightgray;\r\n");
      out.write("\t}\r\n");
      out.write("\t#time{\r\n");
      out.write("\t\twidth:280px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");

	String contextPath=request.getContextPath();
	Member mem=(Member)session.getAttribute("mem");
	String head=request.getParameter("head");
	if(head!=null){
		session.setAttribute("head", head);
	}
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("    div.aaa{\r\n");
      out.write("        width:100px;\r\n");
      out.write("        height:30px;\r\n");
      out.write("        border:0px solid;\r\n");
      out.write("        position:relative;\r\n");
      out.write("        float:left;\r\n");
      out.write("        text-align:center;\r\n");
      out.write("        cursor:pointer;\r\n");
      out.write("    }\r\n");
      out.write("    div.aaa div{\r\n");
      out.write("        position:absolute;\r\n");
      out.write("        bottom:0px;\r\n");
      out.write("        width:0%;\r\n");
      out.write("        height:10%;\r\n");
      out.write("        opacity:0.7;\r\n");
      out.write("        background:white;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mem }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('\r');
      out.write('\n');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("<h1><a href=\"");
      out.print(contextPath );
      out.write("\">ITJobs</a></h1>\r\n");
      out.write("<hr>공통 \r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/list.bo?head=main\">게시판</a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/list.bo?head=free\">자유게시판</a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/list.bo?head=study\">스터디</a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/list.bo?head=project\">프로젝트</a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/list.bo?head=qna\">공지사항</a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/list.bo?head=form\">서식</a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/list.qu\"><del>문의사항</del></a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/notificationList.se\">공고검색(기업상세정보)</a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/resumeList.se\">인재검색</a>\r\n");
      out.write("<hr>공통\r\n");
      out.write("<a href=\"");
      out.print(contextPath );
      out.write("/views/login/join_law.jsp\">회원가입</a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath );
      out.write("/login.me\">로그인</a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath );
      out.write("/logout.me\">로그아웃</a><br>\r\n");
      out.write("<hr>일반\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/myInfo.me\"><del>내 정보 수정</del></a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/myApplyList.vo\">지원리스트</a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/myCompanyList.like\"><del>관심기업</del></a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/myNotificationList.like\"><del>관심공고</del></a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/list.re\">이력서 관리</a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/mylist.qu\"><del>나의 문의</del></a>\r\n");
      out.write("+지원하기\r\n");
      out.write("<hr>기업\r\n");
      out.write("\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/myInfo.me\"><del>내 정보 수정</del></a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/myNotification.me\">공고리스트</a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/myResumeList.like\"><del>관심인재</del></a>\r\n");
      out.write("<a href=\"");
      out.print(contextPath);
      out.write("/mylist.qu\"><del>나의 문의</del></a>\r\n");
      out.write("<hr>관리자\n");
      out.write("\r\n");
      out.write("<div class=\"aaa\" onclick=\"location.href='");
      out.print(contextPath);
      out.write("/boardList.ad'\">게시판 관리\r\n");
      out.write("    <div></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"aaa\" onclick=\"location.href='");
      out.print(contextPath);
      out.write("/replyList.ad'\">댓글 관리\r\n");
      out.write("    <div></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"aaa\" onclick=\"location.href='");
      out.print(contextPath);
      out.write("/memberList.ad'\">회원 관리\r\n");
      out.write("    <div></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"aaa\" onclick=\"location.href='");
      out.print(contextPath);
      out.write("/noticeList.ad'\">공고 관리\r\n");
      out.write("    <div></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"aaa\" onclick=\"location.href='");
      out.print(contextPath);
      out.write("/list.qu.ad'\">문의 관리\r\n");
      out.write("    <div></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"aaa\" onclick=\"location.href='");
      out.print(contextPath);
      out.write("/list.de'\">신고 관리\r\n");
      out.write("    <div></div>\r\n");
      out.write("</div>\r\n");
      out.write("<br clear=\"both\">\r\n");
      out.write("<script>\r\n");
      out.write("    function lease(){\r\n");
      out.write("        var bar=aaa_div.eq(n)\r\n");
      out.write("        aaa.eq(n).css({'background':'#ff4e0b','color':'white'})\r\n");
      out.write("        $(bar).animate({\r\n");
      out.write("            width: \"100%\",\r\n");
      out.write("        }, 2000, 'linear', function(){\r\n");
      out.write("            aaa.css({'background':'white','color':'black'})\r\n");
      out.write("            aaa_div.css('width','0%')\r\n");
      out.write("            n=(n+1)%6\r\n");
      out.write("            lease()\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    var aaa=$('.aaa')\r\n");
      out.write("\r\n");
      out.write("    aaa.on('mouseover',function(){\r\n");
      out.write("        aaa_div.eq(n).stop()\r\n");
      out.write("    }).on('mouseleave',function(){\r\n");
      out.write("        var bar=aaa_div.eq(n)\r\n");
      out.write("\r\n");
      out.write("        $(bar).animate({\r\n");
      out.write("            width: \"100%\",\r\n");
      out.write("        }, (2000*(100-parseFloat(bar.css('width')))/100), 'linear', function(){\r\n");
      out.write("        \taaa.css({'background':'white','color':'black'})\r\n");
      out.write("            aaa_div.css('width','0%')\r\n");
      out.write("            n=(n+1)%6\r\n");
      out.write("            lease()\r\n");
      out.write("        });\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    var n=0;\r\n");
      out.write("    var W=$('.aaa').css('width');\r\n");
      out.write("    var aaa_div=$('.aaa').children('div');\r\n");
      out.write("\r\n");
      out.write("    lease()\r\n");
      out.write("</script>\r\n");
      out.write("<hr>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"outer\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div id=\"headArea\"><h1 align=\"left\">새 글 작성</h1></div>\r\n");
      out.write("\t\r\n");
      out.write("\t<form action=\"");
      out.print(contextPath);
      out.write("/insert.bo\" method=\"post\" enctype=\"multipart/form-data\" id=\"form\">\r\n");
      out.write("\t\t<div id=\"tableArea\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>제 목 : \r\n");
      out.write("\t\t\t\t\t\t<select name=\"writehead\" id=\"writehead\">\r\n");
      out.write("\t\t\t\t\t\t\t<option>-------</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"자유\">자유</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"스터디\">스터디</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"프로젝트\">프로젝트</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"공지\">공지</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\"><input type=\"text\" name=\"title\" placeholder=\"제목을 입력하세요\"  style=\"width:280px;\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\"><textarea rows=\"20\" cols=\"60\" name=\"content\"></textarea></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr id=\"time\">\r\n");
      out.write("\t\t\t\t\t<td>모집기간 : </td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\"><input type=\"text\" name=\"time\" id=\"time\" placeholder=\"ex)2019.09.29~2019.10.05 형식으로 입력하세요\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr id=\"fileAdd\">\r\n");
      out.write("\t\t\t\t\t<td>파일첨부 : </td>\r\n");
      out.write("\t\t\t\t\t<td><div id=\"fileAddArea\">이곳을 누르세요</div></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t\t<div class=\"addBtnArea\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<div id=\"cancelBtn\" onclick=\"window.history.back();\">취   소</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"addBtn\" onclick=\"return writeAdd()\">등   록</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"fileArea\"><input type=\"file\" name=\"file1\" id=\"file1\" onchange=\"fileName(this);\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction writeAdd(){\r\n");
      out.write("\t\t\tvar title = $(\"#tableArea input[name=title]\");\r\n");
      out.write("\t\t\tvar content = $(\"#tableArea textarea[name=content]\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(title.val().trim().length == 0){\r\n");
      out.write("\t\t\t\talert(\"제목을 입력해주세요.\");\r\n");
      out.write("\t\t\t\ttitle.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(content.val().trim().length == 0){\r\n");
      out.write("\t\t\t\talert(\"내용을 입력해주세요.\") \r\n");
      out.write("\t\t\t\tcontent.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(\"#form\").submit();\r\n");
      out.write("\t\t\t}\t\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t$(\"#writehead\").change(function(){\r\n");
      out.write("\t\t\t\tvar select = $(\"select[name=writehead]\").val();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tif(select == \"자유\" || select == \"공지\"){\r\n");
      out.write("\t\t\t\t\t$(\"#time\").hide();\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#time\").show();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t$(\"#fileArea\").hide();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t$(\"#fileAdd\").click(function(){\r\n");
      out.write("\t\t\t\t$(\"#file1\").click();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction fileName(value){\r\n");
      out.write("\t\t\tif(value.files && value.files[0]){\r\n");
      out.write("\t\t\t\tvar filename = $(\"#file1\").val();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#fileAddArea\").text(filename);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<footer class=\"sticky-footer bg-white\">\r\n");
      out.write("\t<div class=\"container my-auto\">\r\n");
      out.write("\t\t<div class=\"copyright text-center my-auto\">\r\n");
      out.write("\t\t\t<span>Copyright &copy; ITJobs 2019</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
