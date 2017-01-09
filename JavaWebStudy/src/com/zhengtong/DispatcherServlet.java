package com.zhengtong;
import javax.servlet.*;
import java.io.*;

public class DispatcherServlet extends GenericServlet {

  private String target = "/hello.jsp";

  /** ��Ӧ�ͻ�����*/
  @Override
public void service(ServletRequest request,ServletResponse response)
    throws ServletException, IOException {

    //��ȡ���е��û���
    String username = request.getParameter("username");
    //��ȡ���еĿ���
    String password = request.getParameter("password");

    //��request���������USER����
    request.setAttribute("USER", username);
    //��request���������PASSWORD����
    request.setAttribute("PASSWORD", password);

    /*������ת����hello.jsp */
    ServletContext context = getServletContext();
    RequestDispatcher dispatcher =context.getRequestDispatcher(target);
    dispatcher.forward(request, response);
  }
}
