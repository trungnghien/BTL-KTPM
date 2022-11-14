package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Personal2;
import dao.PersonalDAO;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Content</title>\n");
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
      out.write("        <<script src=\"js/fullcalendar.min.js\"></script>\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"cssAdmin/fullcalendar.css\">\n");
      out.write("        <link href=\"cssAdmin/widgets.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"cssAdmin/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"cssAdmin/style-responsive.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"cssAdmin/xcharts.min.css\" rel=\" stylesheet\">\n");
      out.write("        <link href=\"cssAdmin/jquery-ui-1.10.4.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\"  />\n");
      out.write("        <style>\n");
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
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--main content start-->\n");
      out.write("        <section id=\"main-content\" style=\"padding-top: 17px;\">\n");
      out.write("            <section class=\"wrapper\">\n");
      out.write("                <!--overview start-->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h3 class=\"page-header\"><i class=\"fa fa-laptop\"></i> Dashboard</h3>\n");
      out.write("                        <ol class=\"breadcrumb\" style=\"background-color: rgba(0, 0, 0, 0.34);\">\n");
      out.write("                            <li><i class=\"fa fa-home\"></i><a href=\"index.html\">Home</a></li>\n");
      out.write("                            <li><i class=\"fa fa-laptop\"></i>Dashboard</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12\">\n");
      out.write("                        <div class=\"info-box blue-bg\">\n");
      out.write("                            <i class=\"fas fa-address-book\"></i>\n");
      out.write("                            ");

                                int count = 0;
                                for (Personal2 p : PersonalDAO.getAllPersonal()) {
                                    count++;
                                }
                            
      out.write("\n");
      out.write("                            <div class=\"count\">\n");
      out.write("                                ");
      out.print(count);
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"title\">Tổng Nhân Viên</div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--/.info-box-->\n");
      out.write("                    </div>\n");
      out.write("                    <!--/.col-->\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12\">\n");
      out.write("                        <div class=\"info-box brown-bg\">\n");
      out.write("                            <i class=\"fas fa-birthday-cake\"></i>\n");
      out.write("                            <div class=\"count\">0</div>\n");
      out.write("                            <div class=\"title\">Sinh Nhật Nhân Viên</div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--/.info-box-->\n");
      out.write("                    </div>\n");
      out.write("                    <!--/.col-->\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12\">\n");
      out.write("                        <div class=\"info-box dark-bg\">\n");
      out.write("                            <i class=\"far fa-clock\"></i>\n");
      out.write("                            <div class=\"count\">4</div>\n");
      out.write("                            <div class=\"title\">Anniversary Nhân Viên</div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--/.info-box-->\n");
      out.write("                    </div>\n");
      out.write("                    <!--/.col-->\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12\">\n");
      out.write("                        <div class=\"info-box green-bg\">\n");
      out.write("                            <i class=\"fa fa-cubes\"></i>\n");
      out.write("                            <div class=\"count\">1</div>\n");
      out.write("                            <div class=\"title\">Thông Báo</div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--/.info-box-->\n");
      out.write("                    </div>\n");
      out.write("                    <!--/.col-->\n");
      out.write("                    <a href=\"TaoHoSoNhanVien.jsp\">\n");
      out.write("                        <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12\">\n");
      out.write("                            <div class=\"info-box green-bg\">\n");
      out.write("                                <i class=\"fas fa-plus-square\"></i>\n");
      out.write("                                <div class=\"count\"></div>\n");
      out.write("                                <div class=\"title\">Thêm Nhân Viên Mới</div>\n");
      out.write("                            </div>\n");
      out.write("                            <!--/.info-box-->\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <!--/.col-->\n");
      out.write("                    <a href=\"TaoHoSoNhanVien.jsp\">\n");
      out.write("                        <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12\">\n");
      out.write("                            <div class=\"info-box green-bg\">\n");
      out.write("                                <i class=\"far fa-person-carry\"></i>\n");
      out.write("                                <div class=\"count\"></div>\n");
      out.write("                                <div class=\"title\">Tổng HR</div>\n");
      out.write("                            </div>\n");
      out.write("                            <!--/.info-box-->\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <!--/.col-->\n");
      out.write("                </div>\n");
      out.write("                <!--/.row-->\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("            <div class=\"text-right\">\n");
      out.write("                <div class=\"credits\">\n");
      out.write("                    <a href=\"#\">Quản Lý Nhân Sự Và Tiền Lương Của Công Ty MyDTU</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
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
