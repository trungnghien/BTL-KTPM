package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Personal_Employment;
import model.Personal2;
import dao.PersonalDAO;

public final class QuanLyNhanVienMoi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Quản Lý Nhân Viên Mới</title>\n");
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
      out.write("            #bang\n");
      out.write("            {\n");
      out.write("                font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 100%;\n");
      out.write("            }   \n");
      out.write("\n");
      out.write("            #bang td, #customers th \n");
      out.write("            {\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #bang trtd:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("            #bang tr:hover {background-color: rgba(0,0,0,0.5);}\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                background-color: rgba(0, 0, 0, 0);\n");
      out.write("                color: white;\n");
      out.write("                font-size: 30px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                margin-top: 6px;\n");
      out.write("            }\n");
      out.write("            #Searchhhh\n");
      out.write("            {\n");
      out.write("                opacity: 0.7;\n");
      out.write("                margin-left: 69px;\n");
      out.write("                background-color: rgba(0, 0, 0, 0);\n");
      out.write("                color: white;\n");
      out.write("                font-size:17px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .far , .fas \n");
      out.write("            {\n");
      out.write("                color: white;\n");
      out.write("                transition: 0.7s ease;\n");
      out.write("            }\n");
      out.write("            .far:hover , .fas:hover\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                border-color: #00c6d7;\n");
      out.write("                box-shadow: 0 10px 6px -6px #777;\n");
      out.write("                color: #00c6d7;\n");
      out.write("            }\n");
      out.write("            .dlg-container\n");
      out.write("            {\n");
      out.write("                position:absolute;\n");
      out.write("                left:50%;\n");
      out.write("                top:30%;\n");
      out.write("                transform: translateX(-50%) translateY(-50%);\n");
      out.write("                width:400px;\n");
      out.write("                background:#fff;\n");
      out.write("                padding:10px;\n");
      out.write("                border:2px solid #ddd;\n");
      out.write("                box-shadow:1px 1px 5px 1px #ccc;\n");
      out.write("                border-radius:10px;\n");
      out.write("                opacity:1;\n");
      out.write("                transition:all 0.3 linear 0s;\n");
      out.write("                z-index: 2;\n");
      out.write("                display:none;\n");
      out.write("                background: rgba(0,0,0,0.2);\n");
      out.write("            }\n");
      out.write("            .dlg-container:hover\n");
      out.write("            {\n");
      out.write("               border:1px solid #00a0df;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .dlg-header\n");
      out.write("            {\n");
      out.write("                padding: 10px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                background: rgba(0,0,0,0.5);\n");
      out.write("                color: #f6f7f8;\n");
      out.write("                border: 1px solid white;\n");
      out.write("                border-radius: 10px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .dlg-body\n");
      out.write("            {\n");
      out.write("                padding:10px;\n");
      out.write("                line-height:30px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .dlg-footer\n");
      out.write("            {\n");
      out.write("                text-align:center;\n");
      out.write("                padding : 3px 0;\n");
      out.write("            }\n");
      out.write("            .dlg-footer a\n");
      out.write("            {\n");
      out.write("                display:inline-block;\n");
      out.write("                width:100px;\n");
      out.write("                padding:5px 0;\n");
      out.write("                border-radius:10px;\n");
      out.write("                background: rgba(0,0,0,0.3);\n");
      out.write("                cursor : pointer;\n");
      out.write("                border: 1px solid;\n");
      out.write("                color: white;\n");
      out.write("                transition: 0.9s ease;\n");
      out.write("            }\n");
      out.write("            .dlg-footer a:active\n");
      out.write("            {\n");
      out.write("                box-shadow: inset 2px 2px 4px 0 #ccc;\n");
      out.write("                color:#666;\n");
      out.write("            }\n");
      out.write("            .freeze-layer\n");
      out.write("            {\n");
      out.write("                position: fixed;\n");
      out.write("                top: 0;\n");
      out.write("                left:0;\n");
      out.write("                width:100%;\n");
      out.write("                height:100%;\n");
      out.write("                background:rgba(0,0,0,0.9);\n");
      out.write("                z-index:1;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function ()\n");
      out.write("            {\n");
      out.write("                $(\"#xoa\").click(function ()\n");
      out.write("                {\n");
      out.write("                    $(\"#dialogCont\").show();\n");
      out.write("                    $(\"#freezeLayer\").show();\n");
      out.write("                });\n");
      out.write("                $(\"#khongxoa\").click(function ()\n");
      out.write("                {\n");
      out.write("                    $(\"#dialogCont\").hide();\n");
      out.write("                    $(\"#freezeLayer\").hide();\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
      out.write("                                <div style=\"margin-left:482px;font-size:22px;margin-top:-31px;\">\n");
      out.write("                                ");

                                    String add = (String) request.getAttribute("xoa");
                                    if (add != null) {
                                
      out.write("\n");
      out.write("                                <i class=\"far fa-frown\" style=\"margin-right:6px;color:red;\" ></i><span style=\"color:red;\">");
out.print(add); 
      out.write("</span>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                    ");

                                        String sua = (String) request.getAttribute("sua");
                                        if (sua != null) {
                                    
      out.write("\n");
      out.write("                                <i class=\"far fa-smile-wink\" style=\"margin-right:6px;color:red;\" ></i><span style=\"color:red;\">");
out.print(sua); 
      out.write("</span>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <ol class=\"breadcrumb\" style=\"background-color: rgba(0, 0, 0, 0.34);\">\n");
      out.write("                                <li><i class=\"fa fa-home\"></i><a href=\"indexAdmin.jsp\">Home</a></li>\n");
      out.write("                                <li><i class=\"fa fa-laptop\"></i>Hồ Sơ Nhân Viên</li>\n");
      out.write("                            </ol>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"TaoHoSoNhanVien.jsp\"><i class=\"far fa-address-card\">Tạo Hồ Sơ Nhân Viên Mới</i></a>\n");
      out.write("                    <span id=\"Searchhhh\"><a href=\"\"><i style=\"opacity:0.7;line-height: 51px;margin-left: 13px;\" class=\"fas fa-search\"></i></a><input  style=\"color:white;opacity:0.7;width:257px;border-radius:14px;background-color: rgba(0, 0, 0, 0);position: relative;padding-left: 38px;\" type=\"text\" placeholder=\"Tìm Kiếm Theo Tên\" /></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                <div>\n");
      out.write("                    <table id=\"bang\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>STT</th>\n");
      out.write("                            <th>Họ Và Tên</th>\n");
      out.write("                            <th>Loại Nhân Viên</th>\n");
      out.write("                            <th>Ngày Sinh</th>\n");
      out.write("                            <th>Địa Chỉ</th>\n");
      out.write("                            <th>Thành Phố</th>\n");
      out.write("                            <th>Quận</th>\n");
      out.write("                            <th>Zipcode </th>\n");
      out.write("                            <th>Email</th>\n");
      out.write("                            <th>Điện Thoại</th>\n");
      out.write("                            <th>Social Security Number</th>\n");
      out.write("                            <th>Giấy Phép Lấy Xe</th>\n");
      out.write("                            <th>TT Hôn Nhân</th>\n");
      out.write("                            <th>Giới Tính </th>\n");
      out.write("                            <th>Thuộc Cổ Đông</th>\n");
      out.write("                            <th>Dân Tộc </th>\n");
      out.write("                            <th>Công Cụ</th>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            int count = 0;
                            for (Personal_Employment p : PersonalDAO.getAllPersonal()) {

                                if (p.getEmployment_Status().equals("Cộng Tác Viên")) {
                                    count++;

                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(count);
      out.write("</td>\n");
      out.write("\n");
      out.write("                            <td>");
      out.print(p.getLast_Name() + p.getFirst_Name());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getEmployment_Status());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getBirthday());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getAddress1());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getCity());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getState());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getZip());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getEmail());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getPhone());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getSsn());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getDrivers_license());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(p.getMarital_Status());
      out.write("</td>\n");
      out.write("\n");
      out.write("                            ");

                                if (p.getGender() == 1) {
                            
      out.write("\n");
      out.write("                            <td>Nam</td>\n");
      out.write("                            ");
 } else {
                            
      out.write("\n");
      out.write("                            <td>Nữ</td>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("\n");
      out.write("                            ");

                                if (p.getShareholderStatus() == 1) {
                            
      out.write("\n");
      out.write("                            <td>Có</td>\n");
      out.write("                            ");

                            } else {
                            
      out.write("\n");
      out.write("                            <td>Không</td>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <td>");
      out.print(p.getEthnicity());
      out.write("</td>\n");
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                                <span ><a href=\"NhanVienChinhThuc.jsp?Employee_ID=");
      out.print(p.getEmployee_ID());
      out.write("\"><i class=\"far fa-handshake\" style=\"border: 1px solid white;border-radius: 5px;text-align: center;font-size: 15px;\">Trở Thành NV Chính Thức</i></a></span>  \n");
      out.write("                                <span style=\"font-size: 18px;\" id=\"sua\"><a href=\"SuaHoSoNhanVienMoi.jsp?command=sua&Employee_ID=");
      out.print(p.getEmployee_ID());
      out.write("\"><i class=\"fas fa-wrench\" style=\"text-align: center;border: 1px solid white;border-radius: 5px;margin-right: 53px;\">Sửa</i></a></span>\n");
      out.write("                                <span style=\"font-size: 17px;\" ><a id=\"xoa\" onclick=\"\"><i class=\"fas fa-user-slash\" style=\"border: 1px solid white;border-radius: 5px;cursor: pointer;text-align: center;\">Xóa</i></a></span>\n");
      out.write("                                <div id=\"freezeLayer\" class=\"freeze-layer\" style=\"display:none;\"></div>\n");
      out.write("                                <div id=\"dialogCont\" class=\"dlg-container\">\n");
      out.write("                                    <div class=\"dlg-header\"><i class=\"fas fa-exclamation-triangle\">Xác Nhận Xóa Cộng Tác Viên?</i></div>\n");
      out.write("                                    <div id=\"dlgBody\" class=\"dlg-body\">Bạn Có Tiếp Tục Xóa ,<strong style=\"color:red;\">");
      out.print(p.getLast_Name()+p.getFirst_Name() );
      out.write("</strong>?</div>\n");
      out.write("                                    <div class=\"dlg-footer\">\n");
      out.write("                                        <a href=\"XuLyTaoHoSoNhanVien?command=xoa&Employee_ID=");
      out.print(p.getEmployee_ID());
      out.write("\" style=\"margin-left: 4px;\" ><i class=\"fas fa-user-times\" style=\"margin-left:2px;\">Xóa</i></a>\n");
      out.write("                                        <a style=\"margin-left: 56px;\" id=\"khongxoa\" ><i class=\"fas fa-times-circle\">Không</i></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            ");
 }
                            
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("\n");
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
