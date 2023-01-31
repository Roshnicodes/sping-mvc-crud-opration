//
//  package com.pp.intercepter;
//  
//  import javax.servlet.Registration; import
//  javax.servlet.http.HttpServletRequest; import
//  javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component; import
//  org.springframework.web.servlet.ModelAndView; import
//  org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import com.pp.repository.ws.EmployeeRepo;
//  
//  @Component public class Web_AuthenticationInterceptor extends HandlerInterceptorAdapter
//  {
//  @Autowired
//  EmployeeRepo employeerepo;
//  
//  @Override public boolean preHandle(HttpServletRequest request,
//  HttpServletResponse response, Object handler) throws Exception {
//  
//  String login = request.getHeader("email");
//  String password=request.getHeader("password");
//  request.getSession().getAttribute("login"); if(login == null ||
//  login.equals("")) { response.sendRedirect("login "); return
//  false; }
//  
//  System.out.println("This is preHandle !"); return true; }
//  
//  @Override public void postHandle(HttpServletRequest request,
//  HttpServletResponse response, Object handler, ModelAndView modelAndView)
//  throws Exception { System.out.println("This is postHandle !");
//  
//  }
//  
//  @Override public void afterCompletion(HttpServletRequest request,
//  HttpServletResponse response, Object handler, Exception ex) throws Exception
//  { System.out.println("This is aftercompletion !");
//  
//  }
//  
//  }
// 