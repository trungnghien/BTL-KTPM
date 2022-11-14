package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.PersonalDAO;
import model.Personal;

public final class ThongKe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Hồ Sơ Nhân Viên</title>\n");
      out.write("        <!-- javascripts -->\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui-1.10.4.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-1.8.3.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-ui-1.9.2.custom.min.js\"></script>\n");
      out.write("        <!-- bootstrap -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- nice scroll -->\n");
      out.write("        <script src=\"js/jquery.scrollTo.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- charts scripts -->\n");
      out.write("        <script src=\"assets/jquery-knob/js/jquery.knob.js\"></script>\n");
      out.write("        <script src=\"js/jquery.sparkline.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.js\"></script>\n");
      out.write("        <!-- jQuery full calendar -->\n");
      out.write("        <script src=\"js/fullcalendar.min.js\"></script>\n");
      out.write("        <!-- Full Google Calendar - Calendar -->\n");
      out.write("        <script src=\"assets/fullcalendar/fullcalendar/fullcalendar.js\"></script>\n");
      out.write("        <!--script for this page only-->\n");
      out.write("        <script src=\"js/calendar-custom.js\"></script>\n");
      out.write("        <script src=\"js/jquery.rateit.min.js\"></script>\n");
      out.write("        <!-- custom select -->\n");
      out.write("        <script src=\"js/jquery.customSelect.min.js\"></script>\n");
      out.write("        <script src=\"assets/chart-master/Chart.js\"></script>\n");
      out.write("\n");
      out.write("        <!--custome script for all page-->\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("        <!-- custom script for this page-->\n");
      out.write("        <script src=\"js/sparkline-chart.js\"></script>\n");
      out.write("        <script src=\"js/easy-pie-chart.js\"></script>\n");
      out.write("        <script src=\"js/jquery-jvectormap-1.2.2.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("        <script src=\"js/xcharts.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.autosize.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.placeholder.min.js\"></script>\n");
      out.write("        <script src=\"js/gdp-data.js\"></script>\n");
      out.write("        <script src=\"js/morris.min.js\"></script>\n");
      out.write("        <script src=\"js/sparklines.js\"></script>\n");
      out.write("        <script src=\"js/charts.js\"></script>\n");
      out.write("        <script src=\"js/jquery.slimscroll.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"cssAdmin/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- bootstrap theme -->\n");
      out.write("        <link href=\"cssAdmin/bootstrap-theme.css\" rel=\"stylesheet\">\n");
      out.write("        <!--external css-->\n");
      out.write("        <!-- font icon -->\n");
      out.write("        <link href=\"cssAdmin/elegant-icons-style.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"cssAdmin/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- full calendar css-->\n");
      out.write("        <link href=\"assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/fullcalendar/fullcalendar/fullcalendar.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- easy pie chart-->\n");
      out.write("        <link href=\"assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <!-- owl carousel -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"cssAdmin/owl.carousel.css\" type=\"text/css\">\n");
      out.write("        <link href=\"cssAdmin/jquery-jvectormap-1.2.2.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"cssAdmin/fullcalendar.css\" />\n");
      out.write("        <link href=\"cssAdmin/widgets.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"cssAdmin/style.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"cssAdmin/style-responsive.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"cssAdmin/xcharts.min.css\" rel=\" stylesheet\" />\n");
      out.write("        <link href=\"cssAdmin/jquery-ui-1.10.4.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\"  />\n");
      out.write("        <style>\n");
      out.write("            #bang {\n");
      out.write("                font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #bang td, #customers th {\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #bang trtd:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("            #bang tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("            #bang th\n");
      out.write("            {   \n");
      out.write("                padding-top: 12px;\n");
      out.write("                padding-bottom: 12px;\n");
      out.write("                text-align: left;\n");
      out.write("                background-color: rgba(0, 0, 0, 0.34);\n");
      out.write("                color:  white;\n");
      out.write("            }\n");
      out.write("            .blue-bg\n");
      out.write("            {\n");
      out.write("                background: none;\n");
      out.write("                background-color: none;\n");
      out.write("            }\n");
      out.write("            .brown-bg\n");
      out.write("            {\n");
      out.write("                background: none;\n");
      out.write("                background-color: none;\n");
      out.write("            }\n");
      out.write("            .dark-bg\n");
      out.write("            {\n");
      out.write("                background: none;\n");
      out.write("                background-color: none;\n");
      out.write("            }\n");
      out.write("            .green-bg\n");
      out.write("            {\n");
      out.write("                background: none;\n");
      out.write("                background-color: none;\n");
      out.write("            }\n");
      out.write("            .fa-address-card\n");
      out.write("            {\n");
      out.write("                opacity: 0.7;\n");
      out.write("                margin-left: 415px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                background-color: rgba(0, 0, 0, 0.34);\n");
      out.write("                color: white;\n");
      out.write("                font-size: 30px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                margin-top: 6px;\n");
      out.write("            }\n");
      out.write("            #Searchhhh\n");
      out.write("            {\n");
      out.write("                opacity: 0.7;\n");
      out.write("                margin-left: 178px;\n");
      out.write("                background-color: rgba(0, 0, 0, 0.34);\n");
      out.write("                color: white;\n");
      out.write("                font-size:17px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <body style=\"background: url(images/bann.jpg) fixed;font-size: 14px !important;\">\n");
      out.write("        <section id=\"container\" class=\"\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("                <!--main content start-->\n");
      out.write("                <section id=\"main-content\" style=\"padding-top: 39px;\">\n");
      out.write("                    <section class=\"wrapper\">\n");
      out.write("                        <!--overview start-->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-12\">\n");
      out.write("                                <h3 class=\"page-header\"><i class=\"fa fa-laptop\"></i>Hồ Sơ Nhân Viên</h3>\n");
      out.write("                                <ol class=\"breadcrumb\" style=\"background-color: rgba(0, 0, 0, 0.34);\">\n");
      out.write("                                    <li><i class=\"fa fa-home\"></i><a href=\"indexAdmin.jsp\">Home</a></li>\n");
      out.write("                                    <li><i class=\"fa fa-laptop\"></i>Hồ Sơ Nhân Viên</li>\n");
      out.write("                                </ol>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"TaoHoSoNhanVien.jsp\"><i class=\"far fa-address-card\">Tạo Hồ Sơ Nhân Viên</i></a>\n");
      out.write("                        <span id=\"Searchhhh\"><a href=\"\"><i style=\" opacity:0.7;\" class=\"fas fa-search\"></i></a><input style=\"color:red;opacity:0.7;width:257px;border-radius:14px;background-color: rgba(0, 0, 0, 0.34);\" type=\"text\" placeholder=\"Tìm Kiếm Theo Tên\" /></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                    <div>\n");
      out.write("                        <table id=\"bang\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>STT</th>\n");
      out.write("                                <th>Họ Và Tên</th>\n");
      out.write("                                <th>Bộ Phận</th>\n");
      out.write("                                <th>Loại Nhân Viên</th>\n");
      out.write("                                <th>Điện Thoại</th>\n");
      out.write("                                <th>Email</th>\n");
      out.write("                                <th>Ngày Bắt Đầu</th>\n");
      out.write("                                <th>Địa Chỉ</th>\n");
      out.write("                                <th>Quận</th>\n");
      out.write("                                <th>Thành Phố</th>\n");
      out.write("                                <th>ZipCode</th>\n");
      out.write("                                <th>SSN</th>\n");
      out.write("                                <th>Giới Tính</th>\n");
      out.write("                                <th>Trạng Thái</th>\n");
      out.write("                                <th>Tùy Chỉnh</th>\n");
      out.write("                            </tr>\n");
      out.write("                        ");

                            int count = 0;
                            for (Personal p : PersonalDAO.getAllPersonal()) {
                                count++;

                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(count);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getFirst_Name() + " " + p.getMiddle_Initial() + " " + p.getLast_Name());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getDepartment());
      out.write("</td>\n");
      out.write("                            ");

                                if (p.getTypeworker() == 1) {
                            
      out.write("\n");
      out.write("                            <td>Nhân Viên Chính Thức</td>\n");
      out.write("                            ");

                            } else {
                            
      out.write("\n");
      out.write("                            <td>Cộng Tác Viên</td>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            <td>");
      out.print(p.getPhone());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getEmail());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getStart_date());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getAddress1());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getState());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getCity());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getZip());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getSsn());
      out.write("</td>\n");
      out.write("                            ");

                                if (p.getGender() == 1) {
                            
      out.write("\n");
      out.write("                            <td>Đàn Ông</td>\n");
      out.write("                            ");

                            } else {
                            
      out.write("\n");
      out.write("                            <td>Phụ Nữ</td>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            ");

                                if (p.getStatuswork() == 1) {
                            
      out.write("\n");
      out.write("                            <td>Đang Làm Việc</td>\n");
      out.write("                            ");

                            } else {
                            
      out.write("\n");
      out.write("                            <td>Đã Nghỉ</td>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            <td><span><a href=\"#\">Sửa<i class=\"far fa-edit\"></i></a></span><span><a href=\"#\">Xóa<i class=\"fas fa-trash-alt\"></i></a></span></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
