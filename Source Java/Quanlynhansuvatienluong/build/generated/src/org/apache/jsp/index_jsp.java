package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Đăng Nhập</title>\n");
      out.write("        <!-- Meta tag Keywords -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("            function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!-- Meta tag Keywords -->\n");
      out.write("        <!-- css files -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.css\"> <!-- Font-Awesome-Icons-CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" /> <!-- Style-CSS --> \n");
      out.write("        <!-- //css files -->\n");
      out.write("        <!-- web-fonts -->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700\" rel=\"stylesheet\">\n");
      out.write("        <!-- //web-fonts -->\n");
      out.write("        <style>\n");
      out.write("            input[type=button]\n");
      out.write("            {\n");
      out.write("                opacity: 0.7;\n");
      out.write("                margin-left: 107px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                background-color: rgba(0, 0, 0, 0.34);\n");
      out.write("                color: white;\n");
      out.write("                font-size: 30px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                margin-top: 31px;\n");
      out.write("                transition: 0.5s ease;\n");
      out.write("            }\n");
      out.write("            .header-w3l\n");
      out.write("            {\n");
      out.write("                color: #fff;\n");
      out.write("                letter-spacing: 9px;\n");
      out.write("                text-shadow: 4px 4px 3px #000;\n");
      out.write("                word-spacing: 4px;\n");
      out.write("                font-weight: 500;\n");
      out.write("                font-family: 'Josefin Slab', serif;\n");
      out.write("                margin: 1.7em 0 1em;\n");
      out.write("                font-size: 20px;\n");
      out.write("                margin-left: 336px;\n");
      out.write("            }\n");
      out.write("            input[type=button]:hover\n");
      out.write("            {\n");
      out.write("                animation: swing 1s ease;\n");
      out.write("                border-color: #00c6d7;\n");
      out.write("                box-shadow: 0 10px 6px -6px #777;\n");
      out.write("                color: #00c6d7;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        <script type='text/javascript' src='js/jquery-3.3.1.js'></script>\n");
      out.write("        <script type='text/javascript'>\n");
      out.write("\n");
      out.write("            $(document).ready(function ()\n");
      out.write("            {\n");
      out.write("                $(\"#class_login_hide\").hide();\n");
      out.write("                $(\"#login\").click(function ()\n");
      out.write("                {\n");
      out.write("                    $(\"#class_register_hide\").hide();\n");
      out.write("                    $(\"#class_login_hide\").fadeToggle(2000);\n");
      out.write("                });\n");
      out.write("                $(\"#class_register_hide\").hide();\n");
      out.write("                $(\"#register\").click(function ()\n");
      out.write("                {\n");
      out.write("                    $(\"#class_login_hide\").hide();\n");
      out.write("                    $(\"#class_register_hide\").fadeToggle(2000);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--header-->\n");
      out.write("        <div class=\"header-w3l\">\n");
      out.write("            <h1 style=\"margin-right: 367px;\">Web site Nội Bộ</h1>\n");
      out.write("            <h3>Nơi Quản Lý Nhân Sự Và Tiền Lương</h3>\n");
      out.write("            <input id=\"login\"  type=\"button\" value=\"Đăng Nhập\" />\n");
      out.write("            <input id=\"register\"  type=\"button\" value=\"Đăng Ký\" />\n");
      out.write("            ");
 String err = (String) request.getAttribute("error");
                if (err != null) {
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <p style=\"color:red;\"><span style=\"margin-left:21px;\">");
out.print(err); 
      out.write("</span></p>\n");
      out.write("            </div> \n");
      out.write("            ");
 }
      out.write("\n");
      out.write("            ");
 User add = (User) request.getAttribute("add");
                if (add != null) {
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <p style=\"color:red;\"><span style=\"margin-left:60px;\">Đã Đăng Ký Tài Khoản,");
      out.print(add.getUsername());
      out.write("</span></p>\n");
      out.write("            </div> \n");
      out.write("            ");
 }
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--//header-->\n");
      out.write("        <!--main-->\n");
      out.write("        <div id=\"class_login_hide\" class=\"main-w3layouts-agileinfo\" style=\"position: relative;display:none;\">\n");
      out.write("            <div class=\"wthree-form\">\n");
      out.write("                <h2>Điền Thông Tin Để Đăng Nhập</h2>\n");
      out.write("                <form name=\"hide_form\" action=\"XuLyDangNhap\" method=\"get\">\n");
      out.write("                    <div class=\"form-sub-w3\">\n");
      out.write("                        <input type=\"text\" name=\"Username\" placeholder=\"Tên Đăng Nhập\" required=\"\" />\n");
      out.write("                        <div class=\"icon-w3\">\n");
      out.write("                            <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-sub-w3\">\n");
      out.write("                        <input type=\"password\" name=\"Password\" placeholder=\"Mật Khẩu\" required=\"\" />\n");
      out.write("                        <div class=\"icon-w3\">\n");
      out.write("                            <i class=\"fa fa-unlock-alt\" aria-hidden=\"true\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <label class=\"anim\">\n");
      out.write("                        <input type=\"checkbox\" class=\"checkbox\">\n");
      out.write("                        <span>Remember me</span> \n");
      out.write("                        <a href=\"#\">Quên Mật Khẩu</a>\n");
      out.write("                    </label> \n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                    <div class=\"submit-agileits\">\n");
      out.write("                        <span><input type=\"submit\" value=\"Đăng Nhập\"></span>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"class_register_hide\" style=\"position: absolute;margin-left: 421px;display:none;\" name=\"register\" class=\"main-w3layouts-agileinfo\">\n");
      out.write("            <div class=\"wthree-form\">\n");
      out.write("                <h2>Điền Thông Tin Đăng Ký</h2>\n");
      out.write("                <form name=\"hide_form\" action=\"XuLyDangNhap\" method=\"post\">\n");
      out.write("                    <div class=\"form-sub-w3\">\n");
      out.write("                        <input type=\"text\" name=\"userN\" placeholder=\"Tên Đăng Nhập \" required=\"\" />\n");
      out.write("                        <div class=\"icon-w3\">\n");
      out.write("                            <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-sub-w3\">\n");
      out.write("                        <input type=\"password\" name=\"userP\" placeholder=\"Mật Khẩu\" required=\"\" />\n");
      out.write("                        <input type=\"password\" name=\"retype\" placeholder=\"Nhập Lại Mật Khẩu\" required=\"\" />\n");
      out.write("                        <div class=\"icon-w3\">\n");
      out.write("                            <i class=\"fa fa-unlock-alt\" aria-hidden=\"true\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <label class=\"anim\">\n");
      out.write("                        <input type=\"checkbox\" class=\"checkbox\">\n");
      out.write("                        <span>Remember me</span> \n");
      out.write("                        <a href=\"#\">Quên Mật Khẩu</a>\n");
      out.write("                    </label> \n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                    <div class=\"submit-agileits\">\n");
      out.write("                        <input type=\"submit\" value=\"Đăng Ký\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--//main-->\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
